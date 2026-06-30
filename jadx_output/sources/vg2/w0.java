package vg2;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.x0 f436613d;

    public w0(vg2.x0 x0Var) {
        this.f436613d = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSamePkgGiftWidget$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.x0 x0Var = this.f436613d;
        com.tencent.mars.xlog.Log.i(x0Var.f436616f, "[click] giftId:" + x0Var.f436487e);
        r45.zb4 zb4Var = new r45.zb4();
        zb4Var.set(1, java.lang.Boolean.TRUE);
        zb4Var.set(2, x0Var.f436483a.getString(com.tencent.mm.R.string.f491563dj5));
        zb4Var.set(0, x0Var.f436487e);
        mm2.s2 s2Var = (mm2.s2) dk2.ef.f233372a.i(mm2.s2.class);
        if (s2Var != null && (liveMutableData = s2Var.f329411p) != null) {
            liveMutableData.postValue(zb4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSamePkgGiftWidget$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
