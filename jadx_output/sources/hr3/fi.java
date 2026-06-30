package hr3;

/* loaded from: classes11.dex */
public class fi implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.f0 f283566d;

    public fi(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, l41.f0 f0Var) {
        this.f283566d = f0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f283566d);
    }
}
