package li2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.g f318759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.v0 f318760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.x0 f318761f;

    public c(li2.g gVar, lj2.v0 v0Var, lj2.x0 x0Var) {
        this.f318759d = gVar;
        this.f318760e = v0Var;
        this.f318761f = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        li2.g gVar = this.f318759d;
        if (gVar.G()) {
            lj2.v0 v0Var = this.f318760e;
            lj2.t0 a07 = v0Var.a0();
            km2.q bindLinkMicUser = gVar.getBindLinkMicUser();
            if (bindLinkMicUser == null || (str = bindLinkMicUser.f309170a) == null) {
                str = "";
            }
            if (a07.j(str)) {
                zh2.b m17 = this.f318761f.m();
                if (m17 != null) {
                    ((ch2.o2) m17).z7(4);
                }
                lf2.a aVar = (lf2.a) v0Var.o(lf2.a.class);
                if (aVar != null) {
                    aVar.Z6(2, 4);
                }
            }
        } else {
            gVar.X();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveKTVRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
