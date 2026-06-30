package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fa0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.da f134385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa0(cw2.da daVar) {
        super(1);
        this.f134385d = daVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "[recycledVideoView] " + it + '}');
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it, this.f134385d));
    }
}
