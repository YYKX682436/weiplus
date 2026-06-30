package com.tencent.mm.plugin.sns.abtest;

/* loaded from: classes4.dex */
public class d extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.abtest.NotInterestMenu f162566d;

    public d(com.tencent.mm.plugin.sns.abtest.NotInterestMenu notInterestMenu) {
        this.f162566d = notInterestMenu;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        int[] iArr = com.tencent.mm.plugin.sns.abtest.NotInterestMenu.f162560f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return 3;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        int[] iArr = com.tencent.mm.plugin.sns.abtest.NotInterestMenu.f162560f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.abtest.NotInterestMenu.f162560f[i17]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return valueOf;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return j17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        if (view == null) {
            int[] iArr = com.tencent.mm.plugin.sns.abtest.NotInterestMenu.f162560f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            android.content.Context context = this.f162566d.f162562e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            view = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489352c84, viewGroup, false);
            com.tencent.mm.plugin.sns.abtest.c cVar = new com.tencent.mm.plugin.sns.abtest.c(this);
            cVar.f162565a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kdx);
            view.setTag(cVar);
        }
        android.widget.TextView textView = ((com.tencent.mm.plugin.sns.abtest.c) view.getTag()).f162565a;
        int[] iArr2 = com.tencent.mm.plugin.sns.abtest.NotInterestMenu.f162560f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        textView.setText(com.tencent.mm.plugin.sns.abtest.NotInterestMenu.f162560f[i17]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return view;
    }
}
