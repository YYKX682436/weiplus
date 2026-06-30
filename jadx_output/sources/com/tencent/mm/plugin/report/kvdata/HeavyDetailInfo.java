package com.tencent.mm.plugin.report.kvdata;

/* loaded from: classes12.dex */
public class HeavyDetailInfo extends com.tencent.mm.protobuf.f {
    public long chatroom_;
    public long contact_;
    public long conversation_;
    public long dbSize_;
    public long favDbSize_;
    public long flag_;
    public long message_;
    public long sdFileRatio_;
    public long sdFileSize_;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo)) {
            return false;
        }
        com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo heavyDetailInfo = (com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.flag_), java.lang.Long.valueOf(heavyDetailInfo.flag_)) && n51.f.a(java.lang.Long.valueOf(this.sdFileSize_), java.lang.Long.valueOf(heavyDetailInfo.sdFileSize_)) && n51.f.a(java.lang.Long.valueOf(this.sdFileRatio_), java.lang.Long.valueOf(heavyDetailInfo.sdFileRatio_)) && n51.f.a(java.lang.Long.valueOf(this.dbSize_), java.lang.Long.valueOf(heavyDetailInfo.dbSize_)) && n51.f.a(java.lang.Long.valueOf(this.message_), java.lang.Long.valueOf(heavyDetailInfo.message_)) && n51.f.a(java.lang.Long.valueOf(this.conversation_), java.lang.Long.valueOf(heavyDetailInfo.conversation_)) && n51.f.a(java.lang.Long.valueOf(this.contact_), java.lang.Long.valueOf(heavyDetailInfo.contact_)) && n51.f.a(java.lang.Long.valueOf(this.chatroom_), java.lang.Long.valueOf(heavyDetailInfo.chatroom_)) && n51.f.a(java.lang.Long.valueOf(this.favDbSize_), java.lang.Long.valueOf(heavyDetailInfo.favDbSize_));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.flag_);
            fVar.h(2, this.sdFileSize_);
            fVar.h(3, this.sdFileRatio_);
            fVar.h(4, this.dbSize_);
            fVar.h(5, this.message_);
            fVar.h(6, this.conversation_);
            fVar.h(7, this.contact_);
            fVar.h(8, this.chatroom_);
            fVar.h(9, this.favDbSize_);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.flag_) + 0 + b36.f.h(2, this.sdFileSize_) + b36.f.h(3, this.sdFileRatio_) + b36.f.h(4, this.dbSize_) + b36.f.h(5, this.message_) + b36.f.h(6, this.conversation_) + b36.f.h(7, this.contact_) + b36.f.h(8, this.chatroom_) + b36.f.h(9, this.favDbSize_);
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
        com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo heavyDetailInfo = (com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                heavyDetailInfo.flag_ = aVar2.i(intValue);
                return 0;
            case 2:
                heavyDetailInfo.sdFileSize_ = aVar2.i(intValue);
                return 0;
            case 3:
                heavyDetailInfo.sdFileRatio_ = aVar2.i(intValue);
                return 0;
            case 4:
                heavyDetailInfo.dbSize_ = aVar2.i(intValue);
                return 0;
            case 5:
                heavyDetailInfo.message_ = aVar2.i(intValue);
                return 0;
            case 6:
                heavyDetailInfo.conversation_ = aVar2.i(intValue);
                return 0;
            case 7:
                heavyDetailInfo.contact_ = aVar2.i(intValue);
                return 0;
            case 8:
                heavyDetailInfo.chatroom_ = aVar2.i(intValue);
                return 0;
            case 9:
                heavyDetailInfo.favDbSize_ = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
