package gp4;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer) {
        super(2);
        this.f274444d = context;
        this.f274445e = timeEditorItemContainer;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String title = (java.lang.String) obj;
        java.lang.String menuString = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(menuString, "menuString");
        android.content.Context context = this.f274444d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        k0Var.q(title, 17);
        k0Var.f211872n = new gp4.w(k0Var, context, menuString);
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274445e;
        k0Var.f211881s = new gp4.x(timeEditorItemContainer);
        k0Var.f211854d = new gp4.y(timeEditorItemContainer);
        return k0Var;
    }
}
