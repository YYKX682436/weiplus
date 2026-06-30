package qg5;

/* loaded from: classes8.dex */
public final class f4 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f362980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f362981b;

    public f4(qg5.q4 q4Var, yz5.a aVar) {
        this.f362980a = q4Var;
        this.f362981b = aVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        qg5.q4 q4Var = this.f362980a;
        if (z17 || z18) {
            qg5.q4.U6(q4Var, z17 ? 1 : 0);
        }
        if (z17) {
            qg5.q4.T6(q4Var);
            yz5.a aVar = this.f362981b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
