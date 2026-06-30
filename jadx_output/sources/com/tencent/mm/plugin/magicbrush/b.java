package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147870d = 0;

    public b(com.tencent.mm.plugin.magicbrush.c cVar, com.tencent.mm.plugin.magicbrush.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147870d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147870d;
        this.f147870d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.n5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
