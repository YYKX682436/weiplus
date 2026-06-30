package uh1;

/* loaded from: classes7.dex */
public class b implements vh1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.d f427763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uh1.f f427764c;

    public b(uh1.f fVar, java.lang.String str, uh1.d dVar) {
        this.f427764c = fVar;
        this.f427762a = str;
        this.f427763b = dVar;
    }

    @Override // vh1.a
    public void a(org.json.JSONObject jSONObject) {
        this.f427763b.a(jSONObject);
    }

    @Override // vh1.a
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        this.f427764c.a(this.f427762a);
        this.f427763b.c(0, str2, str, i17, j17, map);
    }

    @Override // vh1.a
    public void c(java.lang.String str, java.lang.String str2) {
    }

    @Override // vh1.a
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f427764c.a(this.f427762a);
        this.f427763b.d(-1, str3, i17);
    }

    @Override // vh1.a
    public void e(java.lang.String str) {
        this.f427764c.f427790g.remove(str);
    }

    @Override // vh1.a
    public void f(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        this.f427763b.b(i17, j17, j18);
    }
}
