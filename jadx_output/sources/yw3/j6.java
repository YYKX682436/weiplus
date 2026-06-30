package yw3;

/* loaded from: classes4.dex */
public final class j6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI f466780d;

    public j6(com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI repairerSetTextStatusDemoUI, java.lang.String str) {
        this.f466780d = repairerSetTextStatusDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
        androidx.appcompat.app.AppCompatActivity context = this.f466780d.getContext();
        bi4.d1 d1Var = new bi4.d1();
        d1Var.f354938e = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/2c691549c7f50ee66ebd332e8f270d6b/video/vsg_output_1622096801814";
        d1Var.f354937d.f354974f = 2;
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) g0Var).Ni(context, 3, d1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
