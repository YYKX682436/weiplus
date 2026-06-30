package ts3;

/* loaded from: classes9.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f421641a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f421642b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f421643c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f421644d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f421645e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f421646f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f421647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ts3.d0 f421648h;

    public c0(ts3.d0 d0Var) {
        this.f421648h = d0Var;
    }

    public void a(c01.ta taVar, int i17, java.lang.String str) {
        ts3.d0 d0Var = this.f421648h;
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = d0Var.B;
        android.view.View.OnClickListener T6 = readerAppUI.T6(taVar, readerAppUI.f155060h, i17, 0, str, str);
        android.view.View view = this.f421641a;
        if (view == null) {
            return;
        }
        view.setOnClickListener(T6);
        this.f421641a.setTag(java.lang.Integer.valueOf(i17));
        this.f421641a.setTag(com.tencent.mm.R.id.ljk, java.lang.Integer.valueOf(i17));
        taVar.i();
        int i18 = taVar.f37489v;
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI2 = d0Var.B;
        if (i18 != 5) {
            readerAppUI2.f155066q.i(this.f421641a, new ts3.p(readerAppUI2, false), readerAppUI2.f155069t);
        }
        this.f421646f.b(taVar.f());
        taVar.i();
        java.lang.String d17 = ot0.g0.d(taVar.f37487t);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            android.view.View view2 = this.f421642b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f421647g.setText(d17);
            android.view.View view3 = this.f421642b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppWeiShiSlot", "fillData", "(Lcom/tencent/mm/model/ReaderAppInfo;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f421646f.setTextColor(readerAppUI2.getContext().getResources().getColor(com.tencent.mm.R.color.f479304vk));
        this.f421643c.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
        int textSize = (int) (this.f421647g.getTextSize() * 1.7d);
        android.view.ViewGroup.LayoutParams layoutParams = this.f421645e.getLayoutParams();
        layoutParams.height = textSize;
        layoutParams.width = textSize;
        this.f421645e.setLayoutParams(layoutParams);
        android.widget.ImageView imageView = this.f421644d;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int i19 = d0Var.f421658w;
        layoutParams2.height = i19;
        imageView.setLayoutParams(layoutParams2);
        java.lang.String c17 = taVar.c();
        android.widget.ImageView imageView2 = this.f421644d;
        ts3.b0 b0Var = new ts3.b0(this);
        java.lang.String d18 = m11.n1.d(c17);
        int e17 = (int) ((fq1.e.f265507a.e(readerAppUI2.getContext()) - (com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.f155055u * 52.0f)) / 2.0f);
        float dimensionPixelSize = imageView2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a8y);
        n11.a b17 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f342093q = com.tencent.mm.R.drawable.f480975gt;
        fVar.f342078b = true;
        fVar.D = "reader_weishi";
        fVar.f342086j = e17;
        fVar.f342087k = i19;
        fVar.A = new r35.n0(0);
        fVar.B = new r35.w(0);
        fVar.f342082f = tv.a.b(d18);
        b17.k(d18, imageView2, fVar.a(), null, new r35.m0(0, e17, d0Var.f421658w, true, true, dimensionPixelSize, b0Var));
    }

    public void b() {
        android.view.View view = this.f421641a;
        if (view == null) {
            return;
        }
        this.f421644d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.pkz);
        this.f421646f = (com.tencent.mm.ui.widget.MMNeat7extView) this.f421641a.findViewById(com.tencent.mm.R.id.odc);
        this.f421647g = (android.widget.TextView) this.f421641a.findViewById(com.tencent.mm.R.id.oxt);
        this.f421645e = (android.widget.ImageView) this.f421641a.findViewById(com.tencent.mm.R.id.kwn);
        this.f421642b = this.f421641a.findViewById(com.tencent.mm.R.id.kxc);
        this.f421643c = this.f421641a.findViewById(com.tencent.mm.R.id.pkw);
    }
}
