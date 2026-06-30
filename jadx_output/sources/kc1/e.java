package kc1;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f306286a;

    /* renamed from: b, reason: collision with root package name */
    public final float f306287b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f306288c;

    /* renamed from: d, reason: collision with root package name */
    public final kc1.d f306289d;

    /* renamed from: e, reason: collision with root package name */
    public final kc1.b f306290e;

    /* renamed from: f, reason: collision with root package name */
    public final kc1.a f306291f;

    public e(kc1.f fVar, float f17, float f18, kc1.d dVar, java.util.ArrayList arrayList, kc1.b bVar, kc1.a aVar) {
        this.f306286a = -1.0f;
        this.f306287b = -1.0f;
        this.f306288c = null;
        this.f306289d = null;
        this.f306290e = null;
        this.f306291f = null;
        this.f306286a = f17;
        this.f306287b = f18;
        this.f306288c = arrayList;
        this.f306289d = dVar;
        this.f306290e = bVar;
        this.f306291f = aVar;
    }

    public java.util.HashMap a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("x", java.lang.Float.valueOf(this.f306286a));
        hashMap.put("y", java.lang.Float.valueOf(this.f306287b));
        kc1.d dVar = this.f306289d;
        if (dVar != null) {
            dVar.getClass();
            java.util.HashMap hashMap2 = new java.util.HashMap(4);
            hashMap2.put("originX", java.lang.Float.valueOf(dVar.f306282a));
            hashMap2.put("originY", java.lang.Float.valueOf(dVar.f306283b));
            hashMap2.put("width", java.lang.Float.valueOf(dVar.f306284c));
            hashMap2.put("height", java.lang.Float.valueOf(dVar.f306285d));
            hashMap.put("detectRect", hashMap2);
        }
        java.util.ArrayList arrayList = this.f306288c;
        if (arrayList != null) {
            hashMap.put("pointArray", arrayList);
        }
        kc1.b bVar = this.f306290e;
        if (bVar != null) {
            bVar.getClass();
            java.util.HashMap hashMap3 = new java.util.HashMap(5);
            hashMap3.put("global", java.lang.Float.valueOf(bVar.f306270a));
            hashMap3.put("leftEye", java.lang.Float.valueOf(bVar.f306271b));
            hashMap3.put("rightEye", java.lang.Float.valueOf(bVar.f306272c));
            hashMap3.put("mouth", java.lang.Float.valueOf(bVar.f306273d));
            hashMap3.put("nose", java.lang.Float.valueOf(bVar.f306274e));
            hashMap.put("confArray", hashMap3);
        }
        kc1.a aVar = this.f306291f;
        if (aVar != null) {
            aVar.getClass();
            java.util.HashMap hashMap4 = new java.util.HashMap(3);
            hashMap4.put("pitch", java.lang.Float.valueOf(aVar.f306267a));
            hashMap4.put("roll", java.lang.Float.valueOf(aVar.f306268b));
            hashMap4.put("yaw", java.lang.Float.valueOf(aVar.f306269c));
            hashMap.put("angleArray", hashMap4);
        }
        return hashMap;
    }
}
