package db5;

/* loaded from: classes11.dex */
public class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.x6 f228555e;

    public v6(db5.x6 x6Var, java.lang.String str) {
        this.f228555e = x6Var;
        this.f228554d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f228555e.f228573f.C.d(this.f228554d.trim());
    }
}
