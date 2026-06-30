package com.tencent.mm.plugin.game.autogen.chatroom;

/* loaded from: classes4.dex */
public class VoteMsgResponse extends r45.js5 {
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo education_jump_info;
    public java.lang.String report_ext_info;
    public com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo vote_info;

    public static final com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse create() {
        return new com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse)) {
            return false;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse voteMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse) fVar;
        return n51.f.a(this.BaseResponse, voteMsgResponse.BaseResponse) && n51.f.a(this.vote_info, voteMsgResponse.vote_info) && n51.f.a(this.education_jump_info, voteMsgResponse.education_jump_info) && n51.f.a(this.report_ext_info, voteMsgResponse.report_ext_info);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo = this.vote_info;
            if (voteInfo != null) {
                fVar.i(2, voteInfo.computeSize());
                this.vote_info.writeFields(fVar);
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.education_jump_info;
            if (jumpInfo != null) {
                fVar.i(3, jumpInfo.computeSize());
                this.education_jump_info.writeFields(fVar);
            }
            java.lang.String str = this.report_ext_info;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo2 = this.vote_info;
            if (voteInfo2 != null) {
                i18 += b36.f.i(2, voteInfo2.computeSize());
            }
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo2 = this.education_jump_info;
            if (jumpInfo2 != null) {
                i18 += b36.f.i(3, jumpInfo2.computeSize());
            }
            java.lang.String str2 = this.report_ext_info;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse voteMsgResponse = (com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                voteMsgResponse.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo();
                if (bArr2 != null && bArr2.length > 0) {
                    voteInfo3.parseFrom(bArr2);
                }
                voteMsgResponse.vote_info = voteInfo3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            voteMsgResponse.report_ext_info = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo3 = new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo();
            if (bArr3 != null && bArr3.length > 0) {
                jumpInfo3.parseFrom(bArr3);
            }
            voteMsgResponse.education_jump_info = jumpInfo3;
        }
        return 0;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse setEducation_jump_info(com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo) {
        this.education_jump_info = jumpInfo;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse setReport_ext_info(java.lang.String str) {
        this.report_ext_info = str;
        return this;
    }

    public com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse setVote_info(com.tencent.mm.plugin.game.autogen.chatroom.VoteInfo voteInfo) {
        this.vote_info = voteInfo;
        return this;
    }
}
