package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class PremadeCardInfo extends com.tencent.mm.protobuf.f {
    public java.lang.String premade_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon team_icon_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo = (com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo) fVar;
        return n51.f.a(this.premade_info, premadeCardInfo.premade_info) && n51.f.a(this.team_icon_info, premadeCardInfo.team_icon_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.premade_info;
            if (str != null) {
                fVar.j(1, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon teamIcon = this.team_icon_info;
            if (teamIcon != null) {
                fVar.i(2, teamIcon.computeSize());
                this.team_icon_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.premade_info;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon teamIcon2 = this.team_icon_info;
            return teamIcon2 != null ? j17 + b36.f.i(2, teamIcon2.computeSize()) : j17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo premadeCardInfo = (com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            premadeCardInfo.premade_info = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon teamIcon3 = new com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon();
            if (bArr != null && bArr.length > 0) {
                teamIcon3.parseFrom(bArr);
            }
            premadeCardInfo.team_icon_info = teamIcon3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo setPremade_info(java.lang.String str) {
        this.premade_info = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.PremadeCardInfo setTeam_icon_info(com.tencent.mm.plugin.game.autogen.chatroom.TeamIcon teamIcon) {
        this.team_icon_info = teamIcon;
        return this;
    }
}
