package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class x1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Context c17 = c();
        long j17 = this.f143442e.f299024a;
        com.tencent.mm.plugin.lite.jsapi.comms.w1 w1Var = new com.tencent.mm.plugin.lite.jsapi.comms.w1(this);
        java.util.HashMap hashMap = ra3.m.f393522a;
        com.tencent.mm.plugin.lite.ui.e eVar = (com.tencent.mm.plugin.lite.ui.e) hashMap.get(java.lang.Long.valueOf(j17));
        if (eVar != null && eVar.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppEmoticonUtil", "repeat invoke, skip ...");
            return;
        }
        if (!(c17 instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppEmoticonUtil", "illegal context, fail");
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(c17);
        boolean optBoolean = jSONObject.optBoolean("showEmoji");
        boolean optBoolean2 = jSONObject.optBoolean("showCustom");
        boolean optBoolean3 = jSONObject.optBoolean("showStore");
        boolean optBoolean4 = jSONObject.optBoolean("showCamera");
        boolean optBoolean5 = jSONObject.optBoolean("showSearch");
        boolean optBoolean6 = jSONObject.optBoolean("showGame");
        wi6.setShowSmiley(optBoolean);
        wi6.p(optBoolean2, true);
        wi6.setShowStore(optBoolean3);
        wi6.o(optBoolean4, true);
        wi6.setShowSearch(optBoolean5);
        wi6.setShowGame(optBoolean6);
        com.tencent.mm.plugin.lite.ui.e[] eVarArr = {new com.tencent.mm.plugin.lite.ui.e(c17)};
        hashMap.put(java.lang.Long.valueOf(j17), eVarArr[0]);
        android.view.View inflate = ((android.app.Activity) c17).getLayoutInflater().inflate(com.tencent.mm.R.layout.di_, (android.view.ViewGroup) null);
        eVarArr[0].setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        eVarArr[0].f144395f = new ra3.g(eVarArr);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.qfw);
        boolean[] zArr = {false};
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
        ra3.h hVar = new ra3.h(zArr, w1Var, eVarArr);
        ra3.i iVar = new ra3.i(eVarArr, zArr);
        wi6.setEntranceScene(0);
        wi6.setVisibility(0);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(viewGroup.getContext()));
        layoutParams.gravity = 80;
        viewGroup.removeAllViews();
        viewGroup.addView(wi6, layoutParams);
        ra3.f fVar = new ra3.f(iVar);
        fVar.f364351a = hVar;
        wi6.setCallback(fVar);
        eVarArr[0].setOnDismissListener(new ra3.j(zArr, eVarArr, j17));
        eVarArr[0].show();
    }
}
