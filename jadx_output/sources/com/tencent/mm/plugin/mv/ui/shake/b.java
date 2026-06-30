package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes11.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b21.r f150933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150934e;

    public b(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew, b21.r rVar, int i17) {
        this.f150934e = musicMainUINew;
        this.f150933d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew.H;
        b21.r rVar = this.f150933d;
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150934e;
        musicMainUINew.U6(rVar, false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_not_add_floatball_exit", true);
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        androidx.appcompat.app.AppCompatActivity context = musicMainUINew.getContext();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Shake;
        ((rk4.k8) aj6).z(context, false, null, null, null, bundle, ar0Var, null);
        if (musicMainUINew.f150908n != null) {
            qk.e9 e9Var = (qk.e9) i95.n0.c(qk.e9.class);
            bw5.lp0 lp0Var = musicMainUINew.f150908n;
            rk4.p6 p6Var = (rk4.p6) e9Var;
            p6Var.getClass();
            ar0Var.toString();
            if (lp0Var != null) {
                p6Var.Zi(new rk4.l6(lp0Var, ar0Var));
            }
        }
        musicMainUINew.f150913s = true;
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
