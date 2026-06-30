package kj2;

/* loaded from: classes10.dex */
public final class m implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.o f308418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f308419b;

    public m(kj2.o oVar, java.util.ArrayList arrayList) {
        this.f308418a = oVar;
        this.f308419b = arrayList;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        kj2.o oVar = this.f308418a;
        oVar.f308429h.clear();
        oVar.f308429h.addAll(this.f308419b);
        oVar.f308430i.notifyItemRangeChanged(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        kj2.o oVar = this.f308418a;
        oVar.f308429h.clear();
        oVar.f308429h.addAll(this.f308419b);
        oVar.f308430i.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        kj2.o oVar = this.f308418a;
        oVar.f308429h.clear();
        oVar.f308429h.addAll(this.f308419b);
        oVar.f308430i.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
    }
}
