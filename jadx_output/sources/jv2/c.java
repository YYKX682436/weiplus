package jv2;

/* loaded from: classes10.dex */
public final class c extends jv2.b {
    public iv2.b P;
    public java.util.LinkedList Q;

    public c() {
        r45.et0 et0Var = new r45.et0();
        et0Var.set(1, new com.tencent.mm.protocal.protobuf.FinderCommentInfo());
        et0Var.set(2, new r45.bc4());
        et0Var.set(3, new r45.cc4());
        this.field_actionInfo = et0Var;
        this.Q = new java.util.LinkedList();
    }

    public final java.util.LinkedList A0() {
        return u0().getLevelTwoComment();
    }

    public final java.lang.String D0() {
        com.tencent.mm.protocal.protobuf.FinderContact author_contact = u0().getAuthor_contact();
        if (author_contact != null) {
            return ya2.d.h(author_contact, null, false, 3, null).w0();
        }
        java.lang.String nickname = u0().getNickname();
        return nickname == null ? "" : nickname;
    }

    public final long F0() {
        return u0().getReplyCommentId();
    }

    public final java.lang.String G0() {
        com.tencent.mm.protocal.protobuf.FinderContact reply_contact = u0().getReply_contact();
        if (reply_contact != null) {
            return ya2.d.h(reply_contact, null, false, 3, null).w0();
        }
        java.lang.String replyNickname = u0().getReplyNickname();
        return replyNickname == null ? "" : replyNickname;
    }

    public final java.lang.String I0() {
        java.lang.String reply_username = u0().getReply_username();
        return reply_username == null ? "" : reply_username;
    }

    public final long J0() {
        return this.field_actionInfo.getLong(4);
    }

    public final java.lang.String L0() {
        java.lang.String username = u0().getUsername();
        return username == null ? "" : username;
    }

    public final boolean P0() {
        return hc2.c0.a(v0());
    }

    public final r45.xk getBizInfo() {
        com.tencent.mm.protocal.protobuf.FinderContact author_contact = u0().getAuthor_contact();
        if (author_contact != null) {
            return ya2.d.b(ya2.d.h(author_contact, null, false, 3, null), false);
        }
        return null;
    }

    public final java.lang.String getClientId() {
        java.lang.String client_id = u0().getClient_id();
        return client_id == null ? "" : client_id;
    }

    public final int getLikeCount() {
        return u0().getLikeCount();
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
        java.lang.String str2 = "field_commentInfo{commentId:" + u0().getCommentId() + ", displayid:" + java.lang.Long.valueOf(u0().getDisplayid()) + " try_count " + this.field_tryCount + " conetent:%s}";
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
        return u0().getDisplayFlag();
    }

    public final long w0() {
        return u0().getDisplayid();
    }

    public final int y0() {
        return u0().getExpandCommentCount();
    }

    public final java.lang.String z0() {
        com.tencent.mm.protocal.protobuf.FinderContact author_contact = u0().getAuthor_contact();
        if (author_contact != null) {
            return ya2.d.h(author_contact, null, false, 3, null).getAvatarUrl();
        }
        java.lang.String headUrl = u0().getHeadUrl();
        return headUrl == null ? "" : headUrl;
    }
}
