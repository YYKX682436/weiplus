package tu0;

/* loaded from: classes5.dex */
public class i extends tu0.h {

    /* renamed from: h, reason: collision with root package name */
    public int f422086h;

    /* renamed from: i, reason: collision with root package name */
    public int f422087i;

    public final void b() {
        java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(this.f422085g.o(), true);
        B.seek(0L);
        int i17 = this.f422086h;
        int i18 = this.f422087i;
        long C = 36 + this.f422085g.C();
        long j17 = i17;
        long j18 = ((i17 * 16) * i18) / 8;
        B.write(new byte[]{82, 73, 70, 70, (byte) (C & 255), (byte) ((C >> 8) & 255), (byte) ((C >> 16) & 255), (byte) ((C >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 0, 0, 0, 1, 0, (byte) i18, 0, (byte) (j17 & 255), (byte) ((j17 >> 8) & 255), (byte) ((j17 >> 16) & 255), (byte) ((j17 >> 24) & 255), (byte) (j18 & 255), (byte) ((j18 >> 8) & 255), (byte) ((j18 >> 16) & 255), (byte) ((j18 >> 24) & 255), (byte) (i18 * 2), 0, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 0, 100, 97, 116, 97, (byte) (r5 & 255), (byte) ((r5 >> 8) & 255), (byte) ((r5 >> 16) & 255), (byte) ((r5 >> 24) & 255)});
        B.close();
    }

    @Override // tu0.h, tu0.f
    public void close() {
        super.close();
        try {
            b();
        } catch (java.io.IOException e17) {
            com.tencent.mm.sdk.platformtools.Log.c("Luggage.PCMAudioEncoder", "", e17);
        }
    }

    @Override // tu0.h, tu0.f
    public boolean init(java.lang.String str, int i17, int i18, int i19) {
        this.f422086h = i17;
        this.f422087i = i18;
        super.init(str, i17, i18, i19);
        return true;
    }
}
