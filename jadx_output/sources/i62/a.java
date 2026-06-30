package i62;

/* loaded from: classes13.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f288936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f288937f;

    public a(long j17, android.app.Activity activity, int i17) {
        this.f288935d = j17;
        this.f288936e = activity;
        this.f288937f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long nanoTime = java.lang.System.nanoTime() - this.f288935d;
        float f17 = ((float) nanoTime) / 1000000;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("oncreate costMs:");
        sb6.append(f17);
        sb6.append(" costNs:");
        sb6.append(nanoTime);
        sb6.append(" act:");
        android.app.Activity activity = this.f288936e;
        sb6.append(activity.getClass().getName());
        com.tencent.mars.xlog.Log.i("ActivityStartReportHelper", sb6.toString());
        i62.o oVar = i62.o.f288963a;
        i62.o.f288965c.add(new i62.j(activity.getClass().getName(), nanoTime, this.f288937f, -1));
        if (activity instanceof com.tencent.mm.ui.MMFragmentActivity) {
            yn5.l lVar = ((com.tencent.mm.ui.MMFragmentActivity) activity).inflateXMLInfo;
            long j17 = f17;
            lVar.f464036b = j17;
            if (j17 == 0 || !com.tencent.mars.xlog.Log.isDebug()) {
                return;
            }
            lVar.b();
        }
    }
}
