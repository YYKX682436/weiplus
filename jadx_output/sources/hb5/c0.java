package hb5;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hb5.e0 f280155e;

    public c0(hb5.e0 e0Var, java.lang.String str) {
        this.f280155e = e0Var;
        this.f280154d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hb5.e0 e0Var = this.f280155e;
        java.lang.String str = e0Var.f280166f;
        java.lang.String str2 = this.f280154d;
        if (str2.equals(str)) {
            c01.d9.e().g(new s01.e0(e0Var.f280164d, str2, 0, null));
        }
    }
}
