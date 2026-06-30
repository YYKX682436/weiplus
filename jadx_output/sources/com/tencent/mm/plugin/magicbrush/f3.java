package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class f3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147935d = 0;

    public f3(com.tencent.mm.plugin.magicbrush.g3 g3Var, com.tencent.mm.plugin.magicbrush.e3 e3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147935d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147935d;
        this.f147935d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.c7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
