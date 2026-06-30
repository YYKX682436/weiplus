package com.tencent.mm.plugin.sns.cover.preview;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverDefaultView;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lv94/g;", "info", "Ljz5/f0;", "loadCover", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "", "getLayoutId", "onResume", "onPause", "onDestroy", "getType", "", "TAG", "Ljava/lang/String;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "changeCoverTxt$delegate", "Ljz5/g;", "getChangeCoverTxt", "()Landroid/widget/TextView;", "changeCoverTxt", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class SnsCoverDefaultView extends com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview {
    private final java.lang.String TAG;

    /* renamed from: changeCoverTxt$delegate, reason: from kotlin metadata */
    private final jz5.g changeCoverTxt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsCoverDefaultView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.SnsCoverDefaultView";
        this.changeCoverTxt = jz5.h.b(new aa4.d(this));
    }

    public static final /* synthetic */ android.widget.TextView access$getChangeCoverTxt(com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView snsCoverDefaultView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        android.widget.TextView changeCoverTxt = snsCoverDefaultView.getChangeCoverTxt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return changeCoverTxt;
    }

    private final android.widget.TextView getChangeCoverTxt() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        android.widget.TextView textView = (android.widget.TextView) this.changeCoverTxt.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChangeCoverTxt", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return textView;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return com.tencent.mm.R.layout.cr7;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        return 0;
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void loadCover(v94.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        if (!kotlin.jvm.internal.o.b(gm0.j1.u().c().l(2, null), gVar != null ? ((com.tencent.mm.plugin.sns.storage.x1) gVar).getUserName() : null)) {
            pm0.v.X(new aa4.e(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPostClose() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mars.xlog.Log.i(this.TAG, "[onPreClose]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPostOpen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPreClose() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.tencent.mm.feature.sns.api.ICoverStatusChanged
    public void onPreOpen() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mars.xlog.Log.i(this.TAG, "[onPreOpen]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }

    @Override // com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview, com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverDefaultView");
    }
}
