package yw2;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f466669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yw2.a0 a0Var) {
        super(0);
        this.f466669d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer k17 = this.f466669d.k();
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = k17.footer;
        int i17 = finderCommentFooter != null ? finderCommentFooter.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() : 0;
        int i18 = k17.sceneForReply == 2 ? 1 : 2;
        k17.sceneForReply = i18;
        com.tencent.mm.plugin.finder.storage.t70.f127590a.b3(i18);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = k17.feedObj;
        if (finderItem != null) {
            android.content.Context context = k17.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i19 = nyVar != null ? nyVar.f135380n : 0;
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            long id6 = finderItem.getId();
            if (o3Var.dk(id6) != null) {
                com.tencent.mm.autogen.mmdata.rpt.FinderSwitchCommentRoleStruct finderSwitchCommentRoleStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderSwitchCommentRoleStruct();
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                if (Ri == null) {
                    Ri = "";
                }
                finderSwitchCommentRoleStruct.f57882d = finderSwitchCommentRoleStruct.b("sessionid", Ri, true);
                finderSwitchCommentRoleStruct.f57883e = finderSwitchCommentRoleStruct.b("feedid", o3Var.Ui(id6), true);
                finderSwitchCommentRoleStruct.f57885g = r3.getLikeCount();
                finderSwitchCommentRoleStruct.f57886h = r3.getCommentCount();
                finderSwitchCommentRoleStruct.f57887i = r3.getFriendLikeCount();
                finderSwitchCommentRoleStruct.f57884f = i19;
                finderSwitchCommentRoleStruct.f57888j = i17;
                finderSwitchCommentRoleStruct.k();
                o3Var.Zk(finderSwitchCommentRoleStruct);
            }
        }
        return jz5.f0.f302826a;
    }
}
