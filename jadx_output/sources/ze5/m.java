package ze5;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final ze5.m f472073d = new ze5.m();

    public m() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View view = (android.view.View) obj;
        yb5.d chattingContext = (yb5.d) obj2;
        rd5.d msgData = (rd5.d) obj3;
        com.tencent.mm.ui.chatting.viewitems.g0 chattingHolder = (com.tencent.mm.ui.chatting.viewitems.g0) obj4;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(chattingHolder, "chattingHolder");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bjv);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bjw);
            if (te5.t.g(f9Var, v17, chattingContext)) {
                com.tencent.mm.ui.chatting.viewitems.j1.r(findViewById, 0);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(f9Var.X1());
                findViewById.setTag(f9Var);
                findViewById.setOnClickListener(new ze5.l(chattingContext, findViewById, textView));
                kotlin.jvm.internal.o.d(textView);
                te5.t.k(K0, findViewById, textView, chattingContext);
            } else {
                com.tencent.mm.ui.chatting.viewitems.j1.r(findViewById, 8);
            }
        }
        return jz5.f0.f302826a;
    }
}
