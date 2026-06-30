package ol4;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f346165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f346166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ol4.q qVar, kotlin.jvm.internal.h0 h0Var, java.util.HashMap hashMap) {
        super(1);
        this.f346164d = qVar;
        this.f346165e = h0Var;
        this.f346166f = hashMap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).longValue();
        ol4.q qVar = this.f346164d;
        ((kk4.f0) qVar.f346180b).enableTPAssetResourceLoader(qVar.f346199u, null);
        kk4.c cVar = qVar.f346180b;
        ((kk4.f0) cVar).setDataSource((java.lang.String) this.f346165e.f310123d, this.f346166f);
        ((kk4.f0) cVar).prepareAsync();
        return jz5.f0.f302826a;
    }
}
