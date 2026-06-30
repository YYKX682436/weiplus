package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public final class xb extends android.view.ContextThemeWrapper {

    /* renamed from: a, reason: collision with root package name */
    public android.view.LayoutInflater f212549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(android.content.Context base, int i17) {
        super(base, i17);
        kotlin.jvm.internal.o.g(base, "base");
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        if (!kotlin.jvm.internal.o.b("layout_inflater", name)) {
            return super.getSystemService(name);
        }
        if (this.f212549a == null) {
            java.lang.Object systemService = super.getSystemService(name);
            this.f212549a = com.tencent.mm.ui.id.c(systemService instanceof android.view.LayoutInflater ? (android.view.LayoutInflater) systemService : null);
        }
        return this.f212549a;
    }
}
