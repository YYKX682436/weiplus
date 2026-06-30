package yl2;

/* loaded from: classes.dex */
public final class g0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f463005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f463006b;

    public g0(int i17, kotlinx.coroutines.q qVar) {
        this.f463005a = i17;
        this.f463006b = qVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        boolean z17 = false;
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("FACE_VERIFY_RESULT", 0)) : null;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "[CTID] gotoFaceVerifyDirectCTID precheckType=" + this.f463005a + " result: " + valueOf);
        if (i17 == -1 && valueOf != null && valueOf.intValue() == 1) {
            z17 = true;
        }
        this.f463006b.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
