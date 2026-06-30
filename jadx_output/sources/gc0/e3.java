package gc0;

/* loaded from: classes5.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f270157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f270158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f270160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270161h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270162i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270163m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.nl5 f270164n;

    public e3(kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.nl5 nl5Var) {
        this.f270157d = c0Var;
        this.f270158e = h0Var;
        this.f270159f = str;
        this.f270160g = j17;
        this.f270161h = str2;
        this.f270162i = str3;
        this.f270163m = str4;
        this.f270164n = nl5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.c0 c0Var = this.f270157d;
        boolean z17 = c0Var.f310112d;
        java.lang.String str = this.f270159f;
        kotlin.jvm.internal.h0 h0Var = this.f270158e;
        if (!z17) {
            ((com.tencent.mm.storage.f9) h0Var.f310123d).j1(2);
            ((com.tencent.mm.storage.f9) h0Var.f310123d).u1(str);
            ((com.tencent.mm.storage.f9) h0Var.f310123d).r1(4);
            ((com.tencent.mm.storage.f9) h0Var.f310123d).f1(8388608);
            ((com.tencent.mm.storage.f9) h0Var.f310123d).setType(10002);
        }
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) h0Var.f310123d;
        r45.nl5 nl5Var = this.f270164n;
        long j17 = nl5Var.getLong(2);
        r45.kl5 kl5Var = (r45.kl5) nl5Var.getCustom(0);
        java.lang.String string = kl5Var != null ? kl5Var.getString(0) : null;
        r45.kl5 kl5Var2 = (r45.kl5) nl5Var.getCustom(1);
        java.lang.String string2 = kl5Var2 != null ? kl5Var2.getString(1) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"tmpl_type_recommend_remark_sys_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[");
        sb6.append(this.f270161h);
        sb6.append(" $remark_msg_native_url$]]></template>\n                  <link_list>\n\t\t\t\t\t<link name=\"remark_msg_native_open_image_url\" type=\"link_recommend_remark_open_image\">\n                      <title>");
        sb6.append(this.f270163m);
        sb6.append("</title>\n                      <remarksend_newxml_info>\n                        <talker>");
        sb6.append(str);
        sb6.append("</talker>\n\t\t\t\t\t\t<img_msg_id>");
        sb6.append(j17);
        sb6.append("</img_msg_id>\n                      </remarksend_newxml_info>\n                    </link>\n                    <link name=\"remark_msg_native_url\" type=\"link_recommend_remark_url\">\n                      <title>");
        sb6.append(this.f270162i);
        sb6.append("</title>\n                      <remarksend_newxml_info>\n                        <msgid>");
        long j18 = this.f270160g;
        sb6.append(j18);
        sb6.append("</msgid>\n                        <talker>");
        sb6.append(str);
        sb6.append("</talker>\n                        <remark>");
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        sb6.append("</remark>\n\t\t\t\t\t\t<phone>");
        if (string2 == null) {
            string2 = "";
        }
        sb6.append(string2);
        sb6.append("</phone>\n\t\t\t\t\t\t<img_msg_id>");
        sb6.append(j17);
        sb6.append("</img_msg_id>\n                      </remarksend_newxml_info>\n                    </link>\n                  </link_list>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        ");
        f9Var.d1(r26.b0.b(sb6.toString()));
        ((com.tencent.mm.storage.f9) h0Var.f310123d).e1(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().G2(str, j18) + 2);
        if (c0Var.f310112d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemarkSysTipHelper", "updateSysTip masMsgId:" + j18 + ", talker:" + str + ", svrId: null");
            c01.w9.C((com.tencent.mm.storage.f9) h0Var.f310123d);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemarkSysTipHelper", "insertSysTip masMsgId:" + j18 + ", talker:" + str + ", svrId: null");
        c01.w9.x((com.tencent.mm.storage.f9) h0Var.f310123d);
    }
}
