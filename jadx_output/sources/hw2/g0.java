package hw2;

/* loaded from: classes5.dex */
public final class g0 implements yt3.r2, hw2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f285530d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f285531e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f285532f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f285533g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f285534h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f285535i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f285536m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f285537n;

    public g0(android.view.ViewGroup layout, ju3.d0 status) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f285530d = layout;
        this.f285531e = status;
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.loe);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f285532f = findViewById;
        android.view.View findViewById2 = layout.findViewById(com.tencent.mm.R.id.log);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = layout.findViewById(com.tencent.mm.R.id.loi);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f285533g = textView;
        android.view.View findViewById4 = layout.findViewById(com.tencent.mm.R.id.loh);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f285534h = findViewById4;
        android.view.View findViewById5 = layout.findViewById(com.tencent.mm.R.id.lof);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f285535i = (android.widget.TextView) findViewById5;
        this.f285537n = true;
        findViewById.setOnClickListener(new hw2.f0(this));
        textView.setSelected(true);
        b(false);
    }

    public final void a(long j17) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f285536m;
        android.widget.TextView textView = this.f285535i;
        if (audioCacheInfo == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.f285530d.getContext().getString(com.tencent.mm.R.string.f1i, java.lang.Integer.valueOf(a06.d.b(((float) j17) / 1000.0f))));
        }
    }

    public final void b(boolean z17) {
        if (this.f285537n != z17) {
            this.f285537n = z17;
            android.view.View view = this.f285534h;
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "enableAddMusic", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "enableAddMusic", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void c() {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f285536m;
        android.widget.TextView textView = this.f285533g;
        if (audioCacheInfo == null) {
            textView.setText(i65.a.r(this.f285530d.getContext(), com.tencent.mm.R.string.f1j));
            a(60000L);
        } else {
            java.util.ArrayList arrayList = audioCacheInfo != null ? audioCacheInfo.f155714h : null;
            if (arrayList == null || arrayList.isEmpty()) {
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo2 = this.f285536m;
                if (audioCacheInfo2 != null) {
                    r2 = audioCacheInfo2.f155723t;
                }
            } else {
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo3 = this.f285536m;
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(audioCacheInfo3 != null ? audioCacheInfo3.f155714h : null, ",");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo4 = this.f285536m;
                sb6.append(audioCacheInfo4 != null ? audioCacheInfo4.f155723t : null);
                sb6.append(" - ");
                sb6.append(c17);
                r2 = sb6.toString();
            }
            textView.setText(r2);
        }
        textView.requestLayout();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f285532f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/RecordAudioPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            c();
        }
    }
}
