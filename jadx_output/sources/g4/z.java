package g4;

/* loaded from: classes5.dex */
public final class z implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final u26.y0 f268643d;

    public z(u26.y0 channel) {
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f268643d = channel;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object t17 = this.f268643d.t(obj, continuation);
        return t17 == pz5.a.f359186d ? t17 : jz5.f0.f302826a;
    }
}
