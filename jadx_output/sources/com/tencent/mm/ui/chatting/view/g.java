package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.view.j f202935a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f202936b;

    /* renamed from: c, reason: collision with root package name */
    public final int f202937c;

    /* renamed from: d, reason: collision with root package name */
    public final float f202938d;

    public g(com.tencent.mm.ui.chatting.view.j anim, android.graphics.Rect rect, int i17, float f17) {
        kotlin.jvm.internal.o.g(anim, "anim");
        this.f202935a = anim;
        this.f202936b = rect;
        this.f202937c = i17;
        this.f202938d = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.g)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.g gVar = (com.tencent.mm.ui.chatting.view.g) obj;
        return kotlin.jvm.internal.o.b(this.f202935a, gVar.f202935a) && kotlin.jvm.internal.o.b(this.f202936b, gVar.f202936b) && this.f202937c == gVar.f202937c && java.lang.Float.compare(this.f202938d, gVar.f202938d) == 0;
    }

    public int hashCode() {
        int hashCode = this.f202935a.hashCode() * 31;
        android.graphics.Rect rect = this.f202936b;
        return ((((hashCode + (rect == null ? 0 : rect.hashCode())) * 31) + java.lang.Integer.hashCode(this.f202937c)) * 31) + java.lang.Float.hashCode(this.f202938d);
    }

    public java.lang.String toString() {
        return "CancelledAnimInfo(anim=" + this.f202935a + ", clipAtCancel=" + this.f202936b + ", layoutWidthAtCancel=" + this.f202937c + ", textColorProgressAtCancel=" + this.f202938d + ')';
    }
}
