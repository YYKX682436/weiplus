package dr0;

/* loaded from: classes8.dex */
public final class k implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr0.m f242451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f242452b;

    public k(dr0.m mVar, long j17) {
        this.f242451a = mVar;
        this.f242452b = j17;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        boolean b17 = kotlin.jvm.internal.o.b(bm5.f1.a(), str);
        long j17 = this.f242452b;
        if (b17) {
            this.f242451a.Di(j17);
        } else {
            com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCLong(j17), dr0.e.class, null);
        }
    }
}
