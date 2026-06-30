package ee5;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f251975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ee5.z zVar) {
        super(0);
        this.f251975d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        de5.a aVar = de5.a.f229396a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setImageIsAllIdentified: " + de5.a.f229407l);
        de5.a.f229407l = true;
        ee5.z zVar = this.f251975d;
        androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar2 = pf5.z.f353948a;
        ((ee5.h0) zVar2.a(activity).a(ee5.h0.class)).U6(aq.c.f12845g);
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
        return jz5.f0.f302826a;
    }
}
