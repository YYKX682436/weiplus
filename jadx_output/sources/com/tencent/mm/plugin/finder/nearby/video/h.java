package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class h implements db2.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.j f122197a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f122198b;

    public h(com.tencent.mm.plugin.finder.nearby.video.j jVar, fp0.r rVar) {
        this.f122197a = jVar;
        this.f122198b = rVar;
    }

    @Override // db2.v3
    public boolean a(int i17, int i18, java.lang.String str, r45.ny3 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.nearby.video.j jVar = this.f122197a;
        fp0.t tVar = jVar.f122205f;
        fp0.r rVar = this.f122198b;
        if (tVar != null && tVar.f265286f == rVar.f265279h) {
            return false;
        }
        rVar.b(fp0.u.f265290f);
        java.lang.String tag = jVar.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isFetchConsume] executorToken=");
        fp0.t tVar2 = jVar.f122205f;
        sb6.append(tVar2 != null ? java.lang.Integer.valueOf(tVar2.f265286f) : null);
        sb6.append(" taskToken=");
        sb6.append(rVar.f265279h);
        com.tencent.mars.xlog.Log.w(tag, sb6.toString());
        return true;
    }
}
