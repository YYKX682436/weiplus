package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.plugin.finder.uniComments.q3 q3Var) {
        super(1);
        this.f130268d = q3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jv2.i commentItem = (jv2.i) obj;
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130268d;
        q3Var.getClass();
        android.content.Context context = q3Var.f130367d;
        if (context != null) {
            db5.e1.n(context, com.tencent.mm.R.string.eyd, 0, new com.tencent.mm.plugin.finder.uniComments.t2(q3Var, commentItem, context), null);
        }
        return jz5.f0.f302826a;
    }
}
