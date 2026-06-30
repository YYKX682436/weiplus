package ss2;

/* loaded from: classes10.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f411952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ss2.l f411953e;

    public j(boolean[] zArr, ss2.l lVar) {
        this.f411952d = zArr;
        this.f411953e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f411952d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            fo3.s sVar = fo3.s.INSTANCE;
            sVar.Z7("ce_feed_publish", "<FeedPublish>");
            sVar.H2("ce_feed_publish", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
            sVar.Qa("ce_feed_publish");
        }
        ss2.l lVar = this.f411953e;
        lVar.getClass();
        com.tencent.mm.plugin.finder.report.p2.L(com.tencent.mm.plugin.finder.report.p2.f125237a, lVar.getContext(), 66, null, 0L, 0, 24, null);
        ss2.d0 d0Var = lVar.f411961m;
        if (d0Var != null && d0Var.f411945o == 1) {
            m92.i X4 = g92.b.f269769e.X4(lVar.f411956e);
            if (X4 == null || X4.f324987a != 1) {
                ya2.b2 b2Var = lVar.f411957f;
                if (b2Var != null && b2Var.G0()) {
                    db5.t7.g(lVar.getContext(), lVar.getString(com.tencent.mm.R.string.ev9));
                }
            } else {
                db5.t7.g(lVar.getContext(), lVar.getString(com.tencent.mm.R.string.ev8));
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
        ss2.d0 d0Var2 = lVar.f411961m;
        if (d0Var2 != null && d0Var2.f411945o == 2) {
            if (!((g92.b.f269769e.k2().e().getInteger(17) & 1) == 0)) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.finder.assist.i0) c17).bl(lVar.getActivity(), null);
                lVar.getActivity().finish();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        lVar.S6();
        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        dv2.e1 e1Var = (dv2.e1) pf5.z.f353948a.a(activity).a(dv2.e1.class);
        ss2.d dVar = lVar.f411960i;
        if (dVar == null || (str = dVar.b().getText().toString()) == null) {
            str = "";
        }
        e1Var.P6(new com.tencent.mm.plugin.finder.assist.g9(str, null, "", false, false, 26, null), new ss2.e(lVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMainUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
