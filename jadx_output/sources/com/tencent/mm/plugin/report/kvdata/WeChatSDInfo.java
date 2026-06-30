package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes11.dex */
public class WeChatSDInfo extends com.tencent.mm.protobuf.f {
    public int depth_;
    public long dirCount_;
    public long fileCount_;
    public long fileLenInvalidCount_;
    public java.util.LinkedList<com.tencent.mm.plugin.report.kvdata.SubDirInfo> subDirList_ = new java.util.LinkedList<>();
    public int subDirResultsSize_;
    public long tempAccDirCount_;
    public int tempAccDirResultsSize_;
    public long tempAccFileCount_;
    public long tempAccFileLenInvalidCount_;
    public long tempAccTotalSize_;
    public long totalSize_;
    public long totalTime_;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.WeChatSDInfo)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.WeChatSDInfo weChatSDInfo = (com.tencent.mm.plugin.report.kvdata.WeChatSDInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.totalSize_), java.lang.Long.valueOf(weChatSDInfo.totalSize_)) && n51.f.a(java.lang.Long.valueOf(this.dirCount_), java.lang.Long.valueOf(weChatSDInfo.dirCount_)) && n51.f.a(java.lang.Long.valueOf(this.fileCount_), java.lang.Long.valueOf(weChatSDInfo.fileCount_)) && n51.f.a(java.lang.Long.valueOf(this.fileLenInvalidCount_), java.lang.Long.valueOf(weChatSDInfo.fileLenInvalidCount_)) && n51.f.a(java.lang.Integer.valueOf(this.subDirResultsSize_), java.lang.Integer.valueOf(weChatSDInfo.subDirResultsSize_)) && n51.f.a(java.lang.Long.valueOf(this.totalTime_), java.lang.Long.valueOf(weChatSDInfo.totalTime_)) && n51.f.a(java.lang.Integer.valueOf(this.depth_), java.lang.Integer.valueOf(weChatSDInfo.depth_)) && n51.f.a(java.lang.Long.valueOf(this.tempAccTotalSize_), java.lang.Long.valueOf(weChatSDInfo.tempAccTotalSize_)) && n51.f.a(java.lang.Integer.valueOf(this.tempAccDirResultsSize_), java.lang.Integer.valueOf(weChatSDInfo.tempAccDirResultsSize_)) && n51.f.a(java.lang.Long.valueOf(this.tempAccDirCount_), java.lang.Long.valueOf(weChatSDInfo.tempAccDirCount_)) && n51.f.a(java.lang.Long.valueOf(this.tempAccFileCount_), java.lang.Long.valueOf(weChatSDInfo.tempAccFileCount_)) && n51.f.a(java.lang.Long.valueOf(this.tempAccFileLenInvalidCount_), java.lang.Long.valueOf(weChatSDInfo.tempAccFileLenInvalidCount_)) && n51.f.a(this.subDirList_, weChatSDInfo.subDirList_);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.totalSize_);
            fVar.h(2, this.dirCount_);
            fVar.h(3, this.fileCount_);
            fVar.h(4, this.fileLenInvalidCount_);
            fVar.e(5, this.subDirResultsSize_);
            fVar.h(6, this.totalTime_);
            fVar.e(7, this.depth_);
            fVar.h(8, this.tempAccTotalSize_);
            fVar.e(9, this.tempAccDirResultsSize_);
            fVar.h(10, this.tempAccDirCount_);
            fVar.h(11, this.tempAccFileCount_);
            fVar.h(12, this.tempAccFileLenInvalidCount_);
            fVar.g(13, 8, this.subDirList_);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.totalSize_) + 0 + b36.f.h(2, this.dirCount_) + b36.f.h(3, this.fileCount_) + b36.f.h(4, this.fileLenInvalidCount_) + b36.f.e(5, this.subDirResultsSize_) + b36.f.h(6, this.totalTime_) + b36.f.e(7, this.depth_) + b36.f.h(8, this.tempAccTotalSize_) + b36.f.e(9, this.tempAccDirResultsSize_) + b36.f.h(10, this.tempAccDirCount_) + b36.f.h(11, this.tempAccFileCount_) + b36.f.h(12, this.tempAccFileLenInvalidCount_) + b36.f.g(13, 8, this.subDirList_);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.subDirList_.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        com.tencent.mm.plugin.report.kvdata.WeChatSDInfo weChatSDInfo = (com.tencent.mm.plugin.report.kvdata.WeChatSDInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                weChatSDInfo.totalSize_ = aVar2.i(intValue);
                return 0;
            case 2:
                weChatSDInfo.dirCount_ = aVar2.i(intValue);
                return 0;
            case 3:
                weChatSDInfo.fileCount_ = aVar2.i(intValue);
                return 0;
            case 4:
                weChatSDInfo.fileLenInvalidCount_ = aVar2.i(intValue);
                return 0;
            case 5:
                weChatSDInfo.subDirResultsSize_ = aVar2.g(intValue);
                return 0;
            case 6:
                weChatSDInfo.totalTime_ = aVar2.i(intValue);
                return 0;
            case 7:
                weChatSDInfo.depth_ = aVar2.g(intValue);
                return 0;
            case 8:
                weChatSDInfo.tempAccTotalSize_ = aVar2.i(intValue);
                return 0;
            case 9:
                weChatSDInfo.tempAccDirResultsSize_ = aVar2.g(intValue);
                return 0;
            case 10:
                weChatSDInfo.tempAccDirCount_ = aVar2.i(intValue);
                return 0;
            case 11:
                weChatSDInfo.tempAccFileCount_ = aVar2.i(intValue);
                return 0;
            case 12:
                weChatSDInfo.tempAccFileLenInvalidCount_ = aVar2.i(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.report.kvdata.SubDirInfo subDirInfo = new com.tencent.mm.plugin.report.kvdata.SubDirInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        subDirInfo.parseFrom(bArr2);
                    }
                    weChatSDInfo.subDirList_.add(subDirInfo);
                }
                return 0;
            default:
                return -1;
        }
    }
}
