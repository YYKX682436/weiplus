package wt3;

/* loaded from: classes5.dex */
public final class e0 extends wt3.g0 implements wt3.j0 {

    /* renamed from: s, reason: collision with root package name */
    public nv3.f f449406s;

    /* renamed from: t, reason: collision with root package name */
    public wt3.i0 f449407t;

    public /* synthetic */ e0(im5.b bVar, yu3.a aVar, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(bVar, aVar, (i18 & 4) != 0 ? 1 : i17);
    }

    @Override // wt3.j0
    public void a(wt3.i0 i0Var) {
        this.f449407t = i0Var;
    }

    @Override // wt3.e
    public wt3.q e() {
        return new wt3.a0();
    }

    @Override // wt3.j0
    public nv3.f getHelper() {
        return this.f449406s;
    }

    @Override // wt3.e
    public void h(com.tencent.mm.protobuf.g gVar, boolean z17) {
        this.f449406s.a(z17, gVar, null);
    }

    @Override // wt3.g0
    public void l(long j17) {
        this.f449395d = j17;
        this.f449406s.f340661c = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(im5.b lifeCycleKeeper, yu3.a createInfo, int i17) {
        super(lifeCycleKeeper, createInfo.f465853c, createInfo.f465855e, createInfo.f465856f, createInfo.f465851a);
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        this.f449406s = new nv3.f(lifeCycleKeeper, this.f449399h, this.f449395d, i17, createInfo.f465858h, 0, null, null, new wt3.d0(this), 224, null);
    }
}
