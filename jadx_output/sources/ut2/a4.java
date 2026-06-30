package ut2;

/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f430819a;

    /* renamed from: b, reason: collision with root package name */
    public final st2.h1 f430820b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f430821c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f430822d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f430823e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f430824f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f430825g;

    public a4(android.view.View root, st2.h1 shoppingListInternal) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(shoppingListInternal, "shoppingListInternal");
        this.f430819a = root;
        this.f430820b = shoppingListInternal;
        this.f430821c = root.findViewById(com.tencent.mm.R.id.flj);
        this.f430822d = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.flk);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484810q43);
        this.f430823e = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.fli);
        d92.f fVar = d92.f.f227470a;
        kotlin.jvm.internal.o.d(textView2);
        fVar.l(textView2, 17.0f, false);
        this.f430824f = textView2;
        this.f430825g = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.tor);
        textView2.setOnClickListener(new ut2.v3(this));
        textView.setOnClickListener(new ut2.w3(this));
        java.lang.String string = root.getContext().getString(com.tencent.mm.R.string.ak_);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = root.getContext().getString(com.tencent.mm.R.string.f491836rv);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(root.getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5)), 0, spannableString.length(), 17);
        textView.setText(android.text.TextUtils.concat(string, spannableString));
        com.tencent.mars.xlog.Log.i("ShoppingPanelEmptyHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    public final void a(r45.dv1 shelf) {
        kotlin.jvm.internal.o.g(shelf, "shelf");
        bw5.q30 q30Var = (bw5.q30) shelf.getCustom(41);
        if (q30Var == null) {
            return;
        }
        boolean[] zArr = q30Var.f31920g;
        java.lang.String str = zArr[1] ? q30Var.f31917d : "";
        android.text.SpannableString spannableString = new android.text.SpannableString(zArr[2] ? q30Var.f31918e : "");
        spannableString.setSpan(new ut2.x3(this), 0, spannableString.length(), 17);
        java.lang.CharSequence concat = android.text.TextUtils.concat(str, spannableString);
        android.widget.TextView textView = this.f430825g;
        textView.setText(concat);
        textView.setMovementMethod(new ut2.y3());
    }

    public final void b(boolean z17, boolean z18, boolean z19) {
        if (!z17) {
            android.view.View view = this.f430821c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f430821c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f430824f;
        android.widget.TextView textView2 = this.f430822d;
        if (!z18) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        android.widget.TextView textView3 = this.f430823e;
        if (z19) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
        } else {
            textView3.setVisibility(8);
            textView2.setVisibility(0);
        }
    }
}
