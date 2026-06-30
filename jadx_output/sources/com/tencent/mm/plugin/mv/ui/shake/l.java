package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes11.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150952d;

    public l(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150952d = musicMainUINew;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150952d;
        musicMainUINew.D = true;
        com.tencent.mm.plugin.mv.ui.shake.d0 d0Var = com.tencent.mm.plugin.mv.ui.shake.d0.f150940a;
        com.tencent.mm.plugin.mv.ui.shake.d0.f150941b.f60321q = 0L;
        d0Var.a(252);
        if (musicMainUINew.f150907m != null) {
            if (!((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).oj(musicMainUINew.f150907m.f17346e)) {
                musicMainUINew.U6(musicMainUINew.f150907m, false);
            }
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        androidx.appcompat.app.AppCompatActivity context = musicMainUINew.getContext();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Shake;
        ((rk4.k8) aj6).z(context, false, null, null, null, null, ar0Var, null);
        if (musicMainUINew.f150908n != null) {
            ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(musicMainUINew.f150908n, ar0Var);
        }
        musicMainUINew.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
