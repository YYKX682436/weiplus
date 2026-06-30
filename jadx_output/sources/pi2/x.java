package pi2;

/* loaded from: classes3.dex */
public final class x extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final yz5.p H;
    public com.tencent.mm.ui.widget.picker.CustomOptionPickNew I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.Button f354819J;
    public android.widget.Button K;
    public final java.util.LinkedList L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, yz5.p onSelect) {
        super(context, false, null, 0.0f, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onSelect, "onSelect");
        this.H = onSelect;
        this.L = new java.util.LinkedList();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dl6;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View E(zl2.u4 uiMode) {
        kotlin.jvm.internal.o.g(uiMode, "uiMode");
        return android.view.LayoutInflater.from(this.f118183e).inflate(com.tencent.mm.R.layout.dl6, (android.view.ViewGroup) z(), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.odb);
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.ml6));
        com.tencent.mm.ui.fk.a(textView);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.qv6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.I = (com.tencent.mm.ui.widget.picker.CustomOptionPickNew) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f354819J = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.c9z);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.K = (android.widget.Button) findViewById3;
        android.widget.Button button = this.f354819J;
        if (button == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        button.setOnClickListener(this);
        android.widget.Button button2 = this.K;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("confirmBtn");
            throw null;
        }
        button2.setOnClickListener(this);
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = this.I;
        if (customOptionPickNew == null) {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
        if (customOptionPickNew == null) {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
        customOptionPickNew.addView(customOptionPickNew.getView(), new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = this.I;
        if (customOptionPickNew2 != null) {
            customOptionPickNew2.setOnValueChangedListener(new pi2.w(this));
        } else {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicCloseWaySelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.Button button = this.f354819J;
        if (button == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        int id6 = button.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
        } else {
            android.widget.Button button2 = this.K;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("confirmBtn");
                throw null;
            }
            int id7 = button2.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                java.util.LinkedList linkedList = this.L;
                java.lang.Object obj = linkedList.get(this.M);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.jf5 jf5Var = (r45.jf5) linkedList.get(this.M);
                if (jf5Var == null || (str = jf5Var.getString(1)) == null) {
                    str = "";
                }
                this.H.invoke(obj, str);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLivePayMicCloseWaySelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
