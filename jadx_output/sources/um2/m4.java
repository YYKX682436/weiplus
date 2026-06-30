package um2;

/* loaded from: classes3.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(um2.x5 x5Var) {
        super(1);
        this.f428880d = x5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        um2.x5 x5Var = this.f428880d;
        com.tencent.mars.xlog.Log.i(x5Var.f429032f, "postCloseLinkMsgWithRetry: " + booleanValue);
        if (booleanValue && ((mm2.e1) x5Var.c(mm2.e1.class)).b7()) {
            com.tencent.mars.xlog.Log.i(x5Var.f429032f, "checkClearSingSong clear song");
            fm2.c cVar = x5Var.f19606c;
            if (cVar != null) {
                com.tencent.mm.plugin.finder.live.util.y.f(cVar, null, null, new um2.z(x5Var, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
