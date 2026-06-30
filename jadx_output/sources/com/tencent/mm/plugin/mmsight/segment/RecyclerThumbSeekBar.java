package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class RecyclerThumbSeekBar extends android.widget.RelativeLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f148871w = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f148872d;

    /* renamed from: e, reason: collision with root package name */
    public int f148873e;

    /* renamed from: f, reason: collision with root package name */
    public int f148874f;

    /* renamed from: g, reason: collision with root package name */
    public int f148875g;

    /* renamed from: h, reason: collision with root package name */
    public int f148876h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.g f148877i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.h f148878m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f148879n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.z f148880o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.SliderSeekBar f148881p;

    /* renamed from: q, reason: collision with root package name */
    public int f148882q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f148883r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.i f148884s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f148885t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f148886u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.k1 f148887v;

    public RecyclerThumbSeekBar(android.content.Context context) {
        super(context);
        this.f148874f = -1;
        this.f148884s = new com.tencent.mm.plugin.mmsight.segment.i(4, new com.tencent.mm.plugin.mmsight.segment.q(this));
        this.f148885t = new com.tencent.mm.plugin.mmsight.segment.s(this);
        this.f148886u = new com.tencent.mm.plugin.mmsight.segment.v(this);
        this.f148887v = new com.tencent.mm.plugin.mmsight.segment.w(this);
        e();
    }

    public static int a(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar, int i17) {
        com.tencent.mm.plugin.mmsight.segment.z zVar = recyclerThumbSeekBar.f148880o;
        if (zVar == null) {
            throw new java.lang.IllegalStateException("recyclerAdapter is null");
        }
        if (recyclerThumbSeekBar.f148874f <= 0) {
            throw new java.lang.IllegalStateException("durationMs <= 0");
        }
        zVar.getItemCount();
        return (int) (java.lang.Math.min(java.lang.Math.max(0.0f, i17 / recyclerThumbSeekBar.f148874f), 1.0f) * recyclerThumbSeekBar.f148876h * (recyclerThumbSeekBar.f148880o.getItemCount() - 2));
    }

    private void setViewWidth(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i17;
        setLayoutParams(layoutParams);
    }

    public float b() {
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.f148881p;
        if (sliderSeekBar == null) {
            return 0.0f;
        }
        float d17 = d(sliderSeekBar.getRightSliderBound(), true);
        this.f148881p.getRightSliderBound();
        java.lang.Math.round(this.f148874f * d17);
        return d17;
    }

    public float c() {
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.f148881p;
        if (sliderSeekBar == null) {
            return 0.0f;
        }
        float d17 = d(sliderSeekBar.getLeftSliderBound(), false);
        this.f148881p.getLeftSliderBound();
        java.lang.Math.round(this.f148874f * d17);
        return d17;
    }

    public final float d(int i17, boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.f148880o == null || (recyclerView = this.f148879n) == null) {
            return 0.0f;
        }
        android.view.View k07 = recyclerView.k0(i17, 0.0f);
        if (k07 == null) {
            com.tencent.mars.xlog.Log.w("RecyclerThumbSeekBar", "getPositionInTotalRange x[%d] isEnd[%b], view is null.", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            return 0.0f;
        }
        int u07 = this.f148879n.u0(k07);
        int itemCount = this.f148880o.getItemCount();
        if (u07 < 1) {
            return 0.0f;
        }
        if (u07 >= itemCount - 1) {
            return 1.0f;
        }
        return ((u07 - 1) + ((i17 - k07.getLeft()) / k07.getWidth())) / (itemCount - 2);
    }

    public final void e() {
        this.f148879n = new androidx.recyclerview.widget.RecyclerView(getContext(), null);
        this.f148879n.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
        this.f148879n.setHasFixedSize(true);
        i65.a.h(getContext(), com.tencent.mm.R.dimen.ad_);
        this.f148882q = i65.a.h(getContext(), com.tencent.mm.R.dimen.ad9);
        addView(this.f148879n, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f148881p = new com.tencent.mm.plugin.mmsight.segment.SliderSeekBar(getContext(), null);
        addView(this.f148881p, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f148881p.setOnSliderTouchListener(this.f148887v);
        this.f148879n.i(this.f148886u);
    }

    public void f(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "initAsync %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.u(this));
        } else {
            this.f148872d = str;
            post(this.f148885t);
        }
    }

    public void g() {
        com.tencent.mm.plugin.mmsight.segment.a0 a0Var;
        this.f148874f = -1;
        this.f148872d = null;
        com.tencent.mm.plugin.mmsight.segment.i iVar = this.f148884s;
        if (iVar != null) {
            iVar.b();
        }
        com.tencent.mm.plugin.mmsight.segment.z zVar = this.f148880o;
        if (zVar != null && (a0Var = zVar.f149111d) != null) {
            com.tencent.mm.sdk.platformtools.n3[] n3VarArr = a0Var.f148978c;
            if (n3VarArr != null && n3VarArr.length != 0) {
                for (int i17 = 0; i17 < n3VarArr.length; i17++) {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = n3VarArr[i17];
                    if (n3Var != null) {
                        n3Var.getSerial().f457303b.g();
                        n3VarArr[i17] = null;
                    }
                }
            }
            this.f148880o.f149111d = null;
            this.f148880o = null;
        }
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.f148881p;
        if (sliderSeekBar != null) {
            sliderSeekBar.d();
        }
    }

    public int getDurationMs() {
        return this.f148874f;
    }

    public int getRightSliderPosition() {
        return this.f148881p.getRightSliderBound();
    }

    public void setCurrentCursorPosition(float f17) {
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.f148881p;
        float f18 = 0.0f;
        if (this.f148880o != null && this.f148879n != null) {
            float itemCount = (r1.getItemCount() - 2) * f17;
            int floor = (int) java.lang.Math.floor(itemCount);
            float f19 = itemCount - floor;
            androidx.recyclerview.widget.k3 p07 = this.f148879n.p0(floor + 1);
            if (p07 != null) {
                android.view.View view = p07.itemView;
                f18 = (view.getLeft() + (view.getWidth() * f19)) / getWidth();
            }
        }
        sliderSeekBar.setCursorPos(f18);
    }

    public void setOnPreparedListener(com.tencent.mm.plugin.mmsight.segment.g gVar) {
        this.f148877i = gVar;
    }

    public void setThumbBarSeekListener(com.tencent.mm.plugin.mmsight.segment.h hVar) {
        this.f148878m = hVar;
    }

    public void setVideoTransPara(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        this.f148883r = videoTransPara;
        if (videoTransPara.f71195h <= videoTransPara.f71196i) {
            this.f148881p.f148941f = true;
        }
    }

    public RecyclerThumbSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f148874f = -1;
        this.f148884s = new com.tencent.mm.plugin.mmsight.segment.i(4, new com.tencent.mm.plugin.mmsight.segment.q(this));
        this.f148885t = new com.tencent.mm.plugin.mmsight.segment.s(this);
        this.f148886u = new com.tencent.mm.plugin.mmsight.segment.v(this);
        this.f148887v = new com.tencent.mm.plugin.mmsight.segment.w(this);
        e();
    }

    public RecyclerThumbSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f148874f = -1;
        this.f148884s = new com.tencent.mm.plugin.mmsight.segment.i(4, new com.tencent.mm.plugin.mmsight.segment.q(this));
        this.f148885t = new com.tencent.mm.plugin.mmsight.segment.s(this);
        this.f148886u = new com.tencent.mm.plugin.mmsight.segment.v(this);
        this.f148887v = new com.tencent.mm.plugin.mmsight.segment.w(this);
        e();
    }
}
