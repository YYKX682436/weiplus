package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI) {
        super(0);
        this.f129570d = finderFansListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        androidx.appcompat.app.AppCompatActivity context = this.f129570d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(xy2.c.e(context)));
        sb6.append("_fansList.fp");
        return new bu2.b(sb6.toString());
    }
}
