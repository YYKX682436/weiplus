package p61;

/* loaded from: classes8.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352331d;

    public o(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI) {
        this.f352331d = bindGoogleContactUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI = this.f352331d;
        bindGoogleContactUI.f72938p = true;
        if (bindGoogleContactUI.f72937o != null) {
            gm0.j1.d().d(bindGoogleContactUI.f72937o);
        }
    }
}
