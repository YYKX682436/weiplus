package go5;

/* loaded from: classes14.dex */
public final class j implements tl.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ go5.k f274137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go5.d f274138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go5.e f274139c;

    public j(go5.k kVar, go5.d dVar, go5.e eVar) {
        this.f274137a = kVar;
        this.f274138b = dVar;
        this.f274139c = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        if (i18 == 15) {
            if (fp.h.c(31)) {
                ((ku5.t0) ku5.t0.f312615d).B(new go5.g(this.f274139c));
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new go5.i(this.f274139c));
            }
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        if (bArr != null) {
            go5.k kVar = this.f274137a;
            if (kVar.f274141b.capacity() < bArr.length) {
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
                kotlin.jvm.internal.o.f(allocateDirect, "allocateDirect(...)");
                kVar.f274141b = allocateDirect;
            }
            kVar.f274141b.clear();
            kVar.f274141b.put(bArr);
            kVar.f274141b.limit(bArr.length);
            java.nio.ByteBuffer buf = kVar.f274141b;
            ((go5.u) this.f274138b).getClass();
            kotlin.jvm.internal.o.g(buf, "buf");
            buf.clear();
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.A(buf, buf.capacity());
        }
    }
}
