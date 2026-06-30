package qd2;

/* loaded from: classes.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361839d;

    public t0(qd2.g1 g1Var) {
        this.f361839d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_ORIGIN_TIPS_DIALOG_DONT_REMIND_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        y9.i iVar = this.f361839d.f361754h;
        if (iVar != null) {
            iVar.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
