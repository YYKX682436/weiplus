package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes8.dex */
public class log_13905 extends com.tencent.mm.protobuf.f {
    public int clientVersion_;
    public int device_;
    public int ds_;
    public int import_ds_;
    public long time_stamp_;
    public long uin_;
    public com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior viOp_;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.log_13905)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.log_13905 log_13905Var = (com.tencent.mm.plugin.report.kvdata.log_13905) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.import_ds_), java.lang.Integer.valueOf(log_13905Var.import_ds_)) && n51.f.a(java.lang.Integer.valueOf(this.ds_), java.lang.Integer.valueOf(log_13905Var.ds_)) && n51.f.a(java.lang.Long.valueOf(this.uin_), java.lang.Long.valueOf(log_13905Var.uin_)) && n51.f.a(java.lang.Integer.valueOf(this.device_), java.lang.Integer.valueOf(log_13905Var.device_)) && n51.f.a(java.lang.Integer.valueOf(this.clientVersion_), java.lang.Integer.valueOf(log_13905Var.clientVersion_)) && n51.f.a(java.lang.Long.valueOf(this.time_stamp_), java.lang.Long.valueOf(log_13905Var.time_stamp_)) && n51.f.a(this.viOp_, log_13905Var.viOp_);
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
            com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = this.viOp_;
            if (voiceInputBehavior != null) {
                fVar.i(7, voiceInputBehavior.computeSize());
                this.viOp_.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.import_ds_) + 0 + b36.f.e(2, this.ds_) + b36.f.h(3, this.uin_) + b36.f.e(4, this.device_) + b36.f.e(5, this.clientVersion_) + b36.f.h(6, this.time_stamp_);
            com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior2 = this.viOp_;
            return voiceInputBehavior2 != null ? e17 + b36.f.i(7, voiceInputBehavior2.computeSize()) : e17;
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
        com.tencent.mm.plugin.report.kvdata.log_13905 log_13905Var = (com.tencent.mm.plugin.report.kvdata.log_13905) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                log_13905Var.import_ds_ = aVar2.g(intValue);
                return 0;
            case 2:
                log_13905Var.ds_ = aVar2.g(intValue);
                return 0;
            case 3:
                log_13905Var.uin_ = aVar2.i(intValue);
                return 0;
            case 4:
                log_13905Var.device_ = aVar2.g(intValue);
                return 0;
            case 5:
                log_13905Var.clientVersion_ = aVar2.g(intValue);
                return 0;
            case 6:
                log_13905Var.time_stamp_ = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior3 = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
                    if (bArr != null && bArr.length > 0) {
                        voiceInputBehavior3.parseFrom(bArr);
                    }
                    log_13905Var.viOp_ = voiceInputBehavior3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
