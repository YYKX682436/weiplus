package yd;

/* loaded from: classes7.dex */
public class b extends yd.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd.e f460917a;

    public b(yd.e eVar) {
        this.f460917a = eVar;
    }

    @Override // yd.y
    public void a() {
        yd.e eVar = this.f460917a;
        eVar.f460947i = true;
        eVar.f460939a.getProvider().jf("window.__wxjs_environment = \"miniprogram\";");
        java.lang.String e17 = ik1.f.e("wxa_library/vconsole-wxjs.js");
        if (e17 != null) {
            eVar.f460939a.getProvider().jf(e17);
        }
        eVar.f460939a.getJsBridgeComponentDelegate().L();
        java.util.LinkedList linkedList = eVar.f460946h;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = eVar.f460946h.iterator();
        while (it.hasNext()) {
            eVar.b((java.lang.String) it.next());
        }
        eVar.f460946h.clear();
    }
}
