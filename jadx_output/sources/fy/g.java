package fy;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.g f267168d = new fy.g();

    public g() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        int i17;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        try {
            str = param.getString("pinyin");
        } catch (java.lang.Exception unused) {
            str = "";
        }
        try {
            i17 = param.getInt("contact_type");
        } catch (java.lang.Exception unused2) {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", "search_contacts_by_pinyin invoke pinyin " + str + " type " + i17);
        kotlin.jvm.internal.o.d(str);
        if (str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(ya.b.SUCCESS, false);
            jSONObject.put("error_message", "pinyin is required");
            onComplete.invoke(jSONObject);
        } else {
            o13.z zVar = (o13.z) i95.n0.c(o13.z.class);
            p13.u uVar = new p13.u();
            uVar.f351141c = str;
            uVar.f351140b = 16;
            uVar.f351145g = new int[]{131072};
            uVar.f351153o = 1;
            uVar.f351151m = new fy.f(onComplete);
            ((com.tencent.mm.plugin.fts.d0) zVar).sj(2, uVar);
        }
        return jz5.f0.f302826a;
    }
}
