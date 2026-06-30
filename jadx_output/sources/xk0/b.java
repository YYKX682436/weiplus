package xk0;

/* loaded from: classes10.dex */
public final class b extends xk0.o {
    public final android.util.Size M;
    public boolean N;
    public final jz5.g P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, android.text.SpannableString spannableString, int i17, int i18, java.lang.String str2, boolean z17, boolean z18, android.util.Size placeHolderBitmapSize) {
        super(context, matrix, str, rect, rect2, spannableString, i17, i18, str2, z17, z18);
        kotlin.jvm.internal.o.g(placeHolderBitmapSize, "placeHolderBitmapSize");
        this.M = placeHolderBitmapSize;
        this.N = placeHolderBitmapSize.getWidth() > 0 && placeHolderBitmapSize.getHeight() > 0;
        this.P = jz5.h.b(new xk0.a(this));
    }

    @Override // xk0.o, yk0.a
    public java.lang.String F() {
        return "MicroMsg.AsyncStickerTextItem-" + hashCode();
    }

    @Override // xk0.o
    public void H(android.graphics.Bitmap bitmap, java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        super.H(bitmap, text);
        if (bitmap != null) {
            this.N = false;
            jz5.g gVar = this.P;
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            if (((android.graphics.Bitmap) value).isRecycled()) {
                return;
            }
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.graphics.Bitmap) value2).recycle();
        }
    }

    @Override // xk0.o, xk0.f
    public android.graphics.Bitmap p() {
        if (this.N) {
            java.lang.Object value = ((jz5.n) this.P).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            return (android.graphics.Bitmap) value;
        }
        android.graphics.Bitmap bitmap = this.f454952g;
        if (bitmap != null) {
            return bitmap;
        }
        android.graphics.Bitmap p17 = super.p();
        kotlin.jvm.internal.o.f(p17, "getEmojiBitmap(...)");
        return p17;
    }
}
