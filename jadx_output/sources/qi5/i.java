package qi5;

/* loaded from: classes.dex */
public final class i extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f363819d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f363820e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f363821f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f363822g;

    public i(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f363819d = activity;
        this.f363820e = jz5.h.b(qi5.e.f363813d);
        this.f363821f = new java.util.ArrayList();
        this.f363822g = jz5.h.b(new qi5.h(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010f, code lost:
    
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.Continuation, java.lang.Object, kotlinx.coroutines.a1] */
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlinx.coroutines.flow.j a(v65.i r23, ym3.c r24) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi5.i.a(v65.i, ym3.c):kotlinx.coroutines.flow.j");
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f363821f;
        arrayList.clear();
        p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
        g17.f352657d = dm.i2.W.j("conversationboxservice");
        g17.f352659f = kz5.b0.c(new g95.v());
        p75.l0 a17 = g17.a();
        jz5.g gVar = this.f363822g;
        boolean d17 = com.tencent.mm.ui.contact.i5.d(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), 4);
        boolean d18 = com.tencent.mm.ui.contact.i5.d(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), 16);
        java.util.Iterator it = ((java.util.ArrayList) a17.l(((jm0.l) ((jz5.n) this.f363820e).getValue()).Q4())).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!d17 || !com.tencent.mm.storage.z3.R4(str)) {
                if (!d18 || com.tencent.mm.storage.z3.R4(str)) {
                    if (!r26.n0.D(str, ",", false, 2, null)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactDataSource", "onCreate  contactListSize=" + arrayList.size());
    }
}
