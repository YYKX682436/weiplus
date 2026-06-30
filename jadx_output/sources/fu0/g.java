package fu0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final fu0.g f266778a = new fu0.g();

    public static final java.lang.Object a(fu0.g gVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        gVar.getClass();
        if (list.isEmpty()) {
            return kz5.p0.f313996d;
        }
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new iu0.f(list, new java.io.File(az0.i5.f15565i, "MJPublisher/ComposingCreation"), "default_effect_", null), continuation);
    }

    public static final java.util.List b(fu0.g gVar, java.util.List list) {
        java.lang.String str;
        gVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            try {
                i95.m c17 = i95.n0.c(q80.g0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                str = ((com.tencent.mm.feature.lite.i) ((q80.g0) c17)).zj("wxalite94c410838e79a4cecb3dcd66bc6054a3", 0L, str2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MJCC.DefaultMusic", "resolveLocalIdToPath: failed, error=" + e17.getMessage());
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            if (com.tencent.mm.vfs.w6.j(str2)) {
                arrayList.add(str2);
            } else {
                com.tencent.mars.xlog.Log.e("MJCC.DefaultMusic", "resolveAssetInfos: file not exists");
            }
        }
        return arrayList;
    }

    public static final void c(fu0.g gVar, yz5.l lVar, int i17, java.lang.String str) {
        gVar.getClass();
        com.tencent.mars.xlog.Log.e("MJCC.DefaultMusic", "sendError: errCode=" + i17 + ", errMsg=" + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", i17);
        jSONObject.put("errMsg", str);
        lVar.invoke(jSONObject);
    }
}
