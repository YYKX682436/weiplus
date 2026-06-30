package com.tencent.mm.transvoice.ui;

/* loaded from: classes14.dex */
public class SoundWaveView extends android.view.View {
    public double A;
    public final java.lang.Runnable B;
    public int C;
    public final ca5.h D;

    /* renamed from: d, reason: collision with root package name */
    public ca5.k f196427d;

    /* renamed from: e, reason: collision with root package name */
    public ca5.i f196428e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f196429f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f196430g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f196431h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f196432i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f196433m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.animation.Interpolator f196434n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f196435o;

    /* renamed from: p, reason: collision with root package name */
    public int f196436p;

    /* renamed from: q, reason: collision with root package name */
    public int f196437q;

    /* renamed from: r, reason: collision with root package name */
    public int f196438r;

    /* renamed from: s, reason: collision with root package name */
    public int f196439s;

    /* renamed from: t, reason: collision with root package name */
    public int f196440t;

    /* renamed from: u, reason: collision with root package name */
    public int f196441u;

    /* renamed from: v, reason: collision with root package name */
    public int f196442v;

    /* renamed from: w, reason: collision with root package name */
    public int f196443w;

    /* renamed from: x, reason: collision with root package name */
    public int f196444x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f196445y;

    /* renamed from: z, reason: collision with root package name */
    public int f196446z;

    public SoundWaveView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getActiveBundleIndex() {
        int i17 = this.C;
        ca5.h hVar = this.D;
        if (-1 == i17) {
            int nextInt = new java.util.Random().nextInt((hVar.f40090b - hVar.f40089a) + 1) + hVar.f40089a;
            this.C = nextInt;
            return nextInt;
        }
        int nextInt2 = new java.util.Random().nextInt(3);
        if (1 == nextInt2) {
            int i18 = this.C - 1;
            if (!c(i18)) {
                return i18;
            }
            int i19 = this.C + 1;
            if (!c(i19)) {
                return i19;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, keep! %s %s", java.lang.Integer.valueOf(this.C), hVar);
            return this.C;
        }
        if (2 != nextInt2) {
            return this.C;
        }
        int i27 = this.C + 1;
        if (!c(i27)) {
            return i27;
        }
        int i28 = this.C - 1;
        if (!c(i28)) {
            return i28;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, keep! %s %s", java.lang.Integer.valueOf(this.C), hVar);
        return this.C;
    }

    private int getBundleCount() {
        float[] fArr = ca5.j.f40095a;
        return ca5.k.MINI == this.f196427d ? 2 : 5;
    }

    private int getVolumeItemCount() {
        int bundleCount = getBundleCount();
        float[] fArr = ca5.j.f40095a;
        return bundleCount * 5;
    }

    public final void a() {
        int bundleCount = getBundleCount();
        int i17 = bundleCount / 2;
        int i18 = i17 - 1;
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = i17 + 1;
        if (i19 >= bundleCount) {
            i19 = bundleCount - 1;
        }
        ca5.h hVar = this.D;
        hVar.f40089a = i18;
        hVar.f40090b = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "initBaseBundleGroupInfo: %s", hVar.toString());
    }

    public final void b() {
        this.f196431h.clear();
        int volumeItemCount = getVolumeItemCount();
        for (int i17 = 0; i17 < volumeItemCount; i17++) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            float[] fArr = ca5.j.f40095a;
            animatorSet.setStartDelay(100 * i17);
            animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
            ca5.f fVar = new ca5.f(this, i17);
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(this.f196439s, this.f196441u);
            long j17 = 500;
            ofInt.setDuration(j17);
            ofInt.addUpdateListener(fVar);
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(this.f196441u, this.f196439s);
            ofInt2.setDuration(j17);
            ofInt2.addUpdateListener(fVar);
            int i18 = this.f196439s;
            android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(i18, i18);
            ofInt3.setDuration(1000);
            ofInt3.addUpdateListener(fVar);
            animatorSet.addListener(new ca5.g(this, i17));
            animatorSet.playSequentially(ofInt, ofInt2, ofInt3);
            this.f196431h.add(animatorSet);
        }
    }

    public final boolean c(int i17) {
        ca5.h hVar = this.D;
        return !(i17 >= hVar.f40089a && i17 <= hVar.f40090b);
    }

