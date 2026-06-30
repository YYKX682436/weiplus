package hh1;

/* loaded from: classes.dex */
public class c extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f281454f = jz5.h.b(hh1.a.f281452d);

    @Override // lc3.c0
    public java.lang.String f() {
        return "postMessageToWeApp";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("bizName");
        java.lang.String optString2 = data.optString("eventName");
        java.lang.String optString3 = data.optString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        int length = optString3 != null ? optString3.length() : 0;
        if ((optString3 == null || optString3.length() == 0) || length <= ((java.lang.Number) ((jz5.n) f281454f).getValue()).intValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiPostMessageToWeApp", "bizName: " + optString + ", eventName: " + optString2 + ", message: " + optString3);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiPostMessageToWeApp", "bizName: " + optString + ", eventName: " + optString2 + ", message too long: " + length);
        }
        boolean z17 = optString == null || optString.length() == 0;
        lc3.z zVar = lc3.x.f317937d;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "has no bizName");
            s().invoke(j(zVar, "has no bizName"));
            return;
        }
        if (optString2 == null || optString2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "has no eventName");
            s().invoke(j(zVar, "has no eventName"));
            return;
        }
        jz5.l[] lVarArr = new jz5.l[3];
        kotlin.jvm.internal.o.d(optString);
        lVarArr[0] = new jz5.l("bizName", optString);
        kotlin.jvm.internal.o.d(optString2);
        lVarArr[1] = new jz5.l("eventName", optString2);
        if (optString3 == null) {
            optString3 = "";
        }
        lVarArr[2] = new jz5.l(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, optString3);
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        lc3.e eVar = this.f317890a;
        if (eVar instanceof hq0.i) {
            kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.biz.IMagicCardStarterSclBizClass");
            ((hq0.b0) ((hq0.i) eVar)).O1("postMessageToWeApp", i17, new hh1.b(this));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "only support starter biz");
            s().invoke(j(zVar, "only support starter biz"));
        }
    }
}
