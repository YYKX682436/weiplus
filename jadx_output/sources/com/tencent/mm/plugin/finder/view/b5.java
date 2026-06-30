package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f131690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131691b;

    /* renamed from: c, reason: collision with root package name */
    public final long f131692c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f131693d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f131694e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.yj0 f131695f;

    public b5(com.tencent.mm.plugin.finder.storage.FinderItem feedObj, boolean z17, long j17, boolean z18, boolean z19, com.tencent.mm.plugin.finder.storage.yj0 yj0Var) {
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        this.f131690a = feedObj;
        this.f131691b = z17;
        this.f131692c = j17;
        this.f131693d = z18;
        this.f131694e = z19;
        this.f131695f = yj0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.view.b5)) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.b5 b5Var = (com.tencent.mm.plugin.finder.view.b5) obj;
        return kotlin.jvm.internal.o.b(this.f131690a, b5Var.f131690a) && this.f131691b == b5Var.f131691b && this.f131692c == b5Var.f131692c && this.f131693d == b5Var.f131693d && this.f131694e == b5Var.f131694e && kotlin.jvm.internal.o.b(this.f131695f, b5Var.f131695f);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f131690a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f131691b)) * 31) + java.lang.Long.hashCode(this.f131692c)) * 31) + java.lang.Boolean.hashCode(this.f131693d)) * 31) + java.lang.Boolean.hashCode(this.f131694e)) * 31;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f131695f;
        return hashCode + (yj0Var == null ? 0 : yj0Var.hashCode());
    }

    public java.lang.String toString() {
        return "DrawerOpenData(feedObj=" + this.f131690a + ", isSingleMode=" + this.f131691b + ", refCommentId=" + this.f131692c + ", blinkRefComment=" + this.f131693d + ", showFooter=" + this.f131694e + ", replyCommentObj=" + this.f131695f + ')';
    }
}
