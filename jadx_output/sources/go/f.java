package go;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f273707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f273709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.storage.f9 f9Var, java.lang.String str, long j17) {
        super(0);
        this.f273707d = f9Var;
        this.f273708e = str;
        this.f273709f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var = this.f273707d;
        f9Var.j1(2);
        java.lang.String talker = this.f273708e;
        f9Var.u1(talker);
        f9Var.r1(4);
        f9Var.f1(8388608);
        f9Var.setType(10002);
        kotlin.jvm.internal.o.f(talker, "$talker");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.o57);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nfh);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        f9Var.d1(r26.b0.b("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"tmpl_type_auto_translation_sys_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[" + string2 + " $go_to_enable_native_url$]]></template>\n                  <link_list>\n\t\t\t\t\t<link name=\"go_to_enable_native_url\" type=\"link_auto_translation_url\">\n                      <title>" + string + "</title>\n                      <talker>" + talker + "</talker>\n                    </link>\n                  </link_list>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        "));
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        long j17 = this.f273709f;
        f9Var.e1(cj6.G2(talker, j17) + 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertSysTipAfter() insertSysTip msgId:" + j17 + ", talker:" + talker + ", svrId: null");
        c01.w9.x(f9Var);
        return jz5.f0.f302826a;
    }
}
