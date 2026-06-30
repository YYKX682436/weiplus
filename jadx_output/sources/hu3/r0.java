package hu3;

/* loaded from: classes5.dex */
public final class r0 implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hu3.s0 f285191a;

    public r0(hu3.s0 s0Var) {
        this.f285191a = s0Var;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e(this.f285191a.f285195b, "onRecError state is in " + i17);
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        yz5.p pVar;
        if (bArr == null || i17 <= 0 || (pVar = this.f285191a.f285197d) == null) {
            return;
        }
        pVar.invoke(bArr, java.lang.Integer.valueOf(i17));
    }
}
