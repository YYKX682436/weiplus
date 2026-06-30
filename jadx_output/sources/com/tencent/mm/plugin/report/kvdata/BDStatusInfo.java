package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes8.dex */
public class BDStatusInfo extends com.tencent.mm.protobuf.f {
    public long favDBSize_;
    public long mmDBSize_;
    public int mmDBTableCount_;
    public long snsDBSize_;
    public java.util.LinkedList<com.tencent.mm.plugin.report.kvdata.TableInfo> tableList_ = new java.util.LinkedList<>();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.BDStatusInfo)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.BDStatusInfo bDStatusInfo = (com.tencent.mm.plugin.report.kvdata.BDStatusInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.mmDBSize_), java.lang.Long.valueOf(bDStatusInfo.mmDBSize_)) && n51.f.a(java.lang.Long.valueOf(this.snsDBSize_), java.lang.Long.valueOf(bDStatusInfo.snsDBSize_)) && n51.f.a(java.lang.Integer.valueOf(this.mmDBTableCount_), java.lang.Integer.valueOf(bDStatusInfo.mmDBTableCount_)) && n51.f.a(this.tableList_, bDStatusInfo.tableList_) && n51.f.a(java.lang.Long.valueOf(this.favDBSize_), java.lang.Long.valueOf(bDStatusInfo.favDBSize_));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.mmDBSize_);
            fVar.h(2, this.snsDBSize_);
            fVar.e(3, this.mmDBTableCount_);
            fVar.g(4, 8, this.tableList_);
            fVar.h(5, this.favDBSize_);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.mmDBSize_) + 0 + b36.f.h(2, this.snsDBSize_) + b36.f.e(3, this.mmDBTableCount_) + b36.f.g(4, 8, this.tableList_) + b36.f.h(5, this.favDBSize_);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.tableList_.clear();
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
        com.tencent.mm.plugin.report.kvdata.BDStatusInfo bDStatusInfo = (com.tencent.mm.plugin.report.kvdata.BDStatusInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bDStatusInfo.mmDBSize_ = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            bDStatusInfo.snsDBSize_ = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            bDStatusInfo.mmDBTableCount_ = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            bDStatusInfo.favDBSize_ = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.report.kvdata.TableInfo tableInfo = new com.tencent.mm.plugin.report.kvdata.TableInfo();
            if (bArr2 != null && bArr2.length > 0) {
                tableInfo.parseFrom(bArr2);
            }
            bDStatusInfo.tableList_.add(tableInfo);
        }
        return 0;
    }
}
