package ho4;

/* loaded from: classes.dex */
public final class e implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final e14.s f282887d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f282888e;

    public e(e14.s sVar, yz5.l onWrite) {
        kotlin.jvm.internal.o.g(onWrite, "onWrite");
        this.f282887d = sVar;
        this.f282888e = onWrite;
    }

    @Override // e14.s
    public e14.s enterParent(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        return new ho4.g(this);
    }

    @Override // e14.s
    public e14.s exitParent() {
        return this.f282887d;
    }

    @Override // e14.s
    public void writeAttr(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        zn4.f.f474500b.invoke(new ho4.d(key, value));
    }

    @Override // e14.s
    public void writeText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        if (!r26.n0.N(text)) {
            this.f282888e.invoke(text);
        }
    }
}
