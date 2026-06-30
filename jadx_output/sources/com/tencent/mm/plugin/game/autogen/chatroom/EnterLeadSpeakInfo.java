package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class EnterLeadSpeakInfo extends com.tencent.mm.protobuf.f {
    public int disappear_second;
    public java.lang.String jump_wording;
    public java.lang.String lead_speak_wording;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enterLeadSpeakInfo = (com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo) fVar;
        return n51.f.a(this.jump_wording, enterLeadSpeakInfo.jump_wording) && n51.f.a(this.lead_speak_wording, enterLeadSpeakInfo.lead_speak_wording) && n51.f.a(java.lang.Integer.valueOf(this.disappear_second), java.lang.Integer.valueOf(enterLeadSpeakInfo.disappear_second));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.jump_wording;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.lead_speak_wording;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.disappear_second);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.jump_wording;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.lead_speak_wording;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.disappear_second);
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
        com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo enterLeadSpeakInfo = (com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            enterLeadSpeakInfo.jump_wording = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            enterLeadSpeakInfo.lead_speak_wording = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        enterLeadSpeakInfo.disappear_second = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo setDisappear_second(int i17) {
        this.disappear_second = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo setJump_wording(java.lang.String str) {
        this.jump_wording = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.EnterLeadSpeakInfo setLead_speak_wording(java.lang.String str) {
        this.lead_speak_wording = str;
        return this;
    }
}
