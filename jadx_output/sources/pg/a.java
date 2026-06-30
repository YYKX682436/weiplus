package pg;

/* loaded from: classes5.dex */
public final class a extends mg.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.handlebox.view.RenderViewContainer f353952a;

    public a(com.tencent.maas.handlebox.view.RenderViewContainer renderViewContainer) {
        this.f353952a = renderViewContainer;
    }

    @Override // mg.d
    public void a(com.tencent.maas.base.Rect2 curRect, com.tencent.maas.base.Vec2 scale, float f17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(curRect, "curRect");
        kotlin.jvm.internal.o.g(scale, "scale");
        com.tencent.maas.handlebox.view.RenderViewContainer renderViewContainer = this.f353952a;
        renderViewContainer.getClass();
        mg.e.a("RenderViewContainer", "showBorder rect origin: " + curRect.getOrigin() + ", size:" + curRect.getSize() + ", scale:" + scale + ", rotation:" + f17);
        android.widget.ImageView imageView = renderViewContainer.f48050e;
        if (imageView == null) {
            f0Var = null;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = (int) curRect.getSize().f47799x;
            layoutParams2.height = (int) curRect.getSize().f47800y;
            layoutParams2.setMargins((int) curRect.getOrigin().f47799x, (int) curRect.getOrigin().f47800y, 0, 0);
            imageView.setLayoutParams(layoutParams2);
            android.widget.ImageView imageView2 = renderViewContainer.f48050e;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{8.0f, 8.0f, 8.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f});
            gradientDrawable.setStroke(3, -16711936);
            android.widget.ImageView imageView3 = new android.widget.ImageView(renderViewContainer.getContext());
            renderViewContainer.f48050e = imageView3;
            imageView3.setImageDrawable(gradientDrawable);
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams((int) curRect.getSize().f47799x, (int) curRect.getSize().f47800y);
            layoutParams3.setMargins((int) curRect.getOrigin().f47799x, (int) curRect.getOrigin().f47800y, 0, 0);
            renderViewContainer.addView(renderViewContainer.f48050e, layoutParams3);
            android.widget.ImageView imageView4 = renderViewContainer.f48050e;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
        }
        android.widget.ImageView imageView5 = renderViewContainer.f48050e;
        if (imageView5 == null) {
            return;
        }
        imageView5.setRotation(-((float) java.lang.Math.toDegrees(f17)));
    }
}
