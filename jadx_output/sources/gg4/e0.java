package gg4;

/* loaded from: classes8.dex */
public class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.j0 f271745d;

    public e0(com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI inviteFriendsBy3rdUI, w11.j0 j0Var) {
        this.f271745d = j0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f271745d);
    }
}
