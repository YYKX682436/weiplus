package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class MsgOptions extends com.tencent.mm.protobuf.f {
    public java.util.LinkedList<java.lang.String> at_list = new java.util.LinkedList<>();
    public int bg_type;
    public com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo chosen_info;
    public com.tencent.mm.protobuf.g cli_local_data;
    public java.lang.String complaint_url;
    public int msg_biz_type;
    public com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo msg_channel_info;
    public long reply_seq;
    public boolean self_msg;
    public com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickle_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topic_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo vote_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions = (com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions) fVar;
        return n51.f.a(this.at_list, msgOptions.at_list) && n51.f.a(this.complaint_url, msgOptions.complaint_url) && n51.f.a(this.cli_local_data, msgOptions.cli_local_data) && n51.f.a(java.lang.Integer.valueOf(this.msg_biz_type), java.lang.Integer.valueOf(msgOptions.msg_biz_type)) && n51.f.a(java.lang.Boolean.valueOf(this.self_msg), java.lang.Boolean.valueOf(msgOptions.self_msg)) && n51.f.a(java.lang.Long.valueOf(this.reply_seq), java.lang.Long.valueOf(msgOptions.reply_seq)) && n51.f.a(this.vote_info, msgOptions.vote_info) && n51.f.a(java.lang.Integer.valueOf(this.bg_type), java.lang.Integer.valueOf(msgOptions.bg_type)) && n51.f.a(this.chosen_info, msgOptions.chosen_info) && n51.f.a(this.msg_channel_info, msgOptions.msg_channel_info) && n51.f.a(this.topic_info, msgOptions.topic_info) && n51.f.a(this.tickle_info, msgOptions.tickle_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.at_list);
            java.lang.String str = this.complaint_url;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.cli_local_data;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.msg_biz_type);
            fVar.a(5, this.self_msg);
            fVar.h(6, this.reply_seq);
            com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo = this.vote_info;
            if (voteInfo != null) {
                fVar.i(7, voteInfo.computeSize());
                this.vote_info.writeFields(fVar);
            }
            fVar.e(8, this.bg_type);
            com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo chosenInfo = this.chosen_info;
            if (chosenInfo != null) {
                fVar.i(9, chosenInfo.computeSize());
                this.chosen_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo msgChannelInfo = this.msg_channel_info;
            if (msgChannelInfo != null) {
                fVar.i(10, msgChannelInfo.computeSize());
                this.msg_channel_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo = this.topic_info;
            if (topicInfo != null) {
                fVar.i(11, topicInfo.computeSize());
                this.topic_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickleInfo = this.tickle_info;
            if (tickleInfo != null) {
                fVar.i(12, tickleInfo.computeSize());
                this.tickle_info.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.at_list) + 0;
            java.lang.String str2 = this.complaint_url;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.cli_local_data;
            if (gVar2 != null) {
                g17 += b36.f.b(3, gVar2);
            }
            int e17 = g17 + b36.f.e(4, this.msg_biz_type) + b36.f.a(5, this.self_msg) + b36.f.h(6, this.reply_seq);
            com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo2 = this.vote_info;
            if (voteInfo2 != null) {
                e17 += b36.f.i(7, voteInfo2.computeSize());
            }
            int e18 = e17 + b36.f.e(8, this.bg_type);
            com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo chosenInfo2 = this.chosen_info;
            if (chosenInfo2 != null) {
                e18 += b36.f.i(9, chosenInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo msgChannelInfo2 = this.msg_channel_info;
            if (msgChannelInfo2 != null) {
                e18 += b36.f.i(10, msgChannelInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo2 = this.topic_info;
            if (topicInfo2 != null) {
                e18 += b36.f.i(11, topicInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickleInfo2 = this.tickle_info;
            return tickleInfo2 != null ? e18 + b36.f.i(12, tickleInfo2.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.at_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions msgOptions = (com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                msgOptions.at_list.add(aVar2.k(intValue));
                return 0;
            case 2:
                msgOptions.complaint_url = aVar2.k(intValue);
                return 0;
            case 3:
                msgOptions.cli_local_data = aVar2.d(intValue);
                return 0;
            case 4:
                msgOptions.msg_biz_type = aVar2.g(intValue);
                return 0;
            case 5:
                msgOptions.self_msg = aVar2.c(intValue);
                return 0;
            case 6:
                msgOptions.reply_seq = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        voteInfo3.parseFrom(bArr2);
                    }
                    msgOptions.vote_info = voteInfo3;
                }
                return 0;
            case 8:
                msgOptions.bg_type = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo chosenInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        chosenInfo3.parseFrom(bArr3);
                    }
                    msgOptions.chosen_info = chosenInfo3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo msgChannelInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo();
                    if (bArr4 != null && bArr4.length > 0) {
                        msgChannelInfo3.parseFrom(bArr4);
                    }
                    msgOptions.msg_channel_info = msgChannelInfo3;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo();
                    if (bArr5 != null && bArr5.length > 0) {
                        topicInfo3.parseFrom(bArr5);
                    }
                    msgOptions.topic_info = topicInfo3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickleInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo();
                    if (bArr6 != null && bArr6.length > 0) {
                        tickleInfo3.parseFrom(bArr6);
                    }
                    msgOptions.tickle_info = tickleInfo3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setAt_list(java.util.LinkedList<java.lang.String> linkedList) {
        this.at_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setBg_type(int i17) {
        this.bg_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setChosen_info(com.tencent.mm.plugin.game.autogen.chatroom.ChosenInfo chosenInfo) {
        this.chosen_info = chosenInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setCli_local_data(com.tencent.mm.protobuf.g gVar) {
        this.cli_local_data = gVar;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setComplaint_url(java.lang.String str) {
        this.complaint_url = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setMsg_biz_type(int i17) {
        this.msg_biz_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setMsg_channel_info(com.tencent.mm.plugin.game.autogen.chatroom.MsgChannelInfo msgChannelInfo) {
        this.msg_channel_info = msgChannelInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setReply_seq(long j17) {
        this.reply_seq = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setSelf_msg(boolean z17) {
        this.self_msg = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setTickle_info(com.tencent.mm.plugin.game.autogen.chatroom.TickleInfo tickleInfo) {
        this.tickle_info = tickleInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setTopic_info(com.tencent.mm.plugin.game.autogen.chatroom.TopicInfo topicInfo) {
        this.topic_info = topicInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions setVote_info(com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo) {
        this.vote_info = voteInfo;
        return this;
    }
}
