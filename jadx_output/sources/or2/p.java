package or2;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f347666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or2.s f347667e;

    public p(android.view.View view, or2.s sVar) {
        this.f347666d = view;
        this.f347667e = sVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f347666d.removeOnAttachStateChangeListener(this);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        or2.s sVar = this.f347667e;
        if (sVar.f347678n > 0) {
            jSONObject.put("avgScrollCostMs", a06.d.c((((float) sVar.f347677m) * 1.0f) / r1));
            or2.o.f347664a.a(sVar.f347671d, jSONObject);
        }
        or2.o oVar = or2.o.f347664a;
        or2.j jVar = or2.j.f347656a;
        oVar.b(or2.j.f347657b);
    }
}
