package gx0;

/* loaded from: classes5.dex */
public final class bh extends ou0.p {
    public android.widget.FrameLayout A;
    public ou0.z B;
    public final android.text.SpannableStringBuilder C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public com.tencent.maas.model.time.MJTime H;
    public final gx0.yg I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f276261J;
    public final jz5.g K;
    public final kz5.q L;
    public boolean M;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f276262r;

    /* renamed from: s, reason: collision with root package name */
    public final int f276263s;

    /* renamed from: t, reason: collision with root package name */
    public final int f276264t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f276265u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f276266v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f276267w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f276268x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f276269y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar f276270z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276262r = jz5.h.b(new gx0.vg(this));
        this.f276263s = j65.q.a(getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.agr);
        this.f276264t = j65.q.a(getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.agq);
        this.B = new ou0.w(false);
        this.C = new android.text.SpannableStringBuilder();
        this.D = jz5.h.b(new gx0.ig(this));
        this.E = jz5.h.b(new gx0.kg(this));
        this.F = jz5.h.b(gx0.ah.f276213d);
        this.G = jz5.h.b(gx0.zg.f277290d);
        com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
        kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        this.H = InvalidTime;
        this.I = new gx0.yg(this);
        this.f276261J = jz5.h.b(new gx0.lg(this));
        this.K = jz5.h.b(new gx0.jg(this));
        this.L = new kz5.q();
        this.M = true;
    }

    public static final com.tencent.maas.model.time.MJTime Y6(gx0.bh bhVar, float f17) {
        com.tencent.maas.model.time.MJTime mJTime = (com.tencent.maas.model.time.MJTime) bhVar.V6().f276258y.getValue();
        if (mJTime == null) {
            com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            return InvalidTime;
        }
        com.tencent.maas.model.time.MJTime multi = mJTime.multi(f17);
        kotlin.jvm.internal.o.f(multi, "multi(...)");
        return multi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0 == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z6(gx0.bh r3, com.tencent.maas.model.time.MJTime r4, com.tencent.maas.model.time.MJTime r5) {
        /*
            gx0.kh r0 = r3.W6()
            ex0.a0 r0 = r0.f276642r
            r1 = 0
            if (r0 == 0) goto Le
            ex0.r r0 = r0.n()
            goto Lf
        Le:
            r0 = r1
        Lf:
            boolean r2 = r0 instanceof ex0.f
            if (r2 == 0) goto L16
            r1 = r0
            ex0.f r1 = (ex0.f) r1
        L16:
            if (r1 == 0) goto L1e
            boolean r0 = r1.f257133i
            r1 = 1
            if (r0 != r1) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            if (r1 == 0) goto L22
            goto L3e
        L22:
            gx0.bf r0 = r3.V6()
            boolean r0 = r0.L
            if (r0 == 0) goto L2b
            goto L3e
        L2b:
            if (r4 == 0) goto L3e
            boolean r0 = r4.isNumeric()
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L3e
            boolean r0 = r5.isNumeric()
            if (r0 == 0) goto L3e
            r3.i7(r4, r5)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bh.Z6(gx0.bh, com.tencent.maas.model.time.MJTime, com.tencent.maas.model.time.MJTime):void");
    }

    public final gx0.w8 a7() {
        return (gx0.w8) ((jz5.n) this.f276262r).getValue();
    }

    public final com.tencent.maas.model.time.MJTime b7() {
        com.tencent.maas.model.time.MJTime l76 = V6().l7();
        if (!l76.isNumeric()) {
            com.tencent.maas.model.time.MJTime InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            return InvalidTime;
        }
        if (this.f276270z == null) {
            kotlin.jvm.internal.o.o("timelineToolbar");
            throw null;
        }
        com.tencent.maas.model.time.MJTime multi = l76.multi(r1.getPercent());
        kotlin.jvm.internal.o.f(multi, "multi(...)");
        return multi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (((ou0.w) r0).f348912b != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c7() {
        /*
            r2 = this;
            ou0.z r0 = r2.B
            boolean r1 = r0 instanceof ou0.v
            if (r1 == 0) goto L8
            r1 = 1
            goto La
        L8:
            boolean r1 = r0 instanceof ou0.y
        La:
            if (r1 == 0) goto Ld
            goto L21
        Ld:
            boolean r1 = r0 instanceof ou0.x
            if (r1 == 0) goto L17
            ou0.x r0 = (ou0.x) r0
            r0.getClass()
            goto L24
        L17:
            boolean r1 = r0 instanceof ou0.w
            if (r1 == 0) goto L26
            ou0.w r0 = (ou0.w) r0
            boolean r0 = r0.f348912b
            if (r0 == 0) goto L24
        L21:
            int r0 = r2.f276263s
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
        L26:
            jz5.j r0 = new jz5.j
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.bh.c7():int");
    }

    public final void d7() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qbq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qbt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qbr);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e7(boolean z17) {
        if (z17) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.q3b);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.q3b);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f484457q52);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.q4z);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f484456q51);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484455q50);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById6, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "hideTimelineBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void f7(ou0.z type) {
        kotlin.jvm.internal.o.g(type, "type");
        if (this.B.f348914a != type.f348914a) {
            this.B = type;
            java.util.Objects.toString(type);
            int i17 = this.B.f348914a;
            if (i17 == 1) {
                e7(((ou0.w) type).f348912b);
                d7();
            } else if (i17 == 2) {
                g7();
                e7(false);
            } else if (i17 == 4) {
                h7();
                d7();
            } else if (i17 == 6) {
                g7();
                h7();
            }
        }
        if (type instanceof ou0.y) {
            k7(((ou0.y) type).f348913b);
        }
        if (type instanceof ou0.v) {
            k7(((ou0.v) type).f348911b);
        }
    }

    public final void g7() {
        android.widget.FrameLayout frameLayout = this.A;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("vThumbLayout");
            throw null;
        }
        int height = frameLayout.getHeight();
        int i17 = this.f276264t;
        if (height != i17) {
            android.widget.FrameLayout frameLayout2 = this.A;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("vThumbLayout");
                throw null;
            }
            frameLayout2.getLayoutParams().height = i17;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qbq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qbt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.qbr);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void h7() {
        android.view.View view = this.f276265u;
        if (view == null) {
            kotlin.jvm.internal.o.o("timelineBgView");
            throw null;
        }
        int height = view.getHeight();
        int i17 = this.f276263s;
        if (height != i17) {
            android.view.View view2 = this.f276265u;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("timelineBgView");
                throw null;
            }
            view2.getLayoutParams().height = i17;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q3b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484457q52);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.q4z);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC", "showTimelineBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void i7(com.tencent.maas.model.time.MJTime mjTime, com.tencent.maas.model.time.MJTime duration) {
        kotlin.jvm.internal.o.g(mjTime, "mjTime");
        kotlin.jvm.internal.o.g(duration, "duration");
        long milliseconds = (long) mjTime.toMilliseconds();
        long milliseconds2 = (long) duration.toMilliseconds();
        java.lang.String d17 = ou0.f.d(milliseconds);
        java.lang.String str = d17 + " / " + ou0.f.d(milliseconds2);
        android.text.SpannableStringBuilder timeSpanBuilder = this.C;
        timeSpanBuilder.clear();
        timeSpanBuilder.append((java.lang.CharSequence) str);
        timeSpanBuilder.setSpan((android.text.style.ForegroundColorSpan) ((jz5.n) this.D).getValue(), 0, d17.length(), 34);
        timeSpanBuilder.setSpan((android.text.style.ForegroundColorSpan) ((jz5.n) this.E).getValue(), d17.length(), str.length(), 34);
        android.widget.TextView textView = this.f276266v;
        if (textView == null) {
            kotlin.jvm.internal.o.o("timelineTimeView");
            throw null;
        }
        textView.setText(timeSpanBuilder);
        if (!ou0.f.c(mjTime, 4L)) {
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar = this.f276270z;
            if (playbackTimelineToolbar == null) {
                kotlin.jvm.internal.o.o("timelineToolbar");
                throw null;
            }
            if (playbackTimelineToolbar.getWidth() > 0 && !playbackTimelineToolbar.F) {
                int width = playbackTimelineToolbar.getWidth();
                playbackTimelineToolbar.A.setMax(width);
                playbackTimelineToolbar.C(width * (((float) milliseconds) / ((float) milliseconds2)));
            }
        }
        gx0.w8 a76 = a7();
        a76.getClass();
        kotlin.jvm.internal.o.g(timeSpanBuilder, "timeSpanBuilder");
        android.widget.TextView textView2 = a76.H;
        if (textView2 != null) {
            textView2.setText(timeSpanBuilder);
        } else {
            kotlin.jvm.internal.o.o("tvPlayerTime");
            throw null;
        }
    }

    public final void k7(boolean z17) {
        if (z17) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f276268x;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("revokeButton");
                throw null;
            }
            weImageView.setVisibility(0);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f276269y;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("recoverButton");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f276268x;
        if (weImageView3 == null) {
            kotlin.jvm.internal.o.o("revokeButton");
            throw null;
        }
        weImageView3.setVisibility(4);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f276269y;
        if (weImageView4 != null) {
            weImageView4.setVisibility(4);
        } else {
            kotlin.jvm.internal.o.o("recoverButton");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        nv0.d t76 = a7().t7();
        t76.getClass();
        gx0.yg change = this.I;
        kotlin.jvm.internal.o.g(change, "change");
        java.util.ArrayList arrayList = t76.f340427a;
        if (arrayList.contains(change)) {
            arrayList.remove(change);
        }
    }

    @Override // du0.g, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        a7().t7().a(this.I);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qbp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar) findViewById;
        this.f276270z = playbackTimelineToolbar;
        android.view.View findViewById2 = playbackTimelineToolbar.findViewById(com.tencent.mm.R.id.qbt);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.A = (android.widget.FrameLayout) findViewById2;
        android.view.View findViewById3 = playbackTimelineToolbar.findViewById(com.tencent.mm.R.id.q3b);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f276265u = findViewById3;
        android.view.View findViewById4 = playbackTimelineToolbar.findViewById(com.tencent.mm.R.id.f484457q52);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f276266v = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = playbackTimelineToolbar.findViewById(com.tencent.mm.R.id.q4z);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f276267w = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5;
        android.view.View findViewById6 = playbackTimelineToolbar.findViewById(com.tencent.mm.R.id.f484456q51);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f276268x = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        android.view.View findViewById7 = playbackTimelineToolbar.findViewById(com.tencent.mm.R.id.f484455q50);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f276269y = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        f7(new ou0.x(false));
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.PlaybackTimelineToolbar playbackTimelineToolbar2 = this.f276270z;
        if (playbackTimelineToolbar2 == null) {
            kotlin.jvm.internal.o.o("timelineToolbar");
            throw null;
        }
        playbackTimelineToolbar2.setOnSeekBarChangeListener(new gx0.xg(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f276267w;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("timelinePlayButton");
            throw null;
        }
        weImageView.setOnClickListener(new gx0.sg(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f276268x;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("revokeButton");
            throw null;
        }
        weImageView2.setOnClickListener(new gx0.tg(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f276269y;
        if (weImageView3 == null) {
            kotlin.jvm.internal.o.o("recoverButton");
            throw null;
        }
        weImageView3.setOnClickListener(new gx0.ug(this));
        V6().f276255v.observe(getActivity(), new gx0.mg(this));
        V6().f276258y.observe(getActivity(), new gx0.ng(this));
        V6().A.observe(getActivity(), new gx0.og(this));
    }
}
