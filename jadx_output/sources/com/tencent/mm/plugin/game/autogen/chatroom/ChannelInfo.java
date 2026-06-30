package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class ChannelInfo extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> channel_list = new java.util.LinkedList<>();
    public int default_channel_id;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo) fVar;
        return n51.f.a(this.channel_list, channelInfo.channel_list) && n51.f.a(java.lang.Integer.valueOf(this.default_channel_id), java.lang.Integer.valueOf(channelInfo.default_channel_id));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.channel_list);
            fVar.e(2, this.default_channel_id);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.channel_list) + 0 + b36.f.e(2, this.default_channel_id);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.channel_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo channelInfo = (com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            channelInfo.default_channel_id = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            com.tencent.mm.plugin.game.autogen.chatroom.Channel channel = new com.tencent.mm.plugin.game.autogen.chatroom.Channel();
            if (bArr2 != null && bArr2.length > 0) {
                channel.parseFrom(bArr2);
            }
            channelInfo.channel_list.add(channel);
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo setChannel_list(java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.Channel> linkedList) {
        this.channel_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.ChannelInfo setDefault_channel_id(int i17) {
        this.default_channel_id = i17;
        return this;
    }
}
