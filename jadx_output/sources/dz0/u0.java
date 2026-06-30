package dz0;

/* loaded from: classes5.dex */
public final class u0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f245020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.e f245021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245022f;

    public u0(float f17, az0.e eVar, java.lang.String str) {
        this.f245020d = f17;
        this.f245021e = eVar;
        this.f245022f = str;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        az0.e eVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        if (floatValue >= this.f245020d && (eVar = this.f245021e) != null) {
            ((mz0.w1) eVar).a(this.f245022f, floatValue);
        }
        return jz5.f0.f302826a;
    }
}
