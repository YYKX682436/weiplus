package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class d implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.f f122173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db2.v3 f122174b;

    public d(com.tencent.mm.plugin.finder.nearby.video.f fVar, db2.v3 v3Var) {
        this.f122173a = fVar;
        this.f122174b = v3Var;
    }

    @Override // db2.d3
    public boolean isBeginHistory() {
        return this.f122173a.f122191m;
    }

    @Override // db2.d3
    public boolean isResultConsume(int i17, int i18, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        db2.v3 v3Var = this.f122174b;
        if (v3Var != null) {
            return v3Var.a(i17, i18, null, resp);
        }
        return false;
    }

    @Override // db2.d3
    public void onBuildRequest(db2.b3 request) {
        kotlin.jvm.internal.o.g(request, "request");
    }

    @Override // db2.d3
    public void onLoadFinish() {
    }
}
