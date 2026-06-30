package xk0;

/* loaded from: classes10.dex */
public class p extends xk0.f implements xk0.h {
    public final int A;
    public int B;
    public boolean C;
    public boolean D;
    public final android.text.SpannableString E;
    public final cm5.m F;

    public p(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, android.text.SpannableString spannableString, int i17, int i18, java.lang.String str2) {
        super(context, matrix, str, rect, rect2);
        this.A = -1;
        this.B = -65536;
        this.C = false;
        this.D = true;
        cm5.m mVar = new cm5.m(context);
        this.F = mVar;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        mVar.f43449c = str2;
        this.A = i17;
        this.E = spannableString;
        this.B = i18;
    }

    @Override // xk0.h
    public xk0.q a() {
        return new xk0.q(this.A, this.B, this.C, this.D, this.E);
    }

    @Override // xk0.h
    public void b(int i17) {
        this.F.f43450d = i17;
    }

    @Override // xk0.h
    public void c(boolean z17) {
        this.C = z17;
    }

    @Override // xk0.h
    public void d(boolean z17) {
        this.D = z17;
    }

    @Override // xk0.h
    public boolean e() {
        return true;
    }

    @Override // xk0.f
    public android.graphics.Bitmap p() {
        return this.F.c(this.E, this.A, this.B, this.C, this.D);
    }

    @Override // xk0.h
    public void setTextSize(float f17) {
        this.F.f43448b = f17;
    }
}
