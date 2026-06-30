package ho4;

/* loaded from: classes.dex */
public final class g implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f282893d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f282894e = new java.util.ArrayList();

    public g(e14.s sVar) {
        this.f282893d = sVar;
    }

    @Override // e14.s
    public e14.s enterParent(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        ((java.util.ArrayList) this.f282894e).add(name);
        return this;
    }

    @Override // e14.s
    public e14.s exitParent() {
        java.util.List list = this.f282894e;
        if (!(!list.isEmpty())) {
            return this.f282893d;
        }
        kz5.h0.E(list);
        return this;
    }

    @Override // e14.s
    public void writeAttr(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
    }

    @Override // e14.s
    public void writeText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
    }
}
