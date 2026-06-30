package t00;

/* loaded from: classes9.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f414348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(java.util.LinkedList linkedList) {
        super(1);
        this.f414348d = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bw5.l7 l7Var = new bw5.l7();
        if (it.has("key")) {
            l7Var.f29670d = it.get("key").toString();
            boolean[] zArr = l7Var.f29673g;
            zArr[1] = true;
            int i17 = 0;
            if (it.has("bypass")) {
                java.lang.Object obj2 = it.get("bypass");
                if (obj2 instanceof java.lang.String) {
                    if (((java.lang.CharSequence) obj2).length() > 0) {
                        byte[] bytes = ((java.lang.String) obj2).getBytes(r26.c.f368865a);
                        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                        l7Var.f29671e = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
                        zArr[2] = true;
                    }
                } else if (obj2 instanceof org.json.JSONObject) {
                    byte[] bytes2 = obj2.toString().getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                    l7Var.f29671e = new com.tencent.mm.protobuf.g(bytes2, 0, bytes2.length);
                    zArr[2] = true;
                }
            }
            try {
                if (it.has(ya.b.LEVEL)) {
                    i17 = it.getInt(ya.b.LEVEL);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetInt", "", e17);
            }
            l7Var.f29672f = i17;
            zArr[3] = true;
            this.f414348d.add(l7Var);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TryPreloadDataActionHandler", "invalid itemListItem, key is null");
        }
        return jz5.f0.f302826a;
    }
}
