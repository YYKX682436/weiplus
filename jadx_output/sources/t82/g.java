package t82;

/* loaded from: classes12.dex */
public final class g implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t82.r f416388a;

    public g(t82.r rVar) {
        this.f416388a = rVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", "[handleDelete] negativeClick cancel");
            this.f416388a.f416405f.invoke(9);
        }
    }
}
