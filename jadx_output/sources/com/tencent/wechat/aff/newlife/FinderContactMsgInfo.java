package com.tencent.wechat.aff.newlife;

/* loaded from: classes10.dex */
public class FinderContactMsgInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderContactMsgInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderContactMsgInfo();
    public java.lang.String msg_username = "";
    public java.lang.String session_id = "";

    public static com.tencent.wechat.aff.newlife.FinderContactMsgInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderContactMsgInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderContactMsgInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderContactMsgInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderContactMsgInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderContactMsgInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderContactMsgInfo finderContactMsgInfo = (com.tencent.wechat.aff.newlife.FinderContactMsgInfo) fVar;
        return n51.f.a(this.msg_username, finderContactMsgInfo.msg_username) && n51.f.a(this.session_id, finderContactMsgInfo.session_id);
    }

    public java.lang.String getMsgUsername() {
        return this.msg_username;
    }

    public java.lang.String getMsg_username() {
        return this.msg_username;
    }

    public java.lang.String getSessionId() {
        return this.session_id;
    }

    public java.lang.String getSession_id() {
        return this.session_id;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderContactMsgInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.msg_username;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.session_id;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.msg_username;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.session_id;
            return str4 != null ? j17 + b36.f.j(2, str4) : j17;
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
            this.msg_username = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.session_id = aVar2.k(intValue);
        return 0;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo setMsgUsername(java.lang.String str) {
        this.msg_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo setMsg_username(java.lang.String str) {
        this.msg_username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo setSessionId(java.lang.String str) {
        this.session_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo setSession_id(java.lang.String str) {
        this.session_id = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderContactMsgInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderContactMsgInfo) super.parseFrom(bArr);
    }
}
