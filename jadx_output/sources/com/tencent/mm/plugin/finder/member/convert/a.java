package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489347dd1;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.g item = (jo2.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        holder.s(com.tencent.mm.R.id.gcc, holder.f293121e.getString(com.tencent.mm.R.string.leq, java.lang.Integer.valueOf(item.f300886d)));
    }
}
