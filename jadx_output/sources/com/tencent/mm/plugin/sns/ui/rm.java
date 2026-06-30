package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rm extends com.tencent.mm.plugin.sns.ui.bm {
    public int A;
    public int B;
    public boolean C;
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance D;

    /* renamed from: y, reason: collision with root package name */
    public android.database.Cursor f170426y;

    /* renamed from: z, reason: collision with root package name */
    public android.database.Cursor f170427z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance snsMsgUIWithRelevance, android.content.Context context, com.tencent.mm.plugin.sns.storage.v1 v1Var) {
        super(snsMsgUIWithRelevance, context, v1Var);
        this.D = snsMsgUIWithRelevance;
        this.f170426y = null;
        this.f170427z = null;
        this.C = false;
        o();
    }

    @Override // com.tencent.mm.plugin.sns.ui.bm
    public boolean H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAll", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return false;
    }

    public android.database.Cursor J(int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int M = M();
        int K = K();
        int i19 = 0;
        boolean z17 = M > 0;
        boolean z18 = K > 0;
        int i27 = (z17 && this.C) ? 1 : 0;
        if (z18 && this.C) {
            i19 = 1;
        }
        if (i27 == 1 && i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        if (z17 && i17 >= i27 && i17 < M + i27) {
            android.database.Cursor cursor = this.f170426y;
            if (cursor == null || !cursor.moveToPosition(i17 - i27)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
                return null;
            }
            android.database.Cursor cursor2 = this.f170426y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return cursor2;
        }
        if (i19 == 1 && i17 == M + i27) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        if (!z18 || i17 < (i18 = i27 + M + i19) || i17 >= i18 + K) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        android.database.Cursor cursor3 = this.f170427z;
        if (cursor3 == null || !cursor3.moveToPosition(((i17 - i27) - M) - i19)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        android.database.Cursor cursor4 = this.f170427z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return cursor4;
    }

    public int K() {
        android.database.Cursor cursor;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFriendsUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        if (this.B < 0 && (cursor = this.f170427z) != null) {
            this.B = cursor.getCount();
        }
        int i17 = this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFriendsUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return i17;
    }

    public com.tencent.mm.plugin.sns.storage.v1 L(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        java.util.Map map = this.f212610g;
        if (map != null) {
            com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            if (v1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
                return v1Var;
            }
        }
        android.database.Cursor J2 = J(i17);
        if (J2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return null;
        }
        if (this.f212610g == null) {
            com.tencent.mm.plugin.sns.storage.v1 x17 = x((com.tencent.mm.plugin.sns.storage.v1) this.f212607d, J2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return x17;
        }
        com.tencent.mm.plugin.sns.storage.v1 x18 = x(null, J2);
        ((java.util.HashMap) this.f212610g).put(java.lang.Integer.valueOf(i17), x18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return x18;
    }

    public int M() {
        android.database.Cursor cursor;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getToMeUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        if (this.A < 0 && (cursor = this.f170426y) != null) {
            this.A = cursor.getCount();
        }
        int i17 = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getToMeUnReadCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return i17;
    }

    @Override // com.tencent.mm.ui.z9
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        android.database.Cursor cursor = this.f170426y;
        if (cursor != null) {
            cursor.close();
        }
        this.A = -1;
        android.database.Cursor cursor2 = this.f170427z;
        if (cursor2 != null) {
            cursor2.close();
        }
        this.B = -1;
        java.util.Map map = this.f212610g;
        if (map != null) {
            map.clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int M = M();
        int K = K();
        int i17 = 0;
        if (M > 0) {
            i17 = (this.C ? 1 : 0) + M + 0;
        }
        if (K > 0) {
            i17 = i17 + K + (this.C ? 1 : 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return i17;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.tencent.mm.plugin.sns.storage.v1 L = L(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return L;
    }

    @Override // com.tencent.mm.plugin.sns.ui.bm, com.tencent.mm.ui.z9, android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.tencent.mm.plugin.sns.storage.v1 L = L(i17);
        if (L == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return 0L;
        }
        long j17 = L.field_snsID;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return j17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.bm, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.sm smVar;
        com.tencent.mm.plugin.sns.ui.sm smVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int M = M();
        int K = K();
        boolean z17 = false;
        boolean z18 = M > 0;
        boolean z19 = K > 0;
        int i18 = (z18 && this.C) ? 1 : 0;
        if (z19 && this.C) {
            z17 = true;
        }
        if (i18 == 1 && i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getToMeTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            if (view == null || !(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.sm)) {
                view = com.tencent.mm.ui.id.b(this.f212608e).inflate(com.tencent.mm.R.layout.ep9, (android.view.ViewGroup) null);
                smVar2 = new com.tencent.mm.plugin.sns.ui.sm();
                smVar2.f170477a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.v99);
                view.setTag(smVar2);
            } else {
                smVar2 = (com.tencent.mm.plugin.sns.ui.sm) view.getTag();
            }
            if (smVar2 != null) {
                smVar2.f170477a.setText(com.tencent.mm.R.string.oju);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getToMeTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return view;
        }
        if (!z17 || i17 != M + i18) {
            android.view.View view2 = super.getView(i17, view, viewGroup);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            return view2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFriendsTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        if (view == null || !(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.sm)) {
            view = com.tencent.mm.ui.id.b(this.f212608e).inflate(com.tencent.mm.R.layout.ep9, (android.view.ViewGroup) null);
            smVar = new com.tencent.mm.plugin.sns.ui.sm();
            smVar.f170477a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.v99);
            view.setTag(smVar);
        } else {
            smVar = (com.tencent.mm.plugin.sns.ui.sm) view.getTag();
        }
        if (smVar != null) {
            smVar.f170477a.setText(com.tencent.mm.R.string.ojl);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFriendsTitleView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return view;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object k(int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.storage.v1 x17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.tencent.mm.plugin.sns.storage.v1 v1Var = (com.tencent.mm.plugin.sns.storage.v1) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        android.database.Cursor J2 = J(i17);
        if (J2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            x17 = null;
        } else {
            x17 = x(v1Var, J2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return x17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.bm, com.tencent.mm.ui.z9
    public void q() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int i18 = com.tencent.mm.plugin.sns.model.l4.Aj().i1(1);
        if (i18 >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUIWithRelevance", "adapter resetToMeCursor toMeUnreadCnt = %d", java.lang.Integer.valueOf(i18));
            android.database.Cursor b17 = com.tencent.mm.plugin.sns.model.l4.Aj().b1(1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setToMeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            this.f170426y = b17;
            this.A = -1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setToMeCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        }
        int i19 = com.tencent.mm.plugin.sns.model.l4.Aj().i1(2);
        if (i19 >= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUIWithRelevance", "adapter resetFriendsCursor friendsUnreadCnt = %d", java.lang.Integer.valueOf(i19));
            android.database.Cursor b18 = com.tencent.mm.plugin.sns.model.l4.Aj().b1(2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFriendsCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
            this.f170427z = b18;
            this.B = -1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFriendsCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        }
        int i27 = i18 + i19;
        if (i18 > 0 && i19 > 0) {
            this.C = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateMainTitle", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        this.D.k7();
        if (!this.C && M() > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMyInteractionMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMyInteractionMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            i17 = com.tencent.mm.R.string.ojt;
        } else if (this.C || K() <= 0) {
            i17 = com.tencent.mm.R.string.jcy;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMutualFriendMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMutualFriendMMtitleStringId", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance");
            i17 = com.tencent.mm.R.string.ojs;
        }
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.sns.ui.qm(this, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateMainTitle", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        u(i27);
        notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
    }

    @Override // com.tencent.mm.plugin.sns.ui.bm
    public int t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return 0;
    }

    @Override // com.tencent.mm.plugin.sns.ui.bm
    public int y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        int count = getCount();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$SnsMsgAdapterWithRelevance");
        return count;
    }
}
