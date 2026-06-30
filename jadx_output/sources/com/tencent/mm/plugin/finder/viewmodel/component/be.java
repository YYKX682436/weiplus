package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class be implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ce f133868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f133869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f133870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f133871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f133872h;

    public be(com.tencent.mm.plugin.finder.viewmodel.component.ce ceVar, long j17, java.lang.ref.WeakReference weakReference, kotlin.jvm.internal.h0 h0Var, boolean z17) {
        this.f133868d = ceVar;
        this.f133869e = j17;
        this.f133870f = weakReference;
        this.f133871g = h0Var;
        this.f133872h = z17;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        in5.s0 s0Var;
        android.view.View view;
        r45.ln2 ln2Var = (r45.ln2) obj;
        android.widget.TextView textView = (android.widget.TextView) this.f133871g.f310123d;
        kotlin.jvm.internal.o.d(ln2Var);
        com.tencent.mm.plugin.finder.viewmodel.component.ce ceVar = this.f133868d;
        ceVar.getClass();
        boolean z17 = this.f133872h;
        if (z17) {
            s0Var = (in5.s0) this.f133870f.get();
            if (s0Var == null) {
                return;
            }
            so2.j5 j5Var = (so2.j5) s0Var.f293125i;
            if (!(j5Var != null && j5Var.getItemId() == this.f133869e)) {
                return;
            }
        } else {
            s0Var = null;
        }
        if (ln2Var.getInteger(1) == 1) {
            if (!z17 || s0Var == null) {
                view = ceVar.f134015d;
            } else {
                bw2.o oVar = bw2.o.f24869a;
                view = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24877i).getValue()).invoke(s0Var)).a();
            }
            if (z17) {
                if (view == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lob)) == null) {
                    textView = null;
                } else {
                    com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                    textView.setTextSize(1, 14.0f);
                }
            }
            java.lang.String string = ln2Var.getString(0);
            if (string == null) {
                string = "";
            }
            if (textView != null) {
                textView.setText(string);
            }
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRecommendUIC", "onRecommendDataNotify", "(JLjava/lang/ref/WeakReference;Landroid/widget/TextView;Lcom/tencent/mm/protocal/protobuf/FinderObjectWordingInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRecommendUIC", "onRecommendDataNotify", "(JLjava/lang/ref/WeakReference;Landroid/widget/TextView;Lcom/tencent/mm/protocal/protobuf/FinderObjectWordingInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("FinderFeedRecommendUIC", "recommendReason: " + ((java.lang.Object) string));
        }
    }
}
