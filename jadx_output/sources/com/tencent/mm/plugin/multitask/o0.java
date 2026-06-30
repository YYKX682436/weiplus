package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f150475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f150477f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i17, java.lang.String str, int i18) {
        super(0);
        this.f150475d = i17;
        this.f150476e = str;
        this.f150477f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.MulitTaskEvent mulitTaskEvent = new com.tencent.mm.autogen.events.MulitTaskEvent();
        am.ak akVar = mulitTaskEvent.f54503g;
        akVar.f6160b = this.f150475d;
        akVar.f6159a = this.f150476e;
        akVar.f6161c = this.f150477f;
        mulitTaskEvent.e();
        return jz5.f0.f302826a;
    }
}
