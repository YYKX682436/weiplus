package xx5;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public long f458030a;

    /* renamed from: b, reason: collision with root package name */
    public long f458031b;

    /* renamed from: c, reason: collision with root package name */
    public long f458032c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f458033d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f458034e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f458035f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f458036g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f458037h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f458038i = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f458039j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f458040k = new java.util.ArrayList();

    public java.lang.String a(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return "{}";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((xx5.c) it.next()).toString());
        }
        return "{" + android.text.TextUtils.join(";", arrayList) + "}";
    }
}
