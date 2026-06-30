package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public final class j5 implements com.tencent.mm.ui.chatting.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f201871a;

    public j5(int i17) {
        this.f201871a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.j5) && this.f201871a == ((com.tencent.mm.ui.chatting.j5) obj).f201871a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f201871a);
    }

    public java.lang.String toString() {
        return "Scene(value=" + this.f201871a + ')';
    }
}
