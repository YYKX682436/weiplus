package um2;

/* loaded from: classes3.dex */
public final class t5 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428968a;

    public t5(um2.x5 x5Var) {
        this.f428968a = x5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        um2.x5 x5Var = this.f428968a;
        fm2.c cVar = x5Var.f19606c;
        if (cVar != null) {
            qo0.c.a(cVar, qo0.b.f365396p, null, 2, null);
        }
        com.tencent.mars.xlog.Log.i(x5Var.f429032f, "showAlertDialog click bOk:" + z17);
    }
}
