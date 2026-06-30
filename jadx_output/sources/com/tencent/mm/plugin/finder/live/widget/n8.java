package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public abstract class n8 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final float f119166d;

    /* renamed from: e, reason: collision with root package name */
    public final float f119167e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.l f119168f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.y0 f119169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f119166d = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        this.f119167e = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        this.f119169g = kotlinx.coroutines.i2.f310477d;
        setOnClickListener(com.tencent.mm.plugin.finder.live.widget.m8.f119052d);
    }

    public void a(com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f119168f = basePlugin;
        this.f119169g = basePlugin.R0().getViewScope();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final com.tencent.mm.plugin.finder.live.plugin.l getBasePlugin() {
        return this.f119168f;
    }

    public final float getHEIGHT() {
        return this.f119166d;
    }

    public final kotlinx.coroutines.y0 getScope() {
        return this.f119169g;
    }

    public final float getWIDTH() {
        return this.f119167e;
    }

    public final void setBasePlugin(com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f119168f = lVar;
    }

    public final void setScope(kotlinx.coroutines.y0 y0Var) {
        kotlin.jvm.internal.o.g(y0Var, "<set-?>");
        this.f119169g = y0Var;
    }

    public final void setTextBold(android.widget.TextView tv6) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        com.tencent.mm.ui.bk.r0(tv6.getPaint(), 0.8f);
    }
}
