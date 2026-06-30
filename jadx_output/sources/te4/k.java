package te4;

/* loaded from: classes15.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.soter.ui.SoterTestUI f418604d;

    public k(com.tencent.mm.plugin.soter.ui.SoterTestUI soterTestUI) {
        this.f418604d = soterTestUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f418604d.f171766o.setText(wt5.a.s("sample_auth_key_name", false).a() ? com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS : "not passed");
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
