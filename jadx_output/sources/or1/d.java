package or1;

/* loaded from: classes12.dex */
public class d extends fb5.b {
    public d(or1.f fVar) {
    }

    @Override // fb5.b
    public void a(android.view.View view, fb5.a aVar) {
        if (view == null || aVar == null || !(aVar instanceof or1.e)) {
            return;
        }
        or1.e eVar = (or1.e) aVar;
        eVar.f320684a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9n);
        eVar.f347477c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbg);
        eVar.f347476b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
        eVar.f347480f = view.findViewById(com.tencent.mm.R.id.f483390aj3);
        eVar.f347479e = view.findViewById(com.tencent.mm.R.id.f487538ox2);
        eVar.f347478d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hed);
    }

    @Override // fb5.b
    public void b(android.content.Context context, fb5.a aVar, fb5.c cVar, java.lang.Object... objArr) {
        java.lang.Object obj;
        if (context == null || aVar == null || cVar == null || (obj = cVar.f260882b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizRecommDataItem", "Context or ViewHolder or DataItem or DataItem.data is null.");
            return;
        }
        if (!(aVar instanceof or1.e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of BizRecommViewHolder.");
            return;
        }
        if (!(obj instanceof r45.fx5)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizRecommDataItem", "The ViewHolder is not a instance of SearchOrRecommendItem.");
            return;
        }
        or1.e eVar = (or1.e) aVar;
        or1.f fVar = (or1.f) cVar;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(eVar.f320684a, fVar.f347487i);
        eVar.f347477c.setText(fVar.f347486h, android.widget.TextView.BufferType.SPANNABLE);
        android.view.View view = eVar.f347480f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = eVar.f347479e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/BizRecommDataItem$1", "fillingView", "(Landroid/content/Context;Lcom/tencent/mm/ui/base/sortview/BaseDataItem$BaseViewHolder;Lcom/tencent/mm/ui/base/sortview/BaseDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        eVar.f347478d.setText((java.lang.CharSequence) null, android.widget.TextView.BufferType.SPANNABLE);
        lr1.m.b(eVar.f347476b, fVar.f347488j);
    }

    @Override // fb5.b
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        return view == null ? android.view.View.inflate(context, com.tencent.mm.R.layout.ciy, null) : view;
    }

    @Override // fb5.b
    public boolean d(android.content.Context context, android.view.View view, fb5.c cVar, java.lang.Object... objArr) {
        or1.m mVar;
        or1.l lVar;
        if (!(cVar instanceof or1.f)) {
            return false;
        }
        or1.f fVar = (or1.f) cVar;
        r45.fx5 fx5Var = (r45.fx5) cVar.f260882b;
        r45.du5 du5Var = fx5Var.f374702e;
        java.lang.String str = du5Var != null ? du5Var.f372756d : null;
        r45.du5 du5Var2 = fx5Var.f374701d;
        java.lang.String str2 = du5Var2 != null ? du5Var2.f372756d : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizRecommDataItem", "onItemClick but username is null");
            return false;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        android.content.Intent intent = new android.content.Intent();
        if (n17.r2()) {
            intent.putExtra("Contact_User", str2);
            intent.putExtra("Contact_Scene", 55);
        } else {
            intent.putExtra("Contact_User", str2);
            intent.putExtra("Contact_Alias", fx5Var.f374711q);
            intent.putExtra("Contact_Nick", str);
            intent.putExtra("Contact_Signature", fx5Var.f374706i);
            intent.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(fx5Var.f374714t, fx5Var.f374704g, fx5Var.f374705h));
            intent.putExtra("Contact_Sex", fx5Var.f374703f);
            intent.putExtra("Contact_VUser_Info", fx5Var.f374709o);
            intent.putExtra("Contact_VUser_Info_Flag", fx5Var.f374708n);
            intent.putExtra("Contact_KWeibo_flag", fx5Var.f374713s);
            intent.putExtra("Contact_KWeibo", fx5Var.f374710p);
            intent.putExtra("Contact_KWeiboNick", fx5Var.f374712r);
            intent.putExtra("Contact_Scene", 55);
            r45.va0 va0Var = fx5Var.f374715u;
            if (va0Var != null) {
                try {
                    intent.putExtra("Contact_customInfo", va0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizRecommDataItem", e17, "", new java.lang.Object[0]);
                }
            }
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
        if (objArr != null && objArr.length > 0) {
            java.lang.Object obj = objArr[0];
            if (obj instanceof or1.m) {
                mVar = (or1.m) obj;
                lVar = fVar.f357933g;
                if (lVar != null && mVar != null) {
                    lVar.a(mVar, cVar, 1, str2, fVar.f357932f, fVar.f357931e);
                }
                return true;
            }
        }
        mVar = null;
        lVar = fVar.f357933g;
        if (lVar != null) {
            lVar.a(mVar, cVar, 1, str2, fVar.f357932f, fVar.f357931e);
        }
        return true;
    }
}
