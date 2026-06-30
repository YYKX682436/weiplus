package ty;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f422727a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f422728b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f422729c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f422730d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f422731e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f422732f;

    public l0(boolean z17, java.lang.String upBtnText, java.lang.String downBtnText, java.lang.String defaultAppName, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(upBtnText, "upBtnText");
        kotlin.jvm.internal.o.g(downBtnText, "downBtnText");
        kotlin.jvm.internal.o.g(defaultAppName, "defaultAppName");
        this.f422727a = z17;
        this.f422728b = upBtnText;
        this.f422729c = downBtnText;
        this.f422730d = defaultAppName;
        this.f422731e = z18;
        this.f422732f = z19;
    }

    public final int a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.brt);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = this.f422730d;
        objArr[0] = str.length() == 0 ? context.getString(com.tencent.mm.R.string.lc9) : str;
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.lc9);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.ho6);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.ho7);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        boolean z17 = this.f422727a;
        if (z17 || z17) {
            return 1;
        }
        java.lang.String str2 = this.f422728b;
        boolean z18 = this.f422732f;
        boolean z19 = this.f422731e;
        if (z19 && z18 && kotlin.jvm.internal.o.b(str2, format)) {
            if (str.length() == 0) {
                return 2;
            }
        }
        java.lang.String str3 = this.f422729c;
        if (!z19 && z18 && kotlin.jvm.internal.o.b(str3, string3)) {
            return 3;
        }
        if (z19 && z18 && kotlin.jvm.internal.o.b(str2, format) && !kotlin.jvm.internal.o.b(str, string2)) {
            return 4;
        }
        if (z19 && z18 && kotlin.jvm.internal.o.b(str2, format) && kotlin.jvm.internal.o.b(str, string2)) {
            return 5;
        }
        return (!z19 && z18 && kotlin.jvm.internal.o.b(str3, string4)) ? 6 : 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty.l0)) {
            return false;
        }
        ty.l0 l0Var = (ty.l0) obj;
        return this.f422727a == l0Var.f422727a && kotlin.jvm.internal.o.b(this.f422728b, l0Var.f422728b) && kotlin.jvm.internal.o.b(this.f422729c, l0Var.f422729c) && kotlin.jvm.internal.o.b(this.f422730d, l0Var.f422730d) && this.f422731e == l0Var.f422731e && this.f422732f == l0Var.f422732f;
    }

    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.f422727a) * 31) + this.f422728b.hashCode()) * 31) + this.f422729c.hashCode()) * 31) + this.f422730d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f422731e)) * 31) + java.lang.Boolean.hashCode(this.f422732f);
    }

    public java.lang.String toString() {
        return "PageType(isMiniQbPage=" + this.f422727a + ", upBtnText=" + this.f422728b + ", downBtnText=" + this.f422729c + ", defaultAppName=" + this.f422730d + ", upBtnVisitable=" + this.f422731e + ", downBtnVisitable=" + this.f422732f + ')';
    }
}
