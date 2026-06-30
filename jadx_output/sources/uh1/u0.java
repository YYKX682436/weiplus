package uh1;

/* loaded from: classes7.dex */
public class u0 implements uh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.x0 f427908b;

    public u0(uh1.x0 x0Var, java.lang.String str) {
        this.f427908b = x0Var;
        this.f427907a = str;
    }

    @Override // uh1.d
    public void a(org.json.JSONObject jSONObject) {
    }

    @Override // uh1.d
    public void b(int i17, long j17, long j18) {
    }

    @Override // uh1.d
    public void c(int i17, java.lang.String str, java.lang.String str2, int i18, long j17, java.util.Map map) {
        if (i17 == -1) {
            return;
        }
        synchronized (this.f427908b.f427928i) {
            java.util.Map map2 = this.f427908b.f427928i;
            java.lang.String str3 = this.f427907a;
            ((java.util.HashMap) map2).put(str3, new uh1.w0(str2, str, str3, i18, j17));
        }
    }

    @Override // uh1.d
    public void d(int i17, java.lang.String str, int i18) {
    }
}