    public void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f196432i).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.List list = (java.util.List) it.next();
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.set(i17, java.lang.Float.valueOf(this.f196439s));
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) this.f196433m).iterator();
        while (it6.hasNext()) {
            java.util.List list2 = (java.util.List) it6.next();
            for (int i18 = 0; i18 < list2.size(); i18++) {
                list2.set(i18, java.lang.Float.valueOf(this.f196439s));
            }
        }
        this.f196428e = ca5.i.WAITING;
        this.C = -1;
        f();
        java.util.Iterator it7 = this.f196431h.iterator();
        while (it7.hasNext()) {
            ((android.animation.AnimatorSet) it7.next()).end();
        }
        java.util.Iterator it8 = this.f196431h.iterator();
        while (it8.hasNext()) {
            ((android.animation.AnimatorSet) it8.next()).start();
        }
    }

    public final void e() {
        int bundleCount = getBundleCount();
        for (int i17 = 0; i17 < bundleCount; i17++) {
            this.f196429f.set(i17, java.lang.Integer.valueOf(this.f196439s));
        }
    }

    public final void f() {
        int volumeItemCount = getVolumeItemCount();
        for (int i17 = 0; i17 < volumeItemCount; i17++) {
            this.f196430g.set(i17, java.lang.Integer.valueOf(this.f196439s));
        }
    }

    public final void g(float f17, java.util.List list) {
        float[] fArr = ca5.j.f40095a;
        for (int i17 = 0; i17 < 5; i17++) {
            float[] fArr2 = ca5.j.f40095a;
            int i18 = 2 - i17;
            float pow = (float) (f17 * java.lang.Math.pow(0.8f, java.lang.Math.abs(i18)));
            if (2 == java.lang.Math.abs(i18)) {
                postDelayed(new ca5.d(this, list, i17, pow), 320L);
            } else if (1 == java.lang.Math.abs(i18)) {
                postDelayed(new ca5.e(this, list, i17, pow), 160L);
            } else if (java.lang.Math.abs(i18) == 0) {
                list.set(i17, java.lang.Float.valueOf(pow));
            }
        }
    }

    public void h(ca5.k kVar) {
        this.f196427d = kVar;
        e();
        f();
        a();
        b();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "update style %s", this.f196427d);
        requestLayout();
        d();
    }

    public void i(int i17) {
        float f17 = i17 / 100.0f;
        double d17 = f17;
        double d18 = this.A;
        java.lang.Runnable runnable = this.B;
        ca5.i iVar = ca5.i.JUDGING;
        ca5.i iVar2 = ca5.i.REACTING;
        if (d17 > d18) {
            if (iVar == this.f196428e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "cancel judging!!!");
                this.f196428e = iVar2;
                removeCallbacks(runnable);
            }
            if (ca5.i.WAITING == this.f196428e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "active reacting!!!");
                this.f196428e = iVar2;
                java.util.Iterator it = this.f196431h.iterator();
                while (it.hasNext()) {
                    ((android.animation.AnimatorSet) it.next()).end();
                }
            }
        } else if (iVar2 == this.f196428e) {
            this.f196428e = iVar;
            postDelayed(runnable, 300);
        }
        ca5.i iVar3 = this.f196428e;
        if (iVar2 == iVar3 || iVar == iVar3) {
            e();
            int interpolation = (int) (this.f196434n.getInterpolation(f17) * this.f196440t);
            int activeBundleIndex = getActiveBundleIndex();
            this.f196429f.set(activeBundleIndex, java.lang.Integer.valueOf(interpolation));
            int nextInt = new java.util.Random().nextInt(2);
            ca5.h hVar = this.D;
            int i18 = hVar.f40089a;
            float[] fArr = ca5.j.f40095a;
            if (i18 == activeBundleIndex) {
                float f18 = interpolation;
                this.f196429f.set(hVar.f40090b, java.lang.Integer.valueOf((int) (fArr[nextInt] * f18)));
                int i19 = hVar.f40090b;
                if (i19 - 1 != hVar.f40089a) {
                    this.f196429f.set(i19 - 1, java.lang.Integer.valueOf((int) (f18 * fArr[1 - nextInt])));
                }
            } else if (hVar.f40090b == activeBundleIndex) {
                float f19 = interpolation;
                this.f196429f.set(i18, java.lang.Integer.valueOf((int) (fArr[nextInt] * f19)));
                int i27 = hVar.f40089a + 1;
                if (i27 != hVar.f40090b) {
                    this.f196429f.set(i27, java.lang.Integer.valueOf((int) (f19 * fArr[1 - nextInt])));
                }
            } else {
                float f27 = interpolation;
                this.f196429f.set(i18, java.lang.Integer.valueOf((int) (fArr[nextInt] * f27)));
                this.f196429f.set(hVar.f40090b, java.lang.Integer.valueOf((int) (f27 * fArr[nextInt])));
            }
            int bundleCount = getBundleCount();
            int nextInt2 = new java.util.Random().nextInt(2);
            java.util.List list = this.f196433m;
            float[] fArr2 = ca5.j.f40096b;
            int i28 = 0;
            if (bundleCount == 5) {
                int i29 = bundleCount / 2;
                while (i28 < bundleCount) {
                    if (c(i28)) {
                        this.f196429f.set(i28, java.lang.Integer.valueOf((int) (interpolation * fArr2[nextInt2])));
                        nextInt2 = 1 - nextInt2;
                    }
                    int i37 = i29 - i28;
                    if (2 == java.lang.Math.abs(i37)) {
                        postDelayed(new ca5.b(this, i28), 320L);
                    } else if (1 == java.lang.Math.abs(i37)) {
                        postDelayed(new ca5.c(this, i28), 160L);
                    } else if (java.lang.Math.abs(i37) == 0) {
                        g(((java.lang.Integer) this.f196429f.get(i28)).intValue(), (java.util.List) ((java.util.ArrayList) list).get(i28));
                    }
                    i28++;
                }
            } else {
                while (i28 < bundleCount) {
                    if (c(i28)) {
                        this.f196429f.set(i28, java.lang.Integer.valueOf((int) (interpolation * fArr2[nextInt2])));
                        nextInt2 = 1 - nextInt2;
                    }
                    g(((java.lang.Integer) this.f196429f.get(i28)).intValue(), (java.util.List) ((java.util.ArrayList) list).get(i28));
                    i28++;
                }
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.util.List list;
        super.onDraw(canvas);
        ca5.i iVar = ca5.i.REACTING;
        ca5.i iVar2 = this.f196428e;
        int i17 = 0;
        if (iVar == iVar2 || ca5.i.JUDGING == iVar2) {
            int bundleCount = getBundleCount();
            for (int i18 = 0; i18 < bundleCount; i18++) {
                ((java.lang.Integer) this.f196429f.get(i18)).intValue();
                float[] fArr = ca5.j.f40095a;
                int i19 = 0;
                while (true) {
                    list = this.f196432i;
                    if (i19 >= 5) {
                        break;
                    }
                    float floatValue = ((java.lang.Float) ((java.util.List) ((java.util.ArrayList) this.f196433m).get(i18)).get(i19)).floatValue();
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    float floatValue2 = ((java.lang.Float) ((java.util.List) arrayList.get(i18)).get(i19)).floatValue();
                    ((java.util.List) arrayList.get(i18)).set(i19, java.lang.Float.valueOf(floatValue2 + ((floatValue - floatValue2) / 6.0f)));
                    i19++;
                }
                int i27 = (this.f196442v * i18) + (this.f196437q * i18);
                for (int i28 = 0; i28 < 5; i28++) {
                    int i29 = (this.f196436p * i28) + (this.f196437q * i28) + i27;
                    float floatValue3 = ((java.lang.Float) ((java.util.List) ((java.util.ArrayList) list).get(i18)).get(i28)).floatValue();
                    float f17 = this.f196439s;
                    if (floatValue3 < f17) {
                        floatValue3 = f17;
                    }
                    float f18 = this.f196440t;
                    if (floatValue3 > f18) {
                        floatValue3 = f18;
                    }
                    float f19 = (this.f196444x - floatValue3) / 2.0f;
                    float f27 = i29;
                    float f28 = this.f196436p + i29;
                    float f29 = this.f196438r;
                    canvas.drawRoundRect(f27, f19, f28, f19 + floatValue3, f29, f29, this.f196435o);
                }
            }
        } else if (ca5.i.WAITING == iVar2) {
            int volumeItemCount = getVolumeItemCount();
            while (i17 < volumeItemCount) {
                int i37 = i17 + 1;
                int i38 = (this.f196443w - (this.f196436p * i37)) - (this.f196437q * i17);
                int intValue = (this.f196444x - ((java.lang.Integer) this.f196430g.get(i17)).intValue()) / 2;
                int i39 = this.f196436p + i38;
                float intValue2 = ((java.lang.Integer) this.f196430g.get(i17)).intValue() + intValue;
                int i47 = this.f196438r;
                canvas.drawRoundRect(i38, intValue, i39, intValue2, i47, i47, this.f196435o);
                i17 = i37;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (ca5.k.MINI == this.f196427d) {
            this.f196443w = com.tencent.mm.ui.zk.a(getContext(), ca5.j.f40099e);
        } else if (this.f196445y) {
            this.f196443w = com.tencent.mm.ui.zk.a(getContext(), this.f196446z);
        } else {
            this.f196443w = com.tencent.mm.ui.zk.a(getContext(), ca5.j.f40098d);
        }
        setMeasuredDimension(this.f196443w, this.f196444x);
    }

    public void setStyle(ca5.k kVar) {
        this.f196427d = kVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "set style %s", kVar);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            d();
        }
    }

    public void setVolumeChange(double d17) {
        this.A = d17;
    }

    public void setWaveColor(int i17) {
        android.graphics.Paint paint = this.f196435o;
        if (paint != null) {
            paint.setColor(i17);
            invalidate();
        }
    }

    public SoundWaveView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        ca5.k kVar = ca5.k.NORMAL;
        this.f196427d = kVar;
        this.f196428e = ca5.i.WAITING;
        this.f196432i = new java.util.ArrayList();
        this.f196433m = new java.util.ArrayList();
        int i18 = 0;
        this.f196445y = false;
        this.A = 0.05d;
        this.B = new ca5.a(this);
        this.C = -1;
        this.D = new ca5.h(this, null);
        float[] fArr = ca5.j.f40095a;
        int parseColor = android.graphics.Color.parseColor("#000000");
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hi0.a.f281483a, 0, 0);
            int i19 = obtainStyledAttributes.getInt(1, 0);
            if (i19 == 0) {
                this.f196427d = kVar;
            } else if (i19 == 1) {
                this.f196427d = ca5.k.MINI;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewTrans2Txt.SoundWaveView", "style err! %s", java.lang.Integer.valueOf(i19));
            }
            int color = obtainStyledAttributes.getColor(0, android.graphics.Color.parseColor("#000000"));
            obtainStyledAttributes.recycle();
            com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "init style %s", this.f196427d);
            parseColor = color;
        }
        this.f196436p = com.tencent.mm.ui.zk.a(getContext(), 2);
        this.f196437q = com.tencent.mm.ui.zk.a(getContext(), 1);
        this.f196438r = com.tencent.mm.ui.zk.a(getContext(), 1);
        this.f196439s = com.tencent.mm.ui.zk.a(getContext(), 4);
        this.f196440t = com.tencent.mm.ui.zk.a(getContext(), 34);
        this.f196441u = com.tencent.mm.ui.zk.a(getContext(), 10);
        this.f196442v = com.tencent.mm.ui.zk.a(getContext(), ca5.j.f40097c);
        this.f196443w = com.tencent.mm.ui.zk.a(getContext(), ca5.j.f40098d);
        this.f196444x = com.tencent.mm.ui.zk.a(getContext(), 34);
        this.f196429f = new java.util.ArrayList();
        int i27 = 0;
        while (true) {
            float[] fArr2 = ca5.j.f40095a;
            if (i27 >= 5) {
                break;
            }
            this.f196429f.add(java.lang.Integer.valueOf(this.f196439s));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i28 = 0;
            while (true) {
                float[] fArr3 = ca5.j.f40095a;
                if (i28 < 5) {
                    arrayList.add(java.lang.Float.valueOf(this.f196439s));
                    arrayList2.add(java.lang.Float.valueOf(this.f196439s));
                    i28++;
                }
            }
            this.f196432i.add(arrayList);
            this.f196433m.add(arrayList2);
            i27++;
        }
        this.f196430g = new java.util.ArrayList();
        while (true) {
            float[] fArr4 = ca5.j.f40095a;
            if (i18 < 25) {
                this.f196430g.add(java.lang.Integer.valueOf(this.f196439s));
                i18++;
            } else {
                e();
                f();
                this.f196431h = new java.util.ArrayList(25);
                this.f196434n = p3.a.b(0.0f, 0.5f, 0.2f, 1.0f);
                a();
                b();
                android.graphics.Paint paint = new android.graphics.Paint(1);
                this.f196435o = paint;
                paint.setColor(parseColor);
                this.f196435o.setAlpha(128);
                return;
            }
        }
    }
}
