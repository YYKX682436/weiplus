package tb1;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb1.q f416918e;

    public p(tb1.q qVar, java.lang.String str) {
        this.f416918e = qVar;
        this.f416917d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        tb1.s.e(this.f416918e.f416925e, this.f416917d);
    }
}
