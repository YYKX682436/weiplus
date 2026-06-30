package rh;

/* loaded from: classes12.dex */
public class s implements wh.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.w f395502a;

    public s(rh.w wVar) {
        this.f395502a = wVar;
    }

    @Override // wh.e2
    public wh.f2 a(java.lang.String str) {
        java.lang.String str2;
        qh.f0 f0Var = this.f395502a.f395294a;
        f0Var.getClass();
        try {
            str2 = (java.lang.String) f0Var.f363340i.call();
        } catch (java.lang.Exception unused) {
            str2 = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        return new wh.f2(str2);
    }
}
