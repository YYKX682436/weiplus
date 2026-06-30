package ze5;

/* loaded from: classes9.dex */
public final class u7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(yb5.d dVar) {
        super(1);
        this.f472231d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sb5.r2 r2Var = (sb5.r2) this.f472231d.f460708c.a(sb5.r2.class);
        if (r2Var != null) {
            com.tencent.mm.ui.chatting.component.hp hpVar = (com.tencent.mm.ui.chatting.component.hp) r2Var;
            if (!booleanValue) {
                fd5.d m07 = hpVar.m0();
                if (m07 != null) {
                    m07.c(false);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "onStreamFeedingStateChanged: feeding ended, setLayoutToLast(false)");
            }
        }
        return jz5.f0.f302826a;
    }
}
