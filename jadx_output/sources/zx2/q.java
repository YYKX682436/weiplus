package zx2;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx2.t f477063d;

    public q(zx2.t tVar) {
        this.f477063d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx2.t tVar = this.f477063d;
        int childCount = tVar.getChildCount();
        if (childCount % 2 == 0) {
            return;
        }
        int i17 = childCount / 2;
        int paddingStart = tVar.getPaddingStart();
        int paddingEnd = tVar.getPaddingEnd();
        com.tencent.mars.xlog.Log.i("Finder.CustomTabLayout", " startPadding:" + paddingStart + " endPadding:" + paddingEnd);
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < i17; i27++) {
            i19 += tVar.getChildAt(i27).getWidth() + paddingStart;
        }
        while (true) {
            i17++;
            if (i17 >= childCount) {
                break;
            } else {
                i18 += tVar.getChildAt(i17).getWidth() + paddingEnd;
            }
        }
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = tVar.f477080p;
        if (i19 > i18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" add right padding:");
            int i28 = (paddingEnd + i19) - i18;
            sb6.append(i28);
            com.tencent.mars.xlog.Log.i("Finder.CustomTabLayout", sb6.toString());
            int i29 = finderTabLayout.f133104h;
            int i37 = finderTabLayout.f133105i;
            int i38 = finderTabLayout.f133107n;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.v0.k(tVar, i29, i37, i28, i38);
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" add left padding:");
        int i39 = (paddingStart + i18) - i19;
        sb7.append(i39);
        com.tencent.mars.xlog.Log.i("Finder.CustomTabLayout", sb7.toString());
        int i47 = finderTabLayout.f133105i;
        int i48 = finderTabLayout.f133106m;
        int i49 = finderTabLayout.f133107n;
        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
        n3.v0.k(tVar, i39, i47, i48, i49);
    }
}
