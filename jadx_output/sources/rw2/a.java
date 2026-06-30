package rw2;

/* loaded from: classes10.dex */
public final class a implements kp4.s0 {
    @Override // kp4.s0
    public rm5.k a(kp4.a trackInfo, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(trackInfo, "trackInfo");
        if (!(trackInfo instanceof rw2.k)) {
            throw new java.lang.IllegalStateException("trackInfo is not TPTrackThumbInfo".toString());
        }
        if (obj instanceof kk4.h) {
            return new rw2.j((rw2.k) trackInfo, (kk4.h) obj);
        }
        throw new java.lang.IllegalStateException("not set resourceLoader".toString());
    }
}
