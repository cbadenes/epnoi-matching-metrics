package es.upm.oeg.epnoi.matching.metrics.topics

import es.upm.oeg.epnoi.matching.metrics.domain.entity.TopicDistribution

/**
 * Created by cbadenes on 04/05/15.
 */
case class SampleCaseClass (id: Integer, topicDistribution: TopicDistribution) extends Serializable {

  override def toString(): String={
    s"id:$id $topicDistribution"
  }

}
