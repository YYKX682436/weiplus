package df2;

/* loaded from: classes3.dex */
public final class x5 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f231759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f231760b;

    public x5(yz5.a aVar, df2.d6 d6Var) {
        this.f231759a = aVar;
        this.f231760b = d6Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        yz5.a aVar = this.f231759a;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f231760b.f229945m = null;
    }
}
