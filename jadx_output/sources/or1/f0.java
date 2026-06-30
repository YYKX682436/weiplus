package or1;

/* loaded from: classes9.dex */
public class f0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI f347489a;

    public f0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI) {
        this.f347489a = enterpriseBizContactListUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI;
        if (message == null || message.what != 1 || (enterpriseBizContactListUI = this.f347489a) == null || enterpriseBizContactListUI.isFinishing()) {
            return;
        }
        r01.q3.Ai().c(enterpriseBizContactListUI.f94007e, null);
        java.util.List i17 = r01.q3.cj().i1(enterpriseBizContactListUI.f94007e);
        int i18 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) i17;
            if (i18 >= arrayList.size()) {
                return;
            }
            java.lang.String str = (java.lang.String) arrayList.get(i18);
            if (c01.e2.J(str)) {
                r01.q3.Ai().c(str, null);
                com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                r0Var.f70529a = str;
                r0Var.f70536h = 1;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.wi().j(str, r0Var);
            }
            i18++;
        }
    }
}
