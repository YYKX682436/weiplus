package df2;

/* loaded from: classes3.dex */
public final class sl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f231347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yg2.b f231348e;

    public sl(android.view.ViewGroup viewGroup, yg2.b bVar) {
        this.f231347d = viewGroup;
        this.f231348e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f231347d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.widget.sl slVar = new com.tencent.mm.plugin.finder.live.widget.sl(context);
        java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.oqn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        slVar.c(string);
        slVar.f119807k = -855638017;
        slVar.f119806j = -12566464;
        slVar.f119800d = viewGroup;
        slVar.f119799c = 3000L;
        slVar.f119798b.setMaxWidth(pm0.v.S(300));
        slVar.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118845e;
        slVar.f119809m = i65.a.c(viewGroup.getContext(), (viewGroup.getWidth() / 2) - 4);
        slVar.b();
        slVar.d(this.f231348e);
    }
}
