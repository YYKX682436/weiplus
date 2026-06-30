package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.q f173301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mvvmlist.MvvmList f173302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nj4.e f173303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f173304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f173305h;

    public l(com.tencent.mm.plugin.textstatus.convert.topic.q qVar, com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList, nj4.e eVar, kotlin.jvm.internal.h0 h0Var, java.util.List list) {
        this.f173301d = qVar;
        this.f173302e = mvvmList;
        this.f173303f = eVar;
        this.f173304g = h0Var;
        this.f173305h = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f173301d.f173356w = false;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f173302e;
        if (mvvmList != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.q(mvvmList, new com.tencent.mm.plugin.textstatus.convert.topic.d(this.f173303f, "arrow@name", ((com.tencent.mm.plugin.textstatus.convert.topic.d) ((java.util.List) this.f173304g.f310123d).get(r0.f173253e - 1)).f173266f - 1000, null, this.f173305h, 8, null), false, 2, null);
        }
    }
}
