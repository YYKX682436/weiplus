package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f133225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        super(0);
        this.f133225d = finderCollapsibleTextView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (com.tencent.mm.plugin.finder.view.FadeNeatTextView) this.f133225d.findViewById(com.tencent.mm.R.id.c1_);
    }
}
