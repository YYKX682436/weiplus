package ht0;

/* loaded from: classes10.dex */
public final class a extends ei3.u {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f284660J;

    public a(int i17, int i18, int i19, boolean z17) {
        super(i17, i18, i19, null, z17);
        this.f284660J = new java.util.ArrayList();
    }

    @Override // ei3.u
    public boolean j() {
        return true;
    }

    @Override // ei3.u
    public void k(java.nio.ByteBuffer outputBuffer, android.media.MediaCodec.BufferInfo info) {
        kotlin.jvm.internal.o.g(outputBuffer, "outputBuffer");
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = this.f284660J;
        if (arrayList.size() < 0 || this.f253144u) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sight.base.h.e((com.tencent.mm.plugin.sight.base.h) it.next(), outputBuffer, info.size, info.presentationTimeUs, 0, 0, 0, 56, null);
        }
    }

    @Override // ei3.u
    public void l(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo info, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = this.f284660J;
        if (arrayList.size() < 0 || byteBuffer == null || this.f253144u) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.sight.base.h) it.next()).d(byteBuffer, info.size, info.presentationTimeUs, i17, i18, i19);
        }
    }

    public final int n(com.tencent.mm.plugin.sight.base.h sightEncode, java.lang.String tempPath) {
        kotlin.jvm.internal.o.g(sightEncode, "sightEncode");
        kotlin.jvm.internal.o.g(tempPath, "tempPath");
        java.util.ArrayList arrayList = this.f284660J;
        arrayList.clear();
        arrayList.add(sightEncode);
        return c(sightEncode.f162415a, tempPath);
    }
}
