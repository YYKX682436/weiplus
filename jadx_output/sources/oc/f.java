package oc;

/* loaded from: classes14.dex */
public final class f extends android.os.Handler {
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i17 = message.what;
        oc.h hVar = oc.g.f344101a;
        if (i17 == 2) {
            mc.p.f325531a.b("TuringSdkHelper", "turing face timeout " + hVar.f344111j);
            hVar.f344108g = true;
            oc.h.b(hVar);
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                mc.p.f325531a.e("TuringSdkHelper", "error event");
                return;
            }
            mc.q qVar = mc.p.f325531a;
            qVar.b("TuringSdkHelper", "wait frame image check is time out");
            qVar.b("TuringSdkHelper", "remove compare check all listener");
            if (hVar.f344110i != null) {
                hVar.f344110i.removeMessages(4);
            }
        }
    }
}
