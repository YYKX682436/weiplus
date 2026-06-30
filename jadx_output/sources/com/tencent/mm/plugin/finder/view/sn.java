package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class sn implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f133063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f133064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f133065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f133066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f133067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.gz0 f133068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133069g;

    public sn(java.lang.String str, android.os.Bundle bundle, com.tencent.mm.plugin.finder.view.e3 e3Var, int i17, kotlin.jvm.internal.f0 f0Var, r45.gz0 gz0Var, yz5.l lVar) {
        this.f133063a = str;
        this.f133064b = bundle;
        this.f133065c = e3Var;
        this.f133066d = i17;
        this.f133067e = f0Var;
        this.f133068f = gz0Var;
        this.f133069g = lVar;
    }

    @Override // zy2.c6
    public final void a(zy2.dc dcVar) {
        java.lang.String str = ((ya2.b2) dcVar).field_v5username;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = ((ya2.b2) dcVar).D0();
        }
        com.tencent.mm.plugin.finder.assist.k8.f102328a.e(str, this.f133063a, null, new com.tencent.mm.plugin.finder.view.wn(this.f133064b, this.f133065c, this.f133069g), null, true, this.f133066d, this.f133067e.f310116d, this.f133068f);
    }
}
