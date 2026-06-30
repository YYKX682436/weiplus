package r0;

/* loaded from: classes14.dex */
public class g extends r0.e {

    /* renamed from: g, reason: collision with root package name */
    public final r0.f f367974g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f367975h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f367976i;

    /* renamed from: m, reason: collision with root package name */
    public int f367977m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r0.f builder, r0.v[] path) {
        super(builder.f367970f, path);
        kotlin.jvm.internal.o.g(builder, "builder");
        kotlin.jvm.internal.o.g(path, "path");
        this.f367974g = builder;
        this.f367977m = builder.f367972h;
    }

    public final void d(int i17, r0.u uVar, java.lang.Object obj, int i18) {
        int i19 = i18 * 5;
        r0.v[] vVarArr = this.f367965d;
        if (i19 <= 30) {
            int i27 = 1 << ((i17 >> i19) & 31);
            if (uVar.h(i27)) {
                int f17 = uVar.f(i27);
                r0.v vVar = vVarArr[i18];
                java.lang.Object[] buffer = uVar.f367991d;
                int bitCount = java.lang.Integer.bitCount(uVar.f367988a) * 2;
                vVar.getClass();
                kotlin.jvm.internal.o.g(buffer, "buffer");
                vVar.f367992d = buffer;
                vVar.f367993e = bitCount;
                vVar.f367994f = f17;
                this.f367966e = i18;
                return;
            }
            int t17 = uVar.t(i27);
            r0.u s17 = uVar.s(t17);
            r0.v vVar2 = vVarArr[i18];
            java.lang.Object[] buffer2 = uVar.f367991d;
            int bitCount2 = java.lang.Integer.bitCount(uVar.f367988a) * 2;
            vVar2.getClass();
            kotlin.jvm.internal.o.g(buffer2, "buffer");
            vVar2.f367992d = buffer2;
            vVar2.f367993e = bitCount2;
            vVar2.f367994f = t17;
            d(i17, s17, obj, i18 + 1);
            return;
        }
        r0.v vVar3 = vVarArr[i18];
        java.lang.Object[] objArr = uVar.f367991d;
        int length = objArr.length;
        vVar3.getClass();
        vVar3.f367992d = objArr;
        vVar3.f367993e = length;
        vVar3.f367994f = 0;
        while (true) {
            r0.v vVar4 = vVarArr[i18];
            if (kotlin.jvm.internal.o.b(vVar4.f367992d[vVar4.f367994f], obj)) {
                this.f367966e = i18;
                return;
            } else {
                vVarArr[i18].f367994f += 2;
            }
        }
    }

    @Override // r0.e, java.util.Iterator
    public java.lang.Object next() {
        if (this.f367974g.f367972h != this.f367977m) {
            throw new java.util.ConcurrentModificationException();
        }
        if (!this.f367967f) {
            throw new java.util.NoSuchElementException();
        }
        r0.v vVar = this.f367965d[this.f367966e];
        this.f367975h = vVar.f367992d[vVar.f367994f];
        this.f367976i = true;
        return super.next();
    }

    @Override // r0.e, java.util.Iterator
    public void remove() {
        if (!this.f367976i) {
            throw new java.lang.IllegalStateException();
        }
        boolean z17 = this.f367967f;
        r0.f fVar = this.f367974g;
        if (!z17) {
            kotlin.jvm.internal.m0.c(fVar).remove(this.f367975h);
        } else {
            if (!z17) {
                throw new java.util.NoSuchElementException();
            }
            r0.v vVar = this.f367965d[this.f367966e];
            java.lang.Object obj = vVar.f367992d[vVar.f367994f];
            kotlin.jvm.internal.m0.c(fVar).remove(this.f367975h);
            d(obj != null ? obj.hashCode() : 0, fVar.f367970f, obj, 0);
        }
        this.f367975h = null;
        this.f367976i = false;
        this.f367977m = fVar.f367972h;
    }
}
