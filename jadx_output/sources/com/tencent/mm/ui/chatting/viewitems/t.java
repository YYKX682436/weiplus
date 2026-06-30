package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f205539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f205540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f205541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f205542g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205543h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zy2.c f205544i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205545m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205546n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f205547o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, long j17, long j18, android.view.View view, zy2.c cVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, long j19) {
        super(2);
        this.f205539d = h0Var;
        this.f205540e = h0Var2;
        this.f205541f = j17;
        this.f205542g = j18;
        this.f205543h = view;
        this.f205544i = cVar;
        this.f205545m = dVar;
        this.f205546n = f9Var;
        this.f205547o = j19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        com.tencent.mm.ui.chatting.viewitems.x xVar = com.tencent.mm.ui.chatting.viewitems.z.f206107a;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        java.lang.String str = (java.lang.String) this.f205539d.f310123d;
        r45.k30 k30Var = (r45.k30) this.f205540e.f310123d;
        xVar.g(this.f205541f, this.f205542g, this.f205543h, this.f205544i, this.f205545m, this.f205546n, booleanValue, this.f205547o, str, k30Var, intent);
        return jz5.f0.f302826a;
    }
}
