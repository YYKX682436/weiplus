package kn;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn.l f309411d;

    public j(kn.l lVar) {
        this.f309411d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "startShowLoading");
        kn.l lVar = this.f309411d;
        android.content.Context context = lVar.f309413e;
        lVar.f309414f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), lVar.f309413e.getString(com.tencent.mm.R.string.i4v), true, true, new kn.i(this));
    }
}
