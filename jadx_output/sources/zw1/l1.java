package zw1;

/* loaded from: classes15.dex */
public class l1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wf5 f476703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476704b;

    public l1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.wf5 wf5Var) {
        this.f476704b = collectMainUI;
        this.f476703a = wf5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476704b;
        collectMainUI.f96394h = 1;
        collectMainUI.f96391c2 = true;
        com.tencent.mm.plugin.collect.ui.CollectMainUI.X6(collectMainUI, this.f476703a);
        collectMainUI.f96395i.B();
        collectMainUI.f96395i = null;
    }
}
