package qi2;

/* loaded from: classes3.dex */
public final class m0 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f363570h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.CustomOptionPickNew f363571i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f363572m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f363573n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f363574o;

    /* renamed from: p, reason: collision with root package name */
    public int f363575p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, yz5.p onSelect) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onSelect, "onSelect");
        this.f363570h = onSelect;
        this.f363574o = new java.util.LinkedList();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dl6;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLivePkDurationSelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.Button button = this.f363572m;
        if (button == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        int id6 = button.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            a();
        } else {
            android.widget.Button button2 = this.f363573n;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("confirmBtn");
                throw null;
            }
            int id7 = button2.getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                a();
                java.util.LinkedList linkedList = this.f363574o;
                java.lang.Object obj = linkedList.get(this.f363575p);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                java.lang.String string = this.f118381d.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(((java.lang.Number) linkedList.get(this.f363575p)).intValue() / 60));
                kotlin.jvm.internal.o.f(string, "getString(...)");
                this.f363570h.invoke(obj, string);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLivePkDurationSelectPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.qv6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f363571i = (com.tencent.mm.ui.widget.picker.CustomOptionPickNew) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f363572m = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.c9z);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f363573n = (android.widget.Button) findViewById3;
        android.widget.Button button = this.f363572m;
        if (button == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        button.setOnClickListener(this);
        android.widget.Button button2 = this.f363573n;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("confirmBtn");
            throw null;
        }
        button2.setOnClickListener(this);
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = this.f363571i;
        if (customOptionPickNew == null) {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
        if (customOptionPickNew == null) {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
        customOptionPickNew.addView(customOptionPickNew.getView(), new android.widget.FrameLayout.LayoutParams(-1, -2));
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = this.f363571i;
        if (customOptionPickNew2 != null) {
            customOptionPickNew2.setOnValueChangedListener(new qi2.l0(this));
        } else {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
    }

    public final void y(java.util.LinkedList battleDurationList, int i17) {
        kotlin.jvm.internal.o.g(battleDurationList, "battleDurationList");
        w();
        java.util.LinkedList linkedList = this.f363574o;
        linkedList.clear();
        linkedList.addAll(battleDurationList);
        this.f363575p = battleDurationList.indexOf(java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = this.f363571i;
        if (customOptionPickNew == null) {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(battleDurationList, 10));
        java.util.Iterator it = battleDurationList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f118381d.getResources().getString(com.tencent.mm.R.string.lzf, java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue() / 60)));
        }
        customOptionPickNew.setOptionsArray((java.lang.String[]) arrayList.toArray(new java.lang.String[0]));
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = this.f363571i;
        if (customOptionPickNew2 == null) {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
        customOptionPickNew2.setValue(this.f363575p);
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew3 = this.f363571i;
        if (customOptionPickNew3 != null) {
            customOptionPickNew3.c(this.f363575p);
        } else {
            kotlin.jvm.internal.o.o("pickView");
            throw null;
        }
    }
}
