package r23;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final r23.e f368822d = new r23.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_total_duration_seconds, 600);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaTotalDurationLimitSeconds: " + Ni);
        if (r23.j.f368833g / 1000 > Ni) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f492180fi4, java.lang.Integer.valueOf(a06.d.b(Ni / 60.0f))));
            z17 = false;
        } else {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
