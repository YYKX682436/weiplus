package xk0;

/* loaded from: classes10.dex */
public final class n extends yk0.a {
    public final android.graphics.Rect G;
    public final java.lang.String H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f454997J;
    public final jz5.g K;
    public final jz5.g L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, android.graphics.Matrix matrix, java.lang.String id6, android.graphics.Rect layerRect, android.graphics.Rect maxInteractRect, android.graphics.Rect safeInteractRect, java.lang.String filePath, java.lang.String str) {
        super(context, matrix, id6, layerRect, maxInteractRect, false, false);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(layerRect, "layerRect");
        kotlin.jvm.internal.o.g(maxInteractRect, "maxInteractRect");
        kotlin.jvm.internal.o.g(safeInteractRect, "safeInteractRect");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.G = safeInteractRect;
        this.H = filePath;
        this.I = str;
        this.K = jz5.h.b(new xk0.m(this, layerRect));
        this.L = jz5.h.b(new xk0.l(this));
        this.f454957o = 0.0f;
    }

    @Override // yk0.a
    public java.lang.String F() {
        return "MicroMsg.PictureItem[" + hashCode() + ']';
    }

    public final android.graphics.Bitmap H() {
        java.lang.Object value = ((jz5.n) this.L).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.graphics.Bitmap) value;
    }

    public final android.util.Size I() {
        return (android.util.Size) ((jz5.n) this.K).getValue();
    }

    @Override // yk0.a, xk0.f
    public void i(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.i(canvas);
        if ((H().isRecycled() || (bitmap = this.f454952g) == null || kotlin.jvm.internal.o.b(bitmap, H()) || this.f454952g.isRecycled()) ? false : true) {
            H().recycle();
        }
    }

    @Override // xk0.f
    public android.graphics.Bitmap p() {
        if (this.f454952g == null) {
            this.f454952g = H();
        }
        F();
        this.f454952g.hashCode();
        H().hashCode();
        android.graphics.Bitmap mEmojiBoxBmp = this.f454952g;
        kotlin.jvm.internal.o.f(mEmojiBoxBmp, "mEmojiBoxBmp");
        return mEmojiBoxBmp;
    }

    @Override // xk0.f
    public java.lang.String q() {
        return hashCode() + '_' + this.H;
    }
}
