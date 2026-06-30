package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f145670d = 0;

    public w(com.tencent.mm.plugin.luckymoney.model.x xVar, com.tencent.mm.plugin.luckymoney.model.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f145670d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f145670d;
        this.f145670d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.luckymoney.model.b3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
