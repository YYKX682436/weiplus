package com.tencent.wechat.aff.newlife;

/* loaded from: classes4.dex */
public class FinderCommentMentionedUser extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderCommentMentionedUser DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderCommentMentionedUser();
    public com.tencent.mm.protobuf.g mentioned_cli_buf = com.tencent.mm.protobuf.g.f192155b;
    public java.lang.String username = "";

    public static com.tencent.wechat.aff.newlife.FinderCommentMentionedUser create() {
        return new com.tencent.wechat.aff.newlife.FinderCommentMentionedUser();
    }

    public static com.tencent.wechat.aff.newlife.FinderCommentMentionedUser getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderCommentMentionedUser newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderCommentMentionedUser();
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderCommentMentionedUser)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderCommentMentionedUser finderCommentMentionedUser = (com.tencent.wechat.aff.newlife.FinderCommentMentionedUser) fVar;
        return n51.f.a(this.mentioned_cli_buf, finderCommentMentionedUser.mentioned_cli_buf) && n51.f.a(this.username, finderCommentMentionedUser.username);
    }

    public com.tencent.mm.protobuf.g getMentionedCliBuf() {
        return this.mentioned_cli_buf;
    }

    public com.tencent.mm.protobuf.g getMentioned_cli_buf() {
        return this.mentioned_cli_buf;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderCommentMentionedUser();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.mentioned_cli_buf;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.username;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.mentioned_cli_buf;
            int b17 = gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0;
            java.lang.String str2 = this.username;
            return str2 != null ? b17 + b36.f.j(2, str2) : b17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.mentioned_cli_buf = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.username = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser setMentionedCliBuf(com.tencent.mm.protobuf.g gVar) {
        this.mentioned_cli_buf = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser setMentioned_cli_buf(com.tencent.mm.protobuf.g gVar) {
        this.mentioned_cli_buf = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderCommentMentionedUser parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderCommentMentionedUser) super.parseFrom(bArr);
    }
}
