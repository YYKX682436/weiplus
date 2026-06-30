package sg0;

/* loaded from: classes8.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg0.a2 f407794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(sg0.a2 a2Var, java.lang.String str) {
        super(0);
        this.f407794d = a2Var;
        this.f407795e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sg0.a2 a2Var = this.f407794d;
        java.util.List list = a2Var.f407671i;
        java.lang.String str = this.f407795e;
        kz5.h0.B(list, new sg0.q1(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.ServiceWorkerFeatureService", "delSubscribeLiteAppStoreListener, subscribeListeners: " + ((java.util.ArrayList) a2Var.f407671i).size() + ", " + str);
        return jz5.f0.f302826a;
    }
}
