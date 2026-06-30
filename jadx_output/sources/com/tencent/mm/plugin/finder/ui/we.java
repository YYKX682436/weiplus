package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class we extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f129987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, r45.mb4 mb4Var) {
        super(2);
        this.f129986d = finderSelectCoverUI;
        this.f129987e = mb4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap != null) {
            r45.mb4 mb4Var = this.f129987e;
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.d7(this.f129986d, mb4Var.getBoolean(13), (r45.dd4) mb4Var.getCustom(14), bitmap);
        }
        return jz5.f0.f302826a;
    }
}
