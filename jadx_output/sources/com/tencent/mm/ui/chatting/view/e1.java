package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f202909a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f202910b;

    public e1(java.util.List cardsInOrder, java.util.LinkedHashMap startViewsById) {
        kotlin.jvm.internal.o.g(cardsInOrder, "cardsInOrder");
        kotlin.jvm.internal.o.g(startViewsById, "startViewsById");
        this.f202909a = cardsInOrder;
        this.f202910b = startViewsById;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.e1)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.e1 e1Var = (com.tencent.mm.ui.chatting.view.e1) obj;
        return kotlin.jvm.internal.o.b(this.f202909a, e1Var.f202909a) && kotlin.jvm.internal.o.b(this.f202910b, e1Var.f202910b);
    }

    public int hashCode() {
        return (this.f202909a.hashCode() * 31) + this.f202910b.hashCode();
    }

    public java.lang.String toString() {
        return "FoldedSnap(cardsInOrder=" + this.f202909a + ", startViewsById=" + this.f202910b + ')';
    }
}
