package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f214453a;

    /* renamed from: b, reason: collision with root package name */
    public int f214454b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f214455c;

    /* renamed from: d, reason: collision with root package name */
    public int f214456d;

    public b(int i17, int i18, int i19, java.lang.Object obj) {
        this.f214453a = i17;
        this.f214454b = i18;
        this.f214456d = i19;
        this.f214455c = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.xcompat.recyclerview.widget.b)) {
            return false;
        }
        com.tencent.mm.xcompat.recyclerview.widget.b bVar = (com.tencent.mm.xcompat.recyclerview.widget.b) obj;
        int i17 = this.f214453a;
        if (i17 != bVar.f214453a) {
            return false;
        }
        if (i17 == 8 && java.lang.Math.abs(this.f214456d - this.f214454b) == 1 && this.f214456d == bVar.f214454b && this.f214454b == bVar.f214456d) {
            return true;
        }
        if (this.f214456d != bVar.f214456d || this.f214454b != bVar.f214454b) {
            return false;
        }
        java.lang.Object obj2 = this.f214455c;
        if (obj2 != null) {
            if (!obj2.equals(bVar.f214455c)) {
                return false;
            }
        } else if (bVar.f214455c != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f214453a * 31) + this.f214454b) * 31) + this.f214456d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("[");
        int i17 = this.f214453a;
        sb6.append(i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb6.append(",s:");
        sb6.append(this.f214454b);
        sb6.append("c:");
        sb6.append(this.f214456d);
        sb6.append(",p:");
        sb6.append(this.f214455c);
        sb6.append("]");
        return sb6.toString();
    }
}
