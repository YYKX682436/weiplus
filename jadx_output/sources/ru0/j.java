package ru0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.me4 f399678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f399679e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f399680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f399681g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.me4 me4Var, long j17, long j18, float f17) {
        super(1);
        this.f399678d = me4Var;
        this.f399679e = j17;
        this.f399680f = j18;
        this.f399681g = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject translation = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(translation, "translation");
        java.lang.String optString = translation.optString("lang");
        if (optString != null) {
            r45.me4 me4Var = this.f399678d;
            me4Var.f380415i = optString;
            kotlin.jvm.internal.o.d(optString);
            java.util.List d17 = ru0.m.d(translation, optString, this.f399679e, this.f399680f, this.f399681g);
            if (d17 != null) {
                me4Var.f380413g.addAll(d17);
            }
        }
        return jz5.f0.f302826a;
    }
}
