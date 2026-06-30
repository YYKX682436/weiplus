package ho4;

/* loaded from: classes.dex */
public final class f implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f282889d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f282890e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f282891f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f282892g;

    public f(e14.s parent, java.lang.String itemTagName, yz5.l onCreate, yz5.a onExit) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        kotlin.jvm.internal.o.g(onCreate, "onCreate");
        kotlin.jvm.internal.o.g(onExit, "onExit");
        this.f282889d = parent;
        this.f282890e = itemTagName;
        this.f282891f = onCreate;
        this.f282892g = onExit;
    }

    @Override // e14.s
    public e14.s enterParent(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String str = this.f282890e;
        return (!(r26.n0.N(str) ^ true) || kotlin.jvm.internal.o.b(name, str)) ? (e14.s) this.f282891f.invoke(this) : this;
    }

    @Override // e14.s
    public e14.s exitParent() {
        this.f282892g.invoke();
        return this.f282889d;
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
