package dr0;

/* loaded from: classes8.dex */
public final class j implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr0.m f242435a;

    public j(dr0.m mVar) {
        this.f242435a = mVar;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (kotlin.jvm.internal.o.b(bm5.f1.a(), str)) {
            this.f242435a.Bi(false);
        } else {
            com.tencent.mm.ipcinvoker.d0.d(str, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, dr0.c.class, null);
        }
    }
}
