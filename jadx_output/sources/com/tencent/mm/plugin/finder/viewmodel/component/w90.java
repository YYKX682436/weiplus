package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f136324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f136325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f136327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(java.lang.Class cls, com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, boolean z17, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f136324d = cls;
        this.f136325e = finderVideoRecycler;
        this.f136326f = z17;
        this.f136327g = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Class cls = this.f136324d;
        if ((cls == null || cls.isAssignableFrom(it.getClass())) && this.f136325e.W6(it) == this.f136326f) {
            this.f136327g.f310116d++;
        }
        return java.lang.Boolean.FALSE;
    }
}
