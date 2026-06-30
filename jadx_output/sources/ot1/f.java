package ot1;

/* loaded from: classes12.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f348834d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot1.g f348835e;

    public f(ot1.g gVar, ot1.e eVar) {
        this.f348835e = gVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f348834d == null) {
            ot1.g gVar = this.f348835e;
            boolean moveToNext = gVar.f348836d.moveToNext();
            if (!moveToNext) {
                gVar.f348836d.close();
            }
            this.f348834d = java.lang.Boolean.valueOf(moveToNext);
        }
        return this.f348834d.booleanValue();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        ot1.g gVar = this.f348835e;
        java.lang.Object j17 = gVar.j(gVar.f348836d);
        this.f348834d = null;
        return j17;
    }
}
