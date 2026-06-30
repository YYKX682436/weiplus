package iw3;

/* loaded from: classes8.dex */
public final class c extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final iw3.c f295234d = new iw3.c();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        int i17;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        int hashCode = env.f340860a.hashCode();
        java.util.Map map = hw3.a.f285583a;
        java.util.HashMap hashMap = new java.util.HashMap();
        uc0.v vVar = (uc0.v) ((java.util.concurrent.ConcurrentHashMap) hw3.a.f285583a).get(java.lang.Integer.valueOf(hashCode));
        if (vVar != null) {
            int i18 = vVar.f426283c;
            r2 = i18 != 0 ? i18 : 32;
            int i19 = vVar.f426286f;
            if (i19 >= 0) {
                hashMap.put("selectedStartIndex", java.lang.Integer.valueOf(i19));
            }
            int i27 = vVar.f426287g;
            if (i27 >= 0) {
                hashMap.put("selectedEndIndex", java.lang.Integer.valueOf(i27));
            }
            str = vVar.f426281a;
            i17 = vVar.f426282b;
        } else {
            str = "";
            i17 = 0;
        }
        hashMap.put("content", str);
        hashMap.put("currentCharLength", java.lang.Integer.valueOf(i17));
        hashMap.put("maxCharLength", java.lang.Integer.valueOf(r2));
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetTextContent", "JsApi-Call: msg:%s", msg);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getTextContent";
    }
}
