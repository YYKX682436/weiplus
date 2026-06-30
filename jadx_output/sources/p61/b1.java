package p61;

/* loaded from: classes5.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352217d;

    public b1(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI) {
        this.f352217d = bindMContactIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352217d;
        int ordinal = bindMContactIntroUI.f72968n.ordinal();
        if (ordinal == 1) {
            gm0.j1.u().c().w(4097, "");
            gm0.j1.u().c().w(6, "");
            bindMContactIntroUI.initView();
        } else if (ordinal == 2) {
            bindMContactIntroUI.Z6(true);
        } else if (ordinal == 3) {
            bindMContactIntroUI.Z6(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
