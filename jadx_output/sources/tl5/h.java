package tl5;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final tl5.h f420349a = new tl5.h();

    static {
        new android.view.animation.LinearInterpolator();
    }

    public final tl5.e a(java.util.List list, long j17) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            for (tl5.e eVar : (java.util.List) it.next()) {
                if (eVar.f420344a.f420364c == j17) {
                    return eVar;
                }
            }
        }
        return null;
    }

    public final android.graphics.RectF b(android.graphics.RectF rectF, float f17, float f18, float f19, float f27, int i17, int i18, int i19) {
        float f28 = i17;
        float width = f17 + (i19 * (((f19 - 1.0f) * rectF.width()) + f28));
        float height = f18 + (i18 * (((f27 - 1.0f) * rectF.height()) + f28));
        float centerX = rectF.centerX() + width;
        float centerY = rectF.centerY() + height;
        float width2 = (rectF.width() * f19) / 2.0f;
        float height2 = (rectF.height() * f27) / 2.0f;
        return new android.graphics.RectF(centerX - width2, centerY - height2, centerX + width2, centerY + height2);
    }

    public final java.util.List c(java.util.List snapshots) {
        kotlin.jvm.internal.o.g(snapshots, "snapshots");
        if (snapshots.isEmpty()) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : snapshots) {
            if (true ^ ((tl5.j) obj).f420366e) {
                arrayList.add(obj);
            }
        }
        java.util.List<tl5.j> F0 = kz5.n0.F0(arrayList, mz5.a.a(tl5.f.f420347d, tl5.g.f420348d));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = null;
        int i17 = -1;
        for (tl5.j jVar : F0) {
            if (arrayList3 != null) {
                if (((tl5.e) arrayList3.get(0)).f420344a.f420362a.top == jVar.f420362a.top) {
                    arrayList3.add(new tl5.e(jVar, i17, arrayList3.size()));
                }
            }
            arrayList3 = new java.util.ArrayList();
            arrayList2.add(arrayList3);
            i17++;
            arrayList3.add(new tl5.e(jVar, i17, arrayList3.size()));
        }
        return arrayList2;
    }
}
