package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class d2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147907d = 0;

    public d2(com.tencent.mm.plugin.magicbrush.e2 e2Var, com.tencent.mm.plugin.magicbrush.c2 c2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147907d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147907d;
        this.f147907d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.e6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
