package or1;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI f347575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gb3 f347576e;

    public t1(or1.u1 u1Var, com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI, r45.gb3 gb3Var) {
        this.f347575d = enterpriseBizEntranceListUI;
        this.f347576e = gb3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = this.f347575d;
        try {
            java.util.LinkedList linkedList = this.f347576e.f375071e.f376235u;
            int i17 = com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI.f94028m;
            enterpriseBizEntranceListUI.T6(linkedList);
            enterpriseBizEntranceListUI.f94029d.notifyDataSetChanged();
        } catch (java.lang.Throwable unused) {
        }
    }
}
