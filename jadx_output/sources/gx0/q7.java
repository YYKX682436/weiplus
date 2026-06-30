package gx0;

/* loaded from: classes5.dex */
public final class q7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(gx0.w8 w8Var) {
        super(0);
        this.f276875d = w8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gx0.w8 w8Var = this.f276875d;
        com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView mCReferenceLineView = new com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView(w8Var.getContext(), null, 0, 6, null);
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) w8Var.Q).getValue();
        kotlin.jvm.internal.o.f(textView, "access$getMcReferenceTipTextView(...)");
        yw0.n nVar = new yw0.n(mCReferenceLineView, textView);
        nVar.c(yw0.q.f466581d);
        nVar.c(yw0.q.f466582e);
        return nVar;
    }
}
