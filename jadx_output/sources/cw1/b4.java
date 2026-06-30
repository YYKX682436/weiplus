package cw1;

/* loaded from: classes12.dex */
public final class b4 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f222813d;

    /* renamed from: e, reason: collision with root package name */
    public int f222814e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.MMImageView f222815f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f222816g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f222817h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f222818i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f222819m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.CheckBox f222820n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f222821o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(cw1.q4 q4Var, android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f222821o = q4Var;
        this.f222814e = -1;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.chd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f222815f = (com.tencent.mm.ui.MMImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.mzv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f222816g = textView;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f222817h = textView2;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.oru);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        this.f222818i = textView3;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.mkj);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f222819m = findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.mie);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f222820n = (android.widget.CheckBox) findViewById6;
        float dimension = q4Var.f223265d.getResources().getDimension(com.tencent.mm.R.dimen.f479930ja);
        textView.setTextSize(0, dimension);
        textView2.setTextSize(0, dimension);
        textView3.setTextSize(0, dimension);
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.saf);
        findViewById7.setTag(this);
        findViewById7.setOnClickListener(this);
        if (q4Var.f223273o) {
            findViewById7.setOnLongClickListener(new cw1.x3(q4Var));
        }
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.l3o);
        findViewById8.setTag(this);
        findViewById8.setOnClickListener(new cw1.y3(q4Var));
        if (q4Var.f223273o) {
            findViewById8.setOnLongClickListener(new cw1.z3(q4Var));
        }
        ((com.tencent.mm.view.recyclerview.dragselect.GestureFoursquareRelativeLayout) root).setItemGestureListener(new cw1.a4(q4Var, this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailNewAdapter.ItemViewHolder");
        cw1.b4 b4Var = (cw1.b4) tag;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectClick dataPos=");
        sb6.append(b4Var.f222813d);
        sb6.append(" nextChecked=");
        android.widget.CheckBox checkBox = b4Var.f222820n;
        sb6.append(!checkBox.isChecked());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingDetailNewAdapter", sb6.toString());
        boolean z17 = !checkBox.isChecked();
        cw1.q4 q4Var = this.f222821o;
        if (q4Var.f223269h.get(b4Var.f222813d) != z17) {
            q4Var.f223269h.set(b4Var.f222813d, z17);
            checkBox.setChecked(z17);
            bw1.l lVar = (bw1.l) q4Var.f223266e.get(b4Var.f222813d);
            if (z17) {
                android.view.View view = b4Var.f222819m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q4Var.f223271m++;
                q4Var.f223270i += lVar.f24809a;
            } else {
                android.view.View view2 = b4Var.f222819m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter", "checkItem", "(Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q4Var.f223271m--;
                q4Var.f223270i -= lVar.f24809a;
            }
            int i17 = b4Var.f222814e;
            if (i17 >= 0) {
                q4Var.notifyItemChanged(((java.lang.Number) ((jz5.l) q4Var.f223267f.get(i17)).f302833d).intValue(), "");
            }
            q4Var.f223265d.h7(q4Var.f223270i, q4Var.f223266e.size(), q4Var.f223271m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$ItemViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
