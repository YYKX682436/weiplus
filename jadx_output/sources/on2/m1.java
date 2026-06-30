package on2;

/* loaded from: classes3.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f346969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(on2.a2 a2Var) {
        super(0);
        this.f346969d = a2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int height;
        on2.a2 a2Var = this.f346969d;
        if (a2Var.f346830m) {
            float height2 = a2Var.getHEIGHT();
            float width = a2Var.getWIDTH();
            if (height2 > width) {
                height2 = width;
            }
            height = (int) (height2 - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz));
        } else {
            height = (int) (a2Var.getHEIGHT() * (ae2.in.f3688a.h0() / 100.0f));
        }
        return java.lang.Integer.valueOf(height);
    }
}
