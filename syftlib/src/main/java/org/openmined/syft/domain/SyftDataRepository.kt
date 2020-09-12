package org.openmined.syft.domain

import org.pytorch.IValue

interface SyftDataRepository {
    fun loadDataBatch(batchSize: Int): Pair<IValue, IValue>
}