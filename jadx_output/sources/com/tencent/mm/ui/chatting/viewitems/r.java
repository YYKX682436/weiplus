package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f205391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f205393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f205394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.c f205395h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.content.Intent intent, yb5.d dVar, long j17, long j18, zy2.c cVar, java.lang.String str) {
        super(2);
        this.f205391d = intent;
        this.f205392e = dVar;
        this.f205393f = j17;
        this.f205394g = j18;
        this.f205395h = cVar;
        this.f205396i = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent i17 = (android.content.Intent) obj2;
        kotlin.jvm.internal.o.g(i17, "i");
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        long j17 = this.f205393f;
        android.content.Intent intent = this.f205391d;
        intent.putExtra("CURRENT_FEED_ID", j17);
        intent.putExtra("LAUNCH_WITH_ANIM", booleanValue);
        android.app.Activity g17 = this.f205392e.g();
        long j18 = this.f205393f;
        long j19 = this.f205394g;
        zy2.c cVar = this.f205395h;
        java.lang.String string = cVar.f477359b.getString(1);
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = cVar.f477359b.getString(12);
        ((vd2.d5) i0Var).wi(intent, g17, j18, j19, str, string2 == null ? "" : string2, cVar.f477359b.getString(4), this.f205396i, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        return jz5.f0.f302826a;
    }
}
