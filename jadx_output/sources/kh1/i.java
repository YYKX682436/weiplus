package kh1;

/* loaded from: classes13.dex */
public class i extends kh1.h {

    /* renamed from: i, reason: collision with root package name */
    public int f307983i;

    /* renamed from: j, reason: collision with root package name */
    public int f307984j;

    @Override // kh1.h, kh1.e
    public void close() {
        super.close();
        try {
            f();
        } catch (java.io.IOException e17) {
            com.tencent.mm.sdk.platformtools.Log.c("Luggage.PCMAudioEncoder", "", e17);
        }
    }

    public final void f() {
        java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(this.f307982h.o(), true);
        B.seek(0L);
        int i17 = this.f307983i;
        int i18 = this.f307984j;
        long C = 36 + this.f307982h.C();
        long j17 = i17;
        long j18 = ((i17 * 16) * i18) / 8;
        B.write(new byte[]{82, 73, 70, 70, (byte) (C & 255), (byte) ((C >> 8) & 255), (byte) ((C >> 16) & 255), (byte) ((C >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 0, 0, 0, 1, 0, (byte) i18, 0, (byte) (j17 & 255), (byte) ((j17 >> 8) & 255), (byte) ((j17 >> 16) & 255), (byte) ((j17 >> 24) & 255), (byte) (j18 & 255), (byte) ((j18 >> 8) & 255), (byte) ((j18 >> 16) & 255), (byte) ((j18 >> 24) & 255), (byte) (i18 * 2), 0, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 0, 100, 97, 116, 97, (byte) (r5 & 255), (byte) ((r5 >> 8) & 255), (byte) ((r5 >> 16) & 255), (byte) ((r5 >> 24) & 255)});
        B.close();
    }

    @Override // kh1.h, kh1.e
    public boolean init(java.lang.String str, int i17, int i18, int i19) {
        this.f307983i = i17;
        this.f307984j = i18;
        super.init(str, i17, i18, i19);
        return true;
    }
}
