package ww2;

/* loaded from: classes2.dex */
public final class a implements ww2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f450378a = new java.util.LinkedHashSet();

    @Override // ww2.b
    public java.util.List a(vw2.f event, com.tencent.mm.plugin.finder.model.BaseFinderFeed data) {
        r45.zz3 zz3Var;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!(event instanceof vw2.e)) {
            return arrayList;
        }
        if (data.getFeedObject().getLikeCount() > 0) {
            java.util.Set set = f450378a;
            if (!set.contains(java.lang.Long.valueOf(data.getItemId())) && com.tencent.mm.plugin.finder.storage.FinderItem.Companion.e(data.getFeedObject().getFeedObject()) && !data.B0()) {
                set.add(java.lang.Long.valueOf(data.getItemId()));
                arrayList.add(new vw2.b(500L, 5000L, vw2.c.f440833e));
                return arrayList;
            }
        }
        r45.dm2 object_extend = data.getFeedObject().getFeedObject().getObject_extend();
        if (object_extend != null && (zz3Var = (r45.zz3) object_extend.getCustom(41)) != null) {
            zz3Var.getString(4);
        }
        return arrayList;
    }

    @Override // ww2.b
    public void b(java.util.List views, com.tencent.mm.plugin.finder.model.BaseFinderFeed data) {
        r45.vl2 vl2Var;
        r45.wl2 wl2Var;
        r45.zz3 zz3Var;
        kotlin.jvm.internal.o.g(views, "views");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = views.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = lVar.f302833d == vw2.c.f440833e ? (android.widget.TextView) lVar.f302834e : null;
            if (textView != null) {
                arrayList.add(textView);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.widget.TextView textView2 = (android.widget.TextView) it6.next();
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = data.getFeedObject().getFeedObject();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            boolean z17 = true;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Nd).getValue()).r()).intValue() == 1) {
                feedObject.setObject_extend(null);
            }
            r45.dm2 object_extend = feedObject.getObject_extend();
            java.lang.String string = (object_extend == null || (zz3Var = (r45.zz3) object_extend.getCustom(41)) == null) ? null : zz3Var.getString(4);
            r45.dm2 object_extend2 = feedObject.getObject_extend();
            java.lang.String string2 = (object_extend2 == null || (vl2Var = (r45.vl2) object_extend2.getCustom(27)) == null || (wl2Var = (r45.wl2) vl2Var.getCustom(1)) == null) ? null : wl2Var.getString(4);
            if (string == null || string.length() == 0) {
                if (string2 == null || string2.length() == 0) {
                    r45.bm2 e17 = cu2.f0.f222391a.e(feedObject.getObjectType());
                    string = e17 != null ? e17.getString(11) : null;
                    if (string != null && string.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        string = textView2.getContext().getString(com.tencent.mm.R.string.d1d);
                    }
                } else {
                    string = string2;
                }
            }
            com.tencent.mm.ui.fk.c(textView2);
            textView2.setText(string);
        }
    }
}
