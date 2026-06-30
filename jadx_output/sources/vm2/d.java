package vm2;

/* loaded from: classes3.dex */
public final class d implements so2.j5 {

    /* renamed from: f, reason: collision with root package name */
    public static final vm2.c f438087f = new vm2.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final r45.yp1 f438088d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.qa0 f438089e;

    public d(r45.yp1 gift, r45.qa0 qa0Var) {
        kotlin.jvm.internal.o.g(gift, "gift");
        this.f438088d = gift;
        this.f438089e = qa0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        if (this.f438088d.getString(0) != null) {
            return r0.hashCode();
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
