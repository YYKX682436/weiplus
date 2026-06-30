package ow0;

/* loaded from: classes5.dex */
public final class c implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f349294d;

    public c(ow0.g gVar) {
        this.f349294d = gVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Object obj2;
        kw0.e eVar = (kw0.e) obj;
        sw0.f fVar = sw0.f.f413431f;
        java.util.Iterator it = this.f349294d.F.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((sw0.n) obj2).f413444b == fVar) {
                    break;
                }
            }
        }
        sw0.n nVar = (sw0.n) obj2;
        android.view.View view = nVar != null ? nVar.f413445c : null;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView fancyTextView = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView) (view instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.sticker.subviews.FancyTextView ? view : null);
        if (fancyTextView == null || eVar.f312801a.isEmpty()) {
            return;
        }
        kw0.f fVar2 = kw0.f.f312804a;
        kw0.k kVar = eVar.f312803c;
        if (kotlin.jvm.internal.o.b(kVar, fVar2)) {
            return;
        }
        boolean z17 = kVar instanceof kw0.g;
        java.util.List<kw0.a> list = eVar.f312801a;
        if (!z17) {
            if (kotlin.jvm.internal.o.b(kVar, kw0.i.f312806a)) {
                fancyTextView.setDataList(list);
                return;
            } else {
                kotlin.jvm.internal.o.b(kVar, kw0.j.f312807a);
                return;
            }
        }
        kw0.g gVar = (kw0.g) kVar;
        kw0.a aVar = (kw0.a) kz5.n0.a0(list, gVar.f312805a);
        if (aVar != null) {
            fancyTextView.a(gVar.f312805a, aVar);
        }
    }
}
