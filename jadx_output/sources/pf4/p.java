package pf4;

/* loaded from: classes4.dex */
public final class p extends pf4.l {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f353882m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pf4.q f353883n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pf4.q qVar, android.view.View itemView) {
        super(qVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f353883n = qVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f487127nl5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f353882m = (android.widget.TextView) findViewById;
    }

    @Override // pf4.l
    public android.view.View i() {
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.nkm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // pf4.l
    public void j(int i17, gf4.a comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        super.j(i17, comment);
        boolean z17 = comment.f271336g;
        if (z17) {
            pm0.v.c(this.f353875e);
        }
        pf4.q qVar = this.f353883n;
        android.widget.TextView textView = this.f353882m;
        if (z17) {
            textView.setVisibility(8);
        } else {
            boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(ef4.w.f252468t.e(), comment.f271330a);
            textView.setVisibility(0);
            if (D0) {
                textView.setOnClickListener(new pf4.o(qVar, comment));
                textView.setText(this.itemView.getContext().getResources().getString(com.tencent.mm.R.string.jlp));
                textView.setTextColor(-1);
                pm0.v.c(textView);
            } else {
                textView.setVisibility(8);
            }
        }
        this.itemView.setOnClickListener(new pf4.n(qVar, comment));
    }
}
