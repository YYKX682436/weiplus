package com.tencent.mm.plugin.magicbrush;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f147929d = 0;

    public f(com.tencent.mm.plugin.magicbrush.g gVar, com.tencent.mm.plugin.magicbrush.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f147929d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f147929d;
        this.f147929d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.e6.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
