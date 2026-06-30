package z32;

/* loaded from: classes12.dex */
public final class d0 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f469901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r32.d f469902b;

    public d0(int i17, r32.d dVar) {
        this.f469901a = i17;
        this.f469902b = dVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            a42.c cVar = a42.c.f1200a;
            int i17 = this.f469901a;
            java.lang.String field_nickname = v5Var.field_nickname;
            kotlin.jvm.internal.o.f(field_nickname, "field_nickname");
            java.lang.String field_username = this.f469902b.field_username;
            kotlin.jvm.internal.o.f(field_username, "field_username");
            cVar.a(i17, 3, field_nickname, 2, 2, field_username);
        }
    }
}
