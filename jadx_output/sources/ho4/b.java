package ho4;

/* loaded from: classes.dex */
public final class b implements e14.s {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f282876d;

    /* renamed from: e, reason: collision with root package name */
    public final e14.s f282877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f282878f;

    /* renamed from: g, reason: collision with root package name */
    public int f282879g;

    public b(java.lang.String prefixTag, java.lang.String tag, e14.s childVisitor) {
        kotlin.jvm.internal.o.g(prefixTag, "prefixTag");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(childVisitor, "childVisitor");
        this.f282876d = tag;
        this.f282877e = childVisitor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f282878f = arrayList;
        java.util.List f07 = r26.n0.f0(prefixTag, new java.lang.String[]{"."}, false, 0, 6, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (!r26.n0.N((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
    }

    @Override // e14.s
    public e14.s enterParent(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        int i17 = this.f282879g;
        java.util.List list = this.f282878f;
        if (i17 > ((java.util.ArrayList) list).size()) {
            zn4.f.f474499a.a(new ho4.a(name));
            return new ho4.g(this);
        }
        if (this.f282879g == ((java.util.ArrayList) list).size()) {
            return kotlin.jvm.internal.o.b(name, this.f282876d) ? this.f282877e : new ho4.g(this);
        }
        if (!kotlin.jvm.internal.o.b(name, (java.lang.String) ((java.util.ArrayList) list).get(this.f282879g))) {
            return new ho4.g(this);
        }
        this.f282879g++;
        return this;
    }

    @Override // e14.s
    public e14.s exitParent() {
        int i17 = this.f282879g;
        if (i17 > 0) {
            this.f282879g = i17 - 1;
        }
        if (this.f282879g > 0) {
            return this;
        }
        return null;
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
