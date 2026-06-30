package gg4;

/* loaded from: classes8.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI f271786d;

    public z(com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI inviteFriendsBy3rdUI) {
        this.f271786d = inviteFriendsBy3rdUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        j45.l.j(this.f271786d.getContext(), "account", ".ui.FacebookAuthUI", new android.content.Intent(), null);
    }
}
