package ks3;

/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f311746a;

    /* renamed from: b, reason: collision with root package name */
    public final int f311747b;

    public s(java.lang.String str, int i17) {
        this.f311746a = null;
        this.f311747b = 100;
        com.tencent.mars.xlog.Log.i("Msg.Plugin.HttpRequestCache", "HttpRequestCache constructor, path = " + str + ", maxCount = " + i17);
        this.f311746a = str;
        com.tencent.mm.vfs.w6.u(str);
        this.f311747b = i17 <= 0 ? 100 : i17;
    }

    public void a() {
        java.lang.String str = this.f311746a;
        java.lang.String[] D = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).D();
        int i17 = 0;
        if ((D != null ? D.length : 0) < this.f311747b) {
            return;
        }
        java.lang.String[] D2 = new com.tencent.mm.vfs.r6(str).D();
        int length = D2.length;
        com.tencent.mm.vfs.r6 r6Var = null;
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        while (i17 < length) {
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(D2[i17]);
            long B = r6Var2.B();
            if (B < j17) {
                j17 = B;
            }
            i17++;
            r6Var = r6Var2;
        }
        if (r6Var.m()) {
            r6Var.l();
        }
    }

    public final java.lang.String b(java.lang.String str, java.util.Map map) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.String str3 = (java.lang.String) entry.getValue();
                stringBuffer.append(str2);
                stringBuffer.append(str3);
            }
        }
        return kk.k.g(stringBuffer.toString().getBytes());
    }
}
