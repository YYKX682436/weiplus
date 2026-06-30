package px1;

/* loaded from: classes12.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f358835a = new java.util.ArrayList();

    public void a(android.text.Spannable spannable) {
        java.util.Iterator it = this.f358835a.iterator();
        while (it.hasNext()) {
            px1.n nVar = (px1.n) it.next();
            px1.g gVar = nVar.f358832a;
            px1.l lVar = nVar.f358833b;
            int i17 = lVar.f341315d;
            int i18 = 34;
            if (nVar.f358834c) {
                int spanStart = spannable.getSpanStart(gVar);
                if (spanStart > -1 && spanStart < i17) {
                    spannable.setSpan(gVar.a(), spanStart, i17, 34);
                }
                spannable.removeSpan(gVar);
            } else {
                int i19 = lVar.f341316e;
                if (!lVar.f358831g || !lVar.a()) {
                    boolean z17 = lVar.f358831g;
                    if (z17 && lVar.f358830f) {
                        i18 = 18;
                    } else if (!z17) {
                        i18 = 33;
                    }
                }
                if (i19 > spannable.length()) {
                    i19 = spannable.length();
                }
                spannable.setSpan(gVar, i17, i19, i18);
            }
        }
    }

    public void b(java.util.ArrayList arrayList, px1.l lVar) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof px1.g) {
                this.f358835a.add(new px1.n(next, lVar, true));
            }
        }
    }
}
