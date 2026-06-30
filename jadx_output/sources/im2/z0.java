package im2;

/* loaded from: classes3.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292628d;

    public z0(im2.z3 z3Var) {
        this.f292628d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View decorView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f292628d;
        if (z3Var.C1 != null) {
            cf2.h hVar = new cf2.h(z3Var.getContext(), z3Var.getContext().getString(com.tencent.mm.R.string.ntg), z3Var.getContext().getString(com.tencent.mm.R.string.ntj), z3Var.getContext().getString(com.tencent.mm.R.string.nth), z3Var.getContext().getString(com.tencent.mm.R.string.nti));
            hVar.R = new im2.w0(z3Var, hVar);
            hVar.C();
        } else if (!z3Var.p7()) {
            r45.h32 Y6 = z3Var.Z1 ? z3Var.Y6() : z3Var.X6(z3Var.L1);
            com.tencent.mars.xlog.Log.i(z3Var.f292635d, "#previewData introduction:" + Y6.getString(3) + " introduction_extend:" + Y6.getString(23));
            android.app.Activity context = z3Var.getContext();
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
            if (mMFragmentActivity != null) {
                mMFragmentActivity.hideVKB();
            }
            android.app.Activity context2 = z3Var.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            te2.s8 s8Var = (te2.s8) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(te2.s8.class);
            s8Var.getClass();
            if (s8Var.J1) {
                android.view.View findViewById = s8Var.findViewById(com.tencent.mm.R.id.umn);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "loadPreviewData", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeWithPreviewUIC", "loadPreviewData", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveNoticeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View inflate = s8Var.getActivity().getLayoutInflater().inflate(com.tencent.mm.R.layout.f488946aw5, (android.view.ViewGroup) null);
                android.view.Window window = s8Var.getActivity().getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    ym5.v6.b(decorView, inflate);
                }
                s8Var.J1 = true;
            }
            s8Var.A1.f418391b = Y6;
            s8Var.f418335z1 = ya2.h.f460484a.b(xy2.c.e(s8Var.getContext()));
            s8Var.l7();
            s8Var.k7();
            te2.sc scVar = te2.sc.f418412a;
            java.util.List list = te2.sc.f418414c;
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list;
            r45.s52 s52Var = arrayList3.size() <= 0 ? (r45.s52) kz5.n0.Z(list) : (r45.s52) arrayList3.get(0);
            if (s52Var == null) {
                s52Var = new r45.s52();
            }
            s8Var.v7(s52Var);
            s8Var.u7();
            int size = ((java.util.ArrayList) list).size();
            jz5.g gVar = s8Var.V;
            if (size > 0) {
                ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(0);
            }
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setOnClickListener(new te2.q8(s8Var));
            s8Var.F1 = new te2.r8(s8Var);
            android.app.Activity context3 = z3Var.getContext();
            kotlin.jvm.internal.o.g(context3, "context");
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((te2.s8) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(te2.s8.class)).G1 = new im2.y0(z3Var);
        } else if (z3Var.Z1) {
            z3Var.V6("", -1);
        } else {
            z3Var.U6(z3Var.L1, "", -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
