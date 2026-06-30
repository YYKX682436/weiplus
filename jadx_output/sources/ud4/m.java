package ud4;

/* loaded from: classes4.dex */
public class m implements android.widget.AdapterView.OnItemLongClickListener {
    public m(ud4.t tVar) {
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$2");
        return true;
    }
}
