package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class XWebAudioPlayerProgress extends android.widget.RelativeLayout implements com.tencent.mm.xwebutil.y {

    /* renamed from: d, reason: collision with root package name */
    public long f214808d;

    /* renamed from: e, reason: collision with root package name */
    public long f214809e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f214810f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f214811g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f214812h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall f214813i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.xwebutil.x f214814m;

    /* renamed from: n, reason: collision with root package name */
    public wu5.c f214815n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f214816o;

    public XWebAudioPlayerProgress(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f214808d = 0L;
        this.f214809e = 0L;
        this.f214810f = null;
        this.f214811g = null;
        this.f214812h = null;
        this.f214813i = null;
        this.f214814m = null;
        this.f214815n = null;
        this.f214816o = new com.tencent.mm.xwebutil.u(this);
        b(context);
    }

    public java.lang.String a(long j17) {
        boolean z17;
        if (j17 < 0) {
            j17 = 0;
        }
        long j18 = j17 / 1000;
        long j19 = j18 % 60;
        long j27 = (j18 / 60) % 60;
        long j28 = j18 / 3600;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (j28 > 0) {
            sb6.append(j28);
            sb6.append(":");
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17 && j27 < 10) {
            sb6.append(0);
        }
        sb6.append(j27);
        sb6.append(":");
        if (j19 < 10) {
            sb6.append("0");
        }
        sb6.append(j19);
        return sb6.toString();
    }

    public final void b(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d_y, this);
        this.f214810f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.psy);
        this.f214811g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.psz);
        this.f214812h = findViewById(com.tencent.mm.R.id.psw);
        com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall = (com.tencent.mm.xwebutil.XWebAudioPlayerProgressBall) findViewById(com.tencent.mm.R.id.psx);
        this.f214813i = xWebAudioPlayerProgressBall;
        xWebAudioPlayerProgressBall.setOperationCallback(this);
        this.f214810f.setText(a(this.f214808d));
        this.f214811g.setText(a(this.f214809e));
        this.f214812h.post(new com.tencent.mm.xwebutil.s(this));
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f214812h.post(new com.tencent.mm.xwebutil.v(this));
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f214813i.getTotalLength() == 0) {
            this.f214812h.post(new com.tencent.mm.xwebutil.w(this));
        }
    }

    public void setProgressCallback(com.tencent.mm.xwebutil.x xVar) {
        this.f214814m = xVar;
    }

    public void setTotalTime(long j17) {
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e("XFilesAudioPlayerProgress", "setTotalTime invalid totalTime = " + j17);
            this.f214809e = 0L;
        } else {
            com.tencent.mars.xlog.Log.i("XFilesAudioPlayerProgress", "setTotalTime totalTime = " + j17);
            this.f214809e = j17;
        }
        this.f214811g.setText(a(this.f214809e));
    }

    public XWebAudioPlayerProgress(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f214808d = 0L;
        this.f214809e = 0L;
        this.f214810f = null;
        this.f214811g = null;
        this.f214812h = null;
        this.f214813i = null;
        this.f214814m = null;
        this.f214815n = null;
        this.f214816o = new com.tencent.mm.xwebutil.u(this);
        b(context);
    }
}
