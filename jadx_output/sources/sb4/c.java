package sb4;

/* loaded from: classes11.dex */
public class c extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f405446n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f405447o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f405448p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f405449q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnClickListener f405450r;

    public c(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, boolean z19) {
        super(mMBaseSelectContactUI, list, z17, true);
        this.f405446n = null;
        this.f405447o = null;
        this.f405448p = new java.util.ArrayList();
        this.f405450r = null;
        this.f405449q = z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsChatRoomAdapter", "create!");
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        int size = ((java.util.ArrayList) this.f405448p).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        tb4.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f405448p).get(i17);
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(str, "recent_use");
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        if (D0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var.f206903y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.jby);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            dVar = n0Var;
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "recent")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            com.tencent.mm.ui.contact.item.n0 n0Var2 = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var2.f206903y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.jbx);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            dVar = n0Var2;
        } else {
            gm0.j1.i();
            com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L == null) {
                gm0.j1.i();
                L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            tb4.d dVar2 = new tb4.d(i17);
            dVar2.E = this.f405450r;
            dVar2.f(L);
            dVar2.f206836e = this.f207078f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
            dVar = dVar2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        return dVar;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetData", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsChatRoomAdapter", "resetData");
        this.f405447o = com.tencent.mm.plugin.sns.model.l4.Nj().g().f444300e;
        android.database.Cursor cursor = this.f405446n;
        if (cursor != null) {
            cursor.close();
            this.f405446n = null;
        }
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f206588m;
        l75.e0 e0Var = pp.a.f357364e2;
        this.f405446n = Di.C(5, list, null, this.f206587i, "");
        h();
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(this.f405447o);
        java.util.List list2 = this.f405448p;
        if (!L0) {
            for (wa4.y yVar : this.f405447o) {
                gm0.j1.i();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f444305d, true);
                if (n17 != null && ((int) n17.E2) != 0) {
                    list2.add(yVar.f444305d);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(list2)) {
            list2.add(0, "recent");
        } else {
            list2.add(0, "recent_use");
            list2.add("recent");
        }
        while (this.f405446n.moveToNext()) {
            android.database.Cursor cursor2 = this.f405446n;
            java.lang.String string = cursor2.getString(cursor2.getColumnIndex(dm.i4.COL_USERNAME));
            if (!list2.contains(string)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                if (this.f405449q) {
                    z17 = !c01.e2.E(string);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
                    z17 = true;
                }
                if (z17) {
                    list2.add(string);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetData", "com.tencent.mm.plugin.sns.ui.adapter.SnsChatRoomAdapter");
    }
}
