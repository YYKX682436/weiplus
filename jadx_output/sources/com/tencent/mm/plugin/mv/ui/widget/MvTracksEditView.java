package com.tencent.mm.plugin.mv.ui.widget;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a>?B\u001d\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=R\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b4\u0010'R\u0014\u00107\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0007¨\u0006@"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/MvTracksEditView;", "Landroid/widget/FrameLayout;", "Lsm3/h;", "", "h", "I", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "selectedIndex", "i", "getDraggingIndex", "setDraggingIndex", "draggingIndex", "Lqm3/i;", "n", "Lqm3/i;", "getThumbLoader", "()Lqm3/i;", "setThumbLoader", "(Lqm3/i;)V", "thumbLoader", "o", "getSpaceSize", "spaceSize", "Lsm3/u;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lsm3/u;", "getCallback", "()Lsm3/u;", "setCallback", "(Lsm3/u;)V", "callback", "", "value", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "J", "getVideoProgress", "()J", "setVideoProgress", "(J)V", "videoProgress", "", "Lkp4/a;", "getTracks", "()Ljava/util/List;", "tracks", "", "getWidthPerMills", "()F", "widthPerMills", "getFillingDuration", "fillingDuration", "getFillingWidth", "fillingWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sm3/v", "sm3/x", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MvTracksEditView extends android.widget.FrameLayout implements sm3.h {
    public static final /* synthetic */ int F = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public sm3.u callback;
    public long B;
    public long C;
    public int D;

    /* renamed from: E, reason: from kotlin metadata */
    public long videoProgress;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f152011d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.widget.AppCompatImageView f152012e;

    /* renamed from: f, reason: collision with root package name */
    public final int f152013f;

    /* renamed from: g, reason: collision with root package name */
    public final sm3.o f152014g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int selectedIndex;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int draggingIndex;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f152017m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public qm3.i thumbLoader;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int spaceSize;

    /* renamed from: p, reason: collision with root package name */
    public float f152020p;

    /* renamed from: q, reason: collision with root package name */
    public float f152021q;

    /* renamed from: r, reason: collision with root package name */
    public float f152022r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f152023s;

    /* renamed from: t, reason: collision with root package name */
    public final sm3.d f152024t;

    /* renamed from: u, reason: collision with root package name */
    public final sm3.e f152025u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f152026v;

    /* renamed from: w, reason: collision with root package name */
    public final sm3.a0 f152027w;

    /* renamed from: x, reason: collision with root package name */
    public long f152028x;

    /* renamed from: y, reason: collision with root package name */
    public long f152029y;

    /* renamed from: z, reason: collision with root package name */
    public final int f152030z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MvTracksEditView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.selectedIndex = -1;
        this.draggingIndex = -1;
        this.f152017m = kz5.p0.f313996d;
        this.spaceSize = i65.a.b(context, 4);
        sm3.d dVar = new sm3.d();
        this.f152024t = dVar;
        sm3.e eVar = new sm3.e(context);
        this.f152025u = eVar;
        sm3.a0 a0Var = new sm3.a0(context);
        this.f152027w = a0Var;
        androidx.recyclerview.widget.g1 g1Var = new androidx.recyclerview.widget.g1(new sm3.x(this));
        this.f152030z = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.D = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, am3.u.f8805a);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(0);
        float f17 = 48;
        this.f152013f = obtainStyledAttributes.getDimensionPixelSize(2, (int) (getResources().getDisplayMetrics().density * f17));
        obtainStyledAttributes.getDimensionPixelSize(1, (int) (getResources().getDisplayMetrics().density * f17));
        obtainStyledAttributes.recycle();
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn) + ((int) eVar.f409853f);
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = new androidx.appcompat.widget.AppCompatImageView(context, null);
        this.f152012e = appCompatImageView;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setVisibility(4);
        appCompatImageView.setElevation(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 1);
        layoutParams.topMargin = dimensionPixelSize;
        addView(appCompatImageView, layoutParams);
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(context, null);
        this.f152011d = recyclerView;
        sm3.o oVar = new sm3.o(new sm3.q(this), this);
        this.f152014g = oVar;
        recyclerView.setAdapter(oVar);
        recyclerView.setItemAnimator(null);
        recyclerView.setPadding(0, dimensionPixelSize, 0, 0);
        addView(recyclerView, new android.widget.FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df) + dimensionPixelSize, 16));
        eVar.f409859o = dVar;
        recyclerView.N(eVar);
        g1Var.d(recyclerView);
        recyclerView.N(new sm3.r(this));
        recyclerView.N(a0Var);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        setClipToPadding(false);
        setClipChildren(false);
        sm3.g0 g0Var = new sm3.g0(context, new sm3.y(this));
        recyclerView.i(new sm3.s(this));
        recyclerView.P(new sm3.t(this, g0Var));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false);
        this.f152026v = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public final long a() {
        long j17;
        double width;
        float widthPerMills;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f152011d;
        long j18 = 0;
        if (recyclerView.getChildCount() == 0) {
            return 0L;
        }
        int childCount = recyclerView.getChildCount();
        boolean z17 = false;
        android.view.View view = null;
        int i17 = -1;
        for (int i18 = 0; i18 < childCount; i18++) {
            view = recyclerView.getChildAt(i18);
            i17 = recyclerView.u0(view);
            if (i17 != -1) {
                break;
            }
        }
        if (view == null || i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "computeProgress: not find view position");
            return this.B;
        }
        int itemViewType = this.f152026v.getItemViewType(view);
        float widthPerMills2 = (-view.getLeft()) / getWidthPerMills();
        if (itemViewType != 1) {
            if (itemViewType == 2) {
                this.f152014g.getClass();
                int i19 = i17 - 1;
                if (i19 >= 0 && i19 < getTracks().size()) {
                    z17 = true;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "not find view " + i17 + ' ' + i19);
                    return this.B;
                }
                j17 = getTracks().get(i19).f311080j;
                width = getWidth() / 2.0d;
                widthPerMills = getWidthPerMills();
            } else if (itemViewType == 4) {
                j17 = this.f152029y;
                width = getWidth() / 2.0d;
                widthPerMills = getWidthPerMills();
            }
            j18 = ((long) (width / widthPerMills)) + j17;
        }
        long j19 = ((float) j18) + widthPerMills2;
        this.B = j19;
        return j19;
    }

    public final void b() {
        long h17;
        long j17 = 0;
        for (kp4.a aVar : this.f152017m) {
            aVar.f311080j = j17;
            long j18 = aVar.f311075e;
            long j19 = aVar.f311074d;
            long j27 = (j18 - j19) + j17;
            long j28 = this.f152028x;
            if (j27 < j28) {
                h17 = j18 - j19;
            } else {
                h17 = e06.p.h(j28 - j17, 0L, j18 - j19);
                aVar.f311075e = aVar.f311074d + h17;
            }
            j17 += h17;
        }
        this.f152029y = j17;
        this.f152027w.f409833r = j17 < this.f152028x;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("computeTracksDuration: ");
        sb6.append(this.f152029y);
        sb6.append(", timeHelper:");
        sm3.d dVar = this.f152024t;
        sb6.append(dVar.f409846b);
        sb6.append(", ");
        sb6.append(dVar.f409847c);
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", sb6.toString());
    }

    public final void c(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "setTransitionStatus: index=" + i17 + ", enabled=" + z17);
        sm3.a0 a0Var = this.f152027w;
        if (z17 && !a0Var.f409831p.contains(java.lang.Integer.valueOf(i17))) {
            a0Var.f409831p.add(java.lang.Integer.valueOf(i17));
        } else {
            if (z17) {
                return;
            }
            a0Var.f409831p.remove(java.lang.Integer.valueOf(i17));
        }
    }

    public final void d(int i17, long j17, long j18, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "updateTrack: index=" + i17 + ", startTime=" + j17 + ", endTime=" + j18);
        kp4.a aVar = getTracks().get(i17);
        aVar.f311074d = j17;
        aVar.f311075e = j18;
        b();
        this.f152011d.D0();
        if (z17) {
            sm3.o oVar = this.f152014g;
            oVar.getClass();
            oVar.notifyItemChanged(i17 + 1);
        }
    }

    public final void e() {
        for (kp4.a aVar : this.f152017m) {
            aVar.f311076f = ((float) aVar.d()) / (aVar.b() * (aVar.f311071a / getWidthPerMills()));
            int b17 = a06.d.b((float) java.lang.Math.ceil((((float) aVar.d()) / aVar.b()) / (aVar.f311071a / getWidthPerMills())));
            java.util.LinkedList linkedList = aVar.f311077g;
            linkedList.clear();
            e06.k m17 = e06.p.m(0, b17);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                int b18 = ((kz5.x0) it).b();
                kp4.m mVar = new kp4.m();
                mVar.f311124a = b18 * r2;
                arrayList.add(mVar);
            }
            linkedList.addAll(arrayList);
        }
    }

    public final sm3.u getCallback() {
        return this.callback;
    }

    @Override // sm3.h
    public int getDraggingIndex() {
        return this.draggingIndex;
    }

    public final long getFillingDuration() {
        return java.lang.Math.max(this.f152028x - this.f152029y, 0L);
    }

    @Override // sm3.h
    public int getFillingWidth() {
        return java.lang.Math.max((int) (((float) getFillingDuration()) * getWidthPerMills()), 0);
    }

    @Override // sm3.h
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // sm3.h
    public int getSpaceSize() {
        return this.spaceSize;
    }

    @Override // sm3.h
    public qm3.i getThumbLoader() {
        return this.thumbLoader;
    }

    @Override // sm3.h
    public java.util.List<kp4.a> getTracks() {
        return this.f152017m;
    }

    public final long getVideoProgress() {
        return this.videoProgress;
    }

    @Override // sm3.h
    public float getWidthPerMills() {
        return this.f152024t.f409847c;
    }

    public final void setCallback(sm3.u uVar) {
        this.callback = uVar;
    }

    public void setDraggingIndex(int i17) {
        this.draggingIndex = i17;
    }

    public void setSelectedIndex(int i17) {
        this.selectedIndex = i17;
    }

    public void setThumbLoader(qm3.i iVar) {
        this.thumbLoader = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setVideoProgress(long r8) {
        /*
            r7 = this;
            r7.videoProgress = r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.f152011d
            int r1 = r0.getScrollState()
            r2 = 1
            r3 = -1
            r4 = 0
            if (r1 != 0) goto L41
            boolean r1 = r7.f152023s
            if (r1 != 0) goto L2a
            int r1 = r7.getDraggingIndex()
            if (r1 == r3) goto L19
            r1 = r2
            goto L1a
        L19:
            r1 = r4
        L1a:
            if (r1 != 0) goto L2a
            int r1 = r7.getSelectedIndex()
            if (r1 == r3) goto L24
            r1 = r2
            goto L25
        L24:
            r1 = r4
        L25:
            if (r1 == 0) goto L28
            goto L2a
        L28:
            r1 = r4
            goto L2b
        L2a:
            r1 = r2
        L2b:
            if (r1 != 0) goto L41
            long r5 = r7.a()
            long r5 = r8 - r5
            float r1 = (float) r5
            float r5 = r7.getWidthPerMills()
            float r1 = r1 * r5
            int r1 = (int) r1
            r0.scrollBy(r1, r4)
            sm3.e r0 = r7.f152025u
            r0.f409857m = r8
        L41:
            int r8 = r7.getSelectedIndex()
            if (r8 == r3) goto L48
            goto L49
        L48:
            r2 = r4
        L49:
            if (r2 == 0) goto L5a
            sm3.o r8 = r7.f152014g
            yz5.l r8 = r8.f409898f
            if (r8 == 0) goto L5a
            long r0 = r7.videoProgress
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r8.invoke(r9)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView.setVideoProgress(long):void");
    }
}
