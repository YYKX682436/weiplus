package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class b3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147876d = 0;

    public b3(com.tencent.mm.plugin.magicbrush.c3 c3Var, com.tencent.mm.plugin.magicbrush.a3 a3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147876d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147876d;
        this.f147876d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.a7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
