package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class q6 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f190576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f190577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f190578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f190579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190580f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f190581g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f190582h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f190583i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190584j;

    public q6(int i17, float f17, int i18, int i19, int i27, int i28, int i29, float f18, float f19, com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190575a = i17;
        this.f190576b = f17;
        this.f190577c = i18;
        this.f190578d = i19;
        this.f190579e = i27;
        this.f190580f = i28;
        this.f190581g = i29;
        this.f190582h = f18;
        this.f190583i = f19;
        this.f190584j = c8Var;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int i17 = this.f190575a;
        float f17 = this.f190576b;
        float f18 = i17 + ((0 - i17) * f17);
        float f19 = this.f190577c + ((0 - r0) * f17);
        float width = this.f190578d + ((view.getWidth() - r0) * f17);
        float height = this.f190579e + ((view.getHeight() - r0) * f17);
        float f27 = this.f190580f + ((this.f190581g - r14) * f17);
        float f28 = this.f190583i;
        float f29 = this.f190582h;
        float f37 = f29 + ((f28 - f29) * f17);
        outline.setRoundRect((int) f18, (int) f19, (int) width, (int) height, f27);
        java.lang.Object value = ((jz5.n) this.f190584j.f190226h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view2 = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f37));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$1$1", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
