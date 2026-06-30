package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f114860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yf1 f114862f;

    public w2(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, r45.yf1 yf1Var) {
        this.f114861e = v3Var;
        this.f114862f = yf1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.yf1 yf1Var = this.f114862f;
        java.lang.Object obj = yf1Var.getList(0).get(this.f114860d);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114861e;
        v3Var.y1((r45.zf1) obj);
        this.f114860d = (this.f114860d + 1) % yf1Var.getList(0).size();
        v3Var.L.postDelayed(this, (yf1Var.getInteger(1) > 0 ? java.lang.Integer.valueOf(yf1Var.getInteger(1)) : java.lang.Float.valueOf(1000.0f)).longValue());
    }
}
