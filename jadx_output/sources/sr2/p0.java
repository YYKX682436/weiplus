package sr2;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411670d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(sr2.w0 w0Var) {
        super(0);
        this.f411670d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView = this.f411670d.I;
        if (finderPostTextModifyView != null) {
            finderPostTextModifyView.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
