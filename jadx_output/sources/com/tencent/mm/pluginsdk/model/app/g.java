package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f188900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.h3 f188901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.f f188902f;

    public g(com.tencent.mm.pluginsdk.model.app.f fVar, int i17, com.tencent.mm.pluginsdk.model.app.h3 h3Var) {
        this.f188902f = fVar;
        this.f188900d = i17;
        this.f188901e = h3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.model.app.f fVar = this.f188902f;
        java.util.Map map = fVar.f188883d;
        int i17 = this.f188900d;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
            ((java.util.HashMap) fVar.f188883d).put(java.lang.Integer.valueOf(i17), new java.util.HashSet());
        }
        if (((java.util.HashMap) fVar.f188883d).get(java.lang.Integer.valueOf(i17)) != null) {
            java.util.Set set = (java.util.Set) ((java.util.HashMap) fVar.f188883d).get(java.lang.Integer.valueOf(i17));
            com.tencent.mm.pluginsdk.model.app.h3 h3Var = this.f188901e;
            if (set.contains(h3Var)) {
                return;
            }
            ((java.util.Set) ((java.util.HashMap) fVar.f188883d).get(java.lang.Integer.valueOf(i17))).add(h3Var);
        }
    }
}
