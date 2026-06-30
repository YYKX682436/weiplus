package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class hu {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f168534a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f168535b;

    /* renamed from: c, reason: collision with root package name */
    public int f168536c;

    /* renamed from: d, reason: collision with root package name */
    public int f168537d;

    /* renamed from: e, reason: collision with root package name */
    public int f168538e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f168539f;

    /* renamed from: g, reason: collision with root package name */
    public fl5.i f168540g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.WrapScollview f168541h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter f168542i;

    public hu(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f168534a = context;
        this.f168535b = "MicroMsg.SnsUpload.InputScrollHelper";
        this.f168538e = -1;
    }

    public static final com.tencent.mm.plugin.sns.ui.iu a(com.tencent.mm.plugin.sns.ui.hu huVar, int i17, android.text.Layout layout, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        huVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter = huVar.f168542i;
        com.tencent.mm.plugin.sns.ui.iu iuVar = null;
        java.lang.String str = huVar.f168535b;
        if (absSnsUploadSayFooter == null || huVar.f168540g == null || huVar.f168541h == null) {
            com.tencent.mars.xlog.Log.e(str, "buildScrollCursorTask: view null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        } else if (layout == null || layout.getLineCount() < 0) {
            com.tencent.mars.xlog.Log.e(str, "buildScrollCursorTask: editTextLayout error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        } else {
            int lineForOffset = layout.getLineForOffset(i17);
            int lineTop = layout.getLineTop(lineForOffset);
            int lineBottom = layout.getLineBottom(lineForOffset);
            if (i18 != 0) {
                com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter2 = huVar.f168542i;
                kotlin.jvm.internal.o.d(absSnsUploadSayFooter2);
                java.lang.Boolean a17 = absSnsUploadSayFooter2.a();
                kotlin.jvm.internal.o.f(a17, "isFooterBarLayOnPageBottom(...)");
                if (a17.booleanValue()) {
                    com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter3 = huVar.f168542i;
                    kotlin.jvm.internal.o.d(absSnsUploadSayFooter3);
                    i18 -= absSnsUploadSayFooter3.getKeyboardHeight();
                }
            }
            if (huVar.f168536c == 0) {
                fl5.i iVar = huVar.f168540g;
                kotlin.jvm.internal.o.d(iVar);
                android.view.View j17 = iVar.j();
                kotlin.jvm.internal.o.f(j17, "view(...)");
                huVar.f168536c = pm0.v.r(j17).top;
            }
            com.tencent.mm.plugin.sns.ui.WrapScollview wrapScollview = huVar.f168541h;
            kotlin.jvm.internal.o.d(wrapScollview);
            int scrollY = wrapScollview.getScrollY();
            int i19 = huVar.f168536c;
            int i27 = (lineTop + i19) - scrollY;
            huVar.f168538e = i27;
            if (i27 > i19) {
                huVar.f168538e = (lineBottom + i19) - scrollY;
            }
            com.tencent.mm.plugin.sns.ui.iu iuVar2 = new com.tencent.mm.plugin.sns.ui.iu(huVar.f168538e, i19, huVar.f168537d, huVar.f168541h);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFooterBarTopRawY", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            iuVar2.f169443e = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooterBarTopRawY", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            iuVar = iuVar2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        return iuVar;
    }

    public static final void b(com.tencent.mm.plugin.sns.ui.hu huVar, com.tencent.mm.plugin.sns.ui.iu iuVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        huVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        if (iuVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHadRun", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            boolean z17 = iuVar.f169447i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHadRun", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            if (!z17) {
                com.tencent.mars.xlog.Log.i(huVar.f168535b, "do UpdateCursorScrollTask");
                iuVar.run();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
    }

    public static final /* synthetic */ java.lang.String c(com.tencent.mm.plugin.sns.ui.hu huVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        java.lang.String str = huVar.f168535b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        return str;
    }
}
