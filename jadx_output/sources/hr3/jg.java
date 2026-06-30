package hr3;

/* loaded from: classes11.dex */
public class jg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f283703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283704e;

    public jg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f283704e = sayHiWithSnsPermissionUI;
        this.f283703d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.m1 m1Var = this.f283703d;
        r45.my6 my6Var = m1Var.getType() == 30 ? (r45.my6) ((com.tencent.mm.pluginsdk.model.m3) m1Var).f189378e.f70711b.f70700a : null;
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f283704e;
        if (my6Var == null || !android.text.TextUtils.equals(sayHiWithSnsPermissionUI.f153826q, my6Var.f380930d) || android.text.TextUtils.isEmpty(my6Var.f380934h)) {
            sayHiWithSnsPermissionUI.f7(true, "");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "gotoSelfPageWithoutDialog with antispamTicket: %s, username: %s", my6Var.f380934h, my6Var.f380930d);
            sayHiWithSnsPermissionUI.f7(true, my6Var.f380934h);
        }
    }
}
