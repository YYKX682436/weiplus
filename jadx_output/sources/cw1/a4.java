package cw1;

/* loaded from: classes12.dex */
public final class a4 implements kn5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f222729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw1.b4 f222730b;

    public a4(cw1.q4 q4Var, cw1.b4 b4Var) {
        this.f222729a = q4Var;
        this.f222730b = b4Var;
    }

    @Override // kn5.g
    public void a(android.view.MotionEvent motionEvent, android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        cw1.q4 q4Var = this.f222729a;
        cw1.h4 h4Var = q4Var.f223275q;
        java.util.BitSet bitSet = q4Var.f223269h;
        cw1.b4 b4Var = this.f222730b;
        h4Var.f222964a = bitSet.get(b4Var.f222813d);
        q4Var.f223276r.f(true, b4Var.getAdapterPosition());
    }

    @Override // kn5.g
    public boolean b(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18, android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        if (f17 == 0.0f) {
            return false;
        }
        a(null, v17);
        return false;
    }
}
