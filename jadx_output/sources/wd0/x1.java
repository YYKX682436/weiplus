package wd0;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f444778a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f444779b;

    /* renamed from: c, reason: collision with root package name */
    public final int f444780c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f444781d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f444782e;

    /* renamed from: f, reason: collision with root package name */
    public final wd0.w1 f444783f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f444784g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f444785h;

    public x1(java.lang.String name, java.lang.String str, int i17, java.lang.String itemKey, java.lang.String parentItemKey, wd0.w1 matchType, java.lang.String path, boolean z17) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(itemKey, "itemKey");
        kotlin.jvm.internal.o.g(parentItemKey, "parentItemKey");
        kotlin.jvm.internal.o.g(matchType, "matchType");
        kotlin.jvm.internal.o.g(path, "path");
        this.f444778a = name;
        this.f444779b = str;
        this.f444780c = i17;
        this.f444781d = itemKey;
        this.f444782e = parentItemKey;
        this.f444783f = matchType;
        this.f444784g = path;
        this.f444785h = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.x1)) {
            return false;
        }
        wd0.x1 x1Var = (wd0.x1) obj;
        return kotlin.jvm.internal.o.b(this.f444778a, x1Var.f444778a) && kotlin.jvm.internal.o.b(this.f444779b, x1Var.f444779b) && this.f444780c == x1Var.f444780c && kotlin.jvm.internal.o.b(this.f444781d, x1Var.f444781d) && kotlin.jvm.internal.o.b(this.f444782e, x1Var.f444782e) && this.f444783f == x1Var.f444783f && kotlin.jvm.internal.o.b(this.f444784g, x1Var.f444784g) && this.f444785h == x1Var.f444785h;
    }

    public int hashCode() {
        int hashCode = this.f444778a.hashCode() * 31;
        java.lang.String str = this.f444779b;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f444780c)) * 31) + this.f444781d.hashCode()) * 31) + this.f444782e.hashCode()) * 31) + this.f444783f.hashCode()) * 31) + this.f444784g.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f444785h);
    }

    public java.lang.String toString() {
        return "SettingResult(name=" + this.f444778a + ", summary=" + this.f444779b + ", type=" + this.f444780c + ", itemKey=" + this.f444781d + ", parentItemKey=" + this.f444782e + ", matchType=" + this.f444783f + ", path=" + this.f444784g + ", visible=" + this.f444785h + ')';
    }
}
