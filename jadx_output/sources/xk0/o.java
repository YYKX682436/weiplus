package xk0;

/* loaded from: classes10.dex */
public class o extends yk0.a implements xk0.h {
    public final cm5.m G;
    public final int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f454998J;
    public boolean K;
    public android.text.SpannableString L;

    public o(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, android.text.SpannableString spannableString, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        super(context, matrix, str, rect, rect2, z17, z18);
        this.H = -1;
        this.I = -65536;
        this.f454998J = false;
        this.K = true;
        cm5.l lVar = new cm5.l(context);
        this.G = lVar;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        lVar.f43449c = str2;
        this.H = i17;
        this.L = spannableString;
        this.I = i18;
    }

    @Override // yk0.a
    public java.lang.String F() {
        return "MicroMsg.StickerTextItem-" + hashCode();
    }

    @Override // yk0.a
    public boolean G() {
        if (this.L != null) {
            return !com.tencent.mm.sdk.platformtools.t8.K0(r0.toString());
        }
        return false;
    }

    public void H(android.graphics.Bitmap bitmap, java.lang.String str) {
        int i17;
        int i18;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.i(F(), "replaceBitmap: new bitmap null");
            return;
        }
        android.graphics.Bitmap bitmap2 = this.f454952g;
        if (bitmap2 != null) {
            i17 = bitmap2.getWidth();
            i18 = this.f454952g.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i(F(), "replaceBitmap: old size[%d,%d], new size[%d,%d], text=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), str);
        this.f454952g = bitmap;
        this.L = new android.text.SpannableString(str);
    }

    @Override // xk0.h
    public xk0.q a() {
        return new xk0.q(this.H, this.I, this.f454998J, this.K, this.L);
    }

    @Override // xk0.h
    public void b(int i17) {
        this.G.f43450d = i17;
    }

    @Override // xk0.h
    public void c(boolean z17) {
        this.f454998J = z17;
    }

    @Override // xk0.f
    public void clear() {
        com.tencent.mars.xlog.Log.i(F(), "clear");
        super.clear();
        this.L = new android.text.SpannableString("");
    }

    @Override // xk0.h
    public void d(boolean z17) {
        this.K = z17;
    }

    @Override // xk0.h
    public boolean e() {
        return false;
    }

    @Override // xk0.f
    public android.graphics.Bitmap p() {
        return this.G.c(this.L, this.H, this.I, this.f454998J, this.K);
    }

    @Override // xk0.h
    public void setTextSize(float f17) {
        F();
        this.G.f43448b = f17;
    }

    @Override // yk0.a
    public float z(float f17) {
        if (f17 <= 0.0f) {
            return 1.0f;
        }
        return f17;
    }
}
