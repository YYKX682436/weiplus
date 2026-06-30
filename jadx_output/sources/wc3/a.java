package wc3;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.appstorage.y0 {
    @Override // com.tencent.mm.plugin.appbrand.appstorage.y0, com.tencent.mm.plugin.appbrand.appstorage.u1, com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing
    public com.tencent.mm.plugin.appbrand.appstorage.j1 readFile(java.lang.String str, ik1.b0 pByteBuffer) {
        kotlin.jvm.internal.o.g(pByteBuffer, "pByteBuffer");
        if (r26.i0.q(str, "magicbrush.json", false, 2, null)) {
            pByteBuffer.f291824a = java.nio.charset.StandardCharsets.UTF_8.encode("{ \"publicservices\": { \"MBDemoService\": { \"provider\": \"MBDemoService\", \"version\": \"0\" } } }");
        } else {
            pByteBuffer.f291824a = java.nio.charset.StandardCharsets.UTF_8.encode("test read file");
        }
        return com.tencent.mm.plugin.appbrand.appstorage.j1.OK;
    }
}
