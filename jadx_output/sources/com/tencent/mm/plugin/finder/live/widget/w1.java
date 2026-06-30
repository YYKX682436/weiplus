package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.d80 f120117a;

    public w1(com.tencent.mm.plugin.finder.live.widget.d80 settlementMode) {
        kotlin.jvm.internal.o.g(settlementMode, "settlementMode");
        this.f120117a = settlementMode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.live.widget.w1) && this.f120117a == ((com.tencent.mm.plugin.finder.live.widget.w1) obj).f120117a;
    }

    public int hashCode() {
        return this.f120117a.hashCode();
    }

    public java.lang.String toString() {
        return "CoLiveSettingOption(settlementMode=" + this.f120117a + ')';
    }
}
