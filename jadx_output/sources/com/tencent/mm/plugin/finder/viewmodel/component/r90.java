package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class r90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f135781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f135783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f135784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(java.lang.Class cls, android.content.Context context, com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, boolean z17) {
        super(1);
        this.f135781d = cls;
        this.f135782e = context;
        this.f135783f = finderVideoRecycler;
        this.f135784g = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (this.f135781d.isAssignableFrom(it.getClass()) && it.getR() == this.f135782e.hashCode()) {
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = this.f135783f;
            finderVideoRecycler.getClass();
            if (!cq.k.f221221n.a() || finderVideoRecycler.W6(it) == this.f135784g) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
