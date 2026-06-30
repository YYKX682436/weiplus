package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class BroadcastMessage extends com.tencent.mm.protobuf.f {
    public com.tencent.mm.plugin.game.autogen.chatroom.Color color;
    public int disappear_second;
    public int type;
    public java.util.LinkedList<java.lang.String> username_list = new java.util.LinkedList<>();
    public java.lang.String wording;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage broadcastMessage = (com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage) fVar;
        return n51.f.a(this.wording, broadcastMessage.wording) && n51.f.a(this.username_list, broadcastMessage.username_list) && n51.f.a(java.lang.Integer.valueOf(this.type), java.lang.Integer.valueOf(broadcastMessage.type)) && n51.f.a(this.color, broadcastMessage.color) && n51.f.a(java.lang.Integer.valueOf(this.disappear_second), java.lang.Integer.valueOf(broadcastMessage.disappear_second));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.wording;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.username_list);
            fVar.e(3, this.type);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color = this.color;
            if (color != null) {
                fVar.i(4, color.computeSize());
                this.color.writeFields(fVar);
            }
            fVar.e(5, this.disappear_second);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.wording;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 1, this.username_list) + b36.f.e(3, this.type);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color2 = this.color;
            if (color2 != null) {
                j17 += b36.f.i(4, color2.computeSize());
            }
            return j17 + b36.f.e(5, this.disappear_second);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.username_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage broadcastMessage = (com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            broadcastMessage.wording = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            broadcastMessage.username_list.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            broadcastMessage.type = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            broadcastMessage.disappear_second = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.Color color3 = new com.tencent.mm.plugin.game.autogen.chatroom.Color();
            if (bArr2 != null && bArr2.length > 0) {
                color3.parseFrom(bArr2);
            }
            broadcastMessage.color = color3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage setColor(com.tencent.mm.plugin.game.autogen.chatroom.Color color) {
        this.color = color;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage setDisappear_second(int i17) {
        this.disappear_second = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage setType(int i17) {
        this.type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage setUsername_list(java.util.LinkedList<java.lang.String> linkedList) {
        this.username_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.BroadcastMessage setWording(java.lang.String str) {
        this.wording = str;
        return this;
    }
}
