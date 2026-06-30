package gl5;

/* loaded from: classes15.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f273048a = new android.graphics.Path();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f273049b;

    /* renamed from: c, reason: collision with root package name */
    public int f273050c;

    /* renamed from: d, reason: collision with root package name */
    public int f273051d;

    /* renamed from: e, reason: collision with root package name */
    public long f273052e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.RectF f273053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f273054g;

    public o(gl5.e0 e0Var) {
        this.f273054g = e0Var;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f273049b = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    public final void a(boolean z17) {
        gl5.e0 e0Var = this.f273054g;
        if (e0Var.U.getLayout() == null) {
            return;
        }
        if (this.f273053f == null) {
            this.f273053f = new android.graphics.RectF();
        }
        this.f273048a.computeBounds(this.f273053f, false);
        int compoundPaddingLeft = e0Var.U.getCompoundPaddingLeft();
        int extendedPaddingTop = e0Var.U.getExtendedPaddingTop() + e0Var.U.L(true);
        if (z17) {
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            android.graphics.RectF rectF = this.f273053f;
            customTextView.postInvalidateOnAnimation(((int) rectF.left) + compoundPaddingLeft, ((int) rectF.top) + extendedPaddingTop, compoundPaddingLeft + ((int) rectF.right), extendedPaddingTop + ((int) rectF.bottom));
        } else {
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView2 = e0Var.U;
            android.graphics.RectF rectF2 = this.f273053f;
            customTextView2.postInvalidate((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        }
    }
}
