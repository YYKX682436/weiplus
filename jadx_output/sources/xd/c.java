package xd;

/* loaded from: classes7.dex */
public class c extends xd.h {

    /* renamed from: a, reason: collision with root package name */
    public final xd.g f453612a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xd.g bufferConfig) {
        super(bufferConfig);
        kotlin.jvm.internal.o.g(bufferConfig, "bufferConfig");
        this.f453612a = bufferConfig;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "NativeBuffer";
    }

    @Override // h8.c
    public boolean accept(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return r26.i0.A((java.lang.String) obj, "nativebuffer://", false, 2, null);
        }
        return false;
    }

    @Override // h8.c
    public h8.b b(java.lang.Object obj, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        h8.b bVar = new h8.b();
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.Integer h17 = r26.h0.h(r26.n0.l0((java.lang.String) obj, new e06.k(15, r5.length() - 1)));
        if (h17 != null) {
            java.lang.ref.WeakReference weakReference = ((wd.e) this.f453612a).f444683a;
            java.nio.ByteBuffer j07 = (weakReference.get() != null ? (com.tencent.mm.plugin.appbrand.jsruntime.v) ((com.tencent.mm.plugin.appbrand.AppBrandRuntime) weakReference.get()).C0().getF147808e().h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class) : null).j0(h17.intValue(), false);
            if (j07 == null) {
                ah.i.f4715a.w("MicroMsg.AppBrandNativeBufferImageStreamFetcher", "hy: can not found buffer in buffer addon", new java.lang.Object[0]);
                bVar.f279512b = "Not found native buffer in buffer addon!";
            } else {
                j07.position(0);
                byte[] bArr = new byte[j07.remaining()];
                j07.get(bArr);
                bVar.f279511a = new java.io.ByteArrayInputStream(bArr);
            }
        } else {
            ah.i.f4715a.w("MicroMsg.AppBrandNativeBufferImageStreamFetcher", "hy: not providing int as native buffer key!", new java.lang.Object[0]);
            bVar.f279512b = "Not invalid native buffer key!";
        }
        return bVar;
    }
}
