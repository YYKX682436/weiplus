package y00;

/* loaded from: classes3.dex */
public final class k implements com.tencent.mm.storage.i8 {
    @Override // com.tencent.mm.storage.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (!z65.c.f470458d && i17 == 5) {
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardOnConversationChanged", "onNotifyChange: invalid talker");
            } else if (com.tencent.mm.storage.z3.p4(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardOnConversationChanged", "onNotifyChange: delete talker=%s", str);
                ((ku5.t0) ku5.t0.f312615d).B(new y00.i(str));
                ((ku5.t0) ku5.t0.f312615d).g(new y00.j(this, str));
            }
        }
    }
}
