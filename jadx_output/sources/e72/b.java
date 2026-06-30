package e72;

/* loaded from: classes14.dex */
public class b implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public short[] f249886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e72.e f249887b;

    public b(e72.e eVar) {
        this.f249887b = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceVoiceRecordLogic", "onRecError state = " + i17 + " detailState = " + i18);
        e72.e eVar = this.f249887b;
        com.tencent.mm.vfs.w6.h(eVar.f249893c);
        e72.d dVar = eVar.f249891a;
        if (dVar != null) {
            ((e72.u) dVar).a(2);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        int i18;
        short[] sArr = this.f249886a;
        if (sArr == null || sArr.length < i17 / 2) {
            this.f249886a = new short[i17 / 2];
        }
        int i19 = 0;
        while (true) {
            i18 = i17 / 2;
            if (i19 >= i18) {
                break;
            }
            int i27 = i19 * 2;
            this.f249886a[i19] = (short) ((bArr[i27 + 1] << 8) | (bArr[i27] & 255));
            i19++;
        }
        short[] sArr2 = this.f249886a;
        e72.e eVar = this.f249887b;
        eVar.getClass();
        for (int i28 = 0; i28 < i18; i28++) {
            short s17 = sArr2[i28];
            if (s17 > eVar.f249897g) {
                eVar.f249897g = s17;
            }
        }
        e72.d dVar = eVar.f249891a;
        if (dVar != null) {
            ((e72.u) dVar).a(1);
            com.tencent.mm.vfs.w6.h(eVar.f249893c);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceVoiceRecordLogic", "mVoiceSilentDetectAPI is null");
    }
}
