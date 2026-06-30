package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class t4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.i f130416d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f130417e;

    public t4(jv2.i commentItem, int i17, yz5.l lVar) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        this.f130416d = commentItem;
        this.f130417e = lVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        jv2.c cVar;
        ec2.d e27;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            jv2.i iVar = this.f130416d;
            if (itemId == 0) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(iVar.f302223d.j())) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.b0.e(iVar.f302223d.j());
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f490361st, 0).show();
                return;
            }
            if (itemId == 1) {
                yz5.l lVar = this.f130417e;
                if (lVar != null) {
                    lVar.invoke(iVar);
                    return;
                }
                return;
            }
            java.lang.String str = null;
            if (itemId != 2) {
                if (itemId != 3) {
                    if (itemId == 999) {
                        if (iVar != null && (cVar = iVar.f302223d) != null) {
                            str = cVar.toString();
                        }
                        com.tencent.mm.sdk.platformtools.b0.e(str);
                        return;
                    }
                    return;
                }
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y yVar = hb2.y.f280114e;
                long itemId2 = iVar.getItemId();
                jv2.c cVar2 = iVar.f302223d;
                long j17 = cVar2.field_feedId;
                java.lang.String str2 = cVar2.field_objectNonceId;
                if (str2 == null) {
                    str2 = "";
                }
                yVar.o(itemId2, j17, str2, true, new com.tencent.mm.plugin.finder.uniComments.s4());
                return;
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jv2.c cVar3 = iVar.f302223d;
            long j18 = cVar3.field_feedId;
            java.lang.String str3 = "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=79&comment_ID=" + cVar3.t0() + "&Content_ID=" + j18;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str3);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).nj(j18);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (e27 = zy2.ra.e2(nyVar, 0, 1, null)) == null) {
                return;
            }
            e27.a(new ec2.a(17, j18, null));
        }
    }
}
