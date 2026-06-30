package com.tencent.mm.plugin.zero;

@j95.b
/* loaded from: classes7.dex */
public class k0 extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FixupLoadVoipSoService", "[tomys] Load voip so and its dependencies.");
        fp.d0.o("voipComm");
        fp.d0.o("voipCodec");
    }
}
