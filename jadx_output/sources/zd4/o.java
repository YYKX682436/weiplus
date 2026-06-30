package zd4;

/* loaded from: classes11.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f471640a = jz5.h.b(new zd4.n(this));

    public final boolean a(int i17, int i18, int i19) {
        zd4.q qVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMatchChildKeyByChildPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildKeyByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.r h17 = h(i17);
        java.lang.Integer num = null;
        if (h17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            qVar = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            qVar = (zd4.q) kz5.n0.a0(h17.f471648d, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        }
        if (qVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            num = java.lang.Integer.valueOf(qVar.f471642b);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildKeyByChildPosition", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z17 = num != null && i19 == num.intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMatchChildKeyByChildPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z17;
    }

    public final boolean b(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMatchTargetVisibilityByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z17 = n(i17) == i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMatchTargetVisibilityByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z17;
    }

    public abstract java.util.List c();

    public final int d(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.q g17 = g(i17, i18);
        if (g17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChildSubTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return g17.f471644d;
    }

    public final int e(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.q g17 = g(i17, i18);
        if (g17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChildTitleResId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return g17.f471643c;
    }

    public int f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findHeaderTitleTextColor", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int d17 = i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.a0c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findHeaderTitleTextColor", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return d17;
    }

    public final zd4.q g(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.r h17 = h(i17);
        if (h17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildItems", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
        for (zd4.q qVar : h17.f471648d) {
            qVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupChildConfigItem");
            if (qVar.f471642b == i18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return qVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSelectVisibleChildItemByChildKey", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return null;
    }

    public final zd4.r h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        for (zd4.r rVar : l()) {
            rVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            if (rVar.f471645a == i17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return rVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findSelectVisibleGroupHeaderItem", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return null;
    }

    public final int i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int i18 = 0;
        for (java.lang.Object obj : l()) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            zd4.r rVar = (zd4.r) obj;
            rVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            if (rVar.f471645a == i17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
                return i18;
            }
            i18 = i19;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupPositionByVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return 0;
    }

    public int j(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderCheckBoxVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderCheckBoxVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return 0;
    }

    public int k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderPaddingLeft", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        int h17 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderPaddingLeft", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return h17;
    }

    public final java.util.List l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        java.util.List list = (java.util.List) ((jz5.n) this.f471640a).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectVisibleGroupHeaders", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return list;
    }

    public int m(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSubHeaderTitleVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSubHeaderTitleVisibility", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return 0;
    }

    public final int n(int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleStateByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        zd4.r rVar = (zd4.r) kz5.n0.a0(l(), i17);
        if (rVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.SelectVisibleGroupHeaderConfigItem");
            i18 = rVar.f471645a;
        } else {
            i18 = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleStateByPos", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return i18;
    }

    public final boolean o(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("matchTargetVisibilityState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        boolean z17 = i17 == i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("matchTargetVisibilityState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return z17;
    }

    public boolean p(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preCheckOnSelectVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preCheckOnSelectVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleResCollector");
        return true;
    }
}
