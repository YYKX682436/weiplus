package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class wn implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f133303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f133304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133305c;

    public wn(android.os.Bundle bundle, com.tencent.mm.plugin.finder.view.e3 e3Var, yz5.l lVar) {
        this.f133303a = bundle;
        this.f133304b = e3Var;
        this.f133305c = lVar;
    }

    @Override // zy2.i5
    public void a(java.lang.Object ret) {
        kotlin.jvm.internal.o.g(ret, "ret");
        if (ret instanceof r45.nw6) {
            pm0.v.X(new com.tencent.mm.plugin.finder.view.vn(this.f133303a, ret, this.f133304b, this.f133305c));
        }
    }
}
