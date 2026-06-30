package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class xb extends com.tencent.mm.ui.chatting.viewitems.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Pair f205978d;

    /* renamed from: e, reason: collision with root package name */
    public int f205979e;

    public xb(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar) {
        super(f9Var, context, qVar);
        this.f205979e = 0;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null && v17.f348666i == 57) {
            ti3.l f17 = ti3.i.f(context, 0.0f, f9Var, com.tencent.mm.ui.chatting.viewitems.dc.a(com.tencent.mm.ui.chatting.viewitems.dc.b(qVar.f460745d, qVar.f460742a, f9Var.getMsgId(), f9Var.Q0(), v17.f348725w2, "handleQuoteMsgFillingFrom"), v17.f348725w2), v17.f348725w2);
            this.f205978d = new android.util.Pair(java.lang.Boolean.valueOf(f17.f419626a), f17.f419627b);
        }
        this.f205979e = go.d.f273696a.d(f9Var.Q0(), f9Var.getMsgId());
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        android.util.Pair pair;
        com.tencent.mm.ui.chatting.viewitems.xb xbVar = (com.tencent.mm.ui.chatting.viewitems.xb) obj;
        android.util.Pair pair2 = this.f205978d;
        if (pair2 == null && xbVar.f205978d == null) {
            return true;
        }
        if (pair2 == null || (pair = xbVar.f205978d) == null || pair2.first != pair.first || this.f205979e != xbVar.f205979e) {
            return false;
        }
        return android.text.TextUtils.equals((java.lang.CharSequence) pair2.second, (java.lang.CharSequence) pair.second);
    }
}
