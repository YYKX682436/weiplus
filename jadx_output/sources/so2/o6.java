package so2;

/* loaded from: classes8.dex */
public final class o6 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.n6 f410534d;

    public o6(so2.n6 model) {
        kotlin.jvm.internal.o.g(model, "model");
        this.f410534d = model;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof so2.o6) && ((so2.o6) obj).f410534d.f410510j == this.f410534d.f410510j) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return this.f410534d.f410505e.ordinal();
    }
}
