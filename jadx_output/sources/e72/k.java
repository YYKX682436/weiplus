package e72;

/* loaded from: classes14.dex */
public class k implements e72.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f249911e;

    /* renamed from: f, reason: collision with root package name */
    public final long f249912f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f249907a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f249908b = false;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f249909c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f249910d = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f249913g = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f249915i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f249916j = false;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f249917k = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new e72.i(this), true);

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f249914h = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.anim.f477886ea);

    public k(java.lang.String str, long j17) {
        this.f249911e = str;
        this.f249912f = j17;
    }

    @Override // e72.h
    public e72.g a() {
        return this.f249907a ? new e72.g(90025, "user cancelled in intermediate page") : new e72.g(90004, "user cancelled in processing");
    }

    @Override // e72.h
    public void b(java.lang.String str) {
        j();
        if (j() == null) {
            return;
        }
        j().setText(str);
    }

    @Override // e72.h
    public boolean c(com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult faceCharacteristicsResult) {
        return this.f249907a && faceCharacteristicsResult != null && faceCharacteristicsResult.f99948d == 18;
    }

    @Override // e72.h
    public e72.f d() {
        if (!this.f249907a || this.f249916j) {
            return null;
        }
        this.f249916j = true;
        return new e72.f(1);
    }

    @Override // e72.h
    public void e(android.content.Context context, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        this.f249909c = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aab, viewGroup);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aac, viewGroup2);
        this.f249910d = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "initMotion", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "initMotion", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (j() != null) {
            j().setText(this.f249911e);
        }
        long j17 = this.f249912f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalFaceMotion", "hy: starting tween timer: tween: %d", java.lang.Long.valueOf(j17));
        this.f249917k.d();
        this.f249913g = true;
        this.f249917k.c(0L, j17);
    }

    @Override // e72.h
    public boolean f(int i17, java.lang.CharSequence charSequence) {
        return false;
    }

    @Override // e72.h
    public boolean g(com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult faceCharacteristicsResult) {
        if (faceCharacteristicsResult.f99948d == -1) {
            this.f249907a = true;
            if (!this.f249915i) {
                com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.hpp);
                android.widget.TextView textView = (android.widget.TextView) this.f249909c.findViewById(com.tencent.mm.R.id.h0f);
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.anim.f477779b8);
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.anim.f477783bc);
                loadAnimation.setDuration(500L);
                loadAnimation2.setDuration(500L);
                textView.startAnimation(loadAnimation);
                textView.setVisibility(4);
                android.view.View view = this.f249910d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "startTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "startTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f249910d.startAnimation(loadAnimation2);
                this.f249910d.findViewById(com.tencent.mm.R.id.do6).setOnClickListener(new e72.j(this));
                this.f249915i = true;
                return true;
            }
        }
        return false;
    }

    @Override // e72.h
    public void h() {
        this.f249913g = false;
        this.f249917k.d();
        this.f249907a = false;
        this.f249915i = false;
        this.f249916j = false;
        this.f249908b = false;
    }

    @Override // e72.h
    public boolean i() {
        return this.f249907a && this.f249908b;
    }

    public android.widget.TextView j() {
        android.view.View view;
        android.view.View view2;
        boolean z17 = this.f249907a;
        if (!z17 && (view2 = this.f249909c) != null) {
            return (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.h0f);
        }
        if (!z17 || (view = this.f249910d) == null) {
            return null;
        }
        return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h0f);
    }
}
