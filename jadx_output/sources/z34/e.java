package z34;

/* loaded from: classes13.dex */
public class e implements z34.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f469988a;

    /* renamed from: b, reason: collision with root package name */
    public final short f469989b;

    /* renamed from: c, reason: collision with root package name */
    public final short f469990c;

    /* renamed from: d, reason: collision with root package name */
    public final short f469991d;

    /* renamed from: e, reason: collision with root package name */
    public final z34.l[] f469992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z34.f f469993f;

    /* JADX WARN: Multi-variable type inference failed */
    public e(z34.f fVar) {
        this.f469993f = fVar;
        c();
        c();
        e(d() + 12);
        this.f469988a = b();
        e(d() + 4 + 6);
        this.f469989b = c();
        int c17 = c();
        this.f469990c = c17;
        this.f469991d = c();
        this.f469992e = new z34.l[c17];
        for (int i17 = 0; i17 < this.f469990c; i17++) {
            this.f469992e[i17] = new z34.a(this, fVar, this.f469988a + (this.f469989b * i17));
        }
    }

    public int a(byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        z34.f fVar = this.f469993f;
        int length = z34.f.a(fVar).length - fVar.f469995c;
        if (length < 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
            return length;
        }
        int min = java.lang.Math.min(length, bArr.length);
        java.lang.System.arraycopy(z34.f.a(fVar), fVar.f469995c, bArr, 0, min);
        fVar.f469995c += min;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        return min;
    }

    public int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        byte[] bArr = new byte[4];
        a(bArr);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bytes2int", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(byteOrder);
        int i17 = wrap.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bytes2int", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readInt", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        return i17;
    }

    public short c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readShort", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        byte[] bArr = new byte[2];
        a(bArr);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bytes2short", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        wrap.order(byteOrder);
        short s17 = wrap.getShort();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bytes2short", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readShort", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        return s17;
    }

    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        int i17 = this.f469993f.f469995c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        return i17;
    }

    public void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
        z34.f fVar = this.f469993f;
        int length = z34.f.a(fVar).length;
        fVar.f469995c = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl$ELFHeaderImpl");
    }
}
