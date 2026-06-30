package uy0;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.api.MJTemplateSession f431901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.mj_template.api.MJTemplateSession mJTemplateSession) {
        super(0);
        this.f431901d = mJTemplateSession;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.rz6 rz6Var = new r45.rz6();
        try {
            rz6Var.parseFrom(this.f431901d.f69765d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MJTemplate", "parse template info error", e17);
        }
        return rz6Var;
    }
}
