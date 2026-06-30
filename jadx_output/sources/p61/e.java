package p61;

/* loaded from: classes3.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI f352236d;

    public e(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI bindGoogleContactIntroUI) {
        this.f352236d = bindGoogleContactIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactIntroUI bindGoogleContactIntroUI = this.f352236d;
        db5.e1.K(bindGoogleContactIntroUI.getContext(), true, bindGoogleContactIntroUI.getString(com.tencent.mm.R.string.k2d), "", bindGoogleContactIntroUI.getString(com.tencent.mm.R.string.k2c), bindGoogleContactIntroUI.getString(com.tencent.mm.R.string.f490347sg), new p61.c(this), new p61.d(this));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
