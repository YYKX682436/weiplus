package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hi {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.fi f134635a;

    public hi(com.tencent.mm.plugin.finder.viewmodel.component.fi displayStatus) {
        kotlin.jvm.internal.o.g(displayStatus, "displayStatus");
        this.f134635a = displayStatus;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.hi) && this.f134635a == ((com.tencent.mm.plugin.finder.viewmodel.component.hi) obj).f134635a;
    }

    public int hashCode() {
        return this.f134635a.hashCode();
    }

    public java.lang.String toString() {
        return "FinderTabExtInfo(displayStatus=" + this.f134635a + ')';
    }
}
