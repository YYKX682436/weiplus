package s7;

/* loaded from: classes16.dex */
public class z2 extends s7.d3 {

    /* renamed from: a, reason: collision with root package name */
    public float f403913a;

    /* renamed from: b, reason: collision with root package name */
    public float f403914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f403915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(s7.f3 f3Var, float f17, float f18) {
        super(f3Var, null);
        this.f403915c = f3Var;
        this.f403913a = f17;
        this.f403914b = f18;
    }

    @Override // s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f403915c;
        if (f3Var.W()) {
            s7.b3 b3Var = f3Var.f403657d;
            if (b3Var.f403595b) {
                f3Var.f403654a.drawText(str, this.f403913a, this.f403914b, b3Var.f403597d);
            }
            s7.b3 b3Var2 = f3Var.f403657d;
            if (b3Var2.f403596c) {
                f3Var.f403654a.drawText(str, this.f403913a, this.f403914b, b3Var2.f403598e);
            }
        }
        this.f403913a += f3Var.f403657d.f403597d.measureText(str);
    }
}
