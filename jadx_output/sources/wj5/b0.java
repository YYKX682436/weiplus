package wj5;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.e0 f446781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.content.AnimTextView f446782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f446783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xj5.n f446784g;

    public b0(wj5.e0 e0Var, com.tencent.mm.ui.anim.content.AnimTextView animTextView, in5.s0 s0Var, xj5.n nVar) {
        this.f446781d = e0Var;
        this.f446782e = animTextView;
        this.f446783f = s0Var;
        this.f446784g = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.anim.content.AnimTextView animTextView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.anim.content.AnimTextView tvCancel = this.f446782e;
        kotlin.jvm.internal.o.f(tvCancel, "$tvCancel");
        wj5.e0 e0Var = this.f446781d;
        if (e0Var.q(tvCancel)) {
            ak5.g0 g0Var = (ak5.g0) i95.n0.c(ak5.g0.class);
            android.content.Context context = this.f446783f.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xj5.n nVar = this.f446784g;
            g0Var.Ai(context, 2, nVar.f454915u, null);
            nVar.f454897e = 4;
        } else {
            if (!e0Var.q(tvCancel)) {
                java.lang.String string = tvCancel.getContext().getResources().getString(com.tencent.mm.R.string.jza);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                int h17 = i65.a.h(tvCancel.getContext(), com.tencent.mm.R.dimen.f479672c9);
                int color = tvCancel.getContext().getResources().getColor(com.tencent.mm.R.color.f478714f5);
                tvCancel.tText = string;
                tvCancel.tTextColor = color;
                tvCancel.tPaddingLeft = h17;
                tvCancel.tPaddingRight = h17;
                tvCancel.tBackgroundRes = com.tencent.mm.R.drawable.afm;
                tvCancel.tBackgroundShow = true;
                tvCancel.tDuration = 200L;
                tvCancel.b(true);
                tvCancel.setTag(java.lang.Boolean.TRUE);
            }
            e0Var.r(tvCancel);
            java.lang.ref.WeakReference weakReference = wj5.e0.f446793h;
            if (weakReference != null && (animTextView = (com.tencent.mm.ui.anim.content.AnimTextView) weakReference.get()) != null && !kotlin.jvm.internal.o.b(animTextView, tvCancel)) {
                e0Var.p(animTextView, true);
            }
            wj5.e0.f446793h = new java.lang.ref.WeakReference(tvCancel);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
