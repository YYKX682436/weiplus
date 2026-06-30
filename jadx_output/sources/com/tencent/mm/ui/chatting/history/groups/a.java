package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f201746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f201747b;

    public a(java.lang.String uniqueId, int i17) {
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        this.f201746a = uniqueId;
        this.f201747b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.history.groups.a)) {
            return false;
        }
        com.tencent.mm.ui.chatting.history.groups.a aVar = (com.tencent.mm.ui.chatting.history.groups.a) obj;
        return kotlin.jvm.internal.o.b(this.f201746a, aVar.f201746a) && this.f201747b == aVar.f201747b;
    }

    public int hashCode() {
        return (this.f201746a.hashCode() * 31) + java.lang.Integer.hashCode(this.f201747b);
    }

    public java.lang.String toString() {
        return "ContentAnchorInfo(uniqueId=" + this.f201746a + ", pixelOffset=" + this.f201747b + ')';
    }
}
