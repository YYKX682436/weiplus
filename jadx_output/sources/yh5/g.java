package yh5;

/* loaded from: classes12.dex */
public final class g extends lf3.n implements qf3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f462432d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f462433e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.BitSet f462434f;

    /* renamed from: g, reason: collision with root package name */
    public int f462435g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f462432d = kz5.p0.f313996d;
        this.f462433e = new int[0];
        this.f462434f = new java.util.BitSet();
        this.f462435g = -1;
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        java.util.List list;
        java.util.BitSet bitSet;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("CleanMediaDataProvider", "fetch");
        mf3.f fVar = new mf3.f();
        java.lang.String str = "";
        java.lang.String stringExtra = intent.getStringExtra("clean_gallery_target_file_path");
        yh5.a aVar = yh5.a.f462419a;
        synchronized (aVar) {
            list = yh5.a.f462420b;
        }
        synchronized (aVar) {
            bitSet = yh5.a.f462421c;
        }
        this.f462434f = bitSet;
        java.lang.Iterable Z0 = kz5.n0.Z0(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((kz5.v0) Z0).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.Object obj = ((kz5.u0) next).f314016b;
            if (((bw1.l) obj).f24810b == 1 || ((bw1.l) obj).f24810b == 3) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add((bw1.l) ((kz5.u0) it6.next()).f314016b);
        }
        this.f462432d = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((kz5.u0) it7.next()).f314015a));
        }
        this.f462433e = kz5.n0.R0(arrayList3);
        com.tencent.mars.xlog.Log.i("CleanMediaDataProvider", "data size=" + this.f462432d.size() + " displayToOrigin=" + this.f462433e.length);
        for (bw1.l lVar : this.f462432d) {
            yh5.h hVar = new yh5.h(lVar);
            fVar.add(hVar);
            if (kotlin.jvm.internal.o.b(stringExtra, lVar.f24812d)) {
                this.f462435g = fVar.size() - 1;
                str = hVar.getId();
            }
        }
        com.tencent.mars.xlog.Log.i("CleanMediaDataProvider", "enterId=" + str + " selection=" + this.f462435g);
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, false);
        listener.T3(this.f462435g);
        return true;
    }
}
