package k91;

/* loaded from: classes4.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305705e;

    public o4(k91.m4 m4Var, java.lang.String str, java.lang.String str2) {
        this.f305704d = str;
        this.f305705e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            k91.r1.b(this.f305705e, k91.h3.a(new org.json.JSONObject(this.f305704d)).f386203d, true);
        } catch (java.lang.Exception unused) {
        }
    }
}
