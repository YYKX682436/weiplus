package wj2;

/* loaded from: classes3.dex */
public final class j0 implements qf2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f446689a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.v0 f446690b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f446691c;

    /* renamed from: d, reason: collision with root package name */
    public xh2.a f446692d;

    /* renamed from: e, reason: collision with root package name */
    public lj2.i0 f446693e;

    /* renamed from: f, reason: collision with root package name */
    public lj2.e0 f446694f;

    public j0(android.view.View root, lj2.v0 pluginAbility, lj2.x0 service) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f446689a = root;
        this.f446690b = pluginAbility;
        this.f446691c = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.rhb);
    }

    public void a(int i17) {
        lj2.e0 e0Var;
        lj2.i0 i0Var;
        if (i17 < 10 && zl2.r4.f473950a.x1() && (e0Var = this.f446694f) != null && (i0Var = this.f446693e) != null && !i0Var.f318872i && !i0Var.f318873j) {
            android.view.View view = e0Var.f318852a;
            android.content.Context context = view.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (((mMActivity == null || mMActivity.isPaused()) ? false : true) && view.isAttachedToWindow() && i0Var.f318865b.a0().y() == 1) {
                i0Var.f318873j = true;
                android.view.View view2 = i0Var.f318867d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment", "showWidget", "(Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment", "showWidget", "(Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.widget.PopupWindow popupWindow = i0Var.f318868e;
                popupWindow.showAtLocation(view, 51, 0, 0);
                popupWindow.setOnDismissListener(null);
                i0Var.f318867d.getViewTreeObserver().addOnPreDrawListener(new lj2.h0(i0Var, e0Var));
            }
        }
        android.view.View view3 = this.f446689a;
        if (i17 <= 10) {
            view3.setBackgroundResource(com.tencent.mm.R.drawable.cuq);
        } else {
            view3.setBackgroundResource(com.tencent.mm.R.drawable.cup);
        }
        this.f446691c.setText(no0.m.f338730a.b(i17, ":"));
    }

    public final void b(xh2.a data, lj2.e0 attachData) {
        qf2.t3 a76;
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(attachData, "attachData");
        lj2.v0 v0Var = this.f446690b;
        if (!v0Var.a0().n()) {
            android.view.View view = this.f446689a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLivePayMicCountDownWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLivePayMicCountDownWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f446692d = data;
        this.f446694f = attachData;
        long e17 = data.f454521b.f454559k - c01.id.e();
        com.tencent.mars.xlog.Log.i("PayMicCountDownWidget", "onBind time duration: " + e17);
        if (e17 <= 0) {
            a(0);
            android.view.View view2 = this.f446689a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLivePayMicCountDownWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLivePayMicCountDownWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.content.Context context = this.f446689a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f446693e = new lj2.i0(context, v0Var, new wj2.i0(this, data));
        qf2.q3 q3Var = (qf2.q3) v0Var.o(qf2.q3.class);
        if (q3Var != null && (a76 = q3Var.a7()) != null) {
            java.util.HashMap hashMap = a76.f362592c;
            qf2.s3 s3Var = (qf2.s3) hashMap.get(data.b());
            if (s3Var != null) {
                s3Var.f362578d = this;
                s3Var.f362575a = data;
                s3Var.a();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                java.lang.String b17 = data.b();
                qf2.s3 s3Var2 = new qf2.s3(a76, data);
                s3Var2.f362578d = this;
                s3Var2.a();
                hashMap.put(b17, s3Var2);
            }
        }
        android.view.View view3 = this.f446689a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLivePayMicCountDownWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLivePayMicCountDownWidget", "onBind", "(Lcom/tencent/mm/plugin/finder/live/mic/FinderLiveMicCoverData;Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c() {
        qf2.t3 a76;
        qf2.q3 q3Var = (qf2.q3) this.f446690b.o(qf2.q3.class);
        if (q3Var != null && (a76 = q3Var.a7()) != null) {
            xh2.a aVar = this.f446692d;
            qf2.s3 s3Var = (qf2.s3) a76.f362592c.get(aVar != null ? aVar.b() : "");
            if (s3Var != null) {
                s3Var.f362578d = null;
            }
        }
        lj2.i0 i0Var = this.f446693e;
        if (i0Var != null) {
            i0Var.f318872i = true;
            i0Var.f318868e.dismiss();
        }
    }
}
