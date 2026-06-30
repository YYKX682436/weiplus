package p61;

/* loaded from: classes5.dex */
public class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileUI f352309d;

    public l2(com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI) {
        this.f352309d = bindMobileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI = this.f352309d;
        if (bindMobileUI.f73031e.getText().toString() == null || bindMobileUI.f73031e.getText().toString().length() == 0) {
            dp.a.makeText(bindMobileUI, bindMobileUI.getString(com.tencent.mm.R.string.ag6), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(bindMobileUI.f73034h.getText().toString().trim());
        java.lang.String obj = bindMobileUI.f73031e.getText().toString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(obj.replaceAll("[\\.\\-]", "").trim());
        bindMobileUI.f73035i = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactUI", "do next, send sms to self");
        java.lang.String str = bindMobileUI.f73035i;
        java.lang.String string = bindMobileUI.getContext().getString(com.tencent.mm.R.string.ahm);
        db5.e1.u(bindMobileUI.getContext(), java.lang.String.format("%s\n%s", bindMobileUI.getContext().getString(com.tencent.mm.R.string.ahn), str), string, new p61.k2(bindMobileUI, str), null);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
