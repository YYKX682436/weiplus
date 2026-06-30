package gp4;

/* loaded from: classes3.dex */
public final class w implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f274439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f274440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274441f;

    public w(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context, java.lang.String str) {
        this.f274439d = k0Var;
        this.f274440e = context;
        this.f274441f = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f274439d.o(null);
        g4Var.clear();
        g4Var.d(0, this.f274440e.getResources().getColor(com.tencent.mm.R.color.f478532ac), this.f274441f);
    }
}
