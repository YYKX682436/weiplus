package r02;

/* loaded from: classes8.dex */
public class b implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f368286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r02.c f368287b;

    public b(r02.c cVar, android.os.Bundle bundle) {
        this.f368287b = cVar;
        this.f368286a = bundle;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BottomEntranceView", "OpenLiteApp fail");
        r02.c cVar = this.f368287b;
        java.lang.String str = cVar.f368290d.f97357d.f37598e;
        android.os.Bundle bundle = this.f368286a;
        bundle.putString("rawUrl", str);
        ((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Bi(cVar.f368290d.getContext(), bundle);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BottomEntranceView", "OpenLiteApp success");
    }
}
