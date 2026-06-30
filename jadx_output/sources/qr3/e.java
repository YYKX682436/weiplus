package qr3;

/* loaded from: classes4.dex */
public final class e implements kotlinx.coroutines.flow.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f366084d;

    public e(kotlinx.coroutines.flow.j jVar) {
        this.f366084d = jVar;
    }

    @Override // kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f366084d.a(new qr3.d(kVar), continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }
}
