package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public class e0 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f191203d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f191204e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f191205f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.span.w f191206g;

    public e0(java.lang.String str, int i17, int i18, boolean z17, com.tencent.mm.pluginsdk.ui.span.w wVar) {
        super(i17, i18);
        this.f191203d = true;
        this.f191204e = true;
        this.f191205f = "";
        this.f191204e = z17;
        this.f191205f = str;
        this.f191206g = wVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.pluginsdk.ui.span.w wVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/MMSpanManager$LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f191203d && (wVar = this.f191206g) != null) {
            wVar.a(this.f191205f);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/MMSpanManager$LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0
    public void setColor(int i17, int i18) {
        super.setColor(i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        if (this.f191204e) {
            com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
        }
    }
}
