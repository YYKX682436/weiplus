package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class u4 extends com.tencent.mm.vfs.m0 implements android.os.Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213199e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f213200f;

    /* renamed from: g, reason: collision with root package name */
    public final long f213201g;

    /* renamed from: h, reason: collision with root package name */
    public final long f213202h;

    /* renamed from: i, reason: collision with root package name */
    public final long f213203i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f213204m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f213205n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.HashMap f213206o;

    /* renamed from: p, reason: collision with root package name */
    public final android.os.Handler f213207p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.QuotaFileSystem f213208q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.vfs.QuotaFileSystem quotaFileSystem, com.tencent.mm.vfs.q2 q2Var, long j17, long j18, long j19, boolean z17, java.util.Map map) {
        super(quotaFileSystem, map);
        this.f213208q = quotaFileSystem;
        this.f213205n = new java.lang.Object();
        this.f213199e = q2Var;
        this.f213200f = java.util.Collections.singletonList(q2Var);
        this.f213201g = j17;
        this.f213202h = j18;
        this.f213203i = j19;
        this.f213204m = z17;
        if (z17) {
            this.f213206o = new java.util.HashMap();
            this.f213207p = new android.os.Handler(com.tencent.mm.vfs.a3.f212781a.f212824r.getLooper(), this);
        } else {
            this.f213206o = null;
            this.f213207p = null;
        }
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f213200f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f213199e;
    }

    public final void O(java.lang.String str, boolean z17) {
        boolean isEmpty;
        if (this.f213204m) {
            if (z17) {
                synchronized (this.f213205n) {
                    this.f213206o.remove(str);
                }
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f213205n) {
                isEmpty = this.f213206o.isEmpty();
                this.f213206o.put(str, java.lang.Long.valueOf(currentTimeMillis));
            }
            if (isEmpty) {
                this.f213207p.sendMessageDelayed(android.os.Message.obtain(), 60000L);
            }
        }
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.io.InputStream a17 = this.f213199e.a(str);
        O(str, false);
        return a17;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        java.io.OutputStream c17 = this.f213199e.c(str, z17);
        O(str, true);
        return c17;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.u4)) {
            return false;
        }
        com.tencent.mm.vfs.u4 u4Var = (com.tencent.mm.vfs.u4) obj;
        return this.f213199e.equals(u4Var.f213199e) && this.f213201g == u4Var.f213201g && this.f213203i == u4Var.f213203i && this.f213202h == u4Var.f213202h && this.f213204m == u4Var.f213204m;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        java.nio.channels.WritableByteChannel h17 = this.f213199e.h(str, z17);
        O(str, true);
        return h17;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.util.HashMap hashMap;
        synchronized (this.f213205n) {
            if (this.f213206o.isEmpty()) {
                hashMap = null;
            } else {
                hashMap = this.f213206o;
                this.f213206o = new java.util.HashMap();
            }
        }
        if (hashMap == null) {
            return true;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            this.f213199e.n((java.lang.String) entry.getKey(), ((java.lang.Long) entry.getValue()).longValue());
        }
        hashMap.size();
        return true;
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.u4.class.hashCode();
        java.lang.Object[] objArr = {this.f213199e, java.lang.Long.valueOf(this.f213201g), java.lang.Long.valueOf(this.f213202h), java.lang.Boolean.valueOf(this.f213204m)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x034e  */
    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r23) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.u4.q(android.os.CancellationSignal):void");
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        java.nio.channels.ReadableByteChannel s17 = this.f213199e.s(str);
        O(str, false);
        return s17;
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "quota(" + com.tencent.mm.vfs.e8.g(this.f213201g) + " / " + com.tencent.mm.vfs.e8.g(this.f213202h) + ") <- " + this.f213199e;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        android.os.ParcelFileDescriptor x17 = this.f213199e.x(str, str2);
        O(str, str2.contains("w"));
        return x17;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213208q;
    }
}
