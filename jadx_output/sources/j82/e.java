package j82;

/* loaded from: classes8.dex */
public class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j82.g f298154d;

    public e(j82.g gVar) {
        this.f298154d = gVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String str2;
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        j82.g gVar = this.f298154d;
        if (itemId == 2) {
            new java.util.LinkedList().add(gVar.f298156d.f100257f);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("select_fav_local_id", gVar.f298156d.f100257f.field_localId);
            intent.putExtra("Retr_Msg_Type", 2);
            j45.l.v(gVar.f298156d, ".ui.transmit.SelectConversationUI", intent, 1);
            return;
        }
        if (itemId != 3) {
            return;
        }
        r45.bq0 bq0Var = gVar.f298156d.f100257f.field_favProto;
        r45.tq0 tq0Var = bq0Var.f370968m;
        if (tq0Var != null) {
            str = bq0Var.f370972q;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(tq0Var.f386664d)) {
                str = tq0Var.f386664d;
            }
            str2 = tq0Var.f386670m;
        } else {
            str = "";
            str2 = "";
        }
        intent.putExtra("Ksnsupload_link", gVar.f298156d.f100256e);
        intent.putExtra("Ksnsupload_title", str);
        intent.putExtra("Ksnsupload_imgurl", str2);
        intent.putExtra("Ksnsupload_imgbuf", com.tencent.mm.vfs.w6.N(o72.x1.X(o72.x1.J(gVar.f298156d.f100257f)), 0, -1));
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        j45.l.o(gVar.f298156d, "sns", ".ui.SnsUploadUI", intent, 2, false);
    }
}
