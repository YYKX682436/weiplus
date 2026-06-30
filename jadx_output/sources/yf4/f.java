package yf4;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f461837a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Queue f461838b = new java.util.LinkedList();

    public f(java.lang.String str) {
        this.f461837a = str;
        java.util.ArrayList c17 = p35.b.c(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
        if (c17 == null || c17.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PushMessageExtension", "Parse Message Failed !");
            return;
        }
        for (int i17 = 0; i17 < c17.size(); i17++) {
            java.util.Map map = ((p35.b) c17.get(i17)).f351715i;
            if (map != null) {
                java.util.Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    this.f461838b.offer((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
                }
            }
        }
    }
}
