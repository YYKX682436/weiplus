package ud4;

/* loaded from: classes4.dex */
public abstract class b extends ud4.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f426681f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f426682g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final int f426683h;

    public b(android.content.Context context, int i17) {
        this.f426681f = context;
        this.f426683h = i17;
    }

    public void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        ud4.h hVar = (ud4.h) this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearStableIdMap", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        hVar.f426679e.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearStableIdMap", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        hVar.f426682g.clear();
        hVar.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        hVar.f426707o = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAllStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAllStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        this.f426682g.addAll(list);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        int size = this.f426682g.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        java.lang.Object obj = this.f426682g.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        return obj;
    }
}
