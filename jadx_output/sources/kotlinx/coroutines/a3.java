package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class a3 extends kotlinx.coroutines.internal.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c3 f310135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f310136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(kotlinx.coroutines.internal.t tVar, kotlinx.coroutines.c3 c3Var, java.lang.Object obj) {
        super(tVar);
        this.f310135d = c3Var;
        this.f310136e = obj;
    }

    @Override // kotlinx.coroutines.internal.d
    public java.lang.Object i(java.lang.Object obj) {
        if (this.f310135d.P() == this.f310136e) {
            return null;
        }
        return kotlinx.coroutines.internal.n.f310509a;
    }
}
