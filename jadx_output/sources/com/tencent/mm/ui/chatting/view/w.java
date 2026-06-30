package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f203133a;

    /* renamed from: b, reason: collision with root package name */
    public final int f203134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f203135c;

    public w(int i17, int i18, int i19) {
        this.f203133a = i17;
        this.f203134b = i18;
        this.f203135c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.view.w)) {
            return false;
        }
        com.tencent.mm.ui.chatting.view.w wVar = (com.tencent.mm.ui.chatting.view.w) obj;
        return this.f203133a == wVar.f203133a && this.f203134b == wVar.f203134b && this.f203135c == wVar.f203135c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f203133a) * 31) + java.lang.Integer.hashCode(this.f203134b)) * 31) + java.lang.Integer.hashCode(this.f203135c);
    }

    public java.lang.String toString() {
        return "ContentSize(width=" + this.f203133a + ", height=" + this.f203134b + ", textLength=" + this.f203135c + ')';
    }
}
