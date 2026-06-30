package com.tencent.mm.plugin.newtips.model;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.newtips.model.a f152375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f152376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f152377f;

    public h(com.tencent.mm.plugin.newtips.model.a aVar, android.util.Pair pair, boolean z17) {
        this.f152375d = aVar;
        this.f152376e = pair;
        this.f152377f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.newtips.model.a aVar = this.f152375d;
        android.util.Pair pair = this.f152376e;
        boolean z17 = this.f152377f;
        android.util.Pair f17 = com.tencent.mm.plugin.newtips.model.i.f(aVar, pair, z17);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = aVar.getPath();
        java.lang.Object obj = pair.first;
        if (obj == null) {
            obj = "null";
        }
        objArr[1] = obj;
        objArr[2] = com.tencent.mm.plugin.newtips.model.i.m((r45.pm6) pair.second);
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = f17.first;
        objArr[5] = f17.second;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsHelper", "showNewTipsMainThread() path:%s pair:(%s, %s) show:%s state:%s result:%s", objArr);
    }
}
