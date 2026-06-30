package cw1;

/* loaded from: classes12.dex */
public final class b1 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public cw1.v0 f222803d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.CheckBox f222804e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f222805f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f222806g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f222807h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f222808i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI f222809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f222809m = cleanCacheNewUI;
        this.f222803d = new cw1.v0(-4, 0L, false, 6, null);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.bxf);
        kotlin.jvm.internal.o.d(findViewById);
        this.f222804e = (android.widget.CheckBox) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.d(findViewById2);
        this.f222805f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.mzv);
        kotlin.jvm.internal.o.d(findViewById3);
        this.f222806g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.t3j);
        kotlin.jvm.internal.o.d(findViewById4);
        this.f222807h = findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.bxc);
        kotlin.jvm.internal.o.d(findViewById5);
        this.f222808i = findViewById5;
        root.setOnClickListener(this);
    }

    public final void i() {
        java.lang.String a17;
        cw1.v0 v0Var = this.f222803d;
        this.f222804e.setChecked(v0Var.f223361c || v0Var.f223362d > 0);
        if (!v0Var.f223361c) {
            long j17 = v0Var.f223362d;
            if (j17 > 0) {
                a17 = this.f222809m.getString(com.tencent.mm.R.string.n8k, fp.n0.a(j17));
                this.f222806g.setText(a17);
            }
        }
        a17 = fp.n0.a(v0Var.f223360b);
        this.f222806g.setText(a17);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        boolean isChecked = this.f222804e.isChecked();
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI = this.f222809m;
        if (isChecked) {
            cw1.v0 v0Var = this.f222803d;
            v0Var.f223361c = false;
            v0Var.f223362d = 0L;
            int i17 = v0Var.f223359a;
            if (i17 == -2) {
                cleanCacheNewUI.f95670u[0] = cleanCacheNewUI.f95672w;
            } else if (i17 == -1) {
                cleanCacheNewUI.f95670u[1] = cleanCacheNewUI.f95672w;
            } else if (i17 == 3) {
                cleanCacheNewUI.f95668s = new java.lang.String[0];
            }
        } else {
            cw1.v0 v0Var2 = this.f222803d;
            v0Var2.f223361c = true;
            v0Var2.f223362d = v0Var2.f223360b;
            int i18 = v0Var2.f223359a;
            if (i18 == -2) {
                com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr = cleanCacheNewUI.f95670u;
                com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr2 = cleanCacheNewUI.f95671v;
                if (cleanService$SelectedItemsArr2 == null) {
                    kotlin.jvm.internal.o.o("allOriginItems");
                    throw null;
                }
                cleanService$SelectedItemsArr[0] = cleanService$SelectedItemsArr2[0];
            } else if (i18 == -1) {
                com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr3 = cleanCacheNewUI.f95670u;
                com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr4 = cleanCacheNewUI.f95671v;
                if (cleanService$SelectedItemsArr4 == null) {
                    kotlin.jvm.internal.o.o("allOriginItems");
                    throw null;
                }
                cleanService$SelectedItemsArr3[1] = cleanService$SelectedItemsArr4[1];
            } else if (i18 == 3) {
                cleanCacheNewUI.f95668s = new java.lang.String[0];
            }
        }
        i();
        cw1.t0 t0Var = cleanCacheNewUI.f95656d;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        t0Var.f223326f.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
