package z32;

/* loaded from: classes12.dex */
public final class b0 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f469881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469883c;

    public b0(int i17, int i18, java.lang.String str, r45.ed6 ed6Var) {
        this.f469881a = i18;
        this.f469882b = str;
        this.f469883c = ed6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var == null) {
            java.lang.String str = this.f469883c.f373327d;
            return;
        }
        a42.c cVar = a42.c.f1200a;
        int i17 = this.f469881a;
        java.lang.String field_nickname = v5Var.field_nickname;
        kotlin.jvm.internal.o.f(field_nickname, "field_nickname");
        cVar.a(i17, 3, field_nickname, 2, 2, this.f469882b);
    }
}
