package ho4;

/* loaded from: classes.dex */
public final class c implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f282880d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f282881e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f282882f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f282883g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f282884h;

    public c(e14.s sVar, java.lang.String itemName, yz5.l onWrite, yz5.a onExit) {
        kotlin.jvm.internal.o.g(itemName, "itemName");
        kotlin.jvm.internal.o.g(onWrite, "onWrite");
        kotlin.jvm.internal.o.g(onExit, "onExit");
        this.f282880d = sVar;
        this.f282881e = itemName;
        this.f282882f = onWrite;
        this.f282883g = onExit;
    }

    @Override // e14.s
    public e14.s enterParent(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        if (!this.f282884h) {
            java.lang.String str = this.f282881e;
            if (kotlin.jvm.internal.o.b(name, str) || (kotlin.jvm.internal.o.b(name, "item") && r26.n0.N(str))) {
                this.f282884h = true;
                return this;
            }
        }
        return new ho4.g(this);
    }

    @Override // e14.s
    public e14.s exitParent() {
        if (this.f282884h) {
            this.f282884h = false;
            return this;
        }
        this.f282883g.invoke();
        return this.f282880d;
    }

    @Override // e14.s
    public void writeAttr(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
    }

    @Override // e14.s
    public void writeText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        if (this.f282884h) {
            this.f282882f.invoke(text);
        }
    }
}
