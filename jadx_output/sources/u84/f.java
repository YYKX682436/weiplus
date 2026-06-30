package u84;

/* loaded from: classes4.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.k f425516d;

    public f(u84.k kVar) {
        this.f425516d = kVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        i64.p pVar = (i64.p) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        u84.k kVar = this.f425516d;
        java.lang.String j17 = kVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe numberTitle = ");
        sb6.append(pVar != null ? pVar.a() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        android.widget.TextView y17 = u84.k.y(kVar);
        android.content.Context context = y17 != null ? y17.getContext() : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        } else {
            if (pVar == null || (a17 = pVar.a()) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdHighlightTagInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                u84.l lVar = kVar.f425569v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdHighlightTagInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                a17 = lVar != null ? lVar.a() : null;
            }
            if (!(a17 == null || a17.length() == 0)) {
                android.widget.TextView y18 = u84.k.y(kVar);
                java.lang.CharSequence text = y18 != null ? y18.getText() : null;
                if (text == null) {
                    text = "";
                }
                if (!a17.equals(text)) {
                    android.widget.TextView y19 = u84.k.y(kVar);
                    if (y19 != null) {
                        y19.setText(a17);
                    }
                    android.widget.TextView y27 = u84.k.y(kVar);
                    float b17 = i65.a.b(context, 14) * i65.a.q(context);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                    float f17 = kVar.f425570w;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                    ca4.m0.b(context, y27, b17, f17);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        return f0Var;
    }
}
