package qg5;

/* loaded from: classes8.dex */
public final class k3 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f363037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f363038b;

    public k3(qg5.u3 u3Var, yz5.a aVar) {
        this.f363037a = u3Var;
        this.f363038b = aVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        yz5.a aVar;
        ((qg5.e3) qg5.u3.T6(this.f363037a)).oj("journey_copy");
        if (!z17 || (aVar = this.f363038b) == null) {
            return;
        }
        aVar.invoke();
    }
}
