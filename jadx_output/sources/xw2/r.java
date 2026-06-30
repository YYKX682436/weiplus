package xw2;

/* loaded from: classes2.dex */
public final class r implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw2.s f457714d;

    public r(xw2.s sVar) {
        this.f457714d = sVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ((java.lang.Number) obj).intValue();
        this.f457714d.f457720h.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
