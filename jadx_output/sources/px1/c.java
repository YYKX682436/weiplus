package px1;

/* loaded from: classes12.dex */
public class c extends px1.m<java.lang.Boolean, px1.d> {

    /* renamed from: a, reason: collision with root package name */
    public final px1.o f358819a = new px1.o();

    @Override // px1.u
    public int b() {
        return 1;
    }

    @Override // px1.m
    public void f(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, nx1.p pVar, java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.text.Spannable text = wXRTEditText.getText();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        px1.o oVar = this.f358819a;
        oVar.f358835a.clear();
        java.util.ArrayList<px1.l> paragraphs = wXRTEditText.getParagraphs();
        int size = paragraphs.size();
        int i17 = 0;
        while (i17 < size) {
            px1.l lVar = paragraphs.get(i17);
            java.util.ArrayList d17 = d(text, lVar, px1.r.SPAN_FLAGS);
            oVar.b(d17, lVar);
            boolean z17 = !d17.isEmpty();
            if (lVar.c(pVar)) {
                z17 = bool.booleanValue();
            }
            if (i17 > 0 && lVar.b() == 1 && paragraphs.get(i17 + (-1)).b() == 1 && !bool.booleanValue()) {
                z17 = false;
            }
            if (z17) {
                oVar.f358835a.add(new px1.n(new px1.d(nx1.q.b(), lVar.a(), lVar.f358830f, lVar.f358831g), lVar, false));
                px1.v.f358863d.g(text, lVar, oVar);
                px1.v.f358861b.g(text, lVar, oVar);
            }
            i17++;
        }
        oVar.a(text);
    }
}
