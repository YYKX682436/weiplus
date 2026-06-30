package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.j f150764d;

    public l(com.tencent.mm.plugin.music.ui.j jVar) {
        this.f150764d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        jm4.u2 a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/MusicBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicBanner", "clickBannerClose");
        this.f150764d.getClass();
        qk.g9 bj6 = ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj();
        if (bj6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicBanner", "onClickBannerClose tingService is null");
        } else {
            rk4.z8 z8Var = (rk4.z8) bj6;
            if (z8Var.fj()) {
                z8Var.zj();
            } else {
                com.tencent.unit_rc.BaseObjectDef baseObjectDef = (((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj() == null || (a17 = jm4.w2.f300435d.a()) == null) ? null : (jm4.g3) urgen.ur_0025.UR_8227.UR_EDB6(((jm4.w2) a17).getCppPointer());
                if (baseObjectDef != null) {
                    ((b66.q) baseObjectDef).stop();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
