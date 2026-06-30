package df5;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.l f232128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f232129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f232130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f232131g;

    public i(df5.l lVar, int i17, java.util.List list, java.util.List list2) {
        this.f232128d = lVar;
        this.f232129e = i17;
        this.f232130f = list;
        this.f232131g = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actualContainerWidth;
        df5.l lVar = this.f232128d;
        actualContainerWidth = lVar.getActualContainerWidth();
        if (actualContainerWidth <= 0 || actualContainerWidth == this.f232129e) {
            return;
        }
        java.util.List b17 = lVar.b(this.f232130f, actualContainerWidth);
        if (kotlin.jvm.internal.o.b(b17, this.f232131g)) {
            return;
        }
        lVar.removeAllViews();
        ((java.util.LinkedHashMap) lVar.f232159o).clear();
        ((java.util.ArrayList) lVar.f232160p).clear();
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            lVar.addView(lVar.c((java.util.List) it.next()));
        }
    }
}
