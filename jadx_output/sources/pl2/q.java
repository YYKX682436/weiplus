package pl2;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356644d;

    public q(pl2.s sVar) {
        this.f356644d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl2.s sVar = this.f356644d;
        android.content.Context context = sVar.c().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gc2.a aVar = new gc2.a(context);
        aVar.f12049a = sVar.f356657l;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = sVar.c().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(aVar);
        }
    }
}
