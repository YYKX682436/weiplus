package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class qo extends com.tencent.mm.plugin.finder.view.dk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(r45.u24 source) {
        super(source, false, 2, null);
        kotlin.jvm.internal.o.g(source, "source");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof com.tencent.mm.plugin.finder.view.qo) && ((r45.u24) this.f131900d).getInteger(1) == ((r45.u24) ((com.tencent.mm.plugin.finder.view.qo) obj).f131900d).getInteger(1)) ? 0 : 1;
    }

    @Override // in5.c
    public long getItemId() {
        return ((r45.u24) this.f131900d).getInteger(1);
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
