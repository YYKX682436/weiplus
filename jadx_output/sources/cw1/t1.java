package cw1;

/* loaded from: classes7.dex */
public final class t1 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f223328d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.CheckBox f223329e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f223330f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f223331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI f223332h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI cleanCacheSubListUI, android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f223332h = cleanCacheSubListUI;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.bxf);
        kotlin.jvm.internal.o.d(findViewById);
        this.f223329e = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.d(findViewById2);
        this.f223330f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.mzv);
        kotlin.jvm.internal.o.d(findViewById3);
        this.f223331g = (android.widget.TextView) findViewById3;
        root.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        android.widget.CheckBox checkBox = this.f223329e;
        boolean z17 = !checkBox.isChecked();
        checkBox.setChecked(z17);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheSubListUI cleanCacheSubListUI = this.f223332h;
        cw1.s1 s1Var = cleanCacheSubListUI.f95685e;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        s1Var.f223303e[this.f223328d] = z17;
        cleanCacheSubListUI.f95687g = true;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
