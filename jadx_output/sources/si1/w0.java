package si1;

/* loaded from: classes7.dex */
public class w0 implements si1.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Collection f408297d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Collection f408298e;

    static {
        new si1.w0();
    }

    public w0() {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f408297d = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        this.f408298e = hashSet2;
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.sensor.c.class);
        hashSet.add(com.tencent.mm.plugin.appbrand.jsapi.sensor.i.class);
        hashSet.add(yc1.p.class);
        hashSet2.add(vb1.m.class);
        hashSet2.add(nd1.d.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.g0.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.x.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.y.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.d2.class);
        hashSet2.add(com.tencent.mm.plugin.appbrand.jsapi.audio.k0.class);
    }

    @Override // si1.r0
    public boolean J2(java.lang.Class cls) {
        if (cls == null) {
            return false;
        }
        return ((java.util.HashSet) this.f408298e).contains(cls) || ((java.util.HashSet) this.f408297d).contains(cls);
    }

    @Override // si1.r0
    public boolean N4(com.tencent.mm.plugin.appbrand.jsapi.h hVar) {
        if (hVar == null) {
            return false;
        }
        return J2(hVar.getClass());
    }
}
