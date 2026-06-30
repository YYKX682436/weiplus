package tu1;

/* loaded from: classes13.dex */
public final class h implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f422099d;

    public h(tu1.o oVar) {
        this.f422099d = oVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(it, "it");
        android.os.Bundle data = it.getData();
        if (data != null) {
            byte b17 = data.getByte("data_type");
            byte[] byteArray = data.getByteArray("data_data");
            if (!(byteArray != null)) {
                byteArray = null;
            }
            if (byteArray != null) {
                tu1.o oVar = this.f422099d;
                if (b17 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "onVideoFrame Ready");
                    wu1.c cVar = oVar.f422126q;
                    if (cVar != null) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar.b(b17, byteArray, (byte) 0));
                        num = valueOf.intValue() != 0 ? valueOf : null;
                        if (num != null) {
                            num.intValue();
                            xu1.c cVar2 = xu1.c.f457196m;
                            oVar.f422127r = cVar2;
                            yz5.l lVar = oVar.f422128s;
                            if (lVar != null) {
                                lVar.invoke(cVar2);
                            }
                        }
                    }
                } else if (b17 == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScreenCastManager", "onAudioFrame Ready");
                    wu1.c cVar3 = oVar.f422126q;
                    if (cVar3 != null) {
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cVar3.b(b17, byteArray, (byte) 0));
                        num = valueOf2.intValue() != 0 ? valueOf2 : null;
                        if (num != null) {
                            num.intValue();
                            xu1.c cVar4 = xu1.c.f457196m;
                            oVar.f422127r = cVar4;
                            yz5.l lVar2 = oVar.f422128s;
                            if (lVar2 != null) {
                                lVar2.invoke(cVar4);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
