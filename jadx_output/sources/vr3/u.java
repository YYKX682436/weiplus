package vr3;

/* loaded from: classes11.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher f439651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher) {
        super(1);
        this.f439651d = bizProfileDataFetcher;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<r45.e6> cacheMsgs = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(cacheMsgs, "cacheMsgs");
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = this.f439651d;
        if (bizProfileDataFetcher.f154280h) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (r45.e6 e6Var : cacheMsgs) {
                arrayList.add(new vr3.h(e6Var.f373038d, bizProfileDataFetcher.a(e6Var.f373039e.f374031d)));
            }
            bizProfileDataFetcher.f154288s.setValue(new vr3.g(arrayList));
        }
        return jz5.f0.f302826a;
    }
}
