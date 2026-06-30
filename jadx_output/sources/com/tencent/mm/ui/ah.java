package com.tencent.mm.ui;

/* loaded from: classes2.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    public final int f197135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f197136b;

    public ah(int i17, int i18) {
        this.f197135a = i17;
        this.f197136b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.ah)) {
            return false;
        }
        com.tencent.mm.ui.ah ahVar = (com.tencent.mm.ui.ah) obj;
        return this.f197135a == ahVar.f197135a && this.f197136b == ahVar.f197136b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f197135a) * 31) + java.lang.Integer.hashCode(this.f197136b);
    }

    public java.lang.String toString() {
        return "Size(width=" + this.f197135a + ", height=" + this.f197136b + ')';
    }
}
