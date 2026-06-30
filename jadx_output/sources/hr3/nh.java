package hr3;

/* loaded from: classes11.dex */
public class nh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f283843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283844e;

    public nh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, com.tencent.mm.modelbase.m1 m1Var) {
        this.f283844e = sayHiWithSnsPermissionUI3;
        this.f283843d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.modelbase.m1 m1Var = this.f283843d;
        r45.my6 my6Var = m1Var.getType() == 30 ? (r45.my6) ((com.tencent.mm.pluginsdk.model.m3) m1Var).f189378e.f70711b.f70700a : null;
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283844e;
        if (my6Var == null || !android.text.TextUtils.equals(sayHiWithSnsPermissionUI3.f153860v, my6Var.f380930d) || android.text.TextUtils.isEmpty(my6Var.f380934h)) {
            sayHiWithSnsPermissionUI3.d7(true, "");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "gotoSelfPageWithoutDialog with antispamTicket: %s, username: %s", my6Var.f380934h, my6Var.f380930d);
            sayHiWithSnsPermissionUI3.d7(true, my6Var.f380934h);
        }
    }
}
