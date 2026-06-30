package ry1;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f401362a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f401363b = new java.util.HashMap();

    public void a(java.lang.String str, java.lang.Object obj) {
        if (u46.l.e(str) || obj == null) {
            return;
        }
        ((java.util.HashMap) this.f401363b).put(str, obj);
    }

    public void b(java.util.Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        ((java.util.HashMap) this.f401363b).putAll(map);
    }
}
