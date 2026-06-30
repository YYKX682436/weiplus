package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes11.dex */
public class SubDirInfo extends com.tencent.mm.protobuf.f {
    public long dirCount_;
    public long fileCount_;
    public long fileLenInvalidCount;
    public int tag_;
    public long totalSize_;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.SubDirInfo)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.SubDirInfo subDirInfo = (com.tencent.mm.plugin.report.kvdata.SubDirInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.tag_), java.lang.Integer.valueOf(subDirInfo.tag_)) && n51.f.a(java.lang.Long.valueOf(this.totalSize_), java.lang.Long.valueOf(subDirInfo.totalSize_)) && n51.f.a(java.lang.Long.valueOf(this.dirCount_), java.lang.Long.valueOf(subDirInfo.dirCount_)) && n51.f.a(java.lang.Long.valueOf(this.fileCount_), java.lang.Long.valueOf(subDirInfo.fileCount_)) && n51.f.a(java.lang.Long.valueOf(this.fileLenInvalidCount), java.lang.Long.valueOf(subDirInfo.fileLenInvalidCount));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.tag_);
            fVar.h(2, this.totalSize_);
            fVar.h(3, this.dirCount_);
            fVar.h(4, this.fileCount_);
            fVar.h(5, this.fileLenInvalidCount);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.tag_) + 0 + b36.f.h(2, this.totalSize_) + b36.f.h(3, this.dirCount_) + b36.f.h(4, this.fileCount_) + b36.f.h(5, this.fileLenInvalidCount);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.tencent.mm.plugin.report.kvdata.SubDirInfo subDirInfo = (com.tencent.mm.plugin.report.kvdata.SubDirInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            subDirInfo.tag_ = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            subDirInfo.totalSize_ = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            subDirInfo.dirCount_ = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            subDirInfo.fileCount_ = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        subDirInfo.fileLenInvalidCount = aVar2.i(intValue);
        return 0;
    }
}
