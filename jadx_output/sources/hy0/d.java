package hy0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy0.i f285804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hy0.i iVar) {
        super(0);
        this.f285804d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Rect rect = new android.graphics.Rect();
        hy0.i iVar = this.f285804d;
        android.text.TextPaint textPaint = (android.text.TextPaint) ((jz5.n) iVar.f285851n).getValue();
        jz5.g gVar = iVar.f285847j;
        textPaint.getTextBounds((java.lang.String) ((jz5.n) gVar).getValue(), 0, ((java.lang.String) ((jz5.n) gVar).getValue()).length(), rect);
        return rect;
    }
}
