package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.zz f114058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.zz zzVar) {
        super(0);
        this.f114057d = viewGroup;
        this.f114058e = zzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f114057d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vk2.h(context, this.f114058e);
    }
}
