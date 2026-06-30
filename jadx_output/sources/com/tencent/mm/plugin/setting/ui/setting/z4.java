package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes13.dex */
public final class z4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f161807d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f161808e;

    /* renamed from: f, reason: collision with root package name */
    public long f161809f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f161810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.c5 f161811h;

    /* renamed from: i, reason: collision with root package name */
    public int f161812i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.tencent.mm.plugin.setting.ui.setting.c5 c5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f161811h = c5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f161810g = obj;
        this.f161812i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.setting.ui.setting.c5.a(this.f161811h, null, null, null, this);
    }
}
