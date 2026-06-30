package js2;

/* loaded from: classes.dex */
public final class e implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f301521d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f301522e;

    public e(java.lang.String title, boolean z17) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f301521d = title;
        this.f301522e = z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return js2.e.class.hashCode();
    }
}
