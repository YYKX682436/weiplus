package th5;

/* loaded from: classes12.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.l0 f419385d;

    public h0(th5.l0 l0Var) {
        this.f419385d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        th5.l0 l0Var = this.f419385d;
        l0Var.a0();
        l0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - l0Var.A >= 500) {
            l0Var.A = currentTimeMillis;
            com.tencent.mm.plugin.media.live.LivePlayButton livePlayButton = l0Var.f419401v;
            if (livePlayButton != null) {
                livePlayButton.c();
            }
            com.tencent.mm.plugin.media.live.LivePlayButton livePlayButton2 = l0Var.f419401v;
            if (livePlayButton2 != null) {
                livePlayButton2.d();
            }
            l0Var.i0();
        }
        mf3.s sVar = l0Var.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar != null) {
            th5.v0.f419470a.a(qVar.f419344c, qVar.f419342a, qVar.f419343b, th5.a.f419334f, th5.e.f419367f);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
