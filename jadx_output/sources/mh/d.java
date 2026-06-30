package mh;

/* loaded from: classes11.dex */
public final class d extends java.util.ArrayList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f326260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, java.lang.String str) {
        super(i17);
        this.f326260d = i17;
        this.f326261e = str;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i17, java.lang.Object obj) {
        if (super.size() >= this.f326260d) {
            super.remove(0);
            d();
        }
        super.add(i17, obj);
    }

    public final void d() {
        java.lang.String str = "listOverHeat-" + this.f326261e;
        ((ku5.t0) ku5.t0.f312615d).A(str);
        ((ku5.t0) ku5.t0.f312615d).l(new mh.c(this.f326261e, this), 60000L, str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        if (super.size() >= this.f326260d) {
            super.remove(0);
            d();
        }
        return super.add(obj);
    }
}
