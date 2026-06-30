package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class up extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f136155d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f136156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136155d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.tp(this));
    }

    public final void O6(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        if (this.f136156e) {
            com.tencent.mars.xlog.Log.i("FinderMultiTaskSnapshotUIC", "dismissSnapshot: success, source = ".concat(source));
            this.f136156e = false;
            android.view.View decorView = getActivity().getWindow().getDecorView();
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup != null) {
                viewGroup.removeView(P6());
            }
            P6().setImageDrawable(null);
        }
    }

    public final android.widget.ImageView P6() {
        return (android.widget.ImageView) ((jz5.n) this.f136155d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_VIDEO_THUMB_LOCAL_PATH");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderMultiTaskSnapshotUIC", "onCreate: snapshotPath = " + stringExtra);
        android.graphics.Bitmap a17 = al3.b.f5849a.a(stringExtra, null);
        if (a17 == null || a17.isRecycled() || a17.getWidth() == 0 || a17.getHeight() == 0) {
            com.tencent.mars.xlog.Log.e("FinderMultiTaskSnapshotUIC", "onCreate: snapshot error, contentViewBitmap = " + a17);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderMultiTaskSnapshotUIC", "onCreate: add snapshot to decor, width = " + a17.getWidth() + "  height = " + a17.getHeight());
        P6().setImageBitmap(a17);
        P6().setBackgroundColor(-16777216);
        android.view.View decorView = getActivity().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(P6(), -1, -1);
            this.f136156e = true;
        }
        pm0.v.V(3000L, new com.tencent.mm.plugin.finder.viewmodel.component.sp(this));
    }
}
