package vn2;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.h f438423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vn2.a1 f438424e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.finder.megavideo.topstory.flow.h hVar, vn2.a1 a1Var) {
        super(1);
        this.f438423d = hVar;
        this.f438424e = a1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object obj2 = it.get();
        boolean z18 = true;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.h hVar = this.f438423d;
        boolean z19 = obj2 == hVar;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            this.f438424e.getClass();
            com.tencent.mars.xlog.Log.i("Finder.TopStoryMegaVideoPreload", "remove preload listener=" + hVar);
        }
        return java.lang.Boolean.valueOf(z19);
    }
}
