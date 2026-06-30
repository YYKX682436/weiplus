package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f132878a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f132879b;

    /* renamed from: c, reason: collision with root package name */
    public int f132880c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f132881d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f132882e;

    public q7(com.tencent.mm.api.IEmojiInfo iEmojiInfo, java.lang.String str, int i17, boolean z17, java.lang.Long l17) {
        this.f132878a = iEmojiInfo;
        this.f132879b = str;
        this.f132880c = i17;
        this.f132881d = z17;
        this.f132882e = l17;
    }

    public final r45.e60 a() {
        int i17 = this.f132880c;
        if (i17 != 1) {
            if (i17 != 2 || this.f132879b == null) {
                return null;
            }
            r45.e60 e60Var = new r45.e60();
            java.util.LinkedList list = e60Var.getList(1);
            r45.j60 j60Var = new r45.j60();
            j60Var.set(0, this.f132879b);
            list.add(j60Var);
            return e60Var;
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f132878a;
        if (iEmojiInfo == null) {
            return null;
        }
        r45.e60 e60Var2 = new r45.e60();
        java.util.LinkedList list2 = e60Var2.getList(0);
        r45.g60 g60Var = new r45.g60();
        g60Var.set(0, iEmojiInfo.getMd5());
        g60Var.set(2, iEmojiInfo.X0());
        g60Var.set(4, iEmojiInfo.S0());
        g60Var.set(1, iEmojiInfo.E1());
        g60Var.set(5, ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).Ai(iEmojiInfo));
        g60Var.set(3, iEmojiInfo.getGroupId());
        g60Var.set(6, java.lang.Integer.valueOf(iEmojiInfo.getHeight()));
        g60Var.set(7, java.lang.Integer.valueOf(iEmojiInfo.getWidth()));
        list2.add(g60Var);
        return e60Var2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.q7)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.q7 q7Var = (com.tencent.mm.plugin.finder.view.q7) obj;
        return kotlin.jvm.internal.o.b(this.f132878a, q7Var.f132878a) && kotlin.jvm.internal.o.b(this.f132879b, q7Var.f132879b) && this.f132880c == q7Var.f132880c && this.f132881d == q7Var.f132881d && kotlin.jvm.internal.o.b(this.f132882e, q7Var.f132882e);
    }

    public int hashCode() {
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f132878a;
        int hashCode = (iEmojiInfo == null ? 0 : iEmojiInfo.hashCode()) * 31;
        java.lang.String str = this.f132879b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f132880c)) * 31) + java.lang.Boolean.hashCode(this.f132881d)) * 31;
        java.lang.Long l17 = this.f132882e;
        return hashCode2 + (l17 != null ? l17.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderCommentPostContent(emoji=" + this.f132878a + ", image=" + this.f132879b + ", contentType=" + this.f132880c + ", fromRecentImage=" + this.f132881d + ", imageFileModifiedTime=" + this.f132882e + ')';
    }

    public /* synthetic */ q7(com.tencent.mm.api.IEmojiInfo iEmojiInfo, java.lang.String str, int i17, boolean z17, java.lang.Long l17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? null : iEmojiInfo, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? false : z17, (i18 & 16) != 0 ? null : l17);
    }
}
