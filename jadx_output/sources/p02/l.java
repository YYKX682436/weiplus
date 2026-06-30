package p02;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f350403a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f350404b;

    /* renamed from: c, reason: collision with root package name */
    public int f350405c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f350406d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f350407e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f350408f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f350409g;

    /* renamed from: h, reason: collision with root package name */
    public long f350410h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f350411i;

    /* renamed from: j, reason: collision with root package name */
    public int f350412j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f350413k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f350414l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f350415m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f350416n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f350417o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f350418p;

    /* renamed from: q, reason: collision with root package name */
    public int f350419q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f350420r;

    public static void a(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("search_history_href", 0);
        sharedPreferences.edit().putString("search_history_list", sharedPreferences.getString("search_history_list", "").replace(android.util.Base64.encodeToString(str.getBytes(), 0) + ";", "")).commit();
    }

    public static java.util.List b(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = context.getSharedPreferences("search_history_href", 0).getString("search_history_list", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return arrayList;
        }
        int i17 = 0;
        for (java.lang.String str : string.split(";")) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                p02.l lVar = new p02.l();
                lVar.f350403a = 2;
                lVar.f350404b = new java.lang.String(android.util.Base64.decode(str, 0));
                i17++;
                lVar.f350412j = i17;
                arrayList.add(lVar);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            p02.l lVar2 = new p02.l();
            lVar2.f350403a = 1;
            arrayList.add(0, lVar2);
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        return (!(obj instanceof p02.l) || (str = ((p02.l) obj).f350404b) == null) ? super.equals(obj) : str.equals(this.f350404b);
    }
}
