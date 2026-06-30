package zw1;

/* loaded from: classes15.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jv3 f476602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476603e;

    public d1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, r45.jv3 jv3Var) {
        this.f476603e = collectMainUI;
        this.f476602d = jv3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectMainUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wf5 wf5Var = this.f476602d.f378126g;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476603e;
        com.tencent.mm.plugin.collect.ui.CollectMainUI.X6(collectMainUI, wf5Var);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = collectMainUI.W1;
        if (y1Var != null && y1Var.f()) {
            collectMainUI.W1.q();
            collectMainUI.W1 = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
