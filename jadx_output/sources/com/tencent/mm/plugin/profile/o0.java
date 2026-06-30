package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class o0 implements ns.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f153561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f153563c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f153564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.e0 f153566f;

    public o0(com.tencent.mm.plugin.profile.e0 e0Var, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.storage.z3 z3Var, int i17, boolean z17, java.lang.String str) {
        this.f153566f = e0Var;
        this.f153561a = mMActivity;
        this.f153562b = z3Var;
        this.f153563c = i17;
        this.f153564d = z17;
        this.f153565e = str;
    }

    @Override // ns.i
    public void a() {
        this.f153566f.c(this.f153561a, this.f153562b, this.f153563c, this.f153564d, this.f153565e);
    }
}
