package hr3;

/* loaded from: classes11.dex */
public class yg implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.f0 f284220d;

    public yg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, l41.f0 f0Var) {
        this.f284220d = f0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f284220d);
    }
}
