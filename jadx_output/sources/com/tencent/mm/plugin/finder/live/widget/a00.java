package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class a00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f117711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f117712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117713c;

    public a00(yz5.p pVar, com.tencent.mm.plugin.finder.live.widget.m10 m10Var, java.lang.String str) {
        this.f117711a = pVar;
        this.f117712b = m10Var;
        this.f117713c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "team up, check minor result: errCode: " + fVar.f70616b + ", errType: " + fVar.f70615a + ", errMsg: " + fVar.f70617c);
        int i17 = fVar.f70616b;
        yz5.p pVar = this.f117711a;
        if (i17 != -1) {
            java.lang.String str = fVar.f70617c;
            if (str == null) {
                str = "";
            }
            if (!(str.length() > 0)) {
                java.util.Map map = this.f117712b.O;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                map.put(this.f117713c, bool);
                pVar.invoke(bool, null);
                return jz5.f0.f302826a;
            }
        }
        pVar.invoke(java.lang.Boolean.FALSE, fVar.f70617c);
        return jz5.f0.f302826a;
    }
}
