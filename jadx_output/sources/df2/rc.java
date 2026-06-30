package df2;

/* loaded from: classes3.dex */
public final class rc implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.tc f231242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.gw1 f231243b;

    public rc(df2.tc tcVar, r45.gw1 gw1Var) {
        this.f231242a = tcVar;
        this.f231243b = gw1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        df2.tc.Z6(this.f231242a, 7, this.f231243b.getString(0), null, null, 12, null);
        pm0.v.V(500L, new df2.qc(this.f231242a));
    }
}
