package uc5;

/* loaded from: classes10.dex */
public final class k implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uc5.n f426515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426516b;

    public k(uc5.n nVar, android.content.Context context) {
        this.f426515a = nVar;
        this.f426516b = context;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ad5.l0[] l0VarArr = this.f426515a.f426529e;
        int length = l0VarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            ad5.l0 l0Var = l0VarArr[i17];
            g4Var.g(i18, this.f426516b.getResources().getString(l0Var.a()), l0Var.b());
            i17++;
            i18++;
        }
    }
}
