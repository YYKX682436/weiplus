package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class e80 extends com.tencent.mm.plugin.finder.convert.eh {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yz5.q f126697r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(yz5.q qVar, int i17, tu2.b bVar) {
        super(i17, bVar, null, null, 12, null);
        this.f126697r = qVar;
    }

    @Override // com.tencent.mm.plugin.finder.convert.eh, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        yz5.q qVar = this.f126697r;
        if (qVar != null) {
            qVar.invoke(holder, item, java.lang.Integer.valueOf(i17));
        }
    }
}
