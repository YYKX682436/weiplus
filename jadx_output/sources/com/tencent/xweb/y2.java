package com.tencent.xweb;

/* loaded from: classes7.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public int f220631a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f220632b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f220633c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f220634d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f220635e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f220636f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f220637g;

    /* renamed from: h, reason: collision with root package name */
    public int f220638h;

    /* renamed from: i, reason: collision with root package name */
    public long f220639i;

    /* renamed from: j, reason: collision with root package name */
    public int f220640j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f220641k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.xweb.WebView f220642l;

    public y2(int i17, int i18, com.tencent.xweb.WebView webView) {
        this.f220631a = i17;
        this.f220638h = i18;
        this.f220642l = webView;
    }

    public java.lang.String toString() {
        com.tencent.xweb.WebView webView = this.f220642l;
        boolean z17 = false;
        if (webView != null && webView.u(2002)) {
            if (android.text.TextUtils.isEmpty(this.f220633c)) {
                by5.c4.c("XWebScript", "checkValid failed jsSrcValue invalid = " + this.f220633c);
            } else if (android.text.TextUtils.isEmpty(this.f220632b)) {
                by5.c4.c("XWebScript", "checkValid failed jsSrcKind invalid = " + this.f220632b);
            } else if (this.f220631a >= 0) {
                long j17 = this.f220639i;
                if (j17 != 0 && this.f220640j <= 0) {
                    by5.c4.c("XWebScript", "checkValid failed bufferSize invalid = " + this.f220640j);
                } else if (this.f220640j != 0 && j17 == 0) {
                    by5.c4.c("XWebScript", "checkValid failed bufferAddr invalid = " + this.f220639i);
                } else if (android.text.TextUtils.isEmpty(this.f220637g) || webView.u(2008)) {
                    z17 = true;
                } else {
                    by5.c4.c("XWebScript", "not support jsparam as file path, apk ver = " + org.xwalk.core.XWalkEnvironment.d());
                }
            } else {
                by5.c4.c("XWebScript", "checkValid failed compile mode invalid = " + this.f220631a);
            }
        }
        if (!z17) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("//XWEB_SCRIPT:");
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        try {
            if (webView.u(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION)) {
                this.f220638h |= 2048;
            }
            org.json.JSONStringer value = jSONStringer.object().key("compile_mode").value(this.f220631a).key("cache_option").value(this.f220638h).key("js_src_kind").value(this.f220632b).key("js_src").value(this.f220633c);
            if (!android.text.TextUtils.isEmpty(this.f220634d)) {
                value = value.key("cache_key").value(this.f220634d);
            }
            if (!android.text.TextUtils.isEmpty(this.f220635e)) {
                value = value.key("append_script").value(this.f220635e);
            }
            if (!android.text.TextUtils.isEmpty(this.f220637g)) {
                value = value.key("js_param_kind").value(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH).key("js_param").value(this.f220637g);
            } else if (this.f220639i != 0 && this.f220640j != 0) {
                value = value.key("js_param_kind").value("buffer").key("js_param").value(java.lang.Long.toHexString(this.f220639i)).key("js_param_length").value(this.f220640j);
            }
            if (!android.text.TextUtils.isEmpty(this.f220641k)) {
                value = value.key("js_filename").value(this.f220641k);
            }
            value.endObject();
            sb6.append(value.toString());
            if (webView != null && webView.u(2004)) {
                sb6.append("XWEB_SCRIPT_END\n\r" + this.f220636f);
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebScript", "xweb script create failed, error", th6);
        }
        return sb6.toString();
    }
}
