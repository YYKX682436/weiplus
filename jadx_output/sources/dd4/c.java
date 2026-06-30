package dd4;

/* loaded from: classes4.dex */
public final class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dd4.d f228973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f228974e;

    public c(dd4.d dVar, java.lang.StringBuilder sb6) {
        this.f228973d = dVar;
        this.f228974e = sb6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet$printMediaInfo$2");
        dd4.d dVar = this.f228973d;
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet");
        java.lang.Object systemService = dVar.f228979q2.getSystemService("clipboard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, this.f228974e.toString()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleDebugSheet$printMediaInfo$2");
    }
}
