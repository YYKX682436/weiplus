package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147932d = 0;

    public f1(com.tencent.mm.plugin.magicbrush.g1 g1Var, com.tencent.mm.plugin.magicbrush.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147932d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147932d;
        this.f147932d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.k5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
