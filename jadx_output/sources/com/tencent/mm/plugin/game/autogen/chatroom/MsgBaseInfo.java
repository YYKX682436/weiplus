package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class MsgBaseInfo extends com.tencent.mm.protobuf.f {
    public long chatroom_first_seq;
    public com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enter_lead_speak_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msgBaseInfo = (com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.chatroom_first_seq), java.lang.Long.valueOf(msgBaseInfo.chatroom_first_seq)) && n51.f.a(this.enter_lead_speak_info, msgBaseInfo.enter_lead_speak_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.chatroom_first_seq);
            com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enterLeadSpeakInfo = this.enter_lead_speak_info;
            if (enterLeadSpeakInfo != null) {
                fVar.i(2, enterLeadSpeakInfo.computeSize());
                this.enter_lead_speak_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.chatroom_first_seq) + 0;
            com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enterLeadSpeakInfo2 = this.enter_lead_speak_info;
            return enterLeadSpeakInfo2 != null ? h17 + b36.f.i(2, enterLeadSpeakInfo2.computeSize()) : h17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo msgBaseInfo = (com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            msgBaseInfo.chatroom_first_seq = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enterLeadSpeakInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo();
            if (bArr != null && bArr.length > 0) {
                enterLeadSpeakInfo3.parseFrom(bArr);
            }
            msgBaseInfo.enter_lead_speak_info = enterLeadSpeakInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo setChatroom_first_seq(long j17) {
        this.chatroom_first_seq = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgBaseInfo setEnter_lead_speak_info(com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enterLeadSpeakInfo) {
        this.enter_lead_speak_info = enterLeadSpeakInfo;
        return this;
    }
}
