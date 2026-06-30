package mx0;

/* loaded from: classes5.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f332448d;

    public y1(mx0.q2 q2Var) {
        this.f332448d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.a6(m7Var, null), 3, null);
        this.f332448d.getClass();
        mx0.x.l(this.f332448d, false, 1, null);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.f d17 = ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) this.f332448d.d().o().e()).d();
        if (d17 != null) {
            d17.t(null, false);
        }
        if (!this.f332448d.d().f222354d) {
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) this.f332448d.f332235f;
            kotlinx.coroutines.l.d(shootComposingPluginLayout.getScope(), null, null, new mx0.k4(shootComposingPluginLayout, null), 3, null);
            shootComposingPluginLayout.G0(false, false);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/MusicEntranceV2Plugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
