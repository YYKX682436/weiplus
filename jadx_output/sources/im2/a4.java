package im2;

/* loaded from: classes10.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f292246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(im2.g4 g4Var) {
        super(0);
        this.f292246d = g4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinderBackground: preloadCount=");
        im2.g4 g4Var = this.f292246d;
        sb6.append(g4Var.f292341d.size());
        com.tencent.mars.xlog.Log.i("FinderLivePlayerFactory", sb6.toString());
        g4Var.f292342e = false;
        android.os.Looper.getMainLooper().getQueue().removeIdleHandler(g4Var.f292344g);
        java.util.List list = g4Var.f292341d;
        kotlin.jvm.internal.o.f(list, "access$getPreloadPlayer$p(...)");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((nn0.c) it.next()).w();
        }
        list.clear();
        return jz5.f0.f302826a;
    }
}
