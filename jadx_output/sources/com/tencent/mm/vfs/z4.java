package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class z4 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213269e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f213270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.RecordAndExtraGCFileSystem f213271g;

    public z4(com.tencent.mm.vfs.RecordAndExtraGCFileSystem recordAndExtraGCFileSystem, com.tencent.mm.vfs.q2 q2Var) {
        this.f213271g = recordAndExtraGCFileSystem;
        this.f213269e = q2Var;
        this.f213270f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f213270f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f213269e;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d2  */
    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r56) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.z4.q(android.os.CancellationSignal):void");
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "recordGC <- " + this.f213269e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213271g;
    }
}
