package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class yj0 extends com.tencent.mm.plugin.finder.storage.wj0 {

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f128394l1;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f128395p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f128396x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f128397x1;

    /* renamed from: y0, reason: collision with root package name */
    public java.util.LinkedList f128398y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f128399y1;

    public yj0() {
        r45.et0 et0Var = new r45.et0();
        et0Var.set(1, new com.tencent.mm.protocal.protobuf.FinderCommentInfo());
        et0Var.set(2, new r45.bc4());
        et0Var.set(3, new r45.cc4());
        this.field_actionInfo = et0Var;
        this.f128398y0 = new java.util.LinkedList();
        this.f128394l1 = "";
        this.f128395p1 = "";
    }

    public final int A0() {
        return u0().getExpandCommentCount();
    }

    public final int D0() {
        return this.field_failedFlag;
    }

    public final java.lang.String F0() {
        return this.f128395p1;
    }

    public final long G0() {
        return this.field_feedId;
    }

    public final int I0() {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        r45.k60 J0 = J0();
        java.lang.Object obj = null;
        if (J0 != null && (list3 = J0.getList(0)) != null) {
            java.util.Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((r45.h60) next).getString(0), c01.z1.r())) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.h60) obj;
        }
        if (obj != null) {
            r45.k60 J02 = J0();
            int size = ((J02 == null || (list2 = J02.getList(0)) == null) ? 0 : list2.size()) - 1;
            if (size < 0) {
                return 0;
            }
            return size;
        }
        r45.k60 J03 = J0();
        if (J03 == null || (list = J03.getList(0)) == null) {
            return 0;
        }
        return list.size();
    }

    public final r45.k60 J0() {
        return u0().getFriend_recommend_list();
    }

    public final java.lang.String L0() {
        com.tencent.mm.protocal.protobuf.FinderContact author_contact = u0().getAuthor_contact();
        if (author_contact != null) {
            return ya2.d.h(author_contact, null, false, 3, null).getAvatarUrl();
        }
        java.lang.String headUrl = u0().getHeadUrl();
        return headUrl == null ? "" : headUrl;
    }

    public final java.util.LinkedList P0() {
        return u0().getLevelTwoComment();
    }

    public final java.util.LinkedList Q0() {
        return this.field_actionInfo.getList(11);
    }

    public final java.lang.String R0() {
        com.tencent.mm.protocal.protobuf.FinderContact author_contact = u0().getAuthor_contact();
        if (author_contact != null) {
            return ya2.d.h(author_contact, null, false, 3, null).w0();
        }
        java.lang.String nickname = u0().getNickname();
        return nickname == null ? "" : nickname;
    }

    public final long T0() {
        return u0().getReplyCommentId();
    }

    public final java.lang.String U0() {
        com.tencent.mm.protocal.protobuf.FinderContact reply_contact = u0().getReply_contact();
        if (reply_contact != null) {
            return ya2.d.h(reply_contact, null, false, 3, null).w0();
        }
        java.lang.String replyNickname = u0().getReplyNickname();
        return replyNickname == null ? "" : replyNickname;
    }

    public final java.lang.String W0() {
        java.lang.String reply_username = u0().getReply_username();
        return reply_username == null ? "" : reply_username;
    }

    public final long Y0() {
        return this.field_actionInfo.getLong(4);
    }

    public final java.lang.String Z0() {
        java.lang.String username = u0().getUsername();
        return username == null ? "" : username;
    }

    public final boolean a1() {
        return u0().getComment_type() == 1;
    }

    public final boolean c1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return kotlin.jvm.internal.o.b(xy2.c.e(context), Z0()) || kotlin.jvm.internal.o.b(c01.z1.r(), Z0());
    }

    public final boolean d1() {
        int i17 = this.field_state;
        return (i17 == 3 || i17 == 1 || i17 == -1) ? false : true;
    }

    public final boolean e1() {
        return hc2.c0.a(z0());
    }

    public final boolean f1() {
        return (z0() & 128) != 0;
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

    public final int getLikeFlag() {
        return u0().getLikeFlag();
    }

    public final boolean h1() {
        return (z0() & 2) != 0;
    }

    public final boolean i1() {
        return u0().getComment_type() == 2;
    }

    public final java.lang.String j() {
        java.lang.String content = u0().getContent();
        return content == null ? "" : content;
    }

    public final boolean j1() {
        return a1() || i1();
    }

    public final boolean k1() {
        if (w0() != 5) {
            return false;
        }
        r45.o60 ref_product_jump_info = u0().getRef_product_jump_info();
        if (!((ref_product_jump_info != null ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ref_product_jump_info.getCustom(1) : null) == null)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("LocalFinderCommentObject", "type is refProduct but empty refProduct jumpInfo with comment:".concat(pm0.v.u(t0())));
        return false;
    }

    public final void l1(int i17) {
        u0().setDisplayFlag(i17);
    }

    public final void n1(long j17) {
        this.field_actionInfo.set(4, java.lang.Long.valueOf(j17));
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

    public final r45.e60 v0() {
        return u0().getContent_info();
    }

    public final int w0() {
        return u0().getContent_type();
    }

    public final long y0() {
        return u0().getCreatetime();
    }

    public final int z0() {
        return u0().getDisplayFlag();
    }
}
