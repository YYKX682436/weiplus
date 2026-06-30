package ni2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.ub f337332a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.TextureView f337333b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f337334c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f337335d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f337336e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f337337f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f337338g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f337339h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f337340i;

    /* renamed from: j, reason: collision with root package name */
    public final ni2.i f337341j;

    public j(android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.view.ub basePlugin) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        this.f337332a = basePlugin;
        this.f337333b = (android.view.TextureView) root.findViewById(com.tencent.mm.R.id.b58);
        this.f337334c = root.findViewById(com.tencent.mm.R.id.oxy);
        this.f337335d = root.findViewById(com.tencent.mm.R.id.imn);
        this.f337336e = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.f483538b54);
        this.f337340i = true;
        this.f337341j = new ni2.i(this);
        b();
    }

    public final void a(android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = this.f337339h;
        if (imageView != null) {
            viewGroup.removeView(imageView);
        }
        android.widget.ImageView imageView2 = this.f337339h;
        if (imageView2 == null) {
            imageView2 = new android.widget.ImageView(com.tencent.mm.sdk.platformtools.x2.f193071a);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        this.f337339h = imageView2;
        imageView2.setImageBitmap(bitmap);
        viewGroup.addView(this.f337339h, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public final void b() {
        android.view.View view = this.f337334c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f337335d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f337333b.setSurfaceTextureListener(this.f337341j);
    }
}
