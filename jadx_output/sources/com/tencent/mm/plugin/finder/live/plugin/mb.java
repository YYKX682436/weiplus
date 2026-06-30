package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tb f113481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.tb tbVar) {
        super(0);
        this.f113480d = viewGroup;
        this.f113481e = tbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f113480d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new se2.d(context, 0, this.f113481e);
    }
}
