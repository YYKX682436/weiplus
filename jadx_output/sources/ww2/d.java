package ww2;

/* loaded from: classes2.dex */
public final class d implements ww2.b {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f450381b = new java.util.LinkedHashSet();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f450382a;

    public d(boolean z17) {
        this.f450382a = z17;
    }

    @Override // ww2.b
    public java.util.List a(vw2.f event, com.tencent.mm.plugin.finder.model.BaseFinderFeed data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127793ke).getValue()).r()).booleanValue()) {
            return arrayList;
        }
        if ((event instanceof vw2.e) && ((vw2.e) event).f440838b <= 1) {
            if (!this.f450382a || !hc2.b0.i(data)) {
                boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127865oe).getValue()).r()).booleanValue();
                bw5.ms0 ms0Var = bw5.ms0.emFinderNewbieGuideType_ThumbHeartLikeEdu;
                if ((booleanValue || com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance().canShowEduTipsWithKey(ms0Var)) && nv2.o.f340558e.b(data.getFeedObject().getFeedObject()) != 0 && data.getFeedObject().getLikeCount() != 0) {
                    java.util.Set set = f450381b;
                    if (!set.contains(java.lang.Long.valueOf(data.getItemId()))) {
                        com.tencent.wechat.aff.finder.FinderPrefetchManager.getInstance().markShowOnceEduTipsWithKey(ms0Var);
                        set.add(java.lang.Long.valueOf(data.getItemId()));
                        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127775je).getValue()).r()).intValue();
                        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127811le;
                        arrayList.add(new vw2.b(intValue, ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue(), vw2.c.f440832d));
                        arrayList.add(new vw2.b(((java.lang.Number) ((lb2.j) ((jz5.n) r3).getValue()).r()).intValue(), ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue(), vw2.c.f440833e));
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // ww2.b
    public void b(java.util.List views, com.tencent.mm.plugin.finder.model.BaseFinderFeed data) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(views, "views");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Iterator it = views.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            vw2.c cVar = (vw2.c) lVar.f302833d;
            android.widget.TextView textView = (android.widget.TextView) lVar.f302834e;
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                string = textView.getContext().getString(com.tencent.mm.R.string.ms7);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                string = textView.getContext().getString(com.tencent.mm.R.string.mhw);
            }
            textView.setText(string);
        }
    }
}
