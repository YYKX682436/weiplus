package gg4;

/* loaded from: classes8.dex */
public class w implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg3.r1 f271781d;

    public w(com.tencent.mm.plugin.subapp.ui.pluginapp.ContactSearchUI contactSearchUI, tg3.r1 r1Var) {
        this.f271781d = r1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f271781d);
    }
}
