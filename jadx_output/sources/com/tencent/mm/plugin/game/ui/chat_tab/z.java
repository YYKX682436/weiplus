package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public int f141342d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f141343e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView f141344f;

    public z(com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView gameHotMsgView) {
        this.f141344f = gameHotMsgView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.LinkedList) this.f141343e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.game.ui.chat_tab.y yVar = (com.tencent.mm.plugin.game.ui.chat_tab.y) k3Var;
        com.tencent.mm.plugin.game.ui.chat_tab.a0 a0Var = (com.tencent.mm.plugin.game.ui.chat_tab.a0) ((java.util.LinkedList) this.f141343e).get(i17);
        yVar.itemView.setOnClickListener(new com.tencent.mm.plugin.game.ui.chat_tab.x(yVar, a0Var, i17));
        android.widget.TextView textView = yVar.f141336h;
        textView.setVisibility(8);
        yVar.f141337i.setVisibility(8);
        z53.i iVar = a0Var.f141233e;
        com.tencent.mm.plugin.game.ui.chat_tab.z zVar = yVar.f141338m;
        if (iVar != null) {
            ng5.a.a(yVar.f141334f, iVar.field_talker);
            yVar.f141335g.setText(a0Var.f141233e.G);
            if (a0Var.f141233e.field_unReadCount > 0) {
                textView.setVisibility(0);
                int i18 = a0Var.f141233e.field_unReadCount;
                if (i18 > 99) {
                    textView.setText("");
                    textView.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
                } else {
                    textView.setText(java.lang.String.valueOf(i18));
                    textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(zVar.f141344f.f141123f2, i18));
                }
            }
            java.util.Map map = yVar.f141332d;
            java.lang.String str = a0Var.f141233e.field_sessionId;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (!hashMap.containsKey(str)) {
                java.lang.String str2 = a0Var.f141233e.field_sessionId;
                hashMap.put(str2 != null ? str2 : "", java.lang.Boolean.TRUE);
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(a0Var.f141233e.field_selfUserName);
                z53.i iVar2 = a0Var.f141233e;
                y53.m mVar = iVar2.F;
                if (mVar != null && Di != null) {
                    com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
                    int i19 = i17 + 1;
                    int i27 = zVar.f141342d;
                    java.lang.String str3 = iVar2.field_sessionId;
                    long j17 = Di.field_accountType;
                    java.lang.String str4 = iVar2.field_selfUserName;
                    long j18 = mVar.field_accountType;
                    java.lang.String str5 = iVar2.field_talker;
                    long t07 = iVar2.t0();
                    com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView gameHotMsgView = zVar.f141344f;
                    long j19 = gameHotMsgView.f141124g2;
                    if (j19 <= 0) {
                        j19 = gameHotMsgView.f141125h2;
                    }
                    dVar.f(i19, 1L, i27, str3, j17, str4, j18, str5, t07, (int) j19, null, java.lang.Integer.valueOf(a0Var.f141233e.field_unReadCount));
                }
            }
        }
        if (yVar.f141333e) {
            yVar.f141333e = false;
            int i28 = zVar.f141342d;
            com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView gameHotMsgView2 = zVar.f141344f;
            long j27 = gameHotMsgView2.f141124g2;
            if (j27 <= 0) {
                j27 = gameHotMsgView2.f141125h2;
            }
            com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
            gameLifeSessionStruct.f58340d = 2L;
            gameLifeSessionStruct.f58341e = 202L;
            gameLifeSessionStruct.f58342f = 0L;
            gameLifeSessionStruct.f58343g = 1L;
            gameLifeSessionStruct.f58344h = (int) j27;
            gameLifeSessionStruct.f58351o = i28;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("list_state", i28 == 0 ? 2 : 1);
            gameLifeSessionStruct.p(java.net.URLEncoder.encode(jSONObject.toString()));
            gameLifeSessionStruct.k();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.game.ui.chat_tab.y(this, android.view.LayoutInflater.from(this.f141344f.f141123f2).inflate(com.tencent.mm.R.layout.bgc, (android.view.ViewGroup) null));
    }
}
