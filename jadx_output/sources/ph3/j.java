package ph3;

/* loaded from: classes14.dex */
public class j implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph3.k f354422d;

    public j(ph3.k kVar) {
        this.f354422d = kVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        ph3.k kVar = this.f354422d;
        switch (i17) {
            case 1:
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayer", "%s call prepared ", kVar.m());
                ph3.d dVar = kVar.f354429g;
                if (dVar == null) {
                    return false;
                }
                dVar.onPrepared();
                return false;
            case 2:
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayer", "%s call completion ", kVar.m());
                ph3.d dVar2 = kVar.f354429g;
                if (dVar2 == null) {
                    return false;
                }
                dVar2.onCompletion();
                return false;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayer", "%s call seek completion ", kVar.m());
                ph3.d dVar3 = kVar.f354429g;
                if (dVar3 == null) {
                    return false;
                }
                dVar3.onSeekComplete();
                return false;
            case 4:
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayer", "%s call video size changed size [%d, %d] degrees[%d]", kVar.m(), java.lang.Integer.valueOf(message.arg1), java.lang.Integer.valueOf(message.arg2), java.lang.Integer.valueOf(((java.lang.Integer) message.obj).intValue()));
                ph3.d dVar4 = kVar.f354429g;
                if (dVar4 == null) {
                    return false;
                }
                dVar4.a(message.arg1, message.arg2, ((java.lang.Integer) message.obj).intValue());
                return false;
            case 5:
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoPlayer", "%s call play error [%d, %d]", kVar.m(), java.lang.Integer.valueOf(message.arg1), java.lang.Integer.valueOf(message.arg2));
                ph3.d dVar5 = kVar.f354429g;
                if (dVar5 == null) {
                    return false;
                }
                dVar5.onError(message.arg1, message.arg2);
                return false;
            case 6:
                try {
                    ph3.k.j(kVar);
                    return false;
                } catch (java.lang.Exception unused) {
                    return false;
                }
            default:
                com.tencent.mars.xlog.Log.w("MicroMsg.VideoPlayer", "%s it has no idea for msg %d ", kVar.m(), java.lang.Integer.valueOf(i17));
                return false;
        }
    }
}
