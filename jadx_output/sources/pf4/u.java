package pf4;

/* loaded from: classes4.dex */
public final class u implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf4.w f353897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f353898b;

    public u(pf4.w wVar, java.util.List list) {
        this.f353897a = wVar;
        this.f353898b = list;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        pf4.w wVar = this.f353897a;
        java.lang.String str = wVar.f353902e;
        wVar.f353901d.clear();
        wVar.f353901d.addAll(this.f353898b);
        wVar.notifyItemRangeChanged(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        pf4.w wVar = this.f353897a;
        java.lang.String str = wVar.f353902e;
        wVar.f353901d.clear();
        wVar.f353901d.addAll(this.f353898b);
        wVar.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        pf4.w wVar = this.f353897a;
        java.lang.String str = wVar.f353902e;
        wVar.f353901d.clear();
        wVar.f353901d.addAll(this.f353898b);
        wVar.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        java.lang.String str = this.f353897a.f353902e;
    }
}
