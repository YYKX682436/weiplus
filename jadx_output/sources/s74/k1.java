package s74;

/* loaded from: classes4.dex */
public final class k1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404389g;

    public k1(s74.f3 f3Var, s74.o2 o2Var, java.lang.String str, java.lang.String str2) {
        this.f404386d = f3Var;
        this.f404387e = o2Var;
        this.f404388f = str;
        this.f404389g = str2;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        org.json.JSONObject g17;
        java.lang.String x17;
        android.widget.Button g18;
        org.json.JSONObject g19;
        java.lang.String x18;
        android.widget.Button g27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        i64.r rVar = (i64.r) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        s74.f3 f3Var = this.f404386d;
        androidx.appcompat.widget.AppCompatImageView c17 = f3Var.c();
        if (c17 != null) {
            c17.setTag(com.tencent.mm.R.id.n1z, "");
        }
        s74.o2 o2Var = this.f404387e;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e(o2Var.j(), "null in observe AdDownloadModel! " + this.f404388f + ' ' + this.f404389g);
            androidx.appcompat.widget.AppCompatImageView c18 = f3Var.c();
            if (c18 != null) {
                c18.setImageResource(com.tencent.mm.R.raw.light_download_icon);
            }
            android.widget.Button g28 = f3Var.g();
            if (g28 != null && (g19 = s74.q4.f404513a.g(g28)) != null && (x18 = s74.u3.f404562a.x(g19, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, f3Var.e())) != null && (g27 = f3Var.g()) != null) {
                g27.setText(x18);
            }
        } else {
            com.tencent.mars.xlog.Log.i(o2Var.j(), "observeActionButtonUI state = " + rVar.a());
            int a17 = rVar.a();
            if (a17 == 1) {
                android.widget.Button g29 = f3Var.g();
                if (g29 != null) {
                    g29.setText(com.tencent.mm.R.string.f493165j62);
                }
            } else if (a17 == 2) {
                android.widget.Button g37 = f3Var.g();
                if (g37 != null) {
                    g37.setText(com.tencent.mm.R.string.j67);
                }
            } else if (a17 == 3) {
                android.widget.Button g38 = f3Var.g();
                if (g38 != null) {
                    g38.setText(com.tencent.mm.R.string.f493166j63);
                }
            } else if (a17 != 5) {
                android.widget.Button g39 = f3Var.g();
                if (g39 != null && (g17 = s74.q4.f404513a.g(g39)) != null && (x17 = s74.u3.f404562a.x(g17, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, f3Var.e())) != null && (g18 = f3Var.g()) != null) {
                    g18.setText(x17);
                }
            } else {
                android.widget.Button g47 = f3Var.g();
                if (g47 != null) {
                    g47.setText(com.tencent.mm.R.string.f493167j64);
                }
            }
            if (rVar.a() == 5) {
                androidx.appcompat.widget.AppCompatImageView c19 = f3Var.c();
                if (c19 != null) {
                    c19.setImageResource(com.tencent.mm.R.raw.album_advertise_link_icon);
                }
            } else {
                androidx.appcompat.widget.AppCompatImageView c27 = f3Var.c();
                if (c27 != null) {
                    c27.setImageResource(com.tencent.mm.R.raw.light_download_icon);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionButtonUI$2$1");
        return f0Var;
    }
}
