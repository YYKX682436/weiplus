package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes8.dex */
public class JumpInfo extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroom_seq;
    public com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen half_screen;
    public int jump_type;
    public java.lang.String jump_url;
    public java.lang.String preload_id;
    public com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weapp_jump_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = (com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.jump_type), java.lang.Integer.valueOf(jumpInfo.jump_type)) && n51.f.a(this.jump_url, jumpInfo.jump_url) && n51.f.a(this.weapp_jump_info, jumpInfo.weapp_jump_info) && n51.f.a(this.half_screen, jumpInfo.half_screen) && n51.f.a(this.chatroom_seq, jumpInfo.chatroom_seq) && n51.f.a(this.preload_id, jumpInfo.preload_id);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.jump_type);
            java.lang.String str = this.jump_url;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo = this.weapp_jump_info;
            if (weappJumpInfo != null) {
                fVar.i(3, weappJumpInfo.computeSize());
                this.weapp_jump_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen = this.half_screen;
            if (halfScreen != null) {
                fVar.i(4, halfScreen.computeSize());
                this.half_screen.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroomSeq = this.chatroom_seq;
            if (chatroomSeq != null) {
                fVar.i(5, chatroomSeq.computeSize());
                this.chatroom_seq.writeFields(fVar);
            }
            java.lang.String str2 = this.preload_id;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.jump_type) + 0;
            java.lang.String str3 = this.jump_url;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo2 = this.weapp_jump_info;
            if (weappJumpInfo2 != null) {
                e17 += b36.f.i(3, weappJumpInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen2 = this.half_screen;
            if (halfScreen2 != null) {
                e17 += b36.f.i(4, halfScreen2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroomSeq2 = this.chatroom_seq;
            if (chatroomSeq2 != null) {
                e17 += b36.f.i(5, chatroomSeq2.computeSize());
            }
            java.lang.String str4 = this.preload_id;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = (com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jumpInfo.jump_type = aVar2.g(intValue);
                return 0;
            case 2:
                jumpInfo.jump_url = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo();
                    if (bArr != null && bArr.length > 0) {
                        weappJumpInfo3.parseFrom(bArr);
                    }
                    jumpInfo.weapp_jump_info = weappJumpInfo3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen3 = new com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen();
                    if (bArr2 != null && bArr2.length > 0) {
                        halfScreen3.parseFrom(bArr2);
                    }
                    jumpInfo.half_screen = halfScreen3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroomSeq3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq();
                    if (bArr3 != null && bArr3.length > 0) {
                        chatroomSeq3.parseFrom(bArr3);
                    }
                    jumpInfo.chatroom_seq = chatroomSeq3;
                }
                return 0;
            case 6:
                jumpInfo.preload_id = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo setChatroom_seq(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomSeq chatroomSeq) {
        this.chatroom_seq = chatroomSeq;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo setHalf_screen(com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen) {
        this.half_screen = halfScreen;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo setJump_type(int i17) {
        this.jump_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo setJump_url(java.lang.String str) {
        this.jump_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo setPreload_id(java.lang.String str) {
        this.preload_id = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo setWeapp_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.WeappJumpInfo weappJumpInfo) {
        this.weapp_jump_info = weappJumpInfo;
        return this;
    }
}
