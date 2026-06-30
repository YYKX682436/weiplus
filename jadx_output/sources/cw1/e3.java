package cw1;

/* loaded from: classes8.dex */
public final class e3 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f222900d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f222901e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f222902f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f222903g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f222904h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI cleanChattingChooseConvUI, android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f222900d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.d(findViewById2);
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        textView.setTextSize(0, i65.a.h(cleanChattingChooseConvUI, com.tencent.mm.R.dimen.f479897ia));
        this.f222901e = textView;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.d(findViewById3);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        textView2.setTextSize(0, i65.a.h(cleanChattingChooseConvUI, com.tencent.mm.R.dimen.f479853h2));
        this.f222902f = textView2;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.otg);
        kotlin.jvm.internal.o.d(findViewById4);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        textView3.setTextSize(0, i65.a.h(cleanChattingChooseConvUI, com.tencent.mm.R.dimen.f479930ja));
        this.f222903g = textView3;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.ofy);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f222904h = findViewById5;
        root.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        jz5.l lVar = tag instanceof jz5.l ? (jz5.l) tag : null;
        if (lVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object obj = lVar.f302833d;
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object obj2 = lVar.f302834e;
        java.lang.Long l17 = obj2 instanceof java.lang.Long ? (java.lang.Long) obj2 : null;
        if (l17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        long longValue = l17.longValue();
        cw1.d3 d3Var = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI.f95719f;
        android.content.Context context = v17.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d3Var.a(context, str, longValue);
        ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).uj(str);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseConvUI$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
