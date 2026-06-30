package z00;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final z00.a f468925a = new z00.a();

    public static final java.lang.String a(int i17) {
        java.lang.String str = ".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_product_info";
        if (i17 != 0) {
            str = ".msg.appmsg.mmreader.template_header.ecs_kf_template_msg_product_info" + i17;
        }
        return str + ".product_card";
    }

    public final bw5.m7 a(java.util.Map map, java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 0;
        do {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".itemList");
            if (i17 != 0) {
                sb6.append(i17);
            }
            java.lang.String sb7 = sb6.toString();
            java.lang.String str2 = (java.lang.String) map.get(sb7 + ".key");
            java.lang.String str3 = (java.lang.String) map.get(sb7 + ".bypass");
            java.lang.String str4 = (java.lang.String) map.get(sb7 + ".level");
            if (str2 == null || str2.length() == 0) {
                if (str3 == null || str3.length() == 0) {
                    if (str4 == null || str4.length() == 0) {
                        break;
                    }
                }
            }
            if (!(str2 == null || str2.length() == 0)) {
                bw5.l7 l7Var = new bw5.l7();
                l7Var.f29670d = str2;
                boolean[] zArr = l7Var.f29673g;
                zArr[1] = true;
                if (!(str3 == null || str3.length() == 0)) {
                    byte[] bytes = str3.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    l7Var.f29671e = com.tencent.mm.protobuf.g.b(bytes);
                    zArr[2] = true;
                }
                l7Var.f29672f = com.tencent.mm.sdk.platformtools.t8.P(str4, 0);
                zArr[3] = true;
                linkedList.add(l7Var);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductInfoXmlParser", "parseCgiPreloadInfo: itemList[%d] missing key, skip. prefix=%s", java.lang.Integer.valueOf(i17), str);
            }
            i17++;
        } while (i17 <= 16);
        if (linkedList.isEmpty()) {
            return null;
        }
        bw5.m7 m7Var = new bw5.m7();
        m7Var.f30097d = linkedList;
        m7Var.f30098e[1] = true;
        return m7Var;
    }
}
