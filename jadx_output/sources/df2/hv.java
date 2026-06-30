package df2;

/* loaded from: classes3.dex */
public final class hv implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lv f230356d;

    public hv(df2.lv lvVar) {
        this.f230356d = lvVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df2.lv.a7(this.f230356d, "liveGameInfoVisible", ((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }
}
