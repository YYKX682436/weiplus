package dr0;

/* loaded from: classes8.dex */
public final class g implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr0.m f242424a;

    public g(dr0.m mVar) {
        this.f242424a = mVar;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (kotlin.jvm.internal.o.b(bm5.f1.a(), str)) {
            this.f242424a.Bi(true);
        } else {
            com.tencent.mm.ipcinvoker.d0.f(str, new com.tencent.mm.ipcinvoker.type.IPCVoid(), dr0.d.class);
        }
    }
}
