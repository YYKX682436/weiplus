package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pg extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f113875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f113876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113877h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f113878i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f113879m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar, java.lang.String str, boolean z17, boolean z18, android.view.View view, dk2.zf zfVar, in5.r0 r0Var) {
        super(2);
        this.f113873d = mgVar;
        this.f113874e = str;
        this.f113875f = z17;
        this.f113876g = z18;
        this.f113877h = view;
        this.f113878i = zfVar;
        this.f113879m = r0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f113873d;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = ((mm2.c1) mgVar.P0(mm2.c1.class)).f328780b2;
            java.lang.String str = this.f113874e;
            if ((!kotlin.jvm.internal.o.b(concurrentHashMap.get(str), java.lang.Boolean.valueOf(this.f113875f)) || !kotlin.jvm.internal.o.b(java.lang.Boolean.valueOf(this.f113876g), ((mm2.c1) mgVar.P0(mm2.c1.class)).f328785c2.get(str))) && com.tencent.mm.plugin.finder.view.oc.f132781a.b()) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                android.view.View view = this.f113877h;
                view.setTag(com.tencent.mm.R.id.f484601ev3, bool);
                yz5.q qVar = mgVar.D.f22181n;
                if (qVar != null) {
                    qVar.invoke(this.f113878i, view, this.f113879m);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
