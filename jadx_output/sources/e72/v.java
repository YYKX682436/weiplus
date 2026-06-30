package e72;

/* loaded from: classes14.dex */
public class v implements e72.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f249928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f249929b;

    /* renamed from: c, reason: collision with root package name */
    public final e72.e f249930c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f249931d;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.animation.Animation f249940m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.animation.Animation f249941n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.AnimationSet f249942o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.animation.Animation f249943p;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f249951x;

    /* renamed from: e, reason: collision with root package name */
    public int f249932e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f249933f = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f249934g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.views.FaceNumberView f249935h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f249936i = false;

    /* renamed from: j, reason: collision with root package name */
    public long f249937j = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f249938k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f249939l = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f249944q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public boolean f249945r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f249946s = false;

    /* renamed from: t, reason: collision with root package name */
    public e72.f f249947t = null;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f249948u = new e72.l(this, android.os.Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public final android.os.CountDownTimer f249949v = new e72.m(this, com.tencent.wcdb.core.Database.DictDefaultMatchValue, 1000);

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f249950w = new e72.n(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e72.v.<init>(java.lang.String):void");
    }

    public static void j(e72.v vVar) {
        vVar.f249933f = 0;
        synchronized (vVar.f249944q) {
            vVar.f249939l = false;
        }
        vVar.o();
        if (vVar.f249932e == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: triggered start record");
            e72.e eVar = vVar.f249930c;
            e72.r rVar = new e72.r(vVar);
            eVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "start record");
            s75.d.c(new e72.c(eVar, rVar, null), "FaceVoice_record", 10);
            com.tencent.mm.plugin.facedetect.model.y.INSTANCE.f100043d.f100044i.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
        }
        com.tencent.mm.sdk.platformtools.u3.i(new e72.s(vVar), 2000L);
    }

    @Override // e72.h
    public e72.g a() {
        return new e72.g(90004, "user cancelled in processing");
    }

    @Override // e72.h
    public void b(java.lang.String str) {
        ((android.widget.TextView) this.f249951x.findViewById(com.tencent.mm.R.id.h0f)).setText(str);
    }

    @Override // e72.h
    public boolean c(com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult faceCharacteristicsResult) {
        this.f249938k = true;
        return this.f249946s;
    }

    @Override // e72.h
    public e72.f d() {
        return this.f249947t;
    }

    @Override // e72.h
    public void e(android.content.Context context, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aad, viewGroup2);
        this.f249934g = inflate;
        this.f249935h = (com.tencent.mm.plugin.facedetect.views.FaceNumberView) inflate.findViewById(com.tencent.mm.R.id.don);
        this.f249951x = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.aab, viewGroup);
        m(this.f249931d.length, -1);
        android.widget.TextView l17 = l();
        android.view.animation.Animation animation = this.f249940m;
        l17.startAnimation(animation);
        com.tencent.mm.plugin.facedetect.views.FaceNumberView faceNumberView = this.f249935h;
        if (faceNumberView != null) {
            faceNumberView.setVisibility(0);
            this.f249935h.startAnimation(animation);
            this.f249932e = 0;
            n(false);
            this.f249933f = -1;
            o();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            this.f249937j = android.os.SystemClock.elapsedRealtime();
            this.f249945r = false;
        }
    }

    @Override // e72.h
    public boolean f(int i17, java.lang.CharSequence charSequence) {
        this.f249938k = true;
        return this.f249946s;
    }

    @Override // e72.h
    public boolean g(com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult faceCharacteristicsResult) {
        this.f249938k = false;
        return this.f249946s;
    }

    @Override // e72.h
    public void h() {
        com.tencent.mm.plugin.facedetect.views.FaceNumberItemView[] faceNumberItemViewArr;
        this.f249945r = true;
        this.f249946s = false;
        e72.e eVar = this.f249930c;
        eVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f249891a = null;
        com.tencent.mm.vfs.w6.h(eVar.f249893c);
        if (h72.s.e().f279474h && h72.s.e().h()) {
            tl.c f17 = h72.s.e().f();
            synchronized (eVar.f249896f) {
                eVar.f249896f.remove(f17);
            }
            if (this.f249936i) {
                h72.s.e().l(null);
            } else {
                h72.s.e().d();
            }
        }
        this.f249949v.cancel();
        this.f249948u.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.facedetect.views.FaceNumberView faceNumberView = this.f249935h;
        if (faceNumberView != null && (faceNumberItemViewArr = faceNumberView.f100145g) != null && faceNumberItemViewArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.tencent.mm.plugin.facedetect.views.FaceNumberItemView[] faceNumberItemViewArr2 = faceNumberView.f100145g;
                if (i17 >= faceNumberItemViewArr2.length) {
                    break;
                }
                faceNumberItemViewArr2[i17].f100135d.e();
                i17++;
            }
        }
        if (this.f249934g != null) {
            this.f249936i = false;
            this.f249934g = null;
            this.f249935h = null;
        }
    }

    @Override // e72.h
    public boolean i() {
        return this.f249936i;
    }

    public final java.lang.String k(int i17) {
        if (i17 == 1) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c7a);
        }
        if (i17 == 2) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c7b);
        }
        if (i17 == 3) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c7d);
        }
        if (i17 == 4) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c7e);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NumberFaceMotion", "hy: unknown length!!");
        return "";
    }

    public android.widget.TextView l() {
        android.view.View view = this.f249934g;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h0f);
        }
        return null;
    }

    public final void m(int i17, int i18) {
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "groupIndex: %d, itemDataLength: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (l() != null) {
            if (i17 == 1) {
                l().setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c7h));
                return;
            }
            android.widget.TextView l17 = l();
            if (i18 == -1) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = i17 != 2 ? k(i17) : context.getString(com.tencent.mm.R.string.c7c);
                string = context.getString(com.tencent.mm.R.string.c7g, objArr);
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c7f, k(this.f249932e + 1));
            }
            l17.setText(string);
            if (i18 >= 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "start %d group number", java.lang.Integer.valueOf(i18 + 1));
                com.tencent.mm.plugin.facedetect.model.y.INSTANCE.f100043d.f100044i.getClass();
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
            }
        }
    }

    public final void n(boolean z17) {
        if (this.f249935h != null) {
            m(this.f249931d.length, this.f249932e);
            this.f249935h.setNumberLengthAndInflate(this.f249931d[this.f249932e].length());
            if (!z17) {
                com.tencent.mm.sdk.platformtools.u3.i(new e72.q(this), 500L);
                return;
            }
            e72.p pVar = new e72.p(this);
            android.view.animation.Animation animation = this.f249940m;
            animation.setAnimationListener(pVar);
            android.view.View view = this.f249934g;
            if (view != null) {
                view.startAnimation(animation);
            }
        }
    }

    public final void o() {
        com.tencent.mm.plugin.facedetect.views.FaceNumberView faceNumberView = this.f249935h;
        if (faceNumberView != null) {
            int i17 = this.f249932e;
            if (i17 >= 0) {
                faceNumberView.a(this.f249931d[i17].substring(0, this.f249933f + 1));
            } else {
                faceNumberView.a(null);
            }
        }
    }
}
