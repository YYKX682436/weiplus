package k41;

/* loaded from: classes9.dex */
public final class s0 implements com.tencent.mm.storage.i8 {
    @Override // com.tencent.mm.storage.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (i17 == 5 && (obj instanceof java.lang.String) && com.tencent.mm.storage.z3.o4((java.lang.String) obj)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConversationChangeListener", "openImKfConversationChangedListener onNotifyChange delete %s", obj);
            ((ku5.t0) ku5.t0.f312615d).b(k41.z0.f304057d, "kefu_conversation_logic_thread");
        }
    }
}
