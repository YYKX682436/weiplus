package ht0;

/* loaded from: classes10.dex */
public class d0 implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.o0 f284690d;

    public d0(ht0.o0 o0Var) {
        this.f284690d = o0Var;
    }

    @Override // di3.o
    public boolean a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            ht0.o0 o0Var = this.f284690d;
            if (o0Var.f284725c.f253039a == ei3.l.Start) {
                if (!o0Var.A) {
                    o0Var.A = true;
                    byte[] bArr2 = new byte[bArr.length];
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    ((ku5.t0) ku5.t0.f312615d).g(new ht0.j0(o0Var, bArr2));
                }
                if (this.f284690d.f284742t != null) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 1;
                    obtain.obj = bArr;
                    this.f284690d.f284742t.sendMessage(obtain);
                }
                return true;
            }
        }
        return false;
    }
}
