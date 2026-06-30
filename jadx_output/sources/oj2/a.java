package oj2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.c f345755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.v0 f345756e;

    public a(oj2.c cVar, lj2.v0 v0Var) {
        this.f345755d = cVar;
        this.f345756e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean w17 = zl2.r4.f473950a.w1();
        oj2.c cVar = this.f345755d;
        if (w17) {
            com.tencent.mars.xlog.Log.i(cVar.getTAG(), "click rect area but i am anchor, skipped");
        } else {
            java.lang.String s17 = this.f345756e.a0().s();
            km2.q bindLinkMicUser = cVar.getBindLinkMicUser();
            if (com.tencent.mm.sdk.platformtools.t8.D0(s17, bindLinkMicUser != null ? bindLinkMicUser.f309170a : null)) {
                com.tencent.mars.xlog.Log.i(cVar.getTAG(), "click rect area but is myself, skipped");
            } else {
                cVar.X();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
