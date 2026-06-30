package com.tencent.mm.protocal.protobuf;

/* loaded from: classes2.dex */
public class WxaEvaluateBasicInfo extends com.tencent.mm.protobuf.f {
    public double average_score;
    public long total_score_cnt;

    public static final com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo create() {
        return new com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo wxaEvaluateBasicInfo = (com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.average_score), java.lang.Double.valueOf(wxaEvaluateBasicInfo.average_score)) && n51.f.a(java.lang.Long.valueOf(this.total_score_cnt), java.lang.Long.valueOf(wxaEvaluateBasicInfo.total_score_cnt));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.c(1, this.average_score);
            fVar.h(2, this.total_score_cnt);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.c(1, this.average_score) + 0 + b36.f.h(2, this.total_score_cnt);
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
        com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo wxaEvaluateBasicInfo = (com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wxaEvaluateBasicInfo.average_score = aVar2.e(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        wxaEvaluateBasicInfo.total_score_cnt = aVar2.i(intValue);
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo setAverage_score(double d17) {
        this.average_score = d17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.WxaEvaluateBasicInfo setTotal_score_cnt(long j17) {
        this.total_score_cnt = j17;
        return this;
    }
}
