package ex2;

/* loaded from: classes8.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ex2.a f257198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f257199b;

    public b(ex2.a aVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f257198a = aVar;
        this.f257199b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.ui.widget.dialog.p3 p3Var = this.f257198a.f257197d;
        if (p3Var != null) {
            p3Var.a();
        }
        this.f257199b.B();
    }
}
