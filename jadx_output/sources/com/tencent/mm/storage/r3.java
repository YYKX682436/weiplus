package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f195268a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f195269b;

    public r3(int i17, java.lang.String str) {
        this.f195268a = i17;
        this.f195269b = str;
    }

    public static com.tencent.mm.storage.r3 a(java.lang.Object obj) {
        int i17;
        if (obj != null && obj != com.tencent.mm.storage.n3.f195142p) {
            if (obj instanceof java.lang.Integer) {
                i17 = 1;
            } else if (obj instanceof java.lang.Long) {
                i17 = 2;
            } else if (obj instanceof java.lang.String) {
                i17 = 3;
            } else if (obj instanceof java.lang.Boolean) {
                i17 = 4;
            } else if (obj instanceof java.lang.Float) {
                i17 = 5;
            } else if (obj instanceof java.lang.Double) {
                i17 = 6;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConfigStorage", "unresolve failed, unknown type=" + obj.getClass());
            }
            return new com.tencent.mm.storage.r3(i17, obj.toString());
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.storage.r3)) {
            return false;
        }
        com.tencent.mm.storage.r3 r3Var = (com.tencent.mm.storage.r3) obj;
        if (this.f195268a != r3Var.f195268a) {
            return false;
        }
        java.lang.String str = r3Var.f195269b;
        java.lang.String str2 = this.f195269b;
        return str2 == null ? str == null : str2.equals(str);
    }
}
