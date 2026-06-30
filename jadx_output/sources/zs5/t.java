package zs5;

/* loaded from: classes15.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.iam_scan.e1 f475475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.wechat.aff.iam_scan.e1 e1Var, zs5.y yVar) {
        super(0);
        this.f475475d = e1Var;
        this.f475476e = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.wechat.aff.iam_scan.e1 e1Var = this.f475475d;
        if (e1Var != null) {
            bundle.putFloat("param_zoom_ratio", e1Var.f217002d);
            zs5.y yVar = this.f475476e;
            at5.b bVar = yVar.f475523x;
            if (bVar != null) {
                com.tencent.wechat.aff.iam_scan.d1 d1Var = yVar.f475508i;
                bVar.a(d1Var != null ? d1Var.f216985d : 0L, bundle);
            }
        }
        return jz5.f0.f302826a;
    }
}
