package gk5;

/* loaded from: classes9.dex */
public final class k0 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f272678a;

    public k0(gk5.r0 r0Var) {
        this.f272678a = r0Var;
    }

    @Override // tg3.x0
    public final void a(int i17, int i18, java.util.List resultList, byte[] bArr) {
        kotlin.jvm.internal.o.g(resultList, "resultList");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardNoteToWeWorkUIC", "onCallback() called with: errorType = [" + i17 + "], errorCode = [" + i18 + "], resultList = [" + resultList + ']');
        if (i17 == 0 && i18 == 0) {
            return;
        }
        this.f272678a.V6();
    }
}
