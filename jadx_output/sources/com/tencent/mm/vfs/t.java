package com.tencent.mm.vfs;

/* loaded from: classes4.dex */
public class t extends com.tencent.mm.vfs.p1 implements android.os.Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f213175i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.HashMap f213176m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Handler f213177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.CleanExpireFileSystem f213178o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.vfs.CleanExpireFileSystem cleanExpireFileSystem, com.tencent.mm.vfs.q2 q2Var, java.util.Map map) {
        super(cleanExpireFileSystem, q2Var, cleanExpireFileSystem.f212696i, map);
        this.f213178o = cleanExpireFileSystem;
        this.f213175i = new java.lang.Object();
        if (cleanExpireFileSystem.f212697m) {
            this.f213176m = new java.util.HashMap();
            this.f213177n = new android.os.Handler(com.tencent.mm.vfs.a3.f212781a.f212824r.getLooper(), this);
        } else {
            this.f213176m = null;
            this.f213177n = null;
        }
    }

    public final void O(java.lang.String str, boolean z17) {
        boolean isEmpty;
        if (this.f213178o.f212697m) {
            if (z17) {
                synchronized (this.f213175i) {
                    this.f213176m.remove(str);
                }
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f213175i) {
                isEmpty = this.f213176m.isEmpty();
                this.f213176m.put(str, java.lang.Long.valueOf(currentTimeMillis));
            }
            if (isEmpty) {
                this.f213177n.sendMessageDelayed(android.os.Message.obtain(), 60000L);
            }
        }
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.io.InputStream a17 = this.f213120e.a(str);
        O(str, false);
        return a17;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        java.io.OutputStream c17 = this.f213120e.c(str, z17);
        O(str, true);
        return c17;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.WritableByteChannel h(java.lang.String str, boolean z17) {
        java.nio.channels.WritableByteChannel h17 = this.f213120e.h(str, z17);
        O(str, true);
        return h17;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.util.HashMap hashMap;
        synchronized (this.f213175i) {
            if (this.f213176m.isEmpty()) {
                hashMap = null;
            } else {
                hashMap = this.f213176m;
                this.f213176m = new java.util.HashMap();
            }
        }
        if (hashMap == null) {
            return true;
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            this.f213120e.n((java.lang.String) entry.getKey(), ((java.lang.Long) entry.getValue()).longValue());
        }
        hashMap.size();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0729 A[LOOP:3: B:120:0x0723->B:122:0x0729, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05b5  */
    @Override // com.tencent.mm.vfs.p1, com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r76) {
        /*
            Method dump skipped, instructions count: 1847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.t.q(android.os.CancellationSignal):void");
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public java.nio.channels.ReadableByteChannel s(java.lang.String str) {
        java.nio.channels.ReadableByteChannel s17 = this.f213120e.s(str);
        O(str, false);
        return s17;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
        android.os.ParcelFileDescriptor x17 = this.f213120e.x(str, str2);
        O(str, str2.contains("w"));
        return x17;
    }
}
