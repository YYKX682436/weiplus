package ze5;

/* loaded from: classes9.dex */
public final class t2 extends ze5.s2 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView k17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).k(context);
        k17.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
        k17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
        k17.setPadding(i65.a.b(context, 5), 0, 0, 0);
        return k17;
    }
}
