package z32;

/* loaded from: classes12.dex */
public final class c0 implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f469886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469887b;

    public c0(int i17, java.lang.String str) {
        this.f469886a = i17;
        this.f469887b = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            a42.c cVar = a42.c.f1200a;
            int i17 = this.f469886a;
            java.lang.String field_nickname = v5Var.field_nickname;
            kotlin.jvm.internal.o.f(field_nickname, "field_nickname");
            cVar.a(i17, 3, field_nickname, 2, 2, this.f469887b);
        }
    }
}
