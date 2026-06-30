package df2;

/* loaded from: classes3.dex */
public final class ci implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.fi f229886d;

    public ci(df2.fi fiVar) {
        this.f229886d = fiVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            this.f229886d.c7(str);
        }
        return jz5.f0.f302826a;
    }
}
