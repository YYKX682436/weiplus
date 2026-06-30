package ro2;

/* loaded from: classes2.dex */
public final class k implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f398057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398058c;

    public k(android.content.Context context, java.util.Map map, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f398056a = context;
        this.f398057b = map;
        this.f398058c = qeVar;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        this.f398058c.F = null;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context = this.f398056a;
        kotlin.jvm.internal.o.f(context, "$context");
        d2Var.h(context, "poster_send_to_cmt", "view_unexp", false, this.f398057b);
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.content.Context context = this.f398056a;
        kotlin.jvm.internal.o.f(context, "$context");
        d2Var.h(context, "poster_send_to_cmt", "view_exp", false, this.f398057b);
    }
}
