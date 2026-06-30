package yt0;

/* loaded from: classes5.dex */
public interface c {
    static /* synthetic */ void Q5(yt0.c cVar, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k kVar, java.util.Map map, boolean z17, zw0.b bVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPanel");
        }
        if ((i17 & 2) != 0) {
            map = null;
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            bVar = zw0.b.f476551e;
        }
        cVar.N0(kVar, map, z17, bVar);
    }

    static void V(yt0.c cVar, java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markStartLoading");
        }
        java.lang.String str3 = (i18 & 2) != 0 ? "" : str;
        java.lang.String str4 = (i18 & 4) != 0 ? "" : str2;
        int i19 = (i18 & 8) != 0 ? -1 : i17;
        cVar.getClass();
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.p2.z(com.tencent.mm.plugin.finder.report.p2.f125237a, moduleName, str3, str4, i19, 0L, 16, null);
    }

    static /* synthetic */ java.lang.Object o(yt0.c cVar, java.lang.String str, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showStateLoadingDialog");
        }
        if ((i17 & 1) != 0) {
            str = null;
        }
        return cVar.A6(str, continuation);
    }

    void A2();

    boolean A4();

    java.lang.Object A6(java.lang.String str, kotlin.coroutines.Continuation continuation);

    default void C6() {
    }

    java.lang.Object E4(kotlin.coroutines.Continuation continuation);

    android.util.SizeF J1();

    default void L(java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((qs2.q) ((w40.e) c17)).rj(moduleName, str, str2, i17);
    }

    void N0(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k kVar, java.util.Map map, boolean z17, zw0.b bVar);

    java.util.List N5();

    default boolean O4(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!h2()) {
            Z2(false);
            return false;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        i0Var.d(com.tencent.mm.R.string.lle);
        i0Var.f(com.tencent.mm.R.string.lkr);
        int color = j65.q.a(context).getColor(com.tencent.mm.R.color.acu, null);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.W = color;
        aVar.E = new yt0.a(this);
        i0Var.e(com.tencent.mm.R.string.apj);
        i0Var.h();
        return true;
    }

    default void Y1(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c18).f221226g.f242285b;
        boolean i17 = o4Var != null ? o4Var.i("KEY_FINDER_HAS_SHOW_SAVE_EDITED_MEDIA_TIPS", false) : false;
        if (!h2() || i17) {
            A2();
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(activity, 2, 0, false, false);
        z2Var.y(activity.getResources().getString(com.tencent.mm.R.string.f490454vi));
        z2Var.F = new yt0.b(z2Var, this);
        z2Var.x(1);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.ejb, (android.view.ViewGroup) null);
        z2Var.j(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        if (textView != null) {
            com.tencent.mm.ui.fk.b(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_w);
        java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.p6p);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.person_regular, textView2.getCurrentTextColor());
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479691cq);
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        int L = r26.n0.L(spannableStringBuilder, "#", 0, false, 6, null);
        if (L >= 0) {
            spannableStringBuilder.setSpan(new al5.v(e17, 2), L, L + 1, 17);
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_w);
        if (textView3 != null) {
            textView3.setText(new android.text.SpannableString(spannableStringBuilder));
        }
        z2Var.C();
        i95.m c19 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = ((cq.k) c19).f221226g.f242285b;
        if (o4Var2 != null) {
            o4Var2.G("KEY_FINDER_HAS_SHOW_SAVE_EDITED_MEDIA_TIPS", true);
        }
    }

    void Z2(boolean z17);

    default bu0.c f1(boolean z17, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        java.lang.String string;
        byte[] byteArray;
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        if (z17 && audioCacheInfo == null) {
            return new bu0.c(configProvider.M.getString("ShootComposingUI.KEY_ORIGIN_MUSIC_ID"), configProvider.M.getByteArray("ShootComposingUI.KEY_ORIGIN_MUSIC_INFO"), java.lang.Integer.valueOf(configProvider.M.getInt("ShootComposingUI.KEY_MEDIA_EXTRA_MUSIC_SOURCE")), configProvider.M.getByteArray("ShootComposingUI.MEDIA_EXTRA_MUSIC"));
        }
        if (audioCacheInfo == null || !audioCacheInfo.f155722s) {
            if (audioCacheInfo == null || audioCacheInfo.f155722s) {
                return null;
            }
            return new bu0.c(null, null, java.lang.Integer.valueOf(audioCacheInfo.f155719p), audioCacheInfo.f155710d.toByteArray());
        }
        android.os.Bundle bundle = configProvider.M;
        if (bundle == null || (string = bundle.getString("KEY_FINDER_POST_ORIGIN_MUSIC_ID")) == null) {
            android.os.Bundle bundle2 = configProvider.M;
            string = bundle2 != null ? bundle2.getString("KEY_ORIGIN_MUSIC_ID") : null;
        }
        android.os.Bundle bundle3 = configProvider.M;
        if (bundle3 == null || (byteArray = bundle3.getByteArray("KEY_FINDER_POST_ORIGIN_MUSIC_INFO")) == null) {
            android.os.Bundle bundle4 = configProvider.M;
            byteArray = bundle4 != null ? bundle4.getByteArray("KEY_ORIGIN_MUSIC_INFO") : null;
        }
        return new bu0.c(string, byteArray, null, null);
    }

    yw0.n f2();

    boolean h2();

    void j();

    com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig l2();

    nv0.d v6();
}
