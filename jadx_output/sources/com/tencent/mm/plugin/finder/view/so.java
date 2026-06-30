package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class so extends com.tencent.mm.plugin.finder.view.hk implements com.tencent.mm.plugin.finder.view.dp {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f133070d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.kp f133071e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.cp f133072f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.oo f133073g;

    public so(yz5.p selectListener) {
        kotlin.jvm.internal.o.g(selectListener, "selectListener");
        this.f133070d = selectListener;
        this.f133071e = new com.tencent.mm.plugin.finder.view.kp(this);
        this.f133072f = new com.tencent.mm.plugin.finder.view.cp(this);
        this.f133073g = new com.tencent.mm.plugin.finder.view.oo();
    }

    public void d(int i17) {
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTeamConditionBottomSheet", "selectValue " + i17);
        java.util.Iterator it = this.f132250c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = true;
            if (((r45.u24) ((com.tencent.mm.plugin.finder.view.dk) obj).f131900d).getInteger(1) != 7) {
                z17 = false;
            }
            if (z17) {
                break;
            }
        }
        com.tencent.mm.plugin.finder.view.dk dkVar = (com.tencent.mm.plugin.finder.view.dk) obj;
        if (dkVar != null) {
            this.f133070d.invoke(dkVar.f131900d, java.lang.Integer.valueOf(i17));
        }
        b().q();
    }
}
