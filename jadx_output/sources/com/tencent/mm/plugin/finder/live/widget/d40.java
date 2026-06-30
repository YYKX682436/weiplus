package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d40 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.s30 f118053a;

    /* renamed from: b, reason: collision with root package name */
    public final dk2.qf f118054b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f118055c;

    public d40(com.tencent.mm.plugin.finder.live.widget.s30 visitorMicReplayScene, dk2.qf visitorMicReplayData, yz5.a aVar) {
        kotlin.jvm.internal.o.g(visitorMicReplayScene, "visitorMicReplayScene");
        kotlin.jvm.internal.o.g(visitorMicReplayData, "visitorMicReplayData");
        this.f118053a = visitorMicReplayScene;
        this.f118054b = visitorMicReplayData;
        this.f118055c = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.d40)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.d40 d40Var = (com.tencent.mm.plugin.finder.live.widget.d40) obj;
        return this.f118053a == d40Var.f118053a && kotlin.jvm.internal.o.b(this.f118054b, d40Var.f118054b) && kotlin.jvm.internal.o.b(this.f118055c, d40Var.f118055c);
    }

    public int hashCode() {
        int hashCode = ((this.f118053a.hashCode() * 31) + this.f118054b.hashCode()) * 31;
        yz5.a aVar = this.f118055c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public java.lang.String toString() {
        return "FinderLiveVisitorMicReplayWidgetParams(visitorMicReplayScene=" + this.f118053a + ", visitorMicReplayData=" + this.f118054b + ", onCloseCallback=" + this.f118055c + ')';
    }
}
