package yo4;

/* loaded from: classes10.dex */
public final class c0 implements lr.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464188a;

    public c0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
        this.f464188a = multiVideoFullScreenPluginLayout;
    }

    @Override // lr.k0
    public void a(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        yt3.i iVar = this.f464188a.f175852t;
        if (iVar != null) {
            iVar.A().b(false);
        } else {
            kotlin.jvm.internal.o.o("addEmojiPlugin");
            throw null;
        }
    }
}
