package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.k3 f202962a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f202963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f202964c;

    /* renamed from: d, reason: collision with root package name */
    public final int f202965d;

    /* renamed from: e, reason: collision with root package name */
    public final android.animation.ValueAnimator f202966e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f202967f;

    /* renamed from: g, reason: collision with root package name */
    public final float f202968g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f202969h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.k3 f202970i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f202971j;

    /* renamed from: k, reason: collision with root package name */
    public final float f202972k;

    public j(androidx.recyclerview.widget.k3 newHolder, android.view.View newView, int i17, int i18, android.animation.ValueAnimator animator, android.graphics.Rect rect, float f17, java.lang.Integer num, androidx.recyclerview.widget.k3 k3Var, android.view.View view, float f18) {
        kotlin.jvm.internal.o.g(newHolder, "newHolder");
        kotlin.jvm.internal.o.g(newView, "newView");
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f202962a = newHolder;
        this.f202963b = newView;
        this.f202964c = i17;
        this.f202965d = i18;
        this.f202966e = animator;
        this.f202967f = rect;
        this.f202968g = f17;
        this.f202969h = num;
        this.f202970i = k3Var;
        this.f202971j = view;
        this.f202972k = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.j)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.j jVar = (com.tencent.mm.ui.chatting.view.j) obj;
        return kotlin.jvm.internal.o.b(this.f202962a, jVar.f202962a) && kotlin.jvm.internal.o.b(this.f202963b, jVar.f202963b) && this.f202964c == jVar.f202964c && this.f202965d == jVar.f202965d && kotlin.jvm.internal.o.b(this.f202966e, jVar.f202966e) && kotlin.jvm.internal.o.b(this.f202967f, jVar.f202967f) && java.lang.Float.compare(this.f202968g, jVar.f202968g) == 0 && kotlin.jvm.internal.o.b(this.f202969h, jVar.f202969h) && kotlin.jvm.internal.o.b(this.f202970i, jVar.f202970i) && kotlin.jvm.internal.o.b(this.f202971j, jVar.f202971j) && java.lang.Float.compare(this.f202972k, jVar.f202972k) == 0;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f202962a.hashCode() * 31) + this.f202963b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f202964c)) * 31) + java.lang.Integer.hashCode(this.f202965d)) * 31) + this.f202966e.hashCode()) * 31;
        android.graphics.Rect rect = this.f202967f;
        int hashCode2 = (((hashCode + (rect == null ? 0 : rect.hashCode())) * 31) + java.lang.Float.hashCode(this.f202968g)) * 31;
        java.lang.Integer num = this.f202969h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        androidx.recyclerview.widget.k3 k3Var = this.f202970i;
        int hashCode4 = (hashCode3 + (k3Var == null ? 0 : k3Var.hashCode())) * 31;
        android.view.View view = this.f202971j;
        return ((hashCode4 + (view != null ? view.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f202972k);
    }

    public java.lang.String toString() {
        return "RunningAnim(newHolder=" + this.f202962a + ", newView=" + this.f202963b + ", originalWidth=" + this.f202964c + ", originalHeight=" + this.f202965d + ", animator=" + this.f202966e + ", originalClip=" + this.f202967f + ", originalNewAlpha=" + this.f202968g + ", baseTextColor=" + this.f202969h + ", oldHolder=" + this.f202970i + ", oldView=" + this.f202971j + ", oldViewAlpha=" + this.f202972k + ')';
    }
}
