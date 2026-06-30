package mx0;

/* loaded from: classes5.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f332426d;

    public x1(mx0.q2 q2Var) {
        this.f332426d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f332426d.getClass();
        mx0.q2 q2Var = this.f332426d;
        if (!q2Var.d().f222354d) {
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) q2Var.f332235f;
            shootComposingPluginLayout.getClass();
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.h2(m7Var, null), 3, null);
            shootComposingPluginLayout.h1(false);
            kotlinx.coroutines.l.d(shootComposingPluginLayout.getScope(), null, null, new mx0.y8(shootComposingPluginLayout, null), 3, null);
            mx0.k3 d17 = q2Var.d();
            if (!d17.f222354d) {
                mx0.n3 o17 = d17.o();
                if (!o17.isShow()) {
                    o17.setShow(true);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
