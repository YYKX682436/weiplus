package pl2;

/* loaded from: classes3.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final km2.m f356616d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f356617e;

    public a(km2.m data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f356616d = data;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof pl2.a)) {
            return -1;
        }
        return this.f356616d.d(((pl2.a) obj).f356616d);
    }

    @Override // in5.c
    public long getItemId() {
        return this.f356616d.f309129d.f68537e;
    }

    @Override // in5.c
    public int h() {
        return pl2.a.class.hashCode();
    }
}
