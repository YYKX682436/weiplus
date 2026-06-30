package vz;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441553d = 0;

    public n(vz.o oVar, vz.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441553d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441553d;
        this.f441553d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.game.luggage.jsevent.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
