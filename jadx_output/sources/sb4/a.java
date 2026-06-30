package sb4;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f405439n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f405440o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f405441p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f405442q;

    public a(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, java.util.List list2) {
        super(mMBaseSelectContactUI, list, z17, true);
        this.f405439n = null;
        this.f405440o = null;
        this.f405441p = new java.util.ArrayList();
        this.f405442q = z18;
        this.f405440o = list2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewlifeChatRoomAdapter", "create!");
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        int size = ((java.util.ArrayList) this.f405441p).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        tb4.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f405441p).get(i17);
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "recent_use")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var.f206903y = "最近推荐";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createRecentUseHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            dVar = n0Var;
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "recent")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            com.tencent.mm.ui.contact.item.n0 n0Var2 = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var2.f206903y = this.f207076d.getActivity().getResources().getString(com.tencent.mm.R.string.jbx);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createRecentHeaderDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            dVar = n0Var2;
        } else {
            gm0.j1.i();
            com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L == null) {
                gm0.j1.i();
                L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            tb4.d dVar2 = new tb4.d(i17);
            dVar2.E = null;
            dVar2.f(L);
            dVar2.f206836e = this.f207078f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
            dVar2.G = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowMoreBtn", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsSelectChatRoomDataItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsChatRoomDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
            dVar = dVar2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createDataItem", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        return dVar;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetData", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewlifeChatRoomAdapter", "resetData");
        android.database.Cursor cursor = this.f405439n;
        if (cursor != null) {
            cursor.close();
            this.f405439n = null;
        }
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f206588m;
        l75.e0 e0Var = pp.a.f357364e2;
        this.f405439n = Di.C(5, list, null, this.f206587i, "");
        h();
        java.util.List<java.lang.String> list2 = this.f405440o;
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(list2);
        java.util.List list3 = this.f405441p;
        if (!L0) {
            for (java.lang.String str : list2) {
                gm0.j1.i();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                if (n17 != null && ((int) n17.E2) != 0) {
                    list3.add(str);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(list3)) {
            list3.add(0, "recent");
        } else {
            list3.add(0, "recent_use");
            list3.add("recent");
        }
        while (this.f405439n.moveToNext()) {
            android.database.Cursor cursor2 = this.f405439n;
            java.lang.String string = cursor2.getString(cursor2.getColumnIndex(dm.i4.COL_USERNAME));
            if (!list3.contains(string)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
                if (this.f405442q) {
                    z17 = !c01.e2.E(string);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFilterAssociateChatRoom", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
                    z17 = true;
                }
                if (z17) {
                    list3.add(string);
                }
            }
        }
        if (list3.size() > 1 && list3.get(list3.size() - 1) == "recent") {
            list3.remove(list3.size() - 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetData", "com.tencent.mm.plugin.sns.ui.adapter.NewlifeChatRoomAdapter");
    }
}
