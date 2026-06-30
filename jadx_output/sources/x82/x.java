package x82;

/* loaded from: classes9.dex */
public class x implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f452542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452543b;

    public x(o72.r2 r2Var, android.content.Context context) {
        this.f452542a = r2Var;
        this.f452543b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        boolean z17;
        r45.qp0 qp0Var;
        o72.r2 r2Var = this.f452542a;
        r45.gp0 J2 = o72.x1.J(r2Var);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavItemLogic", "goPlayView, but dataitem is null , exit");
            return;
        }
        r45.hp0 hp0Var = J2.J1;
        android.content.Context context = this.f452543b;
        if (hp0Var == null || (qp0Var = hp0Var.f376370x) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavItemLogic", "handleMpVideoItem favMpMsgItem is null");
            z17 = false;
        } else {
            z17 = true;
            s82.x0.l(context, qp0Var, J2, true);
        }
        if (z17) {
            return;
        }
        r45.jp0 jp0Var = J2.O1;
        if (jp0Var != null && (!com.tencent.mm.sdk.platformtools.t8.K0(jp0Var.f377998d) || !com.tencent.mm.sdk.platformtools.t8.K0(J2.O1.f378001g))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "it is ad sight.use sight play");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_detail_info_id", r2Var.field_localId);
            intent.putExtra("key_detail_data_id", J2.T);
            intent.putExtra("key_detail_can_delete", false);
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            o72.x1.L0(context, ".ui.detail.FavoriteFileDetailUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_detail_info_id", r2Var.field_localId);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        intent2.putExtra("key_detail_fav_path", o72.x1.x(J2));
        intent2.putExtra("key_detail_fav_thumb_path", o72.x1.X(J2));
        intent2.putExtra("key_detail_fav_video_duration", J2.f375448y);
        intent2.putExtra("key_detail_statExtStr", J2.R1);
        intent2.putExtra("key_detail_msg_uuid", J2.f375431q2);
        intent2.putExtra("show_share", false);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(context, ".ui.detail.FavoriteVideoPlayUI", intent2, null);
    }
}
