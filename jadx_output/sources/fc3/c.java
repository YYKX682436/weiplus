package fc3;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.e f261016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261017e;

    public c(fc3.e eVar, java.lang.String str) {
        this.f261016d = eVar;
        this.f261017e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc3.e eVar = this.f261016d;
        if (eVar.f261034k) {
            java.lang.String word = this.f261017e;
            kotlin.jvm.internal.o.f(word, "$word");
            eVar.d(word);
        }
    }
}
