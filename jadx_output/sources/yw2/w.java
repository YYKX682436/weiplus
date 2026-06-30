package yw2;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f466673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yw2.a0 a0Var) {
        super(0);
        this.f466673d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ux2.f fVar = this.f466673d.C;
        if (fVar != null) {
            yw2.a0 a0Var = ((yw2.t) fVar.f431853c).f466670a;
            if (a0Var.k().getShowFooter() && !a0Var.k().getCloseComment()) {
                pm0.v.K(null, new ux2.c(fVar));
            } else {
                com.tencent.mars.xlog.Log.w("FinderCommentRecentImageBubble", "isSupportRecentImageHelper is false");
            }
        }
        return jz5.f0.f302826a;
    }
}
