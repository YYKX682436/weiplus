package s7;

/* loaded from: classes16.dex */
public class y2 extends s7.z2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f403903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f403904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(s7.f3 f3Var, android.graphics.Path path, float f17, float f18) {
        super(f3Var, f17, f18);
        this.f403904e = f3Var;
        this.f403903d = path;
    }

    @Override // s7.z2, s7.d3
    public void b(java.lang.String str) {
        s7.f3 f3Var = this.f403904e;
        if (f3Var.W()) {
            s7.b3 b3Var = f3Var.f403657d;
            if (b3Var.f403595b) {
                f3Var.f403654a.drawTextOnPath(str, this.f403903d, this.f403913a, this.f403914b, b3Var.f403597d);
            }
            s7.b3 b3Var2 = f3Var.f403657d;
            if (b3Var2.f403596c) {
                f3Var.f403654a.drawTextOnPath(str, this.f403903d, this.f403913a, this.f403914b, b3Var2.f403598e);
            }
        }
        this.f403913a += f3Var.f403657d.f403597d.measureText(str);
    }
}
