package oo1;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final oo1.j f347145a = new oo1.j();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f347146b = jz5.h.b(oo1.i.f347144d);

    public final po1.d a() {
        java.lang.String u17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f347146b).getValue()).u("roam_at_device", "");
        kotlin.jvm.internal.o.d(u17);
        if (u17.length() == 0) {
            return new po1.d("deviceId@roam-at", po1.g.f357310h, "RoamATDevice", "", "", "primary", "");
        }
        po1.d b17 = po1.d.f357294i.b(u17);
        kotlin.jvm.internal.o.d(b17);
        return b17;
    }
}
