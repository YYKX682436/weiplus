package oz4;

/* loaded from: classes12.dex */
public class m extends oz4.p<java.lang.Boolean, oz4.n> {

    /* renamed from: a, reason: collision with root package name */
    public final oz4.r f350287a = new oz4.r();

    @Override // oz4.v
    public int b() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [oz4.m, oz4.p] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.util.SparseIntArray] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.SparseIntArray] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    @Override // oz4.p
    public void f(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, mz4.t tVar, java.lang.Object obj) {
        int i17;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Editable text = wXRTEditText.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        oz4.r rVar = this.f350287a;
        rVar.f350298a.clear();
        ?? sparseIntArray = new android.util.SparseIntArray();
        ?? sparseIntArray2 = new android.util.SparseIntArray();
        java.util.ArrayList<oz4.o> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        boolean z17 = true;
        int i18 = 1;
        int i19 = 0;
        while (i19 < size) {
            oz4.o oVar = paragraphs.get(i19);
            java.util.ArrayList d17 = oz4.w.f350320f.d(text, oVar, oz4.u.EXACT);
            if (d17.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it = d17.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (next instanceof oz4.h) {
                        i17 += ((java.lang.Integer) ((oz4.h) next).getValue()).intValue();
                    }
                }
            }
            sparseIntArray.put(i18, i17);
            java.util.ArrayList d18 = d(text, oVar, oz4.u.SPAN_FLAGS);
            rVar.b(d18, oVar);
            boolean isEmpty = d18.isEmpty() ^ z17;
            if (oVar.d(tVar)) {
                isEmpty = bool.booleanValue();
            }
            if ((i19 <= 0 || oVar.c() != z17 || paragraphs.get(i19 + (-1)).c() != z17 || bool.booleanValue()) ? false : z17) {
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
                rVar.f350298a.add(new oz4.q(new oz4.n(i27, mz4.b.b(), oVar.a(), oVar.f350293f, oVar.f350294g), oVar, false));
                oz4.w.f350318d.g(text, oVar, rVar);
                oz4.w.f350317c.g(text, oVar, rVar);
            }
            i18++;
            i19++;
            z17 = true;
        }
        rVar.a(text);
    }
}
