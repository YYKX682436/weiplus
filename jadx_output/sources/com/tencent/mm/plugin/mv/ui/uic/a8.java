package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class a8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC f151034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f151035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f151037h;

    public a8(int i17, com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC, android.view.ViewGroup viewGroup, fm3.u uVar, com.tencent.mm.plugin.mv.ui.uic.n0 n0Var) {
        this.f151033d = i17;
        this.f151034e = musicMvSongInfoUIC;
        this.f151035f = viewGroup;
        this.f151036g = uVar;
        this.f151037h = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, position:");
        sb6.append(this.f151033d);
        sb6.append(", snapPositin:");
        com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC = this.f151034e;
        com.tencent.mm.plugin.mv.ui.view.i iVar = musicMvSongInfoUIC.f151000e;
        sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.f151864m) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - musicMvSongInfoUIC.f151004i < 2000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMvSongInfoUIC", "don't click again in 2s");
            yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        musicMvSongInfoUIC.f151004i = currentTimeMillis;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", "do getTicketToQQMusic");
        android.view.ViewGroup viewGroup = this.f151035f;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class);
        musicMvMainUIC.getClass();
        b21.r b17 = b21.m.b();
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        kotlin.jvm.internal.o.d(b17);
        d17.g(new hm3.o(b17, musicMvMainUIC.getActivity().hashCode()));
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.hf2 hf2Var = ((com.tencent.mm.plugin.mv.ui.uic.n0) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151310i;
        fm3.j0 j0Var = fm3.j0.f264078a;
        android.content.Context context3 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        fm3.u uVar = this.f151036g;
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = this.f151037h;
        j0Var.f(context3, hf2Var, uVar, 8, 1, 7, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var.Q6(), (r27 & 256) != 0 ? 1 : n0Var.O6(), (r27 & 512) != 0 ? "" : n0Var.P6(), (r27 & 1024) != 0 ? 2 : n0Var.E);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
