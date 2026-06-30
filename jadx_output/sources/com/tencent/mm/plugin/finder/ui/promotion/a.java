package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.q f129655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gx2.q qVar) {
        super(0);
        this.f129655d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gx2.q qVar = this.f129655d;
        androidx.core.widget.NestedScrollView nestedScrollView = qVar != null ? (androidx.core.widget.NestedScrollView) qVar.findViewById(com.tencent.mm.R.id.t5t) : null;
        return java.lang.Boolean.valueOf(nestedScrollView == null || !nestedScrollView.canScrollVertically(-1));
    }
}
