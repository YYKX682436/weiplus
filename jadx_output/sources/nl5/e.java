package nl5;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.h f338266d;

    public e(nl5.h hVar) {
        this.f338266d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        nl5.h hVar = this.f338266d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (hVar.f338282k) {
                if (android.os.SystemClock.uptimeMillis() - hVar.f338286o > 500) {
                    hVar.c();
                } else {
                    android.widget.TextView textView = hVar.f338272a;
                    int[] iArr = hVar.f338287p;
                    textView.getLocationInWindow(iArr);
                    int i17 = iArr[1];
                    if (i17 == hVar.f338285n) {
                        hVar.c();
                    } else {
                        hVar.f338285n = i17;
                        textView.postDelayed(hVar.f338290s, 16L);
                    }
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            hVar.a();
        }
    }
}
