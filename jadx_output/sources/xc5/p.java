package xc5;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final xc5.p f453547a = new xc5.p();

    public final void a(co.a aVar, com.tencent.mm.storage.f9 f9Var) {
        aVar.set(aVar.f43702d + 0, java.lang.Long.valueOf(f9Var.getMsgId()));
        long I0 = f9Var.I0();
        int i17 = aVar.f43702d;
        aVar.set(i17 + 2, java.lang.Long.valueOf(I0));
        aVar.set(i17 + 3, java.lang.Integer.valueOf(f9Var.getType()));
        java.lang.String Q0 = f9Var.Q0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (Q0 == null) {
            Q0 = "";
        }
        aVar.set(i17 + 1, Q0);
    }
}
