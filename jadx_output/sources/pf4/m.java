package pf4;

/* loaded from: classes4.dex */
public final class m extends pf4.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pf4.q qVar, android.view.View itemView) {
        super(qVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
    }

    @Override // pf4.l
    public android.view.View i() {
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.nkf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // pf4.l
    public void j(int i17, gf4.a comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        super.j(i17, comment);
        if (comment.f271336g) {
            pm0.v.c(this.f353875e);
        }
    }
}
