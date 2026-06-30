package tp0;

/* loaded from: classes7.dex */
public abstract class e extends lc3.b0 {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCoverViewOperator", "invoke, name: " + f() + ", data:" + data + ", biz:" + e().f344331a);
        int v17 = v(data);
        if (v17 != 0) {
            ym5.a1.f(new tp0.d(this, data, v17));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseCoverViewOperator", "hy: operating cover view without viewId is illegal");
            u(lc3.x.f317937d);
        }
    }

    public final void u(lc3.z errOrSuc) {
        kotlin.jvm.internal.o.g(errOrSuc, "errOrSuc");
        if (errOrSuc.f317944a == 0) {
            s().invoke(k());
        } else {
            s().invoke(i(errOrSuc));
        }
    }

    public final int v(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.optInt("viewId", 0);
    }

    public void w(org.json.JSONObject data, jc3.m coverViewDelegate) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(coverViewDelegate, "coverViewDelegate");
    }

    public void x(org.json.JSONObject data, java.lang.Object view, jc3.m parent) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
    }

    public final void y(java.lang.Object view, org.json.JSONObject data, jc3.m coverViewDelegate) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(coverViewDelegate, "coverViewDelegate");
        jc3.l d17 = coverViewDelegate.d(view);
        if (data.has("hide")) {
            if (data.optInt("hide", -1) > 0 || data.optBoolean("hide", false)) {
                d17.b(view);
            }
            if (data.optInt("hide", 1) <= 0 || !data.optBoolean("hide", true)) {
                d17.a(view);
            }
        }
    }
}
