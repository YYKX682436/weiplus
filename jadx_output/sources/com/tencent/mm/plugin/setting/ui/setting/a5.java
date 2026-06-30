package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes13.dex */
public final class a5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f160798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f160799e;

    /* renamed from: f, reason: collision with root package name */
    public long f160800f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f160801g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.c5 f160802h;

    /* renamed from: i, reason: collision with root package name */
    public int f160803i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.plugin.setting.ui.setting.c5 c5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f160802h = c5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f160801g = obj;
        this.f160803i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.setting.ui.setting.c5.b(this.f160802h, null, null, null, this);
    }
}
