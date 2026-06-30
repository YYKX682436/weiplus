package oz4;

/* loaded from: classes12.dex */
public class c extends oz4.p<java.lang.Boolean, oz4.d> {

    /* renamed from: a, reason: collision with root package name */
    public final oz4.r f350275a = new oz4.r();

    @Override // oz4.v
    public int b() {
        return 1;
    }

    @Override // oz4.p
    public void f(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText, mz4.t tVar, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Spannable text = wXRTEditText.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        oz4.r rVar = this.f350275a;
        rVar.f350298a.clear();
        java.util.ArrayList<oz4.o> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        int i17 = 0;
        while (i17 < size) {
            oz4.o oVar = paragraphs.get(i17);
            java.util.ArrayList d17 = d(text, oVar, oz4.u.SPAN_FLAGS);
            rVar.b(d17, oVar);
            boolean z17 = !d17.isEmpty();
            if (oVar.d(tVar)) {
                z17 = bool.booleanValue();
            }
            if (i17 > 0 && oVar.c() == 1 && paragraphs.get(i17 + (-1)).c() == 1 && !bool.booleanValue()) {
                z17 = false;
            }
            if (z17) {
                rVar.f350298a.add(new oz4.q(new oz4.d(mz4.b.b(), oVar.a(), oVar.f350293f, oVar.f350294g), oVar, false));
                oz4.w.f350319e.g(text, oVar, rVar);
                oz4.w.f350317c.g(text, oVar, rVar);
            }
            i17++;
        }
        rVar.a(text);
    }
}
