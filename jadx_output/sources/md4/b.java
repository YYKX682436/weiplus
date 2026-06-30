package md4;

/* loaded from: classes.dex */
public final class b implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f325871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f325872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f325873c;

    public b(java.lang.ref.WeakReference weakReference, android.widget.TextView textView, android.content.Context context) {
        this.f325871a = weakReference;
        this.f325872b = textView;
        this.f325873c = context;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
        java.lang.ref.WeakReference weakReference = this.f325871a;
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
        if (imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        java.lang.Object tag = imageView.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str2 = (java.lang.String) tag;
        android.content.Context context = this.f325873c;
        android.widget.TextView textView = this.f325872b;
        if (n17 != null && ((int) n17.E2) > 0 && (imageView.getTag() instanceof java.lang.String) && c01.e2.G(str) && com.tencent.mm.sdk.platformtools.t8.D0(str2, str)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
            if (n07 == null || com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
            } else {
                md4.e.f325877a.a(imageView, n17, n07.d(), true);
            }
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, e17, textSize));
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f493199oj4);
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize2));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$refreshSrcInfo$1");
    }
}
