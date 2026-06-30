package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f205474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f205476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f205477g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.c f205478h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205479i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Intent intent, yb5.d dVar, long j17, long j18, zy2.c cVar, java.lang.String str) {
        super(0);
        this.f205474d = intent;
        this.f205475e = dVar;
        this.f205476f = j17;
        this.f205477g = j18;
        this.f205478h = cVar;
        this.f205479i = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
        long j17 = this.f205476f;
        android.content.Intent intent = this.f205474d;
        intent.putExtra("CURRENT_FEED_ID", j17);
        intent.putExtra("LAUNCH_WITH_ANIM", true);
        android.app.Activity g17 = this.f205475e.g();
        long j18 = this.f205476f;
        long j19 = this.f205477g;
        zy2.c cVar = this.f205478h;
        java.lang.String string = cVar.f477359b.getString(1);
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = cVar.f477359b.getString(12);
        ((vd2.d5) i0Var).wi(intent, g17, j18, j19, str, string2 == null ? "" : string2, cVar.f477359b.getString(4), this.f205479i, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
        return jz5.f0.f302826a;
    }
}
