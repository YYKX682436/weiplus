package qi5;

/* loaded from: classes.dex */
public final class m extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f363828d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f363829e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f363830f;

    public m(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f363828d = activity;
        this.f363829e = jz5.h.b(qi5.j.f363823d);
        this.f363830f = new java.util.ArrayList();
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
        throw new UnsupportedOperationException("Method not decompiled: qi5.m.a(v65.i, ym3.c):kotlinx.coroutines.flow.j");
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList = this.f363830f;
        arrayList.clear();
        p75.n0 n0Var = dm.i2.K;
        p75.d dVar = dm.i2.L;
        p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
        g17.f352657d = dVar.p("'%@kefu.openim'");
        g17.f352659f = kz5.b0.c(new g95.v());
        java.util.Iterator it = g17.a().l(((jm0.l) ((jz5.n) this.f363829e).getValue()).Q4()).iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) it.next());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKeFuDataSource", "onCreate  contactListSize=" + arrayList.size());
    }
}
