package z34;

/* loaded from: classes13.dex */
public class f implements z34.h {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f469994b;

    /* renamed from: c, reason: collision with root package name */
    public int f469995c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final z34.i f469996d;

    public f(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        this.f469994b = bArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        int min = java.lang.Math.min(bArr.length - this.f469995c, 16);
        java.lang.System.arraycopy(bArr, this.f469995c, bArr2, 0, min);
        this.f469995c += min;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        if (min != 16) {
            throw new z34.g("Error reading elf header (read " + min + "bytes, expected to read 16bytes).");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMagicNumber", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        byte[] bArr3 = {bArr2[0], bArr2[1], bArr2[2], bArr2[3]};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMagicNumber", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        if (!java.util.Arrays.equals(bArr3, z34.h.f469997a)) {
            throw new z34.g("Bad magic number for file.");
        }
        this.f469996d = new z34.e(this);
    }

    public static /* synthetic */ byte[] a(z34.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        byte[] bArr = fVar.f469994b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.device.utils.ua.odex.ELFDataParser$ELFFileImpl");
        return bArr;
    }
}
