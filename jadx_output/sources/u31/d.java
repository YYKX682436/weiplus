package u31;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.net.InetAddress f424255a;

    /* renamed from: b, reason: collision with root package name */
    public final int f424256b;

    /* renamed from: c, reason: collision with root package name */
    public final int f424257c;

    public d(java.net.InetAddress inetAddress, int i17, int i18) {
        this.f424255a = inetAddress;
        this.f424256b = i17;
        this.f424257c = i18;
    }

    public static u31.d a(java.lang.String str) {
        java.lang.String[] split;
        java.net.InetAddress byName;
        if (str != null && (split = str.split(":")) != null && split.length == 3) {
            try {
                java.lang.String str2 = split[0];
                if (com.tencent.mm.sdk.platformtools.a2.a(str2)) {
                    byName = java.net.InetAddress.getByName(str2);
                } else {
                    if (!com.tencent.mm.sdk.platformtools.a2.b(str2)) {
                        throw new java.net.UnknownHostException("invalid ipv4 or ipv6 dotted string");
                    }
                    byName = java.net.InetAddress.getByName(str2);
                }
                return new u31.d(byName, java.lang.Integer.parseInt(split[1]), java.lang.Integer.parseInt(split[2]));
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.InAddress", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return null;
    }

    public java.lang.String toString() {
        int i17 = this.f424257c;
        return this.f424255a.getHostAddress() + ":" + this.f424256b + "(" + (i17 == 2 ? "dns" : i17 == 3 ? "svrdns" : i17 == 4 ? "waphc" : i17 == 5 ? "newdns" : i17 == 6 ? "auth" : i17 == 7 ? "debug" : "hc") + ")";
    }
}
