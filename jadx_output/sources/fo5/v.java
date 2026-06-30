package fo5;

/* loaded from: classes14.dex */
public final class v implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f265124a;

    public v(java.util.ArrayList arrayList) {
        this.f265124a = arrayList;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "after add member is " + list);
        java.util.Set G0 = list != null ? kz5.n0.G0(list, kz5.n0.X0(this.f265124a)) : null;
        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.e(G0 != null ? new java.util.ArrayList(kz5.n0.S0(G0)) : null, fo5.u.f265121a);
    }
}
