package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public final class g5 implements com.tencent.mm.ui.chatting.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f200523a;

    public g5(boolean z17) {
        this.f200523a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.g5) && this.f200523a == ((com.tencent.mm.ui.chatting.g5) obj).f200523a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f200523a);
    }

    public java.lang.String toString() {
        return "IsOnlyPreview(value=" + this.f200523a + ')';
    }
}
