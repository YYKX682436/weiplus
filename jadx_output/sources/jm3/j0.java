package jm3;

/* loaded from: classes10.dex */
public final class j0 implements com.tencent.mm.plugin.mv.ui.uic.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f300329b;

    public j0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI, com.tencent.mm.plugin.mv.ui.uic.c3 c3Var) {
        this.f300328a = musicMvMakerUI;
        this.f300329b = c3Var;
    }

    public void a(boolean z17) {
        int i17;
        int i18 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI = this.f300328a;
        android.view.View X6 = musicMvMakerUI.X6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onCancel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onCancel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        musicMvMakerUI.Y6().setRadius(i65.a.b(musicMvMakerUI.getContext(), 12));
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) a17;
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var2 = (com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        android.view.View findViewByPosition = ((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) h4Var2.f151164h).getValue()).findViewByPosition(h4Var2.f151167n.f151864m);
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) musicMvMakerUI.f150877p).getValue();
        kotlin.jvm.internal.o.f(imageView, "access$getMvItemEditThumb(...)");
        kotlin.jvm.internal.o.d(findViewByPosition);
        com.tencent.mm.ui.widget.MMRoundCornerImageView Y6 = musicMvMakerUI.Y6();
        kotlin.jvm.internal.o.f(Y6, "access$getAlbumFakeThumb(...)");
        android.animation.Animator b17 = fm3.x.a(imageView).b(fm3.x.a(findViewByPosition), Y6, h4Var.f151175v);
        b17.addListener(new jm3.e0(musicMvMakerUI));
        b17.setDuration(250L);
        b17.start();
        jm3.f0 f0Var = new jm3.f0(z17);
        int i19 = h4Var.f151167n.f151864m;
        java.util.ArrayList arrayList2 = h4Var.f151161e;
        fm3.q qVar = (fm3.q) kz5.n0.a0(arrayList2, i19);
        if (qVar != null) {
            f0Var.invoke(java.lang.Integer.valueOf(i19), qVar);
        }
        ((com.tencent.mm.plugin.mv.ui.uic.z5) zVar.a(musicMvMakerUI).a(com.tencent.mm.plugin.mv.ui.uic.z5.class)).W6(false);
        if (h4Var.f151175v && (i17 = h4Var.f151169p) >= 0 && i17 < arrayList2.size()) {
            java.lang.Object obj = arrayList2.get(h4Var.f151169p);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            fm3.q qVar2 = (fm3.q) obj;
            int i27 = h4Var.f151169p;
            fm3.q qVar3 = qVar2.f264114o;
            if (qVar3 != null) {
                qVar3.f264110h = qVar2.f264110h;
                arrayList2.set(i27, qVar3);
                h4Var.R6().notifyItemChanged(i27);
                h4Var.V6(i27);
            }
        }
        musicMvMakerUI.Z6().animate().translationY(0.0f).start();
        musicMvMakerUI.Z6().d();
        if (this.f300329b.P6()) {
            return;
        }
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.V6(musicMvMakerUI);
    }
}
