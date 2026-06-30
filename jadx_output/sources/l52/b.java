package l52;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f316573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l52.f f316576g;

    public b(l52.f fVar, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f316576g = fVar;
        this.f316573d = z17;
        this.f316574e = str;
        this.f316575f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.ref.WeakReference weakReference;
        android.view.ViewGroup viewGroup;
        l52.f fVar = this.f316576g;
        l52.f.f(fVar);
        int i17 = fVar.f316583c;
        if (i17 == 0) {
            e62.q a17 = e62.q.a();
            a17.getClass();
            java.lang.String str = fVar.f316597q;
            if ("com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI".equals(str) || "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI".equals(str)) {
                java.lang.String str2 = "123_" + java.lang.System.currentTimeMillis();
                a17.f249810h = str2;
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.SnsMonitor", "curTimeSessionId update %s", str2);
            }
        }
        if (this.f316573d) {
            fVar.m(this.f316574e, this.f316575f);
            if (i17 != 0 || (weakReference = fVar.f316604x) == null || (viewGroup = (android.view.ViewGroup) weakReference.get()) == null) {
                return;
            }
            fVar.d(viewGroup, fVar.f316605y, fVar.f316606z);
        }
    }
}
