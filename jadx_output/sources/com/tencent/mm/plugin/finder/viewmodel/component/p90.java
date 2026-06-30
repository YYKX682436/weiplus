package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f135540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(android.content.Context context, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f135539d = context;
        this.f135540e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int f124907z = it.getF124907z();
        android.content.Context context = this.f135539d;
        if (f124907z == (context != null ? context.hashCode() : -1) && (it.getIsViewFocused() || it.getF124901t())) {
            this.f135540e.f310123d = it;
        }
        return java.lang.Boolean.FALSE;
    }
}
