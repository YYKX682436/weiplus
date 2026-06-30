package ea2;

/* loaded from: classes2.dex */
public final class s implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250580a;

    public s(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f250580a = finderMusicTopicHeaderUIC;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.hj2 hj2Var;
        java.lang.String string;
        r45.hj2 hj2Var2;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var3;
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250580a;
        androidx.appcompat.app.AppCompatActivity context = finderMusicTopicHeaderUIC.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[10];
        java.lang.String str5 = "";
        if (V6 == null || (str2 = V6.getString(1)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str2);
        if (V6 == null || (str3 = V6.getString(2)) == null) {
            str3 = "";
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", str3);
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
        android.content.Intent intent = finderMusicTopicHeaderUIC.getContext().getIntent();
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L));
        r45.r03 r03Var = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        lVarArr[4] = new jz5.l("topicid", (r03Var == null || (hj2Var3 = (r45.hj2) r03Var.getCustom(19)) == null) ? 0L : pm0.v.u(hj2Var3.getLong(0)));
        r45.r03 r03Var2 = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        if (r03Var2 == null || (hj2Var2 = (r45.hj2) r03Var2.getCustom(19)) == null || (zi2Var = (r45.zi2) hj2Var2.getCustom(3)) == null || (str4 = zi2Var.getString(12)) == null) {
            str4 = "";
        }
        lVarArr[5] = new jz5.l("songid", str4);
        r45.r03 r03Var3 = (r45.r03) finderMusicTopicHeaderUIC.f452719d;
        if (r03Var3 != null && (hj2Var = (r45.hj2) r03Var3.getCustom(19)) != null && (string = hj2Var.getString(15)) != null) {
            str5 = string;
        }
        lVarArr[6] = new jz5.l("audioId", str5);
        lVarArr[7] = new jz5.l("like_status", java.lang.Integer.valueOf(1 ^ (finderMusicTopicHeaderUIC.f101760h ? 1 : 0)));
        lVarArr[8] = new jz5.l("docid", finderMusicTopicHeaderUIC.Y6());
        android.content.Intent intent2 = finderMusicTopicHeaderUIC.getContext().getIntent();
        lVarArr[9] = new jz5.l("source_position", java.lang.Integer.valueOf(intent2 != null ? intent2.getIntExtra("key_source_postion", 0) : 0));
        return kz5.c1.k(lVarArr);
    }
}
