package kl2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f308827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kl2.e0 e0Var) {
        super(3);
        this.f308827d = e0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.ql1 ql1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String id6 = (java.lang.String) obj2;
        java.lang.String url = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("RestrictConsumeSettingHelper", "checkRestrictConsume: " + booleanValue + " id: " + id6 + " url: " + url);
        if (booleanValue) {
            if (!(url.length() == 0)) {
                kl2.e0 e0Var = this.f308827d;
                com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = e0Var.f308764g;
                if (mMSwitchBtn == null) {
                    kotlin.jvm.internal.o.o("switchBtn");
                    throw null;
                }
                mMSwitchBtn.setCheck(true);
                kl2.e0.a(e0Var, true);
                e0Var.f308762e.invoke(java.lang.Boolean.FALSE);
                r45.f82 f82Var = e0Var.f308766i;
                e0Var.f308767j.y(id6, url, (f82Var == null || (ql1Var = (r45.ql1) f82Var.getCustom(2)) == null) ? 0L : ql1Var.getLong(1));
            }
        }
        return jz5.f0.f302826a;
    }
}
