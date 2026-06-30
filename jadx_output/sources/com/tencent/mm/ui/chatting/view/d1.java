package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f202900a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.view.w2 f202901b;

    public d1(java.lang.String uniqueId, com.tencent.mm.ui.chatting.view.w2 snapshot) {
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        this.f202900a = uniqueId;
        this.f202901b = snapshot;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.d1)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.d1 d1Var = (com.tencent.mm.ui.chatting.view.d1) obj;
        return kotlin.jvm.internal.o.b(this.f202900a, d1Var.f202900a) && kotlin.jvm.internal.o.b(this.f202901b, d1Var.f202901b);
    }

    public int hashCode() {
        return (this.f202900a.hashCode() * 31) + this.f202901b.hashCode();
    }

    public java.lang.String toString() {
        return "CardSnap(uniqueId=" + this.f202900a + ", snapshot=" + this.f202901b + ')';
    }
}
