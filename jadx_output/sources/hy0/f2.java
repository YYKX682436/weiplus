package hy0;

/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy0.p2 f285815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(hy0.p2 p2Var) {
        super(0);
        this.f285815d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(((java.lang.Number) ((jz5.n) this.f285815d.f285942t).getValue()).intValue());
        textPaint.setTextSize((int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 8));
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        return textPaint;
    }
}
