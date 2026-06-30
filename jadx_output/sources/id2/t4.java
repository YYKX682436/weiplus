package id2;

/* loaded from: classes3.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f290810d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(id2.f5 f5Var) {
        super(3);
        this.f290810d = f5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.ql1 ql1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String id6 = (java.lang.String) obj2;
        java.lang.String url = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("FinderLiveRemindRestric", "checkRestrictConsume: " + booleanValue + " id: " + id6 + " url: " + url);
        if (booleanValue) {
            if (!(url.length() == 0)) {
                id2.f5 f5Var = this.f290810d;
                com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = f5Var.f290567d;
                if (mMSwitchBtn == null) {
                    kotlin.jvm.internal.o.o("switchBtn");
                    throw null;
                }
                mMSwitchBtn.setCheck(true);
                id2.f5.O6(f5Var, true);
                r45.f82 f82Var = f5Var.f290573m;
                f5Var.f290575o.y(id6, url, (f82Var == null || (ql1Var = (r45.ql1) f82Var.getCustom(2)) == null) ? 0L : ql1Var.getLong(1));
            }
        }
        return jz5.f0.f302826a;
    }
}
