package re2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.e0 f394372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(re2.e0 e0Var) {
        super(2);
        this.f394372d = e0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        this.f394372d.f394401n = false;
        com.tencent.mars.xlog.Log.e(this.f394372d.c(), "doPoll failed: errCode=" + intValue + ", errMsg=" + ((java.lang.String) obj2));
        if (!this.f394372d.g(intValue)) {
            if (this.f394372d.e()) {
                this.f394372d.f(4);
            } else if (this.f394372d.f394402o) {
                this.f394372d.f394402o = false;
                this.f394372d.i();
            } else {
                re2.e0 e0Var = this.f394372d;
                if (e0Var.f394389b == re2.a0.f394356e) {
                    e0Var.f394399l.postDelayed(e0Var.f394404q, e0Var.f394400m);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
