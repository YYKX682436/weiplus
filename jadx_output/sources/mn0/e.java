package mn0;

/* loaded from: classes.dex */
public final class e implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f329729d;

    public e(yz5.l lVar) {
        this.f329729d = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f329729d.invoke(new java.lang.Integer(((java.lang.Number) obj).intValue()));
        return jz5.f0.f302826a;
    }
}
