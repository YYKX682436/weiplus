package gg4;

/* loaded from: classes8.dex */
public class x implements com.tencent.mm.ui.widget.dialog.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f271783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI f271784c;

    public x(com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI inviteFriendsBy3rdUI, java.lang.String str, int i17) {
        this.f271784c = inviteFriendsBy3rdUI;
        this.f271782a = str;
        this.f271783b = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.k
    public void a(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.subapp.ui.pluginapp.InviteFriendsBy3rdUI inviteFriendsBy3rdUI = this.f271784c;
            android.widget.EditText editText = inviteFriendsBy3rdUI.f172434n;
            java.lang.String obj = editText == null ? this.f271782a : editText.getText().toString();
            inviteFriendsBy3rdUI.getClass();
            w11.o0 o0Var = new w11.o0(this.f271783b, obj);
            inviteFriendsBy3rdUI.f172429f = db5.e1.Q(inviteFriendsBy3rdUI, inviteFriendsBy3rdUI.getString(com.tencent.mm.R.string.f490573yv), inviteFriendsBy3rdUI.getString(com.tencent.mm.R.string.f490552yb), true, true, new gg4.f0(inviteFriendsBy3rdUI, o0Var));
            c01.d9.e().g(o0Var);
        }
    }
}
