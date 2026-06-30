package jm3;

/* loaded from: classes10.dex */
public final class c0 implements com.tencent.mm.plugin.mv.ui.uic.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.c3 f300301b;

    public c0(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI, com.tencent.mm.plugin.mv.ui.uic.c3 c3Var) {
        this.f300300a = musicMvMakerUI;
        this.f300301b = c3Var;
    }

    public void a(int i17, fm3.q item, boolean z17, fm3.w wVar) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI activity = this.f300300a;
        if (wVar == null) {
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            ((com.tencent.mm.plugin.mv.ui.uic.z5) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.z5.class)).W6(true);
            com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = (com.tencent.mm.plugin.mv.ui.uic.z5) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.z5.class);
            z5Var.getClass();
            kotlinx.coroutines.l.d(z5Var.E, null, null, new com.tencent.mm.plugin.mv.ui.uic.s5(z5Var, item, null), 3, null);
            activity.Z6().animate().translationY(((android.view.View) ((jz5.n) activity.f150870f).getValue()).getY() - ((android.view.View) ((jz5.n) activity.f150869e).getValue()).getY()).start();
            ((com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class)).f151175v = z17;
            activity.Z6().c();
            return;
        }
        int i18 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
        android.view.View X6 = activity.X6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2", "onEditItem", "(ILcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;ZLcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2", "onEditItem", "(ILcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;ZLcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activity.Y6().setRadius(i65.a.b(activity.getContext(), 12));
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) activity.f150877p).getValue();
        kotlin.jvm.internal.o.f(imageView, "access$getMvItemEditThumb(...)");
        com.tencent.mm.ui.widget.MMRoundCornerImageView Y6 = activity.Y6();
        kotlin.jvm.internal.o.f(Y6, "access$getAlbumFakeThumb(...)");
        android.animation.Animator b17 = wVar.b(fm3.x.a(imageView), Y6, false);
        b17.addListener(new jm3.b0(activity));
        b17.setDuration(250L);
        b17.start();
        pf5.z zVar2 = pf5.z.f353948a;
        ((com.tencent.mm.plugin.mv.ui.uic.z5) zVar2.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.z5.class)).W6(true);
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var2 = (com.tencent.mm.plugin.mv.ui.uic.z5) zVar2.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.z5.class);
        z5Var2.getClass();
        kotlinx.coroutines.l.d(z5Var2.E, null, null, new com.tencent.mm.plugin.mv.ui.uic.s5(z5Var2, item, null), 3, null);
        activity.Z6().animate().translationY(((android.view.View) ((jz5.n) activity.f150870f).getValue()).getY() - ((android.view.View) ((jz5.n) activity.f150869e).getValue()).getY()).start();
        ((com.tencent.mm.plugin.mv.ui.uic.h4) zVar2.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class)).f151175v = z17;
        activity.Z6().c();
    }
}
