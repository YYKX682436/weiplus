package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class la0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f135034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f135035f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la0(android.content.Context context, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler) {
        super(1);
        this.f135033d = context;
        this.f135034e = f0Var;
        this.f135035f = finderVideoRecycler;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.getI() == this.f135033d.hashCode()) {
            z17 = true;
            this.f135034e.f310116d++;
            it.d();
            it.b();
            this.f135035f.e7(it.getVideoView());
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
