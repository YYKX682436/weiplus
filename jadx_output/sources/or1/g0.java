package or1;

/* loaded from: classes9.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI f347495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gb3 f347496e;

    public g0(or1.h0 h0Var, com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI, r45.gb3 gb3Var) {
        this.f347495d = enterpriseBizContactListUI;
        this.f347496e = gb3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI = this.f347495d;
            java.util.LinkedList linkedList = this.f347496e.f375071e.f376235u;
            int i17 = com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI.f94005o;
            enterpriseBizContactListUI.T6(linkedList);
        } catch (java.lang.Throwable unused) {
        }
    }
}
