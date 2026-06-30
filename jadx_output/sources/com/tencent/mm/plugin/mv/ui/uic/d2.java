package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class d2 implements com.tencent.mm.plugin.mv.ui.view.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151095a;

    public d2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        this.f151095a = musicMvMainUIC;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.b
    public void a(int i17) {
        fm3.u uVar;
        androidx.recyclerview.widget.k3 p07;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151095a;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onPageSettle:" + i17 + ", lastPos:" + musicMvMainUIC.f150982o);
        if (musicMvMainUIC.f150982o == i17) {
            return;
        }
        if (musicMvMainUIC.f150990w) {
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(musicMvMainUIC.getContext(), 7, r45.bt4.class);
            if (bt4Var != null) {
                bt4Var.f371036d = 13;
            }
        }
        musicMvMainUIC.f150990w = false;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvMainUIC.f150976f;
        android.view.View view = (wxRecyclerView == null || (p07 = wxRecyclerView.p0(i17)) == null) ? null : p07.itemView;
        androidx.appcompat.app.AppCompatActivity activity = musicMvMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = (com.tencent.mm.plugin.mv.ui.uic.s1) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.s1.class);
        java.util.ArrayList arrayList = musicMvMainUIC.f150977g;
        s1Var.U6(view, ((lm3.e) arrayList.get(i17)).f319482d);
        androidx.appcompat.app.AppCompatActivity activity2 = musicMvMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.mv.ui.uic.k0 k0Var = (com.tencent.mm.plugin.mv.ui.uic.k0) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.k0.class);
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        k0Var.P6(view, (lm3.e) obj);
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.Q6(musicMvMainUIC, i17);
        musicMvMainUIC.f150982o = i17;
        musicMvMainUIC.c7(i17);
        lm3.e eVar = (lm3.e) kz5.n0.a0(arrayList, i17);
        if (eVar == null || (uVar = eVar.f319482d) == null) {
            return;
        }
        uVar.f264143w = 0L;
        uVar.f264144x = 0L;
    }
}
