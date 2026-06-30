package mh2;

/* loaded from: classes10.dex */
public final class q implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326439d;

    public q(com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget) {
        this.f326439d = kTVInteractiveWidget;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.ay1 ay1Var;
        java.util.List list = (java.util.List) obj;
        java.lang.String str = null;
        r45.yx1 yx1Var = list != null ? (r45.yx1) kz5.n0.Z(list) : null;
        if (yx1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Song state updated: ");
            r45.by1 by1Var = yx1Var.f391466o;
            if (by1Var != null && (ay1Var = by1Var.f371143d) != null) {
                str = ay1Var.f370351e;
            }
            sb6.append(str);
            sb6.append(", pause=");
            sb6.append(yx1Var.f391465n);
            com.tencent.mars.xlog.Log.i("KTVInteractiveWidget", sb6.toString());
            int i17 = com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget.f111662p;
            this.f326439d.b(yx1Var);
        }
        return jz5.f0.f302826a;
    }
}
