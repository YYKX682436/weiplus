package qh1;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f363414f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, java.lang.String str2, int i17) {
        super(1);
        this.f363412d = str;
        this.f363413e = str2;
        this.f363414f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.ArrayList arrayList = ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).f303239q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (next instanceof i50.m) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(1, 3, this.f363412d, size, this.f363413e);
        qh1.c.f363419d.wi(this.f363414f);
        return jz5.f0.f302826a;
    }
}
