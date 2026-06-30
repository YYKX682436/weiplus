package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public class yl extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f133401p = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479242tu);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f133402d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f133403e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f133404f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f133405g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f133406h;

    /* renamed from: i, reason: collision with root package name */
    public float f133407i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f133408m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f133409n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f133410o;

    public /* synthetic */ yl(java.lang.String str, int i17, int i18, boolean z17, boolean z18, yz5.l lVar, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? false : z18, lVar);
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        if (this.f133406h) {
            this.f133405g.invoke(this.f133402d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0
    public void setColor(int i17, int i18) {
        super.setColor(i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        if (this.f133403e) {
            com.tencent.mm.ui.bk.r0(ds6, 0.8f);
        }
        float f17 = this.f133407i;
        if (f17 > 0.0f) {
            ds6.setShadowLayer(f17, 0.0f, 0.0f, f133401p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl(java.lang.String text, int i17, int i18, boolean z17, boolean z18, yz5.l onClick) {
        super(i17, i18);
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f133402d = text;
        this.f133403e = z17;
        this.f133404f = z18;
        this.f133405g = onClick;
        this.f133406h = true;
    }
}
