package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public class d1 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f191200d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.span.c1 f191201e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Boolean f191202f;

    public d1() {
        this.f191202f = java.lang.Boolean.TRUE;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/SnsClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.span.c1 c1Var = this.f191201e;
        if (c1Var != null) {
            c1Var.a(view, this.f191200d);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/SnsClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDrawState", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
        super.updateDrawState(textPaint);
        if (this.f191202f.booleanValue()) {
            com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDrawState", "com.tencent.mm.pluginsdk.ui.span.SnsClickableSpan");
    }

    public d1(android.content.Context context, java.lang.Object obj, com.tencent.mm.pluginsdk.ui.span.c1 c1Var) {
        super(2, (r35.m3) null);
        this.f191202f = java.lang.Boolean.TRUE;
        this.f191201e = c1Var;
        this.f191200d = obj;
    }

    public d1(android.content.Context context, java.lang.Object obj, com.tencent.mm.pluginsdk.ui.span.c1 c1Var, int i17) {
        super(2, (r35.m3) null);
        this.f191202f = java.lang.Boolean.TRUE;
        this.f191201e = c1Var;
        this.f191200d = obj;
        setColorConfig(i17);
    }

    public d1(java.lang.Object obj, com.tencent.mm.pluginsdk.ui.span.c1 c1Var) {
        super(2, (r35.m3) null);
        this.f191202f = java.lang.Boolean.TRUE;
        this.f191201e = c1Var;
        this.f191200d = obj;
        setColorConfig(2);
    }
}
