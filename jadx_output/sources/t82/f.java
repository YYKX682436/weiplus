package t82;

/* loaded from: classes12.dex */
public final class f implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f416386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t82.r f416387b;

    public f(o72.r2 r2Var, t82.r rVar) {
        this.f416386a = r2Var;
        this.f416387b = rVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleDelete] positiveClick remove favItemInfo = ");
            o72.r2 favItemInfo = this.f416386a;
            sb6.append(favItemInfo.field_id);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderFilterUI", sb6.toString());
            t82.r rVar = this.f416387b;
            rVar.Q6();
            int i17 = rVar.f416406g;
            t82.e eVar = new t82.e(rVar);
            kotlin.jvm.internal.o.g(favItemInfo, "favItemInfo");
            o72.x1.k(favItemInfo, new t82.c(i17, eVar), 5);
        }
    }
}
