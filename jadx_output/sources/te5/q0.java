package te5;

/* loaded from: classes9.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final te5.q0 f418727d = new te5.q0();

    public q0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yb5.d chattingContext = (yb5.d) obj;
        android.widget.LinearLayout viewArea = (android.widget.LinearLayout) obj2;
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(viewArea, "viewArea");
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).wi();
        android.app.Activity g17 = chattingContext.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        return new com.tencent.mm.chatting.widget.ChattingExpandOptView(g17, null);
    }
}
