package px1;

/* loaded from: classes12.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final px1.b f358860a;

    /* renamed from: b, reason: collision with root package name */
    public static final px1.s f358861b;

    /* renamed from: c, reason: collision with root package name */
    public static final px1.c f358862c;

    /* renamed from: d, reason: collision with root package name */
    public static final px1.j f358863d;

    /* renamed from: e, reason: collision with root package name */
    public static final px1.i f358864e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.ArrayList f358865f;

    static {
        px1.b bVar = new px1.b();
        f358860a = bVar;
        px1.s sVar = new px1.s();
        f358861b = sVar;
        px1.c cVar = new px1.c();
        f358862c = cVar;
        px1.j jVar = new px1.j();
        f358863d = jVar;
        f358864e = new px1.i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f358865f = arrayList;
        arrayList.add(bVar);
        arrayList.add(cVar);
        arrayList.add(jVar);
        arrayList.add(sVar);
    }

    public static void a(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, px1.m mVar, px1.u... uVarArr) {
        for (px1.u uVar : uVarArr) {
            if (mVar == uVar) {
                return;
            }
        }
        mVar.f(wXRTEditText, null, null);
    }

    public static void b(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, px1.u... uVarArr) {
        a(wXRTEditText, f358864e, uVarArr);
        a(wXRTEditText, f358862c, uVarArr);
        a(wXRTEditText, f358863d, uVarArr);
        a(wXRTEditText, f358861b, uVarArr);
    }
}
