package om4;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om4.e f346411d;

    public a(om4.e eVar) {
        this.f346411d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "check short link timeout");
        om4.e eVar = this.f346411d;
        eVar.f346421n.set(true);
        eVar.c();
        eVar.b(false, null);
    }
}
