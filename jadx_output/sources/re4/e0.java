package re4;

/* loaded from: classes9.dex */
public class e0 implements zt5.e {
    public void a(int i17, java.lang.String str) {
        if (i17 == 104) {
            if (str != null && str.contains("Finger")) {
                if (!((wo.v1.f447828h.f447811b & 1) > 0)) {
                    return;
                }
            } else if (str != null && str.contains("Face")) {
                if (!((wo.v1.f447828h.f447811b & 2) > 0)) {
                    return;
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "8", "1", java.lang.String.valueOf(i17), str);
    }
}
