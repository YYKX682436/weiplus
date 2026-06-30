package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pa0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler f135542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f135544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler, android.content.Context context, boolean z17) {
        super(0);
        this.f135542d = finderVideoRecycler;
        this.f135543e = context;
        this.f135544f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f135542d.O6(new com.tencent.mm.plugin.finder.viewmodel.component.oa0(this.f135543e, this.f135544f));
        return jz5.f0.f302826a;
    }
}
