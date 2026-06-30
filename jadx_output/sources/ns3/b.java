package ns3;

/* loaded from: classes8.dex */
public class b extends hs3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.stub.ReadMailProxy f339421a;

    public b(com.tencent.mm.plugin.qqmail.stub.ReadMailProxy readMailProxy) {
        this.f339421a = readMailProxy;
    }

    @Override // hs3.j
    public void a() {
        this.f339421a.CLIENT_CALL("onComplete", new java.lang.Object[0]);
    }

    @Override // hs3.j
    public void b(int i17, java.lang.String str) {
        this.f339421a.CLIENT_CALL("onError", java.lang.Integer.valueOf(i17), str);
    }

    @Override // hs3.j
    public boolean c() {
        return ((java.lang.Boolean) this.f339421a.CLIENT_CALL("onReady", new java.lang.Object[0])).booleanValue();
    }

    @Override // hs3.j
    public void d(java.lang.String str, java.util.Map map) {
        this.f339421a.CLIENT_CALL("onSuccess", str, map);
    }
}
