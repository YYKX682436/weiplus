package tz1;

/* loaded from: classes13.dex */
public abstract class a {
    public static void a(java.lang.Object obj) {
        ey1.b bVar;
        if (obj == null || !sz1.a.m(obj)) {
            return;
        }
        try {
            java.lang.Class<?> cls = obj.getClass();
            if (!cls.isAnnotationPresent(ey1.b.class) || (bVar = (ey1.b) cls.getAnnotation(ey1.b.class)) == null) {
                return;
            }
            cy1.a Ui = cy1.a.Ui();
            iy1.c pageId = bVar.pageId();
            int policy = bVar.policy();
            int routeRule = bVar.routeRule();
            Ui.ak(obj, pageId);
            Ui.gk(obj, null);
            Ui.ik(obj, policy, routeRule);
            cy1.a.Ui().Rj(obj, bVar.bizGroupId());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Amoeba.AnnotationUtils", "[checkPage] throw Exception : " + e17.getMessage());
        }
    }
}
