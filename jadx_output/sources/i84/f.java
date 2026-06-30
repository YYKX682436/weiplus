package i84;

/* loaded from: classes13.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView f289656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f289657e;

    public f(com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView seekBarView, yz5.p pVar) {
        this.f289656d = seekBarView;
        this.f289657e = pVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$initDragControl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView seekBarView = this.f289656d;
        if (action == 0) {
            seekBarView.requestDisallowInterceptTouchEvent(true);
            float progress = seekBarView.getProgress();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            seekBarView.f163312v = progress;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float rawX = motionEvent.getRawX();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            seekBarView.f163311u = rawX;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        } else if (action != 2) {
            seekBarView.requestDisallowInterceptTouchEvent(false);
            this.f289657e.invoke(java.lang.Float.valueOf(seekBarView.getProgress()), new i84.e(seekBarView));
        } else {
            seekBarView.setRefreshing(false);
            float rawX2 = motionEvent.getRawX();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f17 = seekBarView.f163311u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f18 = rawX2 - f17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLineWidth$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            int i17 = seekBarView.f163308r;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLineWidth$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            yz5.a a17 = seekBarView.a(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float floatValue = f18 / ((java.lang.Number) ((i84.d) a17).invoke()).floatValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f19 = seekBarView.f163312v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTotalProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f27 = seekBarView.f163304n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTotalProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            seekBarView.setProgress(f19 + (floatValue * f27));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$initDragControl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1");
        return true;
    }
}
