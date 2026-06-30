package m31;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI f323150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData f323151e;

    public i(com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData) {
        this.f323150d = bizSubscribeMsgManagerUI;
        this.f323151e = subscribeMsgSettingData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI = this.f323150d;
        if (bizSubscribeMsgManagerUI.isFinishing()) {
            return;
        }
        int i17 = com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI.f71849n;
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = this.f323151e;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "updateResult %d, isOpened: %b", java.lang.Integer.valueOf(subscribeMsgSettingData.f71836f.size()), java.lang.Boolean.valueOf(subscribeMsgSettingData.f71835e));
        com.tencent.mm.msgsubscription.ui.MaxRecyclerView maxRecyclerView = bizSubscribeMsgManagerUI.f71855i;
        if (maxRecyclerView == null) {
            kotlin.jvm.internal.o.o("subscribeMsgList");
            throw null;
        }
        maxRecyclerView.setVisibility(subscribeMsgSettingData.f71836f.isEmpty() ^ true ? 0 : 8);
        com.tencent.mm.msgsubscription.ui.MaxRecyclerView maxRecyclerView2 = (com.tencent.mm.msgsubscription.ui.MaxRecyclerView) bizSubscribeMsgManagerUI.findViewById(com.tencent.mm.R.id.nra);
        if (maxRecyclerView2 != null) {
            maxRecyclerView2.setVisibility(0);
        }
        boolean z17 = subscribeMsgSettingData.f71835e;
        java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> list = subscribeMsgSettingData.f71836f;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = bizSubscribeMsgManagerUI.f71853g;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setCheck(z17);
        }
        android.widget.LinearLayout linearLayout = bizSubscribeMsgManagerUI.f71856m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("ll");
            throw null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(bizSubscribeMsgManagerUI.getResources().getString(com.tencent.mm.R.string.aki));
        sb6.append(',');
        sb6.append(z17 ? bizSubscribeMsgManagerUI.getResources().getString(com.tencent.mm.R.string.akg) : bizSubscribeMsgManagerUI.getResources().getString(com.tencent.mm.R.string.akd));
        linearLayout.setContentDescription(sb6.toString());
        m31.f fVar = bizSubscribeMsgManagerUI.f71852f;
        if (fVar != null) {
            java.lang.String value = bizSubscribeMsgManagerUI.f71851e;
            kotlin.jvm.internal.o.g(value, "value");
            fVar.f323139i = value;
        }
        m31.f fVar2 = bizSubscribeMsgManagerUI.f71852f;
        if (fVar2 != null) {
            kotlin.jvm.internal.o.g(list, "list");
            java.util.ArrayList arrayList = fVar2.f323134d;
            arrayList.clear();
            if (!list.isEmpty()) {
                java.util.Collections.sort(list, fVar2.f323138h);
                boolean z18 = false;
                boolean z19 = false;
                for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                    if (subscribeMsgTmpItem.f71820z == 1) {
                        if (!z19) {
                            arrayList.add(new m31.e(fVar2, fVar2.x(bizSubscribeMsgManagerUI, fVar2.f323137g)));
                            z19 = true;
                        }
                    } else if (!z18) {
                        arrayList.add(new m31.e(fVar2, fVar2.x(bizSubscribeMsgManagerUI, 0)));
                        z18 = true;
                    }
                    arrayList.add(new m31.c(fVar2, subscribeMsgTmpItem));
                }
            }
        }
        bizSubscribeMsgManagerUI.U6(z17);
    }
}
