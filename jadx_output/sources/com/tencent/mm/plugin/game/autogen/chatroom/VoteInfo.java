package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class VoteInfo extends com.tencent.mm.protobuf.f {
    public boolean can_vote;
    public java.lang.String desc;
    public java.util.LinkedList<java.lang.String> latest_voter_username_list = new java.util.LinkedList<>();
    public int show_type;
    public boolean voted_by_me;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo = (com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo) fVar;
        return n51.f.a(this.latest_voter_username_list, voteInfo.latest_voter_username_list) && n51.f.a(this.desc, voteInfo.desc) && n51.f.a(java.lang.Integer.valueOf(this.show_type), java.lang.Integer.valueOf(voteInfo.show_type)) && n51.f.a(java.lang.Boolean.valueOf(this.voted_by_me), java.lang.Boolean.valueOf(voteInfo.voted_by_me)) && n51.f.a(java.lang.Boolean.valueOf(this.can_vote), java.lang.Boolean.valueOf(voteInfo.can_vote));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.latest_voter_username_list);
            java.lang.String str = this.desc;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.show_type);
            fVar.a(4, this.voted_by_me);
            fVar.a(5, this.can_vote);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.latest_voter_username_list) + 0;
            java.lang.String str2 = this.desc;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.e(3, this.show_type) + b36.f.a(4, this.voted_by_me) + b36.f.a(5, this.can_vote);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.latest_voter_username_list.clear();
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
        com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo = (com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            voteInfo.latest_voter_username_list.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            voteInfo.desc = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            voteInfo.show_type = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            voteInfo.voted_by_me = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        voteInfo.can_vote = aVar2.c(intValue);
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo setCan_vote(boolean z17) {
        this.can_vote = z17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo setDesc(java.lang.String str) {
        this.desc = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo setLatest_voter_username_list(java.util.LinkedList<java.lang.String> linkedList) {
        this.latest_voter_username_list = linkedList;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo setShow_type(int i17) {
        this.show_type = i17;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo setVoted_by_me(boolean z17) {
        this.voted_by_me = z17;
        return this;
    }
}
