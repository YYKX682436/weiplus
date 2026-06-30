package y;

/* loaded from: classes16.dex */
public final class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.h f458435d;

    public q2(mi2.h hVar) {
        this.f458435d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$setupAcceptWayContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mi2.h hVar = this.f458435d;
        if (hVar.T == 2) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$setupAcceptWayContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        fj2.s.c(fj2.s.f263183a, ml2.q2.B, "2", null, 0, 0, 28, null);
        hVar.T = 2;
        int i17 = hVar.S;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        hVar.S = i17 | 16;
        hVar.U();
        hVar.V(hVar.S);
        hVar.Q(hVar.S);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/moreaction/FinderLiveMicMoreActionWidget$setupAcceptWayContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
