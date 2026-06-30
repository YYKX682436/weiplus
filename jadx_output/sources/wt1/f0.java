package wt1;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f449266a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f449267b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f449268c;

    public f0() {
        wt1.f0 f0Var;
        this.f449268c = 0;
        android.database.Cursor all = xt1.t0.Vi().getAll();
        if (all == null || all.getCount() <= 0) {
            f0Var = this;
        } else {
            all.moveToFirst();
            int columnIndex = all.getColumnIndex("card_type");
            int columnIndex2 = all.getColumnIndex(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            int columnIndex3 = all.getColumnIndex("description");
            int columnIndex4 = all.getColumnIndex("logo_url");
            int columnIndex5 = all.getColumnIndex("time");
            int columnIndex6 = all.getColumnIndex("card_id");
            int columnIndex7 = all.getColumnIndex("card_tp_id");
            int columnIndex8 = all.getColumnIndex("msg_id");
            int columnIndex9 = all.getColumnIndex("msg_type");
            int columnIndex10 = all.getColumnIndex("jump_type");
            int columnIndex11 = all.getColumnIndex("url");
            int columnIndex12 = all.getColumnIndex("buttonData");
            int columnIndex13 = all.getColumnIndex("operData");
            int columnIndex14 = all.getColumnIndex("report_scene");
            int columnIndex15 = all.getColumnIndex("read_state");
            while (!all.isAfterLast()) {
                int i17 = columnIndex15;
                xt1.k kVar = new xt1.k();
                int i18 = columnIndex14;
                kVar.field_card_type = all.getInt(columnIndex);
                kVar.field_title = all.getString(columnIndex2);
                kVar.field_description = all.getString(columnIndex3);
                kVar.field_logo_url = all.getString(columnIndex4);
                kVar.field_time = all.getInt(columnIndex5);
                kVar.field_card_id = all.getString(columnIndex6);
                kVar.field_card_tp_id = all.getString(columnIndex7);
                kVar.field_msg_id = all.getString(columnIndex8);
                kVar.field_msg_type = all.getInt(columnIndex9);
                kVar.field_jump_type = all.getInt(columnIndex10);
                kVar.field_url = all.getString(columnIndex11);
                kVar.field_buttonData = all.getBlob(columnIndex12);
                kVar.field_operData = all.getBlob(columnIndex13);
                kVar.field_report_scene = all.getInt(i18);
                kVar.field_read_state = all.getInt(i17);
                all.moveToNext();
                this.f449267b.add(kVar);
                columnIndex14 = i18;
                columnIndex = columnIndex;
                columnIndex15 = i17;
            }
            f0Var = this;
        }
        if (all != null) {
            all.close();
        }
        java.lang.Object l17 = gm0.j1.u().c().l(139268, null);
        f0Var.f449268c = l17 == null ? 0 : ((java.lang.Integer) l17).intValue();
    }

    public static void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMsgManager", "clearRedDotAndWording()");
        s75.d.b(new wt1.d0(), "clearRedDotAndWording");
    }

    public boolean b(java.lang.String str) {
        xt1.k kVar;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        java.util.List list = this.f449267b;
        if (list != null && !android.text.TextUtils.isEmpty(str)) {
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i17 >= arrayList.size()) {
                    break;
                }
                kVar = (xt1.k) arrayList.get(i17);
                if (str.equals(kVar.field_msg_id)) {
                    break;
                }
                i17++;
            }
        }
        kVar = null;
        if (kVar == null) {
            return false;
        }
        ((java.util.ArrayList) list).remove(kVar);
        c(kVar);
        return true;
    }

    public final boolean c(xt1.k kVar) {
        if (kVar == null) {
            return false;
        }
        boolean delete = xt1.t0.Vi().delete(kVar, new java.lang.String[0]);
        if (!delete) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardMsgManager", "delete CardMsgInfo failed! id:" + kVar.field_msg_id);
        }
        return delete;
    }

    public void d() {
        this.f449268c = 0;
        gm0.j1.u().c().w(139268, java.lang.Integer.valueOf(this.f449268c));
    }

    public final void e(xt1.k kVar) {
        if (kVar == null || xt1.t0.Vi().insert(kVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CardMsgManager", "insert CardMsgInfo failed! id:" + kVar.field_msg_id);
    }

    public void f(wt1.e0 e0Var) {
        wt1.e0 e0Var2;
        if (this.f449266a == null || e0Var == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f449266a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f449266a.get(i17);
            if (weakReference != null && (e0Var2 = (wt1.e0) weakReference.get()) != null && e0Var2.equals(e0Var)) {
                this.f449266a.remove(weakReference);
                return;
            }
        }
    }
}
