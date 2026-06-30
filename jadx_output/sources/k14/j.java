package k14;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.k f303342d;

    public j(k14.k kVar) {
        this.f303342d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        k14.k kVar = this.f303342d;
        android.content.Context context = kVar.f303344e;
        kVar.f303345f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), kVar.f303344e.getString(com.tencent.mm.R.string.ggd), true, true, new k14.i(this));
    }
}
