package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class uh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostTextModifyView f133180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(com.tencent.mm.plugin.finder.view.FinderPostTextModifyView finderPostTextModifyView) {
        super(0);
        this.f133180d = finderPostTextModifyView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.sh2 sh2Var;
        g92.b bVar = g92.b.f269769e;
        android.content.Context context = this.f133180d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int i17 = 0;
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(context), false, 2, null);
        if (j37 != null && (sh2Var = (r45.sh2) j37.u0().getCustom(50)) != null) {
            i17 = sh2Var.getInteger(0);
        }
        if (i17 <= 0) {
            i17 = 10;
        }
        return java.lang.Integer.valueOf(i17 * 2);
    }
}
