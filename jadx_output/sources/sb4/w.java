package sb4;

/* loaded from: classes4.dex */
public final class w extends sb4.e {
    public final android.app.Activity C;
    public int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z17, sb4.v snsClick, android.app.Activity context, java.lang.String userName) {
        super(z17, context, snsClick, userName);
        kotlin.jvm.internal.o.g(snsClick, "snsClick");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.C = context;
    }

    @Override // sb4.e
    public boolean A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSearchModeEnd", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return false;
    }

    public final java.util.ArrayList H(java.lang.String clickSnsId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        kotlin.jvm.internal.o.g(clickSnsId, "clickSnsId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.D = i17;
        java.util.List list = this.f405456e;
        int size = ((java.util.ArrayList) list).size();
        int i18 = 0;
        while (i18 < size) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) ((java.util.ArrayList) list).get(i18);
            java.lang.String snsId = snsInfo.getSnsId();
            int j17 = pb4.e.f353196a.j(snsInfo);
            if (snsInfo.getTimeLine().ContentObj != null && snsInfo.getTimeLine().ContentObj.f369840h.size() != 0 && (snsInfo.isPhoto() || snsInfo.getTimeLine().ContentObj.f369837e == 15)) {
                if (snsId.equals(clickSnsId)) {
                    this.D = arrayList.size();
                }
                java.util.Iterator it = snsInfo.getTimeLine().ContentObj.f369840h.iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    r45.jj4 jj4Var = (r45.jj4) it.next();
                    r45.m33 m33Var = new r45.m33();
                    m33Var.f380109d = jj4Var;
                    m33Var.f380110e = com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", j17);
                    m33Var.f380111f = snsInfo.getCreateTime();
                    m33Var.f380112g = i19;
                    arrayList.add(m33Var);
                    i19++;
                    i18 = i18;
                }
            }
            i18++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return arrayList;
    }

    @Override // sb4.e
    public void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseFeed", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        java.util.ArrayList arrayList = ta4.h1.f416750a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("browseFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        if (snsInfo != null) {
            java.lang.String s07 = ca4.z0.s0(snsInfo.field_snsId);
            java.util.ArrayList arrayList2 = ta4.h1.f416750a;
            if (!arrayList2.contains(s07)) {
                arrayList2.add(s07);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.tencent.mm.plugin.sns.statistics.b0 b0Var = this.A;
        if (b0Var != null && snsInfo != null) {
            b0Var.c(snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("browseFeed", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        int size = ((java.util.ArrayList) this.f405456e).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        java.lang.Object obj = ((java.util.ArrayList) this.f405456e).get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0079. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x007c. Please report as an issue. */
    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        java.util.Map map = this.f405459h;
        if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
            java.lang.Object obj = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.d(obj);
            i18 = ((java.lang.Number) obj).intValue();
        } else {
            i18 = -1;
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarListAdapter", "unknow error " + i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return -1;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) getItem(i18);
        int i19 = snsInfo.getTimeLine().ContentObj.f369837e;
        if (i19 != 1) {
            if (i19 == 4) {
                if (kotlin.jvm.internal.o.b("wx5aa333606550dfd5", snsInfo.getTimeLine().AppInfo != null ? snsInfo.getTimeLine().AppInfo.f390846d : "")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                    return 6;
                }
                ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                return 1;
            }
            if (i19 == 15) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                return 2;
            }
            if (i19 == 21) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                return 3;
            }
            if (i19 != 59 && i19 != 28 && i19 != 29) {
                if (i19 == 33) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                    return 5;
                }
                if (i19 != 34) {
                    switch (i19) {
                        case 36:
                        case 37:
                        case 38:
                            break;
                        case 39:
                            int i27 = snsInfo.getTimeLine().ContentObj.f369850u;
                            if (i27 == 3 || i27 == 100000000) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                return 4;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                            return 1;
                        default:
                            switch (i19) {
                                case 42:
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                    return 6;
                                case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                                case 44:
                                case 45:
                                case 46:
                                    break;
                                case 47:
                                    android.app.Activity context = this.C;
                                    kotlin.jvm.internal.o.f(context, "context");
                                    if (je4.g.d(context, snsInfo.getTimeLine())) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                        return 6;
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                    return 1;
                                default:
                                    switch (i19) {
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 55:
                                        case 56:
                                            break;
                                        case 54:
                                            break;
                                        default:
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                                            return 1;
                                    }
                            }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return 4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        int itemViewType = getItemViewType(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListAdapter", "position " + itemViewType);
        android.view.View p17 = itemViewType != 0 ? itemViewType != 2 ? itemViewType != 3 ? itemViewType != 4 ? itemViewType != 5 ? itemViewType != 6 ? p(i17, view) : o(i17, view) : n(i17, view) : l(i17, view) : m(i17, view) : r(i17, view) : q(i17, view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return p17;
    }

    @Override // sb4.e
    public boolean h(int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDateTvDisplay", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return true;
    }

    @Override // sb4.e
    public boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkToShowStarIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return false;
    }

    @Override // sb4.e
    public void k(android.widget.TextView yearTv, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkYearTvView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        kotlin.jvm.internal.o.g(yearTv, "yearTv");
        int i19 = i17 / 10000;
        int i27 = i18 / 10000;
        d(yearTv);
        android.app.Activity activity = this.C;
        if (i19 == 0) {
            if (com.tencent.mm.plugin.sns.ui.os.f() != i27) {
                B(yearTv);
                java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.jh6);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                yearTv.setText(format);
                yearTv.setVisibility(0);
                d(yearTv);
            }
        } else if (i27 != i19) {
            B(yearTv);
            java.lang.String string2 = activity.getResources().getString(com.tencent.mm.R.string.jh6);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i27)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            yearTv.setText(format2);
            yearTv.setVisibility(0);
            d(yearTv);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkYearTvView", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
    }

    @Override // sb4.e
    public com.tencent.mm.plugin.sns.storage.SnsInfo t(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        if (!(snsInfo != null && this.f405468t == snsInfo.localid)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return null;
        }
        pb4.e eVar = pb4.e.f353196a;
        java.lang.String localid = snsInfo.getLocalid();
        kotlin.jvm.internal.o.f(localid, "getLocalid(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        int m17 = com.tencent.mm.plugin.sns.storage.w2.m(localid);
        l75.k0 f17 = eVar.f();
        p75.i0 i18 = dm.ab.f235716y.i();
        i18.f352657d = dm.ab.f235717z.j(localid);
        dm.ab abVar = (dm.ab) i18.a().o(f17, dm.ab.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getByLocalId >> ");
        sb6.append(localid);
        sb6.append(", ");
        sb6.append(m17);
        sb6.append(", ");
        sb6.append(abVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb6.toString());
        com.tencent.mm.plugin.sns.storage.SnsInfo n17 = eVar.n(abVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        this.f405468t = -1;
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarListAdapter", "getLastestSnsInfo failed to sight update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(snsInfo.localid));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListAdapter", "getLastestSnsInfo success to update snsInfo, fixPos:%d, localId:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(snsInfo.localid));
        ((java.util.ArrayList) this.f405456e).set(i17, n17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastestSnsInfo", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return n17;
    }

    @Override // sb4.e
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionTop", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionTop", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return 0;
    }

    @Override // sb4.e
    public boolean z(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPositionGoToPhoto", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
        return false;
    }
}
