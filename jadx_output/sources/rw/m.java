package rw;

/* loaded from: classes11.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final rw.m f400581d = new rw.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.EcsTLMockRecCanvasCardEvent ecsTLMockRecCanvasCardEvent = new com.tencent.mm.autogen.events.EcsTLMockRecCanvasCardEvent();
        java.lang.String str = "ecs_tl_mock_rec_card_" + java.lang.System.currentTimeMillis();
        am.l4 l4Var = ecsTLMockRecCanvasCardEvent.f54099g;
        l4Var.f7222a = str;
        l4Var.f7223b = "{}";
        ecsTLMockRecCanvasCardEvent.e();
        return jz5.f0.f302826a;
    }
}
