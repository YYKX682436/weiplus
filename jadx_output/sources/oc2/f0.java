package oc2;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f344168a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344169b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f344170c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344171d;

    /* renamed from: e, reason: collision with root package name */
    public final float f344172e;

    /* renamed from: f, reason: collision with root package name */
    public final int f344173f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f344174g;

    public f0(int i17, int i18, java.lang.Object data, int i19, float f17, int i27) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f344168a = i17;
        this.f344169b = i18;
        this.f344170c = data;
        this.f344171d = i19;
        this.f344172e = f17;
        this.f344173f = i27;
        this.f344174g = "";
    }

    public final void a(java.lang.String tag, java.lang.String replaceChar, float f17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(replaceChar, "replaceChar");
        java.lang.Object obj = this.f344170c;
        if (obj instanceof java.lang.CharSequence) {
            this.f344174g = obj.toString();
        } else if (obj instanceof android.graphics.drawable.Drawable) {
            if (f17 > 0.0f) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                kotlin.jvm.internal.o.e(this.f344170c, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                int ceil = (int) java.lang.Math.ceil(((android.graphics.drawable.Drawable) r1).getBounds().width() / f17);
                for (int i17 = 0; i17 < ceil; i17++) {
                    sb6.append(replaceChar);
                }
                replaceChar = sb6.toString();
                kotlin.jvm.internal.o.d(replaceChar);
            }
            this.f344174g = replaceChar;
        }
        com.tencent.mars.xlog.Log.i(tag, "GlobalCapsuleItem " + this + ',' + this.f344174g);
    }

    public final void b(java.lang.Object obj) {
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        this.f344170c = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.f0)) {
            return false;
        }
        oc2.f0 f0Var = (oc2.f0) obj;
        return this.f344168a == f0Var.f344168a && this.f344169b == f0Var.f344169b && kotlin.jvm.internal.o.b(this.f344170c, f0Var.f344170c) && this.f344171d == f0Var.f344171d && java.lang.Float.compare(this.f344172e, f0Var.f344172e) == 0 && this.f344173f == f0Var.f344173f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f344168a) * 31) + java.lang.Integer.hashCode(this.f344169b)) * 31) + this.f344170c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f344171d)) * 31) + java.lang.Float.hashCode(this.f344172e)) * 31) + java.lang.Integer.hashCode(this.f344173f);
    }

    public java.lang.String toString() {
        return "GlobalCapsuleItem(style=" + this.f344168a + ", index=" + this.f344169b + ", data=" + this.f344170c + ", color=" + this.f344171d + ", size=" + this.f344172e + ", fontWeight=" + this.f344173f + ')';
    }
}
