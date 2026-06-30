package oz4;

/* loaded from: classes12.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final oz4.b f350315a;

    /* renamed from: b, reason: collision with root package name */
    public static final oz4.f f350316b;

    /* renamed from: c, reason: collision with root package name */
    public static final oz4.k f350317c;

    /* renamed from: d, reason: collision with root package name */
    public static final oz4.c f350318d;

    /* renamed from: e, reason: collision with root package name */
    public static final oz4.m f350319e;

    /* renamed from: f, reason: collision with root package name */
    public static final oz4.i f350320f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f350321g;

    static {
        oz4.b bVar = new oz4.b();
        f350315a = bVar;
        oz4.f fVar = new oz4.f();
        f350316b = fVar;
        oz4.k kVar = new oz4.k();
        f350317c = kVar;
        oz4.c cVar = new oz4.c();
        f350318d = cVar;
        oz4.m mVar = new oz4.m();
        f350319e = mVar;
        f350320f = new oz4.i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f350321g = arrayList;
        arrayList.add(bVar);
        arrayList.add(fVar);
        arrayList.add(cVar);
        arrayList.add(mVar);
        arrayList.add(kVar);
    }

    public static void a(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, oz4.p pVar, oz4.v... vVarArr) {
        for (oz4.v vVar : vVarArr) {
            if (pVar == vVar) {
                return;
            }
        }
        pVar.f(wXRTEditText, null, null);
    }

    public static void b(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, oz4.v... vVarArr) {
        a(wXRTEditText, f350320f, vVarArr);
        a(wXRTEditText, f350318d, vVarArr);
        a(wXRTEditText, f350319e, vVarArr);
        a(wXRTEditText, f350317c, vVarArr);
    }
}
