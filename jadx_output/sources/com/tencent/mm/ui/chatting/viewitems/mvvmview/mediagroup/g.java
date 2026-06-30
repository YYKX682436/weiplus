package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f204785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f204786b;

    /* renamed from: c, reason: collision with root package name */
    public float f204787c;

    public g(int i17, int i18, float f17) {
        this.f204785a = i17;
        this.f204786b = i18;
        this.f204787c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g)) {
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g gVar = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g) obj;
        return this.f204785a == gVar.f204785a && this.f204786b == gVar.f204786b && java.lang.Float.compare(this.f204787c, gVar.f204787c) == 0;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f204785a) * 31) + java.lang.Integer.hashCode(this.f204786b)) * 31) + java.lang.Float.hashCode(this.f204787c);
    }

    public java.lang.String toString() {
        return "EdgeState(index=" + this.f204785a + ", direction=" + this.f204786b + ", progress=" + this.f204787c + ')';
    }
}
