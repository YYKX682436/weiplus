package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147904d = 0;

    public d0(com.tencent.mm.plugin.magicbrush.e0 e0Var, com.tencent.mm.plugin.magicbrush.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147904d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147904d;
        this.f147904d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.a7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
