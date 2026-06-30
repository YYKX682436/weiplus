package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f154308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(yz5.p pVar) {
        super(2);
        this.f154308d = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.j32 j32Var = (r45.j32) obj2;
        yz5.p pVar = this.f154308d;
        if (!booleanValue || j32Var == null) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "request full list failed");
            pVar.invoke(java.lang.Boolean.FALSE, null);
        } else {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "request full list success: count=" + j32Var.getList(0).size() + ", totalNotice=" + j32Var.getInteger(2));
            pVar.invoke(java.lang.Boolean.TRUE, j32Var);
        }
        return jz5.f0.f302826a;
    }
}
