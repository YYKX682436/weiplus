package ud4;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f426728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ud4.t f426729e;

    public q(ud4.t tVar, java.util.List list) {
        this.f426729e = tVar;
        this.f426728d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$6");
        int size = this.f426728d.size();
        ud4.t tVar = this.f426729e;
        tVar.d(size);
        tVar.f426733b.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$6");
    }
}
