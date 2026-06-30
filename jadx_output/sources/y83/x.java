package y83;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI f460004d;

    public x(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
        this.f460004d = kidsWatchLoginFirstChooseSceneUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = this.f460004d.f143137o;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("syncMsgCb");
            throw null;
        }
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("syncMsgCb");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
