package lw0;

/* loaded from: classes5.dex */
public final class h implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw0.l f321537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lw0.c f321538e;

    public h(lw0.l lVar, lw0.c cVar) {
        this.f321537d = lVar;
        this.f321538e = cVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean l76;
        kw0.e eVar = (kw0.e) obj;
        kotlin.jvm.internal.o.d(eVar);
        lw0.l lVar = this.f321537d;
        lVar.getClass();
        kw0.k kVar = eVar.f312803c;
        if ((kVar instanceof kw0.h) || (kVar instanceof kw0.j)) {
            l76 = lVar.l7(eVar);
        } else {
            com.tencent.mars.xlog.Log.i("StickerStyleReplacePanel", "onWhenWhereReplaced: updateState " + kVar);
            l76 = true;
        }
        if (l76) {
            lVar.v7(this.f321538e, eVar);
        }
    }
}
