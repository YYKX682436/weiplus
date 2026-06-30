package vc;

@j95.b
/* loaded from: classes9.dex */
public final class s extends i95.w implements wc.o, wc.m {
    public int wi() {
        com.tencent.kinda.gen.FingerType fingerType = new com.tencent.kinda.framework.app.KindaFingerprintImpl().getFingerType();
        if (fingerType != null) {
            return fingerType.ordinal();
        }
        return 0;
    }
}
