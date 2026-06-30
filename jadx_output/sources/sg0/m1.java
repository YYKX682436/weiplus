package sg0;

/* loaded from: classes8.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f407753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.lang.String str, java.lang.ref.WeakReference weakReference, sg0.a2 a2Var) {
        super(0);
        this.f407751d = str;
        this.f407752e = weakReference;
        this.f407753f = a2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f407751d;
        sg0.k1 k1Var = new sg0.k1(str, this.f407752e);
        sg0.a2 a2Var = this.f407753f;
        kz5.h0.B(a2Var.f407671i, new sg0.l1(str));
        java.util.List list = a2Var.f407671i;
        ((java.util.ArrayList) list).add(k1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "addSubscribeLiteAppStoreListener, subscribeListeners: " + ((java.util.ArrayList) list).size() + ", " + str);
        return jz5.f0.f302826a;
    }
}
