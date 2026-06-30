package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.animation.ValueAnimator f202956a;

    /* renamed from: b, reason: collision with root package name */
    public final long f202957b;

    /* renamed from: c, reason: collision with root package name */
    public int f202958c;

    public i(android.animation.ValueAnimator animator, long j17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 4) != 0 ? -1 : i17;
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f202956a = animator;
        this.f202957b = j17;
        this.f202958c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.i)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.i iVar = (com.tencent.mm.ui.chatting.view.i) obj;
        return kotlin.jvm.internal.o.b(this.f202956a, iVar.f202956a) && this.f202957b == iVar.f202957b && this.f202958c == iVar.f202958c;
    }

    public int hashCode() {
        return (((this.f202956a.hashCode() * 31) + java.lang.Long.hashCode(this.f202957b)) * 31) + java.lang.Integer.hashCode(this.f202958c);
    }

    public java.lang.String toString() {
        return "LoadingSpanController(animator=" + this.f202956a + ", msgId=" + this.f202957b + ", lastStart=" + this.f202958c + ')';
    }
}
