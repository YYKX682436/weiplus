package oc2;

/* loaded from: classes8.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc2.i0 f344179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cp5 f344180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f344182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f344183h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f344184i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f344185m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f344186n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f344187o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344188p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(oc2.i0 i0Var, r45.cp5 cp5Var, com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, android.graphics.drawable.BitmapDrawable bitmapDrawable, java.lang.ref.WeakReference weakReference, long j17, android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, java.lang.String str) {
        super(0);
        this.f344179d = i0Var;
        this.f344180e = cp5Var;
        this.f344181f = renderView;
        this.f344182g = bitmapDrawable;
        this.f344183h = weakReference;
        this.f344184i = j17;
        this.f344185m = bitmap;
        this.f344186n = rect;
        this.f344187o = rect2;
        this.f344188p = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.t60 t60Var;
        r45.yo5 yo5Var = this.f344180e.f371770f;
        int c17 = this.f344179d.c((yo5Var == null || (t60Var = yo5Var.f391261d) == null) ? null : t60Var.f386167e, 0);
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f344181f;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f344182g;
        com.tencent.mm.plugin.finder.extension.reddot.render.RenderView.d(renderView, bitmapDrawable, c17);
        java.lang.ref.WeakReference weakReference = this.f344183h;
        android.view.View view = (android.view.View) weakReference.get();
        if (view != null) {
            bitmapDrawable.setCallback(view);
        }
        bitmapDrawable.invalidateSelf();
        android.view.View view2 = (android.view.View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
        com.tencent.mars.xlog.Log.i(renderView.h(), "[asyncLoadIcon] token=" + this.f344184i + " resource=" + this.f344185m + " src=" + this.f344186n + " dst=" + this.f344187o + " drawable callback=" + bitmapDrawable.getCallback() + " TextView=" + weakReference.get() + "color=" + c17 + " iconUrl=" + this.f344188p);
        return jz5.f0.f302826a;
    }
}
