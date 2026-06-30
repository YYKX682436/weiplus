package xc2;

/* loaded from: classes2.dex */
public final class z0 extends xc2.o {
    @Override // xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        java.lang.String u17 = pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = infoEx.f453244f;
        if (baseFinderFeed2 == null || (feedObject = baseFinderFeed2.getFeedObject()) == null || (str = feedObject.getUserName()) == null) {
            str = "";
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        boolean z17 = this.f453166f;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        int currentPosMs = (int) ((finderVideoLayout != null ? finderVideoLayout.getCurrentPosMs() : 0L) / 1000);
        int videoDurationSec = finderVideoLayout != null ? finderVideoLayout.getVideoDurationSec() : 0;
        if (z17) {
            currentPosMs = videoDurationSec;
        }
        int i17 = (int) (((currentPosMs * 1.0f) / videoDurationSec) * 100);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(videoDurationSec);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        infoEx.f453253o = "shortvideoid=" + u17 + "&cpid=" + str + "&duration=" + valueOf.intValue() + "&playPercent=" + valueOf2.intValue() + "&visitorUsername=" + e17 + "&commentScene=" + V6.getInteger(5);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("source_feedid", u17);
        java.lang.String string = V6.getString(1);
        if (string == null) {
            string = "";
        }
        linkedHashMap.put("source_contextid", string);
        java.lang.String string2 = V6.getString(2);
        linkedHashMap.put("source_tabcontextid", string2 != null ? string2 : "");
        linkedHashMap.put("source_commentscene", java.lang.Integer.valueOf(V6.getInteger(5)));
        infoEx.f453243e0 = linkedHashMap;
        super.r(holder, jumpView, infoEx);
    }
}
