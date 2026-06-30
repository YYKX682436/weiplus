package gg4;

/* loaded from: classes8.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI f271741d;

    public c0(com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI inviteFriendsBy3rdUI) {
        this.f271741d = inviteFriendsBy3rdUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI inviteFriendsBy3rdUI = this.f271741d;
        inviteFriendsBy3rdUI.f172430g = db5.e1.Q(inviteFriendsBy3rdUI.getContext(), inviteFriendsBy3rdUI.getContext().getString(com.tencent.mm.R.string.f490573yv), inviteFriendsBy3rdUI.getContext().getString(com.tencent.mm.R.string.f493409k23), true, true, new gg4.b0(this));
        inviteFriendsBy3rdUI.f172435o.b(inviteFriendsBy3rdUI, inviteFriendsBy3rdUI.getContext());
    }
}
