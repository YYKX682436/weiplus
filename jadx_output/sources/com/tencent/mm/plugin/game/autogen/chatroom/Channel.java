package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class Channel extends com.tencent.mm.protobuf.f {
    public java.lang.String cant_send_reason;
    public int channel_id;
    public java.lang.String desc;
    public java.lang.String name;
    public boolean read_only;
    public long unread_msg_count;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.Channel create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.Channel();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.Channel)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = (com.tencent.mm.plugin.game.autogen.chatroom.Channel) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.channel_id), java.lang.Integer.valueOf(channel.channel_id)) && n51.f.a(this.name, channel.name) && n51.f.a(java.lang.Boolean.valueOf(this.read_only), java.lang.Boolean.valueOf(channel.read_only)) && n51.f.a(this.cant_send_reason, channel.cant_send_reason) && n51.f.a(this.desc, channel.desc) && n51.f.a(java.lang.Long.valueOf(this.unread_msg_count), java.lang.Long.valueOf(channel.unread_msg_count));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.channel_id);
            java.lang.String str = this.name;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.read_only);
            java.lang.String str2 = this.cant_send_reason;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.desc;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.unread_msg_count);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.channel_id) + 0;
            java.lang.String str4 = this.name;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int a17 = e17 + b36.f.a(3, this.read_only);
            java.lang.String str5 = this.cant_send_reason;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.desc;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            return a17 + b36.f.h(6, this.unread_msg_count);
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
        com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = (com.tencent.mm.plugin.game.autogen.chatroom.Channel) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                channel.channel_id = aVar2.g(intValue);
                return 0;
            case 2:
                channel.name = aVar2.k(intValue);
                return 0;
            case 3:
                channel.read_only = aVar2.c(intValue);
                return 0;
            case 4:
                channel.cant_send_reason = aVar2.k(intValue);
                return 0;
            case 5:
                channel.desc = aVar2.k(intValue);
                return 0;
            case 6:
                channel.unread_msg_count = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Channel setCant_send_reason(java.lang.String str) {
        this.cant_send_reason = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Channel setChannel_id(int i17) {
        this.channel_id = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Channel setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Channel setName(java.lang.String str) {
        this.name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Channel setRead_only(boolean z17) {
        this.read_only = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.Channel setUnread_msg_count(long j17) {
        this.unread_msg_count = j17;
        return this;
    }
}
