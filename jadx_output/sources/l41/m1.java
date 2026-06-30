package l41;

/* loaded from: classes4.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f315868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(yz5.l lVar, k41.g0 g0Var, android.content.Context context) {
        super(1);
        this.f315867d = lVar;
        this.f315868e = g0Var;
        this.f315869f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f315867d.invoke(java.lang.Boolean.valueOf(booleanValue));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success:%s", java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            k41.g0 g0Var = this.f315868e;
            java.lang.String str = g0Var.field_username;
            if (str == null) {
                str = "";
            }
            java.lang.String string = this.f315869f.getString(com.tencent.mm.R.string.g0o, g0Var.field_nickname);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.e1(c01.id.a());
            f9Var.u1(str);
            f9Var.d1(string);
            f9Var.setType(10000);
            cj6.M9(f9Var);
            g0Var.field_needReport = true;
            g0Var.field_hasSetReport = true;
            k41.o0.f(g0Var);
            java.lang.String str2 = g0Var.field_username;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String field_locationType = g0Var.field_locationType;
            kotlin.jvm.internal.o.f(field_locationType, "field_locationType");
            l41.l1 l1Var = l41.l1.f315865d;
            java.lang.String lowerCase = field_locationType.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            boolean b17 = kotlin.jvm.internal.o.b(lowerCase, "wgs84");
            if (l41.r1.f315914b == null) {
                l41.r1.f315914b = new l41.q1(str3, b17, 2, l1Var);
            }
            if (b17) {
                i11.h.e().k(l41.r1.f315914b, false);
            } else {
                i11.h.e().j(l41.r1.f315914b, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
