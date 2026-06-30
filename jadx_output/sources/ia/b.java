package ia;

/* loaded from: classes13.dex */
public class b extends d3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.TextPaint f289868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3.p f289869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ia.c f289870c;

    public b(ia.c cVar, android.text.TextPaint textPaint, d3.p pVar) {
        this.f289870c = cVar;
        this.f289868a = textPaint;
        this.f289869b = pVar;
    }

    @Override // d3.p
    public void c(int i17) {
        ia.c cVar = this.f289870c;
        cVar.a();
        cVar.f289881k = true;
        this.f289869b.c(i17);
    }

    @Override // d3.p
    public void d(android.graphics.Typeface typeface) {
        ia.c cVar = this.f289870c;
        cVar.f289882l = android.graphics.Typeface.create(typeface, cVar.f289873c);
        cVar.d(this.f289868a, typeface);
        cVar.f289881k = true;
        this.f289869b.d(typeface);
    }
}
