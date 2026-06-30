package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ma0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(android.content.Context context) {
        super(1);
        this.f135155d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        android.content.Context context = this.f135155d;
        if (z18) {
            com.tencent.mars.xlog.Log.i("Finder.VideoRecycler", "resumeFocusVideo context=" + context + ",ShouldPlayResume=" + it.getIsShouldPlayResume() + ",floatBallFeedId=" + pm0.v.u(kd2.p1.N.a().F0()) + '!');
        }
        if (it.getIsShouldPlayResume()) {
            if (it.getI() == (context != null ? context.hashCode() : -1)) {
                it.setVideoViewFocused(true);
                it.setIsShouldPlayResume(false);
                it.play();
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
