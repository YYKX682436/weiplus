package ej4;

/* loaded from: classes11.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f253345d;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f253349a;

    /* renamed from: b, reason: collision with root package name */
    public int f253350b;

    /* renamed from: c, reason: collision with root package name */
    public static final ej4.d0 f253344c = new ej4.d0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f253346e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedList f253347f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f253348g = "";

    public e0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f253349a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.TopicSelfItemHelper", "match Size " + r1 + ", " + r6.size() + ", " + r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.LinkedList r22) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ej4.e0.a(java.util.LinkedList):java.util.ArrayList");
    }

    public final void b(mj4.h hVar, java.util.ArrayList arrayList) {
        int c17 = c();
        int size = arrayList.size() - 1;
        android.content.Context context = this.f253349a;
        if (size >= c17 && size != 1) {
            fp.l.b(arrayList);
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            tj4.e eVar = ((com.tencent.mm.plugin.textstatus.ui.ac) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.ac.class)).f173731i;
            if (eVar != null) {
                eVar.f419829f = true;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        mj4.k kVar = (mj4.k) hVar;
        arrayList3.add(kVar.h());
        if (kVar.p().length() == 0) {
            arrayList2.add(bk4.e1.f21460a.d());
        } else {
            arrayList2.add(kVar.p());
        }
        java.lang.String r17 = i65.a.r(context, com.tencent.mm.R.string.lpf);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        arrayList.add(1, new tj4.a(r17, 0, arrayList3, arrayList2, xe0.j0.a(kVar, false, 1, null).f355225s, "0", kVar.f327067b.field_CreateTime));
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        tj4.e eVar2 = ((com.tencent.mm.plugin.textstatus.ui.ac) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.ac.class)).f173731i;
        if (eVar2 == null) {
            return;
        }
        eVar2.f419828e = true;
    }

    public final int c() {
        if (this.f253350b == 0) {
            android.content.Context context = this.f253349a;
            int b17 = i65.a.b(context, 68);
            int b18 = i65.a.b(context, 64);
            int b19 = com.tencent.mm.ui.bh.a(context).f197135a - i65.a.b(context, 72);
            int i17 = b19 / b17;
            int i18 = b19 / b18;
            if (i17 == i18) {
                this.f253350b = i17;
                f253345d = i65.a.b(context, 20);
            } else {
                int b27 = i65.a.b(context, 48);
                this.f253350b = i18;
                f253345d = (int) ((b19 / (i18 * 1.0f)) - b27);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopicSelfItemHelper", "getScreenSize >> " + this.f253350b + ' ' + f253345d);
        }
        int i19 = this.f253350b;
        if (i19 > 7) {
            return 7;
        }
        return i19;
    }
}
