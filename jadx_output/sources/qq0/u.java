package qq0;

/* loaded from: classes7.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f365912a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer f365913b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f365914c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f365915d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f365916e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f365917f;

    /* renamed from: g, reason: collision with root package name */
    public long f365918g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f365919h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f365920i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f365921j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f365922k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Runnable f365923l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f365924m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub f365925n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f365926o;

    public u(java.lang.String bizName, com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer sclView) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(sclView, "sclView");
        this.f365912a = bizName;
        this.f365913b = sclView;
        this.f365914c = "";
        this.f365915d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        android.widget.ImageView imageView = new android.widget.ImageView(sclView.getContext());
        this.f365916e = imageView;
        this.f365924m = new java.util.ArrayList();
        this.f365926o = jz5.h.b(qq0.o.f365906d);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        android.view.View view = new android.view.View(sclView.getContext());
        this.f365917f = view;
        sclView.addView(imageView);
        imageView.setVisibility(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/magicbrush/plugin/scl/startup/cover/MagicSclViewCoverLogic", "<init>", "(Ljava/lang/String;Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/magicbrush/plugin/scl/startup/cover/MagicSclViewCoverLogic", "<init>", "(Ljava/lang/String;Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void a(qq0.u uVar, java.lang.String str) {
        java.lang.String str2;
        hq0.e0 e0Var;
        if (uVar.f365918g > 0) {
            mq0.e0 e0Var2 = (mq0.e0) i95.n0.c(mq0.e0.class);
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = uVar.f365913b;
            fq0.x frameSet = magicSclViewContainer.getFrameSet();
            java.lang.String valueOf = java.lang.String.valueOf(frameSet != null ? frameSet.f265478b : null);
            java.lang.String str3 = uVar.f365912a;
            fq0.x frameSet2 = magicSclViewContainer.getFrameSet();
            if (frameSet2 == null || (e0Var = frameSet2.f265479c) == null || (str2 = e0Var.f282982c) == null) {
                str2 = "";
            }
            ((mq0.v0) e0Var2).wi("tryShowCover", str, valueOf, str3, str2, uVar.f365914c, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - uVar.f365918g));
            uVar.f365918g = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r26) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qq0.u.b(boolean):void");
    }
}
