package so2;

/* loaded from: classes2.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.t1 f410605d = new so2.t1();

    public t1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z18 = true;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127751i8).getValue()).r()).intValue() != 1) {
            if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (!z17 && !z65.c.a()) {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (!z18) {
                return null;
            }
        }
        return new bb2.a();
    }
}
