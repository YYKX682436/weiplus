package e73;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f249952a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Collection f249953b;

    public k(int i17, java.util.Collection items, long j17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        items = (i18 & 2) != 0 ? kz5.p0.f313996d : items;
        kotlin.jvm.internal.o.g(items, "items");
        this.f249952a = i17;
        this.f249953b = items;
    }

    public final java.lang.String a(java.lang.String deviceId, java.lang.String networkStatus, int i17, int i18) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(networkStatus, "networkStatus");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<handofflist opcode=\"");
        sb6.append(this.f249952a);
        sb6.append("\" seq=\"<![CSEQ]>\" devicevirtualid=\"");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(deviceId.getBytes()));
        sb6.append("\" networkstatus=\"");
        java.lang.String lowerCase = networkStatus.toLowerCase();
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append("\" availablecount=\"");
        sb6.append(i17);
        sb6.append("\">");
        java.lang.String sb7 = sb6.toString();
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = sb7.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        int length = bytes.length;
        byte[] bytes2 = "</handofflist>".getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        int length2 = length + bytes2.length;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f249953b.iterator();
        while (it.hasNext()) {
            java.lang.String build = ((com.tencent.mm.plugin.handoff.model.HandOff) it.next()).build();
            byte[] bytes3 = build.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
            length2 += bytes3.length;
            if (length2 > i18) {
                break;
            }
            sb8.append(build);
        }
        return sb7 + '\n' + ((java.lang.Object) sb8) + "\n</handofflist>";
    }
}
