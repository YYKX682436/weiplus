package vu0;

/* loaded from: classes5.dex */
public final class m0 implements com.tencent.maas.utils.MJAudioPCMExtractor.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f440120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tu0.d f440121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440124e;

    public m0(kotlin.jvm.internal.c0 c0Var, tu0.d dVar, yz5.l lVar, java.lang.String str, yz5.l lVar2) {
        this.f440120a = c0Var;
        this.f440121b = dVar;
        this.f440122c = lVar;
        this.f440123d = str;
        this.f440124e = lVar2;
    }

    @Override // com.tencent.maas.utils.MJAudioPCMExtractor.OnComplete
    public final boolean onComplete(java.nio.ByteBuffer byteBuffer, boolean z17) {
        tu0.d dVar = this.f440121b;
        java.lang.String audioFilePath = this.f440123d;
        kotlin.jvm.internal.c0 c0Var = this.f440120a;
        if (c0Var.f310112d) {
            return false;
        }
        try {
            byteBuffer.rewind();
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            dVar.getClass();
            tu0.g gVar = dVar.f422081b;
            if (gVar != null) {
                gVar.h(bArr, remaining, z17);
            }
            tu0.b bVar = dVar.f422080a;
            if (bVar != null) {
                tu0.h hVar = (tu0.h) bVar;
                hVar.a(bArr, remaining, z17);
                try {
                    java.io.OutputStream outputStream = hVar.f422084f;
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, remaining);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if (z17) {
                dVar.a();
                c0Var.f310112d = true;
                yz5.l lVar = this.f440122c;
                kotlin.jvm.internal.o.f(audioFilePath, "$audioFilePath");
                lVar.invoke(audioFilePath);
            }
            return true;
        } catch (java.lang.Exception e17) {
            dVar.a();
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(audioFilePath);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                com.tencent.mars.xlog.Log.i("VideoSubtitleService", "extractAudioPCM: deleteFile = ".concat(audioFilePath));
                com.tencent.mm.vfs.w6.h(audioFilePath);
            }
            c0Var.f310112d = true;
            this.f440124e.invoke(new java.lang.IllegalStateException("Encode PCM data to file failed", e17));
            return false;
        }
    }
}
