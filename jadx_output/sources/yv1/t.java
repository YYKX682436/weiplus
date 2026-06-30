package yv1;

/* loaded from: classes8.dex */
public final class t extends com.tencent.mm.sdk.event.n {
    public t() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CleanJumpChatEvent event = (com.tencent.mm.autogen.events.CleanJumpChatEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        am.z2 z2Var = event.f54061g;
        if (n17) {
            ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).Ai(z2Var.f8508a, z2Var.f8509b);
            return true;
        }
        cw1.d3 d3Var = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseConvUI.f95719f;
        android.content.Context context = z2Var.f8508a;
        kotlin.jvm.internal.o.f(context, "context");
        android.os.Bundle args = z2Var.f8509b;
        kotlin.jvm.internal.o.f(args, "args");
        d3Var.b(context, args);
        return true;
    }
}
