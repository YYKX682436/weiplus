package r0;

/* loaded from: classes14.dex */
public abstract class e implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final r0.v[] f367965d;

    /* renamed from: e, reason: collision with root package name */
    public int f367966e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f367967f;

    public e(r0.u node, r0.v[] path) {
        kotlin.jvm.internal.o.g(node, "node");
        kotlin.jvm.internal.o.g(path, "path");
        this.f367965d = path;
        this.f367967f = true;
        r0.v vVar = path[0];
        java.lang.Object[] buffer = node.f367991d;
        int bitCount = java.lang.Integer.bitCount(node.f367988a) * 2;
        vVar.getClass();
        kotlin.jvm.internal.o.g(buffer, "buffer");
        vVar.f367992d = buffer;
        vVar.f367993e = bitCount;
        vVar.f367994f = 0;
        this.f367966e = 0;
        b();
    }

    public final void b() {
        int i17 = this.f367966e;
        r0.v[] vVarArr = this.f367965d;
        r0.v vVar = vVarArr[i17];
        if (vVar.f367994f < vVar.f367993e) {
            return;
        }
        while (-1 < i17) {
            int c17 = c(i17);
            if (c17 == -1) {
                r0.v vVar2 = vVarArr[i17];
                int i18 = vVar2.f367994f;
                java.lang.Object[] objArr = vVar2.f367992d;
                if (i18 < objArr.length) {
                    int length = objArr.length;
                    vVar2.f367994f = i18 + 1;
                    c17 = c(i17);
                }
            }
            if (c17 != -1) {
                this.f367966e = c17;
                return;
            }
            if (i17 > 0) {
                r0.v vVar3 = vVarArr[i17 - 1];
                int i19 = vVar3.f367994f;
                int length2 = vVar3.f367992d.length;
                vVar3.f367994f = i19 + 1;
            }
            r0.v vVar4 = vVarArr[i17];
            java.lang.Object[] buffer = r0.u.f367987e.f367991d;
            vVar4.getClass();
            kotlin.jvm.internal.o.g(buffer, "buffer");
            vVar4.f367992d = buffer;
            vVar4.f367993e = 0;
            vVar4.f367994f = 0;
            i17--;
        }
        this.f367967f = false;
    }

    public final int c(int i17) {
        r0.v[] vVarArr = this.f367965d;
        r0.v vVar = vVarArr[i17];
        int i18 = vVar.f367994f;
        if (i18 < vVar.f367993e) {
            return i17;
        }
        java.lang.Object[] objArr = vVar.f367992d;
        if (!(i18 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        java.lang.Object obj = objArr[i18];
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        r0.u uVar = (r0.u) obj;
        if (i17 == 6) {
            r0.v vVar2 = vVarArr[i17 + 1];
            java.lang.Object[] objArr2 = uVar.f367991d;
            int length2 = objArr2.length;
            vVar2.getClass();
            vVar2.f367992d = objArr2;
            vVar2.f367993e = length2;
            vVar2.f367994f = 0;
        } else {
            r0.v vVar3 = vVarArr[i17 + 1];
            java.lang.Object[] buffer = uVar.f367991d;
            int bitCount = java.lang.Integer.bitCount(uVar.f367988a) * 2;
            vVar3.getClass();
            kotlin.jvm.internal.o.g(buffer, "buffer");
            vVar3.f367992d = buffer;
            vVar3.f367993e = bitCount;
            vVar3.f367994f = 0;
        }
        return c(i17 + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367967f;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f367967f) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = this.f367965d[this.f367966e].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
