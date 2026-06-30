package com.tencent.mm.udr;

/* loaded from: classes12.dex */
public final class v0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.udr.a1 f196515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ea5.k f196516e;

    public v0(com.tencent.mm.udr.a1 a1Var, ea5.k kVar) {
        this.f196515d = a1Var;
        this.f196516e = kVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.d(bundle);
        com.tencent.mm.udr.a1.wi(this.f196515d, bundle, this.f196516e);
    }
}
