package yk5;

/* loaded from: classes11.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f462893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yk5.u f462894e;

    public o(yk5.u uVar, java.lang.String str) {
        this.f462894e = uVar;
        this.f462893d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        yk5.u uVar = this.f462894e;
        if (!uVar.f462909s.u2()) {
            uVar.f462909s.U2();
            return;
        }
        com.tencent.mm.storage.z3 z3Var = uVar.f462909s;
        z3Var.setType(z3Var.getType() & (-33));
        if (uVar.f462913w) {
            c01.d9.e().g(new tg3.r1(this.f462893d, 3));
            uVar.B = true;
        }
    }
}
