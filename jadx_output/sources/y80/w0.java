package y80;

/* loaded from: classes8.dex */
public final class w0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y80.y0 f459947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ za3.d f459949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f459950g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z80.p0 f459951h;

    public w0(y80.y0 y0Var, android.content.Context context, za3.d dVar, java.util.Map map, z80.p0 p0Var) {
        this.f459947d = y0Var;
        this.f459948e = context;
        this.f459949f = dVar;
        this.f459950g = map;
        this.f459951h = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f459948e;
        kotlin.jvm.internal.o.d(g4Var);
        y80.y0 y0Var = this.f459947d;
        y0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        z80.p0 p0Var = this.f459951h;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = p0Var.f470655a;
        za3.d dVar = this.f459949f;
        java.util.Map d17 = dVar.d(locationInfo);
        java.util.Map map = this.f459950g;
        map.putAll(d17);
        java.lang.Object[] objArr = !com.tencent.mm.sdk.platformtools.a0.c() || y0Var.Ni(map);
        int i17 = y0Var.f459959d;
        if (objArr != false) {
            sb6.append("com.tencent.map|");
            g4Var.b(i17, com.tencent.mm.R.string.juc, 0);
        }
        int i18 = i17 + 1;
        int Ai = y0Var.Ai();
        if ((Ai == 1 || Ai == 2) == true) {
            int i19 = i18;
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.String str2 = (java.lang.String) entry.getValue();
                if (!kotlin.jvm.internal.o.b(str, "com.tencent.map")) {
                    sb6.append(str);
                    sb6.append("|");
                    g4Var.g(i19, str2, 0);
                }
                i19++;
            }
            y0Var.Ui(context, g4Var, p0Var, i19, sb6);
        } else {
            java.util.Iterator it = ((java.util.ArrayList) dVar.e(p0Var.f470655a, true, true)).iterator();
            int i27 = i18;
            while (it.hasNext()) {
                com.tencent.mm.plugin.location.ui.impl.f0 f0Var = (com.tencent.mm.plugin.location.ui.impl.f0) it.next();
                if (!kotlin.jvm.internal.o.b(f0Var.f144813e, "com.tencent.map")) {
                    sb6.append(f0Var.f144813e);
                    sb6.append("|");
                    g4Var.g(i27, f0Var.f144811c, 0);
                }
                i27++;
            }
            y0Var.Ui(context, g4Var, p0Var, i27, sb6);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (objArr != false) {
            int Di = y0Var.Di("com.tencent.map");
            boolean Ni = y0Var.Ni(map);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(Di);
            sb7.append(':');
            sb7.append(Ni ? 1 : 0);
            arrayList.add(sb7.toString());
        }
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry2.getKey();
            if (!kotlin.jvm.internal.o.b(str3, "com.tencent.map")) {
                arrayList.add(y0Var.Di(str3) + ":1");
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("navigate_the_software_status", kz5.n0.g0(arrayList, "#", null, null, 0, null, null, 62, null));
        linkedHashMap.toString();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50243, "view_exp", y0Var.Bi(linkedHashMap), 34048);
    }
}
