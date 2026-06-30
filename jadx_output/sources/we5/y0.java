package we5;

/* loaded from: classes9.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f445402a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f445403b = "UIBlock";

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f445404c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f445405d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f445406e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public long f445407f;

    static {
        new we5.v0(null);
    }

    public y0(yz5.a aVar) {
        this.f445402a = aVar;
    }

    public static final we5.y0 a(com.tencent.mm.ui.chatting.viewitems.g0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return new we5.y0(new we5.u0(holder));
    }

    public final void b(com.tencent.mm.ui.tools.e3 blocks, we5.r0 adapter) {
        kotlin.jvm.internal.o.g(blocks, "blocks");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        yz5.a aVar = this.f445402a;
        if (aVar != null) {
            blocks.a(adapter.a((com.tencent.mm.ui.chatting.viewitems.g0) aVar.invoke()));
            return;
        }
        if (od5.b.a()) {
            ((java.util.ArrayList) this.f445405d).add(java.lang.Integer.valueOf(new java.lang.Throwable().getStackTrace()[1].getLineNumber()));
        }
        ((java.util.ArrayList) this.f445404c).add(new we5.w0(blocks, adapter));
    }

    public final void c(we5.t0 block) {
        kotlin.jvm.internal.o.g(block, "block");
        yz5.a aVar = this.f445402a;
        if (aVar != null) {
            block.a((com.tencent.mm.ui.chatting.viewitems.g0) aVar.invoke());
            return;
        }
        if (od5.b.a()) {
            ((java.util.ArrayList) this.f445405d).add(java.lang.Integer.valueOf(new java.lang.Throwable().getStackTrace()[1].getLineNumber()));
        }
        ((java.util.ArrayList) this.f445404c).add(new we5.x0(block));
    }

    public final void d(yz5.l block) {
        kotlin.jvm.internal.o.g(block, "block");
        yz5.a aVar = this.f445402a;
        if (aVar != null) {
            block.invoke(aVar.invoke());
            return;
        }
        if (od5.b.a()) {
            ((java.util.ArrayList) this.f445405d).add(java.lang.Integer.valueOf(new java.lang.Throwable().getStackTrace()[1].getLineNumber()));
        }
        ((java.util.ArrayList) this.f445404c).add(block);
    }
}
