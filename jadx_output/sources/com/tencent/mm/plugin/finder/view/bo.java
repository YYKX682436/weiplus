package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class bo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f131733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f131735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(android.view.View view, long j17, java.lang.String str, kotlin.jvm.internal.g0 g0Var) {
        super(0);
        this.f131732d = view;
        this.f131733e = j17;
        this.f131734f = str;
        this.f131735g = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bd2.b bVar = bd2.b.f19244a;
        android.content.Context context = this.f131732d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bVar.a(context, this.f131733e, this.f131734f, (i18 & 8) != 0 ? 0L : this.f131735g.f310121d, (i18 & 16) != 0 ? 58 : 0);
        return jz5.f0.f302826a;
    }
}
