package te2;

/* loaded from: classes3.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418529d;

    public x5(te2.p8 p8Var) {
        this.f418529d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f418529d;
        db5.t7.h(p8Var.getContext(), p8Var.getActivity().getResources().getString(com.tencent.mm.R.string.osu));
        yz5.p pVar = p8Var.G1;
        if (pVar != null) {
            pVar.invoke(p8Var.f418333y1, java.lang.Integer.valueOf(p8Var.f418329x0));
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new te2.b8(p8Var, false, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
