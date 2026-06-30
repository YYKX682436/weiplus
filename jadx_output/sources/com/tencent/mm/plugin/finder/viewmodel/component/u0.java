package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f136073a;

    /* renamed from: b, reason: collision with root package name */
    public long f136074b = 5000;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.drawable.Drawable f136075c;

    /* renamed from: d, reason: collision with root package name */
    public int f136076d;

    /* renamed from: e, reason: collision with root package name */
    public long f136077e;

    public u0(int i17) {
        android.graphics.drawable.Drawable drawable = com.tencent.mm.sdk.platformtools.x2.f193075e.getDrawable(com.tencent.mm.R.drawable.f481511v7);
        kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
        this.f136075c = drawable;
        this.f136076d = -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.u0)) {
            return false;
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.u0) obj).getClass();
        return true;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(0);
    }

    public java.lang.String toString() {
        return "Action(type=0)";
    }
}
