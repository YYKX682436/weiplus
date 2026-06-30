package qv3;

/* loaded from: classes5.dex */
public final class d extends wt3.c0 implements wt3.j0 {

    /* renamed from: o, reason: collision with root package name */
    public nv3.f f366953o;

    /* renamed from: p, reason: collision with root package name */
    public wt3.i0 f366954p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f366955q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(im5.b lifeCycleKeeper, yu3.a createInfo, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(lifeCycleKeeper, createInfo.f465851a);
        int i19 = (i18 & 4) != 0 ? 1 : i17;
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        kotlin.jvm.internal.o.g(createInfo, "createInfo");
        this.f366953o = new nv3.f(lifeCycleKeeper, this.f449399h, this.f449395d, i19, createInfo.f465858h, 0, null, null, new qv3.c(this), 224, null);
    }

    @Override // wt3.j0
    public void a(wt3.i0 i0Var) {
        this.f366954p = i0Var;
    }

    @Override // wt3.j0
    public nv3.f getHelper() {
        return this.f366953o;
    }

    @Override // wt3.e
    public void h(com.tencent.mm.protobuf.g gVar, boolean z17) {
        java.util.List list = null;
        if (!d()) {
            gVar = null;
        }
        java.util.List list2 = this.f366955q;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) it.next()).C);
            }
            list = kz5.n0.S0(arrayList);
        }
        this.f366953o.a(z17, gVar, list);
    }
}
