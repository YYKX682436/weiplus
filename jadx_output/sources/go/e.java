package go;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f273705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        super(0);
        this.f273705d = f9Var;
        this.f273706e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var = this.f273705d;
        f9Var.j1(2);
        java.lang.String str = this.f273706e;
        f9Var.u1(str);
        f9Var.r1(4);
        f9Var.f1(8388608);
        f9Var.setType(10002);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.nfi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        f9Var.d1(r26.b0.b("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"tmpl_type_auto_translation_sys_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[" + string + "]]></template>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        "));
        f9Var.e1(c01.id.c());
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertEnabledSysTip() insertSysTip talker:" + str);
        c01.w9.x(f9Var);
        return jz5.f0.f302826a;
    }
}
