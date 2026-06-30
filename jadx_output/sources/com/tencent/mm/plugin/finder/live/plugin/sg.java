package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sg extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f114251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f114253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f114254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f114256i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f114257m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.lang.String str, boolean z17, boolean z18, android.view.View view, dk2.zf zfVar, in5.r0 r0Var) {
        super(2);
        this.f114251d = mgVar;
        this.f114252e = str;
        this.f114253f = z17;
        this.f114254g = z18;
        this.f114255h = view;
        this.f114256i = zfVar;
        this.f114257m = r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f114251d;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ((mm2.c1) mgVar.P0(mm2.c1.class)).f328780b2;
            java.lang.String str = this.f114252e;
            if ((!kotlin.jvm.internal.o.b(concurrentHashMap.get(str), java.lang.Boolean.valueOf(this.f114253f)) || !kotlin.jvm.internal.o.b(java.lang.Boolean.valueOf(this.f114254g), ((mm2.c1) mgVar.P0(mm2.c1.class)).f328785c2.get(str))) && com.tencent.mm.plugin.finder.view.oc.f132781a.b()) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                android.view.View view = this.f114255h;
                view.setTag(com.tencent.mm.R.id.f484601ev3, bool);
                yz5.q qVar = mgVar.D.f22181n;
                if (qVar != null) {
                    qVar.invoke(this.f114256i, view, this.f114257m);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
