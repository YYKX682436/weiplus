package jv2;

/* loaded from: classes10.dex */
public final class a extends jv2.e {
    public iv2.a M;
    public java.util.LinkedList N;

    public a() {
        r45.et0 et0Var = new r45.et0();
        et0Var.set(1, new com.tencent.mm.protocal.protobuf.FinderCommentInfo());
        et0Var.set(2, new r45.bc4());
        et0Var.set(3, new r45.cc4());
        this.field_actionInfo = et0Var;
        this.N = new java.util.LinkedList();
    }

    public final long A0() {
        return this.field_actionInfo.getLong(4);
    }

    public final java.lang.String D0() {
        java.lang.String username = u0().getUsername();
        return username == null ? "" : username;
    }

    public final java.lang.String getClientId() {
        java.lang.String client_id = u0().getClient_id();
        return client_id == null ? "" : client_id;
    }

    public final java.lang.String j() {
        java.lang.String content = u0().getContent();
        return content == null ? "" : content;
    }

    public final long t0() {
        return u0().getCommentId();
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = "field_commentInfo{commentId:" + u0().getCommentId() + ", reply_username:" + u0().getReply_username() + ",feedId:" + this.field_feedId + ",displayid:" + java.lang.Long.valueOf(u0().getDisplayid()) + " try_count " + this.field_tryCount + " conetent:%s}";
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String content = u0().getContent();
        if (content != null) {
            str = content.substring(0, java.lang.Math.min(content.length(), 2));
            kotlin.jvm.internal.o.f(str, "substring(...)");
        } else {
            str = "";
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format(str2, java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo u0() {
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) this.field_actionInfo.getCustom(1);
        return finderCommentInfo == null ? new com.tencent.mm.protocal.protobuf.FinderCommentInfo() : finderCommentInfo;
    }

    public final int v0() {
        return u0().getExpandCommentCount();
    }

    public final java.util.LinkedList w0() {
        return u0().getLevelTwoComment();
    }

    public final java.lang.String y0() {
        java.lang.String nickname = u0().getNickname();
        return nickname == null ? "" : nickname;
    }

    public final java.lang.String z0() {
        java.lang.String replyNickname = u0().getReplyNickname();
        return replyNickname == null ? "" : replyNickname;
    }
}
