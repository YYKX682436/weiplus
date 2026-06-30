package com.tencent.mm.ui.chatting.component;

/* loaded from: classes14.dex */
public final class em extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f198985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.fm f198986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f198987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f198988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f198989h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198990i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.chatting.component.fm fmVar, yb5.d dVar, long j17, long j18, java.lang.String str) {
        super(1);
        this.f198985d = c0Var;
        this.f198986e = fmVar;
        this.f198987f = dVar;
        this.f198988g = j17;
        this.f198989h = j18;
        this.f198990i = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pn4.u0 newState = (pn4.u0) obj;
        kotlin.jvm.internal.o.g(newState, "newState");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextToSpeechComponent", "trans state to " + newState);
        if (newState == pn4.u0.f357232g) {
            kotlin.jvm.internal.c0 c0Var = this.f198985d;
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                y21.h.e(this.f198986e.f199062h, false, false, 3, null);
                pm0.v.X(new com.tencent.mm.ui.chatting.component.dm(this.f198986e, this.f198987f, this.f198988g, this.f198989h, this.f198990i));
            }
        }
        return jz5.f0.f302826a;
    }
}
