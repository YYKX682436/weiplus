package zv;

/* loaded from: classes9.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f476138e;

    public y2(yz5.l lVar, java.util.List list) {
        this.f476137d = lVar;
        this.f476138e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.util.List list = this.f476138e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zv.q.f476079a.d((java.lang.String) it.next()));
        }
        this.f476137d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
    }
}
