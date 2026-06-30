package uj;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f428167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z17) {
        super(1);
        this.f428167d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicPlayableService", "playableLibrary injected: " + it + ", useNativeJs:" + this.f428167d);
        return jz5.f0.f302826a;
    }
}
