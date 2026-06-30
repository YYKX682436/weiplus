package ly4;

/* loaded from: classes12.dex */
public class i extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f322299i;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, ly4.j r8) {
        /*
            r2 = this;
            java.lang.String r0 = "xml"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "domain"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "sendTime"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "fromUserName"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "toUserName"
            kotlin.jvm.internal.o.g(r7, r0)
            r45.fr r0 = new r45.fr
            r0.<init>()
            r1 = 10002(0x2712, float:1.4016E-41)
            r0.f374555d = r1
            r0.f374556e = r6
            r0.f374557f = r7
            r45.ir r6 = new r45.ir
            r6.<init>()
            r6.f377276d = r3
            r0.f374567s = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r6 = 95
            r3.append(r6)
            java.lang.String r7 = r0.f374556e
            r3.append(r7)
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.f374558g = r3
            r45.cr r3 = new r45.cr
            r3.<init>()
            r3.f371797d = r4
            byte[] r3 = pm0.v.D(r3)
            com.tencent.mm.protobuf.g r4 = new com.tencent.mm.protobuf.g
            r4.<init>(r3)
            r0.f374560i = r4
            r3 = 22
            r2.<init>(r3, r0)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r8)
            r2.f322299i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly4.i.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ly4.j):void");
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.e("Byp.CgiBypSendPCRemind", "[onSendFailed] bizType=22 errCode:" + i18 + " errMsg:" + str);
        ly4.j jVar = (ly4.j) this.f322299i.get();
        if (jVar != null) {
            if (str == null) {
                str = "";
            }
            ly4.e eVar = (ly4.e) jVar;
            eVar.f322287g = false;
            eVar.f322288h = str;
            eVar.l(false);
        }
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSendPCRemind", "[onSendSuccessfully] bizType=22 msgSvrId=" + resp.f385130d);
        ly4.j jVar = (ly4.j) this.f322299i.get();
        if (jVar != null) {
            ly4.e eVar = (ly4.e) jVar;
            eVar.f322287g = true;
            eVar.l(true);
        }
    }
}
