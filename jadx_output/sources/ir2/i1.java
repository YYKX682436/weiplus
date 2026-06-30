package ir2;

/* loaded from: classes2.dex */
public final class i1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.j5 f294154d;

    /* renamed from: e, reason: collision with root package name */
    public final int f294155e;

    public i1(ir2.p1 p1Var, so2.j5 data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f294154d = data;
        this.f294155e = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f294154d.getItemId();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
