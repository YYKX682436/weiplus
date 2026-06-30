package om4;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om4.e f346413d;

    public c(om4.e eVar) {
        this.f346413d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        om4.e eVar = this.f346413d;
        android.content.Context context = eVar.f346415e;
        eVar.f346416f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), eVar.f346415e.getString(com.tencent.mm.R.string.ggd), true, true, new om4.b(this));
    }
}
