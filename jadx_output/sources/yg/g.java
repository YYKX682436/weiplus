package yg;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg.h f462060d;

    public g(yg.h hVar, yg.e eVar) {
        this.f462060d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        yg.h hVar = this.f462060d;
        synchronized (hVar.f462064a) {
            if (hVar.f462064a.f48577a != 0) {
                com.tencent.magicbrush.MBRuntime mBRuntime = hVar.f462064a;
                float[] nativeGetCurrentFps = mBRuntime.nativeGetCurrentFps(mBRuntime.f48577a);
                yg.a aVar = hVar.f462066c;
                float f17 = nativeGetCurrentFps[0];
                aVar.f462018a = f17;
                aVar.f462019b = nativeGetCurrentFps[1];
                int i17 = (int) nativeGetCurrentFps[2];
                aVar.f462020c = i17;
                int i18 = (int) nativeGetCurrentFps[3];
                aVar.f462021d = i18;
                aVar.f462022e = nativeGetCurrentFps[4];
                int i19 = (int) nativeGetCurrentFps[5];
                aVar.f462023f = i19;
                int i27 = (int) nativeGetCurrentFps[6];
                aVar.f462024g = i27;
                yg.f fVar = hVar.f462078o;
                fVar.f462050c += i17;
                fVar.f462051d += i18;
                fVar.f462053f += i19;
                fVar.f462054g += i27;
                if (hVar.f462074k) {
                    int i28 = hVar.f462075l + 1;
                    hVar.f462075l = i28;
                    if (i28 > hVar.f462076m) {
                        hVar.f462075l = 1;
                        if (hVar.f462077n) {
                            fVar.f462049b = 0;
                            fVar.f462048a = 0;
                        }
                    }
                    if (f17 < hVar.f462071h) {
                        fVar.f462049b++;
                    }
                    int size = ((java.util.LinkedList) hVar.f462072i).size();
                    int i29 = hVar.f462069f;
                    if (size >= i29 && i29 > 0) {
                        float f18 = (hVar.f462066c.f462018a * i29) + hVar.f462070g;
                        float f19 = hVar.f462073j;
                        if (f18 < f19) {
                            hVar.f462078o.f462048a++;
                        }
                        hVar.f462073j = f19 - ((java.lang.Float) ((java.util.LinkedList) hVar.f462072i).remove()).floatValue();
                    }
                    ((java.util.LinkedList) hVar.f462072i).add(java.lang.Float.valueOf(hVar.f462066c.f462018a));
                    hVar.f462073j += hVar.f462066c.f462018a;
                }
            }
        }
        yg.h hVar2 = this.f462060d;
        android.os.Handler handler = hVar2.f462067d;
        if (handler != null) {
            handler.postDelayed(hVar2.f462068e, 1000L);
        }
    }
}
