package ih1;

/* loaded from: classes7.dex */
public final class j implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ih1.m f291500b;

    public j(ih1.u uVar, ih1.m mVar) {
        this.f291499a = uVar;
        this.f291500b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + this.f291499a.f291530a + "], getViewAttributeFromData: " + data);
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        java.lang.String optString = data.optString("frameSetName", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String optString2 = data.optString("frameSetRootPath", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        return new ih1.f(optString, optString2, new tp0.j(optJSONObject != null ? optJSONObject.optInt("left", -1) : -1, optJSONObject != null ? optJSONObject.optInt("top", -1) : -1, optJSONObject != null ? optJSONObject.optInt("width", -1) : -1, optJSONObject != null ? optJSONObject.optInt("height", -1) : -1, -1, data.has("hide") ? data.optBoolean("hide") : -1));
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f291499a;
        sb6.append(uVar.f291530a);
        sb6.append("], onRequestRemoveCoverView");
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        ((android.widget.FrameLayout) ((jz5.n) uVar.f291533d).getValue()).removeView(view);
        jc3.k.b(callback, lc3.x.f317934a, null, 2, null);
        ih1.m mVar = this.f291500b;
        ih1.v vVar = (ih1.v) mVar.f291510d.get(java.lang.Integer.valueOf(view.hashCode()));
        if (vVar != null) {
            mq0.d0 d0Var = (mq0.d0) i95.n0.c(mq0.d0.class);
            java.lang.String str = vVar.f291542a;
            java.lang.String a17 = vVar.f291543b.a();
            java.lang.String str2 = vVar.f291544c;
            ((mq0.s0) d0Var).Ai(str, a17, str2, mq0.a.f330515g, true, str2, kz5.b1.e(new jz5.l("appId", uVar.f291530a)));
        }
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        return new ih1.i(this.f291500b, this.f291499a);
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        ih1.f viewAttribute = (ih1.f) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f291500b.f291510d.put(java.lang.Integer.valueOf(view.hashCode()), new ih1.v("MagicAdMiniProgram", new iq0.e(viewAttribute.f291490b, "", 0, 0, 12, null), viewAttribute.f291489a, view.getVisibility() == 0));
        c(view, viewAttribute, callback);
    }

    @Override // jc3.m
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void c(android.view.View view, ih1.f viewAttribute, jc3.k callback) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new android.widget.FrameLayout.LayoutParams(0, 0);
        }
        tp0.j jVar = viewAttribute.f291491c;
        int i17 = jVar.f421022c;
        if (i17 >= 0) {
            marginLayoutParams.width = vp0.b.b(java.lang.Integer.valueOf(i17));
        }
        int i18 = jVar.f421023d;
        if (i18 >= 0) {
            marginLayoutParams.height = vp0.b.b(java.lang.Integer.valueOf(i18));
        }
        int i19 = jVar.f421020a;
        if (i19 >= 0) {
            marginLayoutParams.leftMargin = vp0.b.b(java.lang.Integer.valueOf(i19));
        }
        int i27 = jVar.f421021b;
        if (i27 >= 0) {
            marginLayoutParams.topMargin = vp0.b.b(java.lang.Integer.valueOf(i27));
        }
        view.setLayoutParams(marginLayoutParams);
        jc3.k.b(callback, lc3.x.f317934a, null, 2, null);
    }
}
