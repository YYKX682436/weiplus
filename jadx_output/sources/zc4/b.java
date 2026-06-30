package zc4;

/* loaded from: classes4.dex */
public final class b extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final xc4.p f471433d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f471434e;

    public /* synthetic */ b(xc4.p pVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(pVar, (i17 & 2) != 0 ? true : z17);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        zc4.b other = (zc4.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        kotlin.jvm.internal.o.g(other, "other");
        xc4.p pVar = other.f471433d;
        boolean z17 = false;
        if (pVar.isAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        } else {
            xc4.p pVar2 = this.f471433d;
            if (pVar2.compareContent(pVar) && ca4.z0.t0(pVar2.y0()).equals(ca4.z0.t0(pVar.y0())) && kotlin.jvm.internal.o.b(pVar2.W0(), pVar.W0())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                long j17 = pVar2.S1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                long j18 = pVar.S1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceUpdateFlag", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                if (j17 == j18) {
                    z17 = true;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return z17;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clone", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        java.lang.Object clone = super.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clone", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return clone;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        zc4.b other = (zc4.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        kotlin.jvm.internal.o.g(other, "other");
        xc4.p pVar = other.f471433d;
        int createTime = pVar.getCreateTime();
        xc4.p pVar2 = this.f471433d;
        int i17 = createTime != pVar2.getCreateTime() ? kotlin.jvm.internal.o.i(pVar.getCreateTime(), pVar2.getCreateTime()) : pVar.a1().compareTo(pVar2.a1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("compareTo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return i17;
    }

    @Override // xm3.a
    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        if (!(obj instanceof zc4.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(v(), ((zc4.b) obj).v());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return b17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00a3. Please report as an issue. */
    @Override // xm3.a, in5.c
    public int h() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemType", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
        xc4.p info = this.f471433d;
        kotlin.jvm.internal.o.g(info, "info");
        if (info instanceof xc4.a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            i17 = 100;
        } else if (info instanceof h94.c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            i17 = 98;
        } else {
            if (info.isAd()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
            } else if (this.f471434e && info.isWsFold() && !pc4.d.f353410a.F()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                i17 = 7;
            } else {
                com.tencent.mm.protocal.protobuf.TimeLineObject h17 = info.h1();
                r45.a90 a90Var = h17.ContentObj;
                int i18 = a90Var.f369837e;
                if (i18 != 1) {
                    int i19 = 2;
                    if (i18 != 2) {
                        i19 = 3;
                        if (i18 != 3) {
                            int i27 = 9;
                            if (i18 != 4) {
                                if (i18 != 5 && i18 != 9) {
                                    i27 = 10;
                                    if (i18 != 10 && i18 != 17 && i18 != 26) {
                                        if (i18 != 34) {
                                            if (i18 != 101 && i18 != 22 && i18 != 23 && i18 != 41) {
                                                if (i18 == 42) {
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                } else if (i18 != 58) {
                                                    if (i18 != 59) {
                                                        switch (i18) {
                                                            case 12:
                                                            case 13:
                                                            case 14:
                                                                break;
                                                            case 15:
                                                                if (!pc4.d.f353410a.d(info.h1())) {
                                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                    break;
                                                                } else {
                                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                    i17 = 13;
                                                                    break;
                                                                }
                                                            default:
                                                                switch (i18) {
                                                                    case 28:
                                                                        break;
                                                                    case 29:
                                                                    case 30:
                                                                        break;
                                                                    default:
                                                                        switch (i18) {
                                                                            default:
                                                                                switch (i18) {
                                                                                    case 44:
                                                                                    case 46:
                                                                                    case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                                                                                    case 51:
                                                                                    case 52:
                                                                                    case 53:
                                                                                    case 55:
                                                                                    case 56:
                                                                                        break;
                                                                                    case 45:
                                                                                        break;
                                                                                    case 47:
                                                                                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                                                                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                                                                                        if (!je4.g.d(context, h17)) {
                                                                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            i17 = 4;
                                                                                            break;
                                                                                        } else {
                                                                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            break;
                                                                                        }
                                                                                    case 48:
                                                                                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                                                                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                                                                        if (!je4.g.d(context2, h17)) {
                                                                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            i17 = 4;
                                                                                            break;
                                                                                        } else {
                                                                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                            i17 = i27;
                                                                                            break;
                                                                                        }
                                                                                    case 50:
                                                                                        break;
                                                                                    case 54:
                                                                                        break;
                                                                                    default:
                                                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                        break;
                                                                                }
                                                                            case 36:
                                                                            case 37:
                                                                            case 38:
                                                                            case 39:
                                                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                                                i17 = 4;
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                    }
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                                    i17 = 5;
                                                }
                                                i17 = 8;
                                            }
                                        }
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                        i17 = 6;
                                    }
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                i17 = 4;
                            } else {
                                r45.y8 y8Var = h17.AppInfo;
                                if (kotlin.jvm.internal.o.b("wx5aa333606550dfd5", y8Var != null ? y8Var.f390846d : null)) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                    i17 = 8;
                                } else {
                                    if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1 ? 1 : 0) == 0) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                        i17 = i27;
                                    } else {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                        i17 = 4;
                                    }
                                }
                            }
                        } else {
                            r45.hh4 hh4Var = info.h1().ContentObj.f369843n;
                            if (pc4.d.f353410a.a()) {
                                if (hh4Var != null && hh4Var.f376149d == 8) {
                                    r10 = 1;
                                }
                                if (r10 != 0 && hh4Var.f376160r > 0 && info.h1().ContentObj.f369840h.size() > 1) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                                    i17 = 12;
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                            i17 = 4;
                        }
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                    }
                    i17 = i19;
                }
                r10 = a90Var.f369840h.size() != 1 ? 1 : 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTypeUtil");
                i17 = r10;
            }
            i17 = 99;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemType", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return i17;
    }

    public final xc4.p n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return this.f471433d;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        java.lang.String pVar = this.f471433d.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return pVar;
    }

    @Override // xm3.d
    public java.lang.String v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUniqueId", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        xc4.p pVar = this.f471433d;
        java.lang.String str = (pVar.isAd() ? "ad_table_" : "sns_table_") + '_' + pVar.U0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUniqueId", "com.tencent.mm.plugin.sns.ui.improve.repository.ImproveListItem");
        return str;
    }

    public b(xc4.p info, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f471433d = info;
        this.f471434e = z17;
    }
}
