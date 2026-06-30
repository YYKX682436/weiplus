package wt3;

/* loaded from: classes5.dex */
public final class t0 extends wt3.b0 {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f449495p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.y f449496q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f449497r;

    /* renamed from: s, reason: collision with root package name */
    public final wt3.v0 f449498s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.q f449499t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f449500u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f449501v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(im5.b lifeCycleKeeper, java.util.ArrayList images, int i17, androidx.lifecycle.y yVar) {
        super(lifeCycleKeeper, images, i17);
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        kotlin.jvm.internal.o.g(images, "images");
        this.f449495p = images;
        this.f449496q = yVar;
        this.f449497r = new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.NewLifeGetImageListRecommendAudioTask", yVar, 1);
        this.f449500u = new java.util.ArrayList();
        this.f449498s = new wt3.v0(lifeCycleKeeper, this.f449399h, this.f449395d, 103, new wt3.q0(this));
    }

    @Override // wt3.e
    public void h(com.tencent.mm.protobuf.g gVar, boolean z17) {
        v65.i.b(this.f449497r, null, new wt3.r0(this, z17, null), 1, null);
    }

    @Override // wt3.e
    public void k() {
        this.f449501v = v65.i.b(this.f449497r, null, new wt3.s0(this, null), 1, null);
    }
}
