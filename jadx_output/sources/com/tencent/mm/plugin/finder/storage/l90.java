package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class l90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f127122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(1);
        this.f127122d = finderItem;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context context;
        java.lang.String nickname = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f127122d;
        java.lang.ref.WeakReference weakReference = finderItem.getTopicClickExtra().f102475d;
        android.content.Context context2 = weakReference != null ? (android.content.Context) weakReference.get() : null;
        cl0.g gVar = new cl0.g();
        gVar.o("entry_mode", 1);
        gVar.p("remind_feedid", finderItem.getFeedObject().getId());
        c61.p2 p2Var = (c61.p2) ybVar;
        p2Var.getClass();
        if (context2 != null) {
            java.util.HashMap hashMap = p2Var.f39216f;
            if (hashMap.containsKey(nickname)) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) hashMap.get(nickname);
                java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(username) || username == null) {
                    com.tencent.mars.xlog.Log.i("FinderCommonService", "username nil");
                    db5.t7.makeText(context2, com.tencent.mm.R.string.clo, 0).show();
                } else {
                    p2Var.vj(username, context2, finderItem, context2, gVar);
                }
                context = context2;
            } else {
                context = context2;
                new db2.u1(kz5.b0.c(nickname), null).l().K(new c61.j2(p2Var, nickname, context2, finderItem, gVar));
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("nickname", nickname);
            } catch (org.json.JSONException unused) {
            }
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "link_at_profile", 1, jSONObject, false, null, 48, null);
        }
        return jz5.f0.f302826a;
    }
}
