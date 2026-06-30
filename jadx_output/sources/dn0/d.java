package dn0;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f241828a = jz5.h.b(dn0.c.f241827d);

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f241829b;

    public final boolean a(dn0.a type) {
        kotlin.jvm.internal.o.g(type, "type");
        java.lang.Long l17 = this.f241829b;
        if (l17 == null) {
            com.tencent.mars.xlog.Log.e("MMSingReverb", "setReverb type: " + type);
            return false;
        }
        int SetType = ((com.tencent.mm.live.ap.karaoke.LiveDAFX) ((jz5.n) this.f241828a).getValue()).SetType(l17.longValue(), type.ordinal(), new float[0], 0);
        com.tencent.mars.xlog.Log.i("MMSingReverb", "setReverb res: " + SetType + " type: " + type);
        return SetType == 0;
    }
}
