package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/l4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class l4 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f143656g;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Context c17 = c();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(c17);
        e4Var.f211776c = c().getString(com.tencent.mm.R.string.f490604zq);
        e4Var.f211780g = 2;
        e4Var.f211778e = true;
        this.f143656g = e4Var.c();
        new java.util.LinkedList().add(1);
        r45.ly6 ly6Var = new r45.ly6();
        ly6Var.f379980d = 1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gy6 gy6Var = new r45.gy6();
        gy6Var.f375650d = "gh_43f2581f6fd6";
        linkedList.add(gy6Var);
        ly6Var.f379982f = linkedList;
        ly6Var.f379981e = 1;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(1);
        ly6Var.f379985i = linkedList2;
        ly6Var.f379984h = 1;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 137;
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifyuser";
        lVar.f70664a = ly6Var;
        lVar.f70665b = new r45.my6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().K(new com.tencent.mm.plugin.lite.jsapi.comms.k4(this));
    }
}
