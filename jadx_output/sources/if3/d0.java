package if3;

/* loaded from: classes5.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f291164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f291165e;

    public d0(java.util.Map map, long j17) {
        this.f291164d = map;
        this.f291165e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String string;
        for (java.util.Map.Entry entry : this.f291164d.entrySet()) {
            java.lang.String talker = (java.lang.String) entry.getKey();
            long longValue = ((java.lang.Number) entry.getValue()).longValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertSysTip masMsgId:");
            long j17 = this.f291165e;
            sb6.append(j17);
            sb6.append(", talker:");
            sb6.append(talker);
            sb6.append(", svrId:");
            sb6.append(longValue);
            com.tencent.mars.xlog.Log.i("MassSysTipHelper", sb6.toString());
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(2);
            f9Var.u1(talker);
            f9Var.r1(4);
            f9Var.f1(8388608);
            kotlin.jvm.internal.o.g(talker, "talker");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"tmpl_type_masssend_sys_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[");
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m6a);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (gm0.j1.a()) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(talker, true);
                java.lang.Integer valueOf = n17 != null ? java.lang.Integer.valueOf(n17.I) : null;
                if (valueOf != null && valueOf.intValue() == 1) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m6b);
                    kotlin.jvm.internal.o.d(string);
                } else if (valueOf != null && valueOf.intValue() == 2) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m6c);
                    kotlin.jvm.internal.o.d(string);
                } else {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m6d);
                    kotlin.jvm.internal.o.d(string);
                }
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m6d);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
            objArr[0] = string;
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            sb7.append(format);
            sb7.append(" $massend_msg_native_url$]]></template>\n                  <link_list>\n                    <link name=\"massend_msg_native_url\" type=\"link_massend_url\">\n                      <title>");
            sb7.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.m6_));
            sb7.append("</title>\n                      <masssend_newxml_info>\n                        <newmsgid>");
            sb7.append(j17);
            sb7.append("</newmsgid>\n                      </masssend_newxml_info>\n                    </link>\n                  </link_list>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        ");
            f9Var.d1(r26.b0.b(sb7.toString()));
            f9Var.o1(longValue);
            f9Var.e1(c01.w9.m(talker, c01.id.c() / 1000));
            f9Var.setType(10002);
            c01.w9.x(f9Var);
        }
    }
}
