package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseScopePluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lju3/d0;", "Lkotlinx/coroutines/y0;", "h", "Lkotlinx/coroutines/y0;", "getScope", "()Lkotlinx/coroutines/y0;", "scope", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseScopePluginLayout extends com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout implements ju3.d0 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.y0 scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseScopePluginLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.scope = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }

    public static kotlinx.coroutines.r2 y(com.tencent.mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout baseScopePluginLayout, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((i17 & 1) != 0) {
            context = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            start = kotlinx.coroutines.a1.DEFAULT;
        }
        baseScopePluginLayout.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(baseScopePluginLayout.scope, context, start, block);
    }

    public final kotlinx.coroutines.y0 getScope() {
        return this.scope;
    }

    @Override // com.tencent.mm.plugin.recordvideo.plugin.parent.BasePluginLayout, yt3.r2
    public void release() {
        super.release();
        kotlinx.coroutines.z0.d(this.scope, this + " release.", null, 2, null);
    }
}
