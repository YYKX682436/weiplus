package t00;

/* loaded from: classes8.dex */
public final class a0 implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t00.y f414262a = new t00.y(null);

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414345z;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean Vi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Vi();
        com.tencent.mars.xlog.Log.i("MicroMsg.GetEcsSectionDataActionHandler", "handleAction: " + data + ",switchOn:" + Vi);
        if (!Vi) {
            callback.a();
            return;
        }
        x02.h Bi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Bi();
        if (Bi == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetEcsSectionDataActionHandler", "orderAndCardCgiMgr is null");
            callback.a();
            return;
        }
        bw5.z7 a17 = f414262a.a(data);
        if (a17 == null || a17.f35846f.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqScene:$");
            sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f35845e) : null);
            sb6.append(" section list isEmpty");
            com.tencent.mars.xlog.Log.w("MicroMsg.GetEcsSectionDataActionHandler", sb6.toString());
            callback.a();
            return;
        }
        t00.z zVar = new t00.z(callback, c01.id.c(), a17);
        byte[] byteArray = a17.toByteArray();
        x02.d dVar = new x02.d();
        dVar.f450978e = zVar;
        long cppPointer = ((x02.i) Bi).getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_7522.UR_3A2B.UR_8E47(cppPointer, byteArray, dVar);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
