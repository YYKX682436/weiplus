package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class x4 implements com.tencent.mm.plugin.finder.convert.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f133315a;

    public x4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f133315a = finderColumnFrameLayout;
    }

    @Override // com.tencent.mm.plugin.finder.convert.i0
    public void a(int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, android.view.View view) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.a(this.f133315a, i17, view);
    }
}
