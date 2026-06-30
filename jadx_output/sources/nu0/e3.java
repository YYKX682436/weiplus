package nu0;

/* loaded from: classes5.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(nu0.b4 b4Var) {
        super(0);
        this.f339928d = b4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nu0.b4 b4Var = this.f339928d;
        com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView mCReferenceLineView = new com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView(b4Var.getContext(), null, 0, 6, null);
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) b4Var.R).getValue();
        kotlin.jvm.internal.o.f(textView, "access$getMcReferenceTipTextView(...)");
        yw0.n nVar = new yw0.n(mCReferenceLineView, textView);
        nVar.c(yw0.q.f466581d);
        nVar.c(yw0.q.f466582e);
        return nVar;
    }
}
