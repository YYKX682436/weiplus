package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC f151088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f151089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f151091h;

    public c8(int i17, com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC, android.view.ViewGroup viewGroup, fm3.u uVar, com.tencent.mm.plugin.mv.ui.uic.n0 n0Var) {
        this.f151087d = i17;
        this.f151088e = musicMvSongInfoUIC;
        this.f151089f = viewGroup;
        this.f151090g = uVar;
        this.f151091h = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("song_copyright_ll onClick, position:");
        sb6.append(this.f151087d);
        sb6.append(", snapPositin:");
        com.tencent.mm.plugin.mv.ui.view.i iVar = this.f151088e.f151000e;
        sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.f151864m) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", sb6.toString());
        android.view.ViewGroup viewGroup = this.f151089f;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.hf2 hf2Var = ((com.tencent.mm.plugin.mv.ui.uic.n0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151310i;
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class);
        fm3.u uVar = this.f151090g;
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = this.f151091h;
        int S6 = musicMvMainUIC.S6(hf2Var, new com.tencent.mm.plugin.mv.ui.uic.b8(hf2Var, uVar, viewGroup, n0Var));
        if (S6 != 7 && uVar != null) {
            fm3.j0 j0Var = fm3.j0.f264078a;
            android.content.Context context3 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            j0Var.f(context3, hf2Var, uVar, 2, S6, 2, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var.Q6(), (r27 & 256) != 0 ? 1 : n0Var.O6(), (r27 & 512) != 0 ? "" : n0Var.P6(), (r27 & 1024) != 0 ? 2 : n0Var.E);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC$update$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
