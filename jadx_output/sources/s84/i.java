package s84;

/* loaded from: classes4.dex */
public class i implements s84.j {
    public i(com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer adDragViewContainer) {
    }

    @Override // s84.j
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        com.tencent.mars.xlog.Log.i("AdDragViewContainer", "onDragHit");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragHit", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
    }

    @Override // s84.j
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        com.tencent.mars.xlog.Log.i("AdDragViewContainer", "onDragStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragStart", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
    }

    @Override // s84.j
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        com.tencent.mars.xlog.Log.i("AdDragViewContainer", "onDragSucc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragSucc", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
    }

    @Override // s84.j
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
        com.tencent.mars.xlog.Log.i("AdDragViewContainer", "onDragCancel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDragCancel", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$7");
    }
}
