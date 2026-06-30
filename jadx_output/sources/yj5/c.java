package yj5;

/* loaded from: classes5.dex */
public final class c implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj5.d f462707d;

    public c(yj5.d dVar) {
        this.f462707d = dVar;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        yj5.d dVar = this.f462707d;
        if (dVar.f198580d.D() && !com.tencent.mm.sdk.platformtools.t8.K0(str) && kotlin.jvm.internal.o.b(str, dVar.f198580d.x())) {
            dVar.o0();
        }
    }
}
