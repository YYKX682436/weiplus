package px1;

/* loaded from: classes12.dex */
public class j extends px1.m<java.lang.Boolean, px1.k> {

    /* renamed from: a, reason: collision with root package name */
    public final px1.o f358824a = new px1.o();

    @Override // px1.u
    public int b() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [px1.j, px1.m] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.util.SparseIntArray] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.SparseIntArray] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    @Override // px1.m
    public void f(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, nx1.p pVar, java.lang.Object obj) {
        int i17;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        px1.o oVar = this.f358824a;
        oVar.f358835a.clear();
        ?? sparseIntArray = new android.util.SparseIntArray();
        ?? sparseIntArray2 = new android.util.SparseIntArray();
        java.util.ArrayList<px1.l> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        boolean z17 = true;
        int i18 = 1;
        int i19 = 0;
        while (i19 < size) {
            px1.l lVar = paragraphs.get(i19);
            java.util.ArrayList d17 = px1.v.f358864e.d(text, lVar, px1.r.EXACT);
            if (d17.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it = d17.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (next instanceof px1.h) {
                        i17 += ((java.lang.Integer) ((px1.h) next).getValue()).intValue();
                    }
                }
            }
            sparseIntArray.put(i18, i17);
            java.util.ArrayList d18 = d(text, lVar, px1.r.SPAN_FLAGS);
            oVar.b(d18, lVar);
            boolean isEmpty = d18.isEmpty() ^ z17;
            if (lVar.c(pVar)) {
                isEmpty = bool.booleanValue();
            }
            if ((i19 <= 0 || lVar.b() != z17 || paragraphs.get(i19 + (-1)).b() != z17 || bool.booleanValue()) ? false : z17) {
                isEmpty = false;
            }
            if (isEmpty) {
                boolean z18 = z17;
                int i27 = z18;
                for (?? r86 = z18; r86 < i18; r86++) {
                    int i28 = sparseIntArray.get(r86);
                    int i29 = sparseIntArray2.get(r86);
                    if (i28 >= i17) {
                        if (i28 == i17) {
                            if (i29 != 0) {
                                i27 = i29 + 1;
                            }
                        }
                    }
                    i27 = 1;
                }
                sparseIntArray2.put(i18, i27);
                oVar.f358835a.add(new px1.n(new px1.k(i27, nx1.q.b(), lVar.a(), lVar.f358830f, lVar.f358831g), lVar, false));
                px1.v.f358862c.g(text, lVar, oVar);
                px1.v.f358861b.g(text, lVar, oVar);
            }
            i18++;
            i19++;
            z17 = true;
        }
        oVar.a(text);
    }
}
