package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class eb0 {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f112394a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LiveVideoView f112395b;

    public eb0(mn0.b0 b0Var, com.tencent.mm.live.core.view.LiveVideoView liveVideoView) {
        this.f112394a = b0Var;
        this.f112395b = liveVideoView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.eb0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.eb0 eb0Var = (com.tencent.mm.plugin.finder.live.plugin.eb0) obj;
        return kotlin.jvm.internal.o.b(this.f112394a, eb0Var.f112394a) && kotlin.jvm.internal.o.b(this.f112395b, eb0Var.f112395b);
    }

    public int hashCode() {
        mn0.b0 b0Var = this.f112394a;
        int hashCode = (b0Var == null ? 0 : b0Var.hashCode()) * 31;
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = this.f112395b;
        return hashCode + (liveVideoView != null ? liveVideoView.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LivePlayerParams(player=" + this.f112394a + ", view=" + this.f112395b + ')';
    }
}
