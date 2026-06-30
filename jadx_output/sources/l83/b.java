package l83;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.e f317088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l83.c f317089e;

    public b(l83.c cVar, com.tencent.mm.plugin.voip.model.e eVar) {
        this.f317089e = cVar;
        this.f317088d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.e eVar = this.f317088d;
        l83.c cVar = this.f317089e;
        if (eVar != null) {
            eVar.e();
            this.f317088d.f();
            this.f317088d = null;
            cVar.f317093d = false;
        }
        cVar.f317094e.v();
    }
}
