package cw4;

@j95.b(dependencies = {c42.i.class})
/* loaded from: classes.dex */
public class r0 extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        nw4.d.f340815a.a();
        jz5.g gVar = yx4.b.f467972a;
        yw4.r rVar = yw4.r.f466990b;
        java.util.Map jsApiList = (java.util.Map) ((jz5.n) yx4.b.f467972a).getValue();
        kotlin.jvm.internal.o.g(jsApiList, "jsApiList");
        java.util.HashMap hashMap = (java.util.HashMap) yw4.r.f466991c;
        hashMap.clear();
        hashMap.putAll(jsApiList);
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.PluginWebView", "init DefaultJsApiPool");
    }
}
