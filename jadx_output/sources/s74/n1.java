package s74;

/* loaded from: classes4.dex */
public final class n1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404439g;

    public n1(s74.f3 f3Var, s74.o2 o2Var, java.lang.String str, java.lang.String str2) {
        this.f404436d = f3Var;
        this.f404437e = o2Var;
        this.f404438f = str;
        this.f404439g = str2;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        org.json.JSONObject g17;
        java.lang.String x17;
        androidx.appcompat.widget.AppCompatTextView d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3$1");
        i64.r rVar = (i64.r) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3$1");
        s74.f3 f3Var = this.f404436d;
        androidx.appcompat.widget.AppCompatImageView c17 = f3Var.c();
        if (c17 != null) {
            c17.setTag(com.tencent.mm.R.id.n1z, "");
        }
        s74.o2 o2Var = this.f404437e;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e(o2Var.j(), "null in observe AdDownloadModel! " + this.f404438f + ' ' + this.f404439g);
            androidx.appcompat.widget.AppCompatImageView c18 = f3Var.c();
            if (c18 != null) {
                c18.setImageResource(com.tencent.mm.R.raw.light_download_icon);
            }
        } else {
            com.tencent.mars.xlog.Log.i(o2Var.j(), "observeActionLinkUI state = " + rVar.a());
            int a17 = rVar.a();
            if (a17 == 1) {
                androidx.appcompat.widget.AppCompatTextView d18 = f3Var.d();
                if (d18 != null) {
                    d18.setText(com.tencent.mm.R.string.f493165j62);
                }
            } else if (a17 == 2) {
                androidx.appcompat.widget.AppCompatTextView d19 = f3Var.d();
                if (d19 != null) {
                    d19.setText(com.tencent.mm.R.string.j67);
                }
            } else if (a17 == 3) {
                androidx.appcompat.widget.AppCompatTextView d27 = f3Var.d();
                if (d27 != null) {
                    d27.setText(com.tencent.mm.R.string.f493166j63);
                }
            } else if (a17 != 5) {
                androidx.appcompat.widget.AppCompatTextView d28 = f3Var.d();
                if (d28 != null && (g17 = s74.q4.f404513a.g(d28)) != null && (x17 = s74.u3.f404562a.x(g17, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, f3Var.e())) != null && (d17 = f3Var.d()) != null) {
                    d17.setText(x17);
                }
            } else {
                androidx.appcompat.widget.AppCompatTextView d29 = f3Var.d();
                if (d29 != null) {
                    d29.setText(com.tencent.mm.R.string.f493167j64);
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$observeActionLinkUI$3$1");
        return f0Var;
    }
}
