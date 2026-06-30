package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class y7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f193103a;

    /* renamed from: b, reason: collision with root package name */
    public int f193104b;

    public y7(int i17) {
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimpleObjectPool", "The max pool size must be > 0");
        } else {
            this.f193103a = new java.lang.Object[i17];
        }
    }

    public java.lang.Object a() {
        int i17;
        java.lang.Object[] objArr = this.f193103a;
        if (objArr == null || (i17 = this.f193104b) <= 0) {
            return null;
        }
        int i18 = i17 - 1;
        java.lang.Object obj = objArr[i18];
        objArr[i18] = null;
        this.f193104b = i17 - 1;
        return obj;
    }

    public boolean b(java.lang.Object obj) {
        boolean z17;
        java.lang.Object[] objArr = this.f193103a;
        if (objArr == null) {
            return false;
        }
        if (objArr != null) {
            for (int i17 = 0; i17 < this.f193104b; i17++) {
                if (objArr[i17] == obj) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
        int i18 = this.f193104b;
        if (i18 >= objArr.length || i18 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimpleObjectPool", "error index %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(objArr.length));
            return false;
        }
        objArr[i18] = obj;
        this.f193104b = i18 + 1;
        return true;
    }
}
