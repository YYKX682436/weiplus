package te5;

/* loaded from: classes9.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final te5.u0 f418751d = new te5.u0();

    public u0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yb5.d chattingContext = (yb5.d) obj;
        rd5.d msgData = (rd5.d) obj2;
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.ui.chatting.component.v4 v4Var = (com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) chattingContext.f460708c.a(sb5.b0.class));
        v4Var.getClass();
        return java.lang.Boolean.valueOf(msgData instanceof qd5.i ? false : v4Var.o0(msgData.f394254d.f445300b));
    }
}
