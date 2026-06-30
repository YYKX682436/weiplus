package tx2;

/* loaded from: classes3.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f422671d;

    public x(tx2.i0 i0Var) {
        this.f422671d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshBindCouponView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tx2.i0 i0Var = this.f422671d;
        java.lang.String str = i0Var.D;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveNoticeBigCardWidget", "no anchorFinderUsername");
        } else {
            r45.h32 h32Var = i0Var.C;
            if (h32Var == null) {
                com.tencent.mars.xlog.Log.e("FinderLiveNoticeBigCardWidget", "no noticeInfo");
            } else {
                r45.ov2 a17 = zl2.t.a(h32Var);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("FinderLiveNoticeBigCardWidget", "no coupon");
                } else {
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    s40.w0 w0Var = (s40.w0) c17;
                    java.lang.String e17 = xy2.c.e(i0Var.f118381d);
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.lang.String string = a17.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    linkedList.add(string);
                    java.lang.String string2 = h32Var.getString(4);
                    s40.w0.Fa(w0Var, 0L, 0L, str, e17, null, linkedList, string2 == null ? "" : string2, i0Var.f118381d, false, new tx2.w(h32Var, i0Var, a17), 256, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshBindCouponView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
