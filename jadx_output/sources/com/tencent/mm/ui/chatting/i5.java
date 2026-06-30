package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public final class i5 implements com.tencent.mm.ui.chatting.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f201835a;

    public i5(boolean z17) {
        this.f201835a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.i5) && this.f201835a == ((com.tencent.mm.ui.chatting.i5) obj).f201835a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f201835a);
    }

    public java.lang.String toString() {
        return "IsSoonEnterPhotoEdit(value=" + this.f201835a + ')';
    }
}
