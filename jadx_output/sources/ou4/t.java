package ou4;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349028a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f349029b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f349030c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f349031d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f349032e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f349033f;

    public t(java.lang.String initialRoute, java.util.Map arguments, java.util.List list, boolean z17, boolean z18, java.util.Map extras, int i17, kotlin.jvm.internal.i iVar) {
        initialRoute = (i17 & 1) != 0 ? "" : initialRoute;
        int i18 = i17 & 2;
        kz5.q0 q0Var = kz5.q0.f314001d;
        arguments = i18 != 0 ? q0Var : arguments;
        list = (i17 & 4) != 0 ? null : list;
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? true : z18;
        extras = (i17 & 32) != 0 ? q0Var : extras;
        kotlin.jvm.internal.o.g(initialRoute, "initialRoute");
        kotlin.jvm.internal.o.g(arguments, "arguments");
        kotlin.jvm.internal.o.g(extras, "extras");
        this.f349028a = initialRoute;
        this.f349029b = arguments;
        this.f349030c = list;
        this.f349031d = z17;
        this.f349032e = z18;
        this.f349033f = extras;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou4.t)) {
            return false;
        }
        ou4.t tVar = (ou4.t) obj;
        return kotlin.jvm.internal.o.b(this.f349028a, tVar.f349028a) && kotlin.jvm.internal.o.b(this.f349029b, tVar.f349029b) && kotlin.jvm.internal.o.b(this.f349030c, tVar.f349030c) && this.f349031d == tVar.f349031d && this.f349032e == tVar.f349032e && kotlin.jvm.internal.o.b(this.f349033f, tVar.f349033f);
    }

    public int hashCode() {
        int hashCode = ((this.f349028a.hashCode() * 31) + this.f349029b.hashCode()) * 31;
        java.util.List list = this.f349030c;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f349031d)) * 31) + java.lang.Boolean.hashCode(this.f349032e)) * 31) + this.f349033f.hashCode();
    }

    public java.lang.String toString() {
        return "FlutterContainerConfig(initialRoute=" + this.f349028a + ", arguments=" + this.f349029b + ", initialPlugins=" + this.f349030c + ", transparentBackground=" + this.f349031d + ", enableGestureBack=" + this.f349032e + ", extras=" + this.f349033f + ')';
    }
}
