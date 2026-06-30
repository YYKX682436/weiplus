package cw1;

/* loaded from: classes12.dex */
public final class w3 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f223456d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f223457e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.CheckBox f223458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f223459g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(cw1.q4 q4Var, android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(root, "root");
        this.f223459g = q4Var;
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.gzf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f223457e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f485233gz5);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f223458f = (android.widget.CheckBox) findViewById2;
        this.itemView.setTag(this);
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$HeaderViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailNewAdapter.HeaderViewHolder");
        cw1.w3 w3Var = (cw1.w3) tag;
        boolean z17 = !w3Var.f223458f.isChecked();
        cw1.q4 q4Var = this.f223459g;
        q4Var.getClass();
        int i17 = w3Var.f223456d;
        jz5.l B = q4Var.B(i17);
        int intValue = ((java.lang.Number) B.f302833d).intValue();
        int intValue2 = ((java.lang.Number) B.f302834e).intValue();
        if (!z17) {
            int i18 = intValue - 1;
            while (true) {
                i18 = q4Var.f223269h.nextSetBit(i18 + 1);
                if (i18 < 0 || i18 >= intValue2) {
                    break;
                }
                q4Var.f223270i -= ((bw1.l) q4Var.f223266e.get(i18)).f24809a;
                q4Var.f223271m--;
            }
        } else {
            int i19 = intValue - 1;
            while (true) {
                i19 = q4Var.f223269h.nextClearBit(i19 + 1);
                if (i19 >= intValue2) {
                    break;
                }
                q4Var.f223270i += ((bw1.l) q4Var.f223266e.get(i19)).f24809a;
                q4Var.f223271m++;
            }
        }
        q4Var.f223269h.set(intValue, intValue2, z17);
        w3Var.f223458f.setChecked(z17);
        q4Var.notifyItemRangeChanged(i17 + intValue + 1, intValue2 - intValue, "");
        q4Var.f223265d.h7(q4Var.f223270i, q4Var.f223266e.size(), q4Var.f223271m);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailNewAdapter$HeaderViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
