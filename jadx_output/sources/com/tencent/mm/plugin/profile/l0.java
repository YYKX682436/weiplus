package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class l0 implements ns.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f153515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153517c;

    public l0(com.tencent.mm.plugin.profile.e0 e0Var, android.content.Context context, com.tencent.mm.storage.z3 z3Var) {
        this.f153517c = e0Var;
        this.f153515a = context;
        this.f153516b = z3Var;
    }

    @Override // ns.i
    public void a() {
        this.f153517c.a(this.f153515a, this.f153516b);
    }
}
