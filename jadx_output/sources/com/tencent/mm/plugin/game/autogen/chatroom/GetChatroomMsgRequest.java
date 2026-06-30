package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class GetChatroomMsgRequest extends r45.mr5 {
    public int channel_id;
    public java.lang.String chatroom_name;
    public long seq_gt;
    public long seq_lt;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest getChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest) fVar;
        return n51.f.a(this.BaseRequest, getChatroomMsgRequest.BaseRequest) && n51.f.a(this.chatroom_name, getChatroomMsgRequest.chatroom_name) && n51.f.a(java.lang.Long.valueOf(this.seq_gt), java.lang.Long.valueOf(getChatroomMsgRequest.seq_gt)) && n51.f.a(java.lang.Long.valueOf(this.seq_lt), java.lang.Long.valueOf(getChatroomMsgRequest.seq_lt)) && n51.f.a(java.lang.Integer.valueOf(this.channel_id), java.lang.Integer.valueOf(getChatroomMsgRequest.channel_id));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.chatroom_name;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.seq_gt);
            fVar.h(4, this.seq_lt);
            fVar.e(5, this.channel_id);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.chatroom_name;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.h(3, this.seq_gt) + b36.f.h(4, this.seq_lt) + b36.f.e(5, this.channel_id);
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
        com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest getChatroomMsgRequest = (com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                getChatroomMsgRequest.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            getChatroomMsgRequest.chatroom_name = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            getChatroomMsgRequest.seq_gt = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            getChatroomMsgRequest.seq_lt = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        getChatroomMsgRequest.channel_id = aVar2.g(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest setChannel_id(int i17) {
        this.channel_id = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest setChatroom_name(java.lang.String str) {
        this.chatroom_name = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest setSeq_gt(long j17) {
        this.seq_gt = j17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest setSeq_lt(long j17) {
        this.seq_lt = j17;
        return this;
    }
}
