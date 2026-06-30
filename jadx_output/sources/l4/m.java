package l4;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f315730a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315731b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f315732c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f315733d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.Executor f315734e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.concurrent.Executor f315735f;

    /* renamed from: g, reason: collision with root package name */
    public p4.e f315736g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f315737h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f315739j;

    /* renamed from: l, reason: collision with root package name */
    public java.util.Set f315741l;

    /* renamed from: i, reason: collision with root package name */
    public boolean f315738i = true;

    /* renamed from: k, reason: collision with root package name */
    public final l4.p f315740k = new l4.p();

    public m(android.content.Context context, java.lang.Class cls, java.lang.String str) {
        this.f315732c = context;
        this.f315730a = cls;
        this.f315731b = str;
    }

    public l4.m a(m4.a... aVarArr) {
        if (this.f315741l == null) {
            this.f315741l = new java.util.HashSet();
        }
        for (m4.a aVar : aVarArr) {
            this.f315741l.add(java.lang.Integer.valueOf(aVar.f323394a));
            this.f315741l.add(java.lang.Integer.valueOf(aVar.f323395b));
        }
        l4.p pVar = this.f315740k;
        pVar.getClass();
        for (m4.a aVar2 : aVarArr) {
            int i17 = aVar2.f323394a;
            java.util.HashMap hashMap = pVar.f315745a;
            java.util.TreeMap treeMap = (java.util.TreeMap) hashMap.get(java.lang.Integer.valueOf(i17));
            if (treeMap == null) {
                treeMap = new java.util.TreeMap();
                hashMap.put(java.lang.Integer.valueOf(i17), treeMap);
            }
            int i18 = aVar2.f323395b;
            m4.a aVar3 = (m4.a) treeMap.get(java.lang.Integer.valueOf(i18));
            if (aVar3 != null) {
                aVar3.toString();
                aVar2.toString();
            }
            treeMap.put(java.lang.Integer.valueOf(i18), aVar2);
        }
        return this;
    }
}
