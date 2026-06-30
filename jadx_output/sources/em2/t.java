package em2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f255167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(gk2.e eVar) {
        super(0);
        this.f255167d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tn0.w0 w0Var = dk2.ef.f233378d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null) {
            sVar.i1(((mm2.c1) this.f255167d.a(mm2.c1.class)).I4, android.os.SystemClock.elapsedRealtime(), false, null);
        }
        return jz5.f0.f302826a;
    }
}
