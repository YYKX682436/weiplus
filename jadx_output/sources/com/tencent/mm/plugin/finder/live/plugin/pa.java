package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(android.view.ViewGroup viewGroup) {
        super(0);
        this.f113850d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f113850d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return (com.tencent.mm.plugin.finder.live.viewmodel.b8) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
    }
}
