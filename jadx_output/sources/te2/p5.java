package te2;

/* loaded from: classes3.dex */
public final class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418303d;

    public p5(te2.p8 p8Var) {
        this.f418303d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ya2.g gVar = ya2.h.f460484a;
        te2.p8 p8Var = this.f418303d;
        ya2.b2 b17 = gVar.b(xy2.c.e(p8Var.getContext()));
        if (b17 != null) {
            com.tencent.mm.protocal.protobuf.FinderContact i17 = ya2.d.i(b17);
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            android.app.Activity context = p8Var.getContext();
            r45.l32 l32Var = p8Var.Z;
            c61.ub.A3(ubVar, context, null, i17, 1012, false, null, l32Var != null ? (r45.h32) l32Var.getCustom(1) : null, false, null, null, na1.e.CTRL_INDEX, null);
            p8Var.getActivity().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
