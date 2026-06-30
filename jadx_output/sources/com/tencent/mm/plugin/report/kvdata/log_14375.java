package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes8.dex */
public class log_14375 extends com.tencent.mm.protobuf.f {
    public int clientVersion_;
    public com.tencent.mm.plugin.report.kvdata.BDStatusInfo dbStatusInfo_;
    public int device_;
    public int ds_;
    public com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo heavyDetailInfo_;
    public int import_ds_;
    public com.tencent.mm.plugin.report.kvdata.SDStatusInfo sdStatusInfo_;
    public long time_stamp_;
    public int type_;
    public long uin_;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.log_14375)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.log_14375 log_14375Var = (com.tencent.mm.plugin.report.kvdata.log_14375) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.import_ds_), java.lang.Integer.valueOf(log_14375Var.import_ds_)) && n51.f.a(java.lang.Integer.valueOf(this.ds_), java.lang.Integer.valueOf(log_14375Var.ds_)) && n51.f.a(java.lang.Long.valueOf(this.uin_), java.lang.Long.valueOf(log_14375Var.uin_)) && n51.f.a(java.lang.Integer.valueOf(this.device_), java.lang.Integer.valueOf(log_14375Var.device_)) && n51.f.a(java.lang.Integer.valueOf(this.clientVersion_), java.lang.Integer.valueOf(log_14375Var.clientVersion_)) && n51.f.a(java.lang.Long.valueOf(this.time_stamp_), java.lang.Long.valueOf(log_14375Var.time_stamp_)) && n51.f.a(java.lang.Integer.valueOf(this.type_), java.lang.Integer.valueOf(log_14375Var.type_)) && n51.f.a(this.dbStatusInfo_, log_14375Var.dbStatusInfo_) && n51.f.a(this.sdStatusInfo_, log_14375Var.sdStatusInfo_) && n51.f.a(this.heavyDetailInfo_, log_14375Var.heavyDetailInfo_);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.import_ds_);
            fVar.e(2, this.ds_);
            fVar.h(3, this.uin_);
            fVar.e(4, this.device_);
            fVar.e(5, this.clientVersion_);
            fVar.h(6, this.time_stamp_);
            fVar.e(7, this.type_);
            com.tencent.mm.plugin.report.kvdata.BDStatusInfo bDStatusInfo = this.dbStatusInfo_;
            if (bDStatusInfo != null) {
                fVar.i(8, bDStatusInfo.computeSize());
                this.dbStatusInfo_.writeFields(fVar);
            }
            com.tencent.mm.plugin.report.kvdata.SDStatusInfo sDStatusInfo = this.sdStatusInfo_;
            if (sDStatusInfo != null) {
                fVar.i(9, sDStatusInfo.computeSize());
                this.sdStatusInfo_.writeFields(fVar);
            }
            com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo heavyDetailInfo = this.heavyDetailInfo_;
            if (heavyDetailInfo != null) {
                fVar.i(10, heavyDetailInfo.computeSize());
                this.heavyDetailInfo_.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.import_ds_) + 0 + b36.f.e(2, this.ds_) + b36.f.h(3, this.uin_) + b36.f.e(4, this.device_) + b36.f.e(5, this.clientVersion_) + b36.f.h(6, this.time_stamp_) + b36.f.e(7, this.type_);
            com.tencent.mm.plugin.report.kvdata.BDStatusInfo bDStatusInfo2 = this.dbStatusInfo_;
            if (bDStatusInfo2 != null) {
                e17 += b36.f.i(8, bDStatusInfo2.computeSize());
            }
            com.tencent.mm.plugin.report.kvdata.SDStatusInfo sDStatusInfo2 = this.sdStatusInfo_;
            if (sDStatusInfo2 != null) {
                e17 += b36.f.i(9, sDStatusInfo2.computeSize());
            }
            com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo heavyDetailInfo2 = this.heavyDetailInfo_;
            return heavyDetailInfo2 != null ? e17 + b36.f.i(10, heavyDetailInfo2.computeSize()) : e17;
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
        com.tencent.mm.plugin.report.kvdata.log_14375 log_14375Var = (com.tencent.mm.plugin.report.kvdata.log_14375) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                log_14375Var.import_ds_ = aVar2.g(intValue);
                return 0;
            case 2:
                log_14375Var.ds_ = aVar2.g(intValue);
                return 0;
            case 3:
                log_14375Var.uin_ = aVar2.i(intValue);
                return 0;
            case 4:
                log_14375Var.device_ = aVar2.g(intValue);
                return 0;
            case 5:
                log_14375Var.clientVersion_ = aVar2.g(intValue);
                return 0;
            case 6:
                log_14375Var.time_stamp_ = aVar2.i(intValue);
                return 0;
            case 7:
                log_14375Var.type_ = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.report.kvdata.BDStatusInfo bDStatusInfo3 = new com.tencent.mm.plugin.report.kvdata.BDStatusInfo();
                    if (bArr != null && bArr.length > 0) {
                        bDStatusInfo3.parseFrom(bArr);
                    }
                    log_14375Var.dbStatusInfo_ = bDStatusInfo3;
                }
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.report.kvdata.SDStatusInfo sDStatusInfo3 = new com.tencent.mm.plugin.report.kvdata.SDStatusInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        sDStatusInfo3.parseFrom(bArr2);
                    }
                    log_14375Var.sdStatusInfo_ = sDStatusInfo3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo heavyDetailInfo3 = new com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        heavyDetailInfo3.parseFrom(bArr3);
                    }
                    log_14375Var.heavyDetailInfo_ = heavyDetailInfo3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
