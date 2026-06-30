package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class l2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.v2 f182553d;

    public l2(com.tencent.mm.plugin.webview.luggage.v2 v2Var) {
        this.f182553d = v2Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.webview.luggage.v2 v2Var = this.f182553d;
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = v2Var.f182637a;
        android.content.Context context = e0Var.f406610d;
        com.tencent.mm.plugin.webview.luggage.menu.y yVar = v2Var.f182638b;
        for (com.tencent.mm.plugin.webview.luggage.menu.z zVar : yVar.f182569a) {
            if (!zVar.f182573c && !zVar.f182575e) {
                com.tencent.mm.plugin.webview.luggage.menu.a aVar = (com.tencent.mm.plugin.webview.luggage.menu.a) ((java.util.HashMap) yVar.f182570b).get(java.lang.Integer.valueOf(zVar.f182571a));
                if (aVar != null) {
                    aVar.a(context, e0Var, g4Var);
                }
            }
        }
    }
}
