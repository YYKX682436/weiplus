package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151123d;

    public f2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        this.f151123d = musicMvMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.k3 p07;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151123d;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.Q6(musicMvMainUIC, musicMvMainUIC.f150982o);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvMainUIC.f150976f;
        android.view.View view = (wxRecyclerView == null || (p07 = wxRecyclerView.p0(musicMvMainUIC.f150982o)) == null) ? null : p07.itemView;
        androidx.appcompat.app.AppCompatActivity activity = musicMvMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mv.ui.uic.k0 k0Var = (com.tencent.mm.plugin.mv.ui.uic.k0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.k0.class);
        java.lang.Object obj = musicMvMainUIC.f150977g.get(musicMvMainUIC.f150982o);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        k0Var.P6(view, (lm3.e) obj);
    }
}
