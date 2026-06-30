package lx;

/* loaded from: classes9.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f321943e;

    public s3(yz5.l lVar, java.util.List list) {
        this.f321942d = lVar;
        this.f321943e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.util.List list = this.f321943e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yw.h1.f466332a.h((java.lang.String) it.next()));
        }
        this.f321942d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
    }
}
