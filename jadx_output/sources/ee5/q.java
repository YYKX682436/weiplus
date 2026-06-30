package ee5;

/* loaded from: classes9.dex */
public final class q implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f252000d;

    public q(ee5.z zVar) {
        this.f252000d = zVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        aq.c cVar = (aq.c) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initIdentifyObserver >> change type ");
        sb6.append(cVar);
        sb6.append(", ");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(", ");
        ee5.z zVar = this.f252000d;
        sb6.append(zVar.f252107q);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiImageUIC", sb6.toString());
        aq.c cVar2 = aq.c.f12845g;
        if (cVar == cVar2 && zVar.f252107q == aq.c.f12843e) {
            de5.a aVar = de5.a.f229396a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setImageLoadingFinish before >> " + de5.a.f229406k + ", " + de5.a.f229407l);
            de5.a.f229406k = java.lang.System.currentTimeMillis();
            de5.a.f229408m = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setImageLoadingFinish after >> " + de5.a.f229406k + ", " + de5.a.f229403h + ", " + de5.a.f229398c);
            androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar2 = pf5.z.f353948a;
            ((ee5.h0) zVar2.a(activity).a(ee5.h0.class)).U6(cVar2);
            androidx.appcompat.app.AppCompatActivity activity2 = zVar.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ee5.q3 q3Var = (ee5.q3) zVar2.a(activity2).a(ee5.q3.class);
            q3Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone");
            if (!q3Var.f252023x) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowDone >> when done is no query");
                android.widget.ProgressBar progressBar = q3Var.f252012m;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }
        kotlin.jvm.internal.o.d(cVar);
        zVar.f252107q = cVar;
    }
}
