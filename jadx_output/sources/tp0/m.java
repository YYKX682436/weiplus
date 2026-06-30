package tp0;

/* loaded from: classes7.dex */
public final class m implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f421026a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f421027b;

    public m(android.widget.FrameLayout frameLayout) {
        this.f421027b = frameLayout;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        kotlin.jvm.internal.o.d(optJSONObject);
        return new tp0.j(vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("x"))), vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("y"))), vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("width"))), vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("height"))), optJSONObject.optInt("zIndex"), data.optInt("hide"));
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f421027b.removeView(view);
        this.f421026a.remove(java.lang.Integer.valueOf(view.getId()));
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        tp0.j viewAttribute = (tp0.j) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(viewAttribute.f421022c, viewAttribute.f421023d);
        layoutParams.leftMargin = viewAttribute.f421020a;
        layoutParams.topMargin = viewAttribute.f421021b;
        view.setLayoutParams(layoutParams);
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        return new jc3.a();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        int i17;
        android.view.View view = (android.view.View) obj;
        tp0.j viewAttribute = (tp0.j) obj2;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(viewAttribute, "viewAttribute");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(viewAttribute.f421022c, viewAttribute.f421023d);
        layoutParams.leftMargin = viewAttribute.f421020a;
        layoutParams.topMargin = viewAttribute.f421021b;
        java.util.HashMap hashMap = this.f421026a;
        java.util.Iterator it = hashMap.entrySet().iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = viewAttribute.f421024e;
            if (!hasNext) {
                break;
            } else if (i17 >= ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue()) {
                i18++;
            }
        }
        android.widget.FrameLayout frameLayout = this.f421027b;
        if (i18 > frameLayout.getChildCount()) {
            i18 = frameLayout.getChildCount();
        }
        frameLayout.addView(view, i18, layoutParams);
        hashMap.put(java.lang.Integer.valueOf(view.getId()), java.lang.Integer.valueOf(i17));
    }
}
