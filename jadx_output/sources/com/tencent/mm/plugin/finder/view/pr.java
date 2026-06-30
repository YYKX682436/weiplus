package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class pr implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LoadingSwitchBtn f132858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f132859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f132860d;

    public pr(yz5.a aVar, com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn, kotlinx.coroutines.y0 y0Var, yz5.p pVar) {
        this.f132857a = aVar;
        this.f132858b = loadingSwitchBtn;
        this.f132859c = y0Var;
        this.f132860d = pVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        boolean booleanValue = ((java.lang.Boolean) this.f132857a.invoke()).booleanValue();
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn loadingSwitchBtn = this.f132858b;
        if (z17 == booleanValue) {
            com.tencent.mars.xlog.Log.i(loadingSwitchBtn.R, "setSwitchListener isCheck:" + z17 + " equals currentState, skip");
            return;
        }
        if (!kotlinx.coroutines.z0.h(this.f132859c)) {
            com.tencent.mars.xlog.Log.i(loadingSwitchBtn.R, "setSwitchListener isCheck:" + z17 + " but !scope.isActive");
            return;
        }
        com.tencent.mars.xlog.Log.i(loadingSwitchBtn.R, "click:" + z17);
        loadingSwitchBtn.setEnabled(false);
        kotlinx.coroutines.y0 y0Var = this.f132859c;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.finder.view.or(loadingSwitchBtn, this.f132860d, z17, null), 2, null);
    }
}
