package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class b1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147873d = 0;

    public b1(com.tencent.mm.plugin.magicbrush.c1 c1Var, com.tencent.mm.plugin.magicbrush.a1 a1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147873d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147873d;
        this.f147873d = i17 + 1;
        if (i17 == 0) {
            return df3.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
