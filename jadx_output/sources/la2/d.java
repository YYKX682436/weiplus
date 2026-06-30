package la2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final la2.d f317510a = new la2.d();

    public static void a(la2.d dVar, android.content.Context context, r45.ze2 location, boolean z17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        if ((i18 & 8) != 0) {
            i17 = 5;
        }
        dVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(location, "location");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(location.getString(5))) {
            java.lang.String MM_NEAR_LIFE_URI = o45.yf.f343037a;
            kotlin.jvm.internal.o.f(MM_NEAR_LIFE_URI, "MM_NEAR_LIFE_URI");
            java.lang.String format = java.lang.String.format(MM_NEAR_LIFE_URI, java.util.Arrays.copyOf(new java.lang.Object[]{location.getString(5)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("map_view_type", 7);
        intent2.putExtra("kwebmap_slat", java.lang.Double.valueOf(location.getFloat(1)));
        intent2.putExtra("kwebmap_lng", java.lang.Double.valueOf(location.getFloat(0)));
        intent2.putExtra("kwebmap_scale", i17);
        java.lang.String string = location.getString(3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            string = location.getString(2);
        }
        intent2.putExtra("kPoiName", string);
        intent2.putExtra("Kwebmap_locaion", location.getString(4));
        intent2.putExtra("kShowshare", z17);
        j45.l.j(context, ya.b.LOCATION, ".ui.RedirectUI", intent2, null);
    }

    public final void b(android.content.Context context, android.content.Intent intent, int i17, r45.f96 location, boolean z17, int i18, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(location, "location");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("map_view_type", i17);
        intent.putExtra("kwebmap_slat", location.getFloat(1));
        intent.putExtra("kwebmap_lng", location.getFloat(0));
        intent.putExtra("kPoiid", location.getString(5));
        intent.putExtra("KIsFromPoiList", location.getBoolean(16));
        if (z19) {
            intent.putExtra("key_enable_flutter_poi", z19);
        }
        java.lang.String string = location.getString(3);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            string = location.getString(2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(location.getString(4))) {
                i18 = 9;
            }
        }
        intent.putExtra("kPoiName", string);
        intent.putExtra("Kwebmap_locaion", location.getString(4));
        intent.putExtra("kwebmap_scale", i18);
        intent.putExtra("kShowshare", z17);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        intent.putExtra("key_drawer_expend", z18);
        if (intent.getSerializableExtra("key_from_type") == null) {
            intent.putExtra("key_from_type", zy2.o9.f477517e);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        java.lang.String string2 = nyVar != null ? nyVar.V6().getString(1) : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            intent.putExtra("key_context_id", string2);
        }
        j45.l.j(context, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
    }
}
