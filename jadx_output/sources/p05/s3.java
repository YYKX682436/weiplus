package p05;

/* loaded from: classes5.dex */
public final class s3 implements rh0.y {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.s3 f350688a = new p05.s3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f350689b = kz5.c1.k(new jz5.l("MODEL_OCR_DET", 3), new jz5.l("MODEL_OCR_REC_MODEL", 3), new jz5.l("MODEL_OCR_REC_MAP", 2));

    public boolean a(java.util.ArrayList keys) {
        boolean z17;
        kotlin.jvm.internal.o.g(keys, "keys");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = keys.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            kotlin.jvm.internal.o.d(str);
            hashMap.put(str, f350689b.get(str));
        }
        p05.t3 t3Var = p05.u3.f350699d;
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        do {
            z17 = true;
            if (!it6.hasNext()) {
                return true;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it6.next();
            java.lang.String a17 = t3Var.a((java.lang.String) entry.getKey(), (java.lang.Integer) entry.getValue());
            if (a17 != null && a17.length() != 0) {
                z17 = false;
            }
        } while (!z17);
        return false;
    }

    public java.lang.String b(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.String a17 = p05.u3.f350699d.a(key, (java.lang.Integer) f350689b.get(key));
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisResourceManager", "Resource : " + key + ", path: " + a17);
        return a17;
    }

    public void c(java.util.ArrayList keys) {
        kotlin.jvm.internal.o.g(keys, "keys");
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_c42c04f5");
        qVar.f217548e.addAll(keys);
        java.util.LinkedList linkedList = qVar.f217549f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
        vVar.d("wevision_version");
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        vVar.c(tq5.i.f421269a);
        vVar.e(1);
        arrayList.add(vVar);
        linkedList.addAll(arrayList);
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, null);
    }
}
