package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class dm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f198945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f198946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f198947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f198948g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198949h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(com.tencent.mm.ui.chatting.component.fm fmVar, yb5.d dVar, long j17, long j18, java.lang.String str) {
        super(0);
        this.f198945d = fmVar;
        this.f198946e = dVar;
        this.f198947f = j17;
        this.f198948g = j18;
        this.f198949h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yb5.d dVar = this.f198946e;
        long j17 = this.f198947f;
        long j18 = this.f198948g;
        java.lang.String str = this.f198949h;
        com.tencent.mm.ui.chatting.component.fm fmVar = this.f198945d;
        fmVar.u0(dVar, j17, j18, fmVar.x0(str), true);
        return jz5.f0.f302826a;
    }
}
