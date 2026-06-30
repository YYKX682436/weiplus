package gr2;

/* loaded from: classes10.dex */
public final class a extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f274750d;

    public a(java.util.LinkedList colorList) {
        kotlin.jvm.internal.o.g(colorList, "colorList");
        this.f274750d = colorList;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        if (textPaint != null) {
            java.util.LinkedList linkedList = this.f274750d;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(zl2.q4.f473933a.O((java.lang.String) it.next())));
            }
            int[] R0 = kz5.n0.R0(arrayList);
            if (linkedList.size() >= 2) {
                textPaint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, textPaint.descent() - textPaint.ascent(), R0, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
                return;
            }
            java.lang.Integer M = kz5.z.M(R0);
            if (M != null) {
                textPaint.setColor(M.intValue());
            }
        }
    }
}
