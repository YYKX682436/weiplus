package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f208361a;

    /* renamed from: b, reason: collision with root package name */
    public int f208362b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f208363c;

    public e3(java.lang.Object obj, int i17, java.lang.Object obj2) {
        this.f208361a = obj;
        this.f208362b = i17;
        this.f208363c = obj2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.tencent.mm.ui.e3.class != obj.getClass()) {
            return false;
        }
        com.tencent.mm.ui.e3 e3Var = (com.tencent.mm.ui.e3) obj;
        if (this.f208362b != e3Var.f208362b) {
            return false;
        }
        java.lang.Object obj2 = e3Var.f208361a;
        java.lang.Object obj3 = this.f208361a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i17 = (this.f208362b + 31) * 31;
        java.lang.Object obj = this.f208361a;
        return i17 + (obj == null ? 0 : obj.hashCode());
    }
}
