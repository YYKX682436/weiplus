package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class o8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f191812a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.e1 f191813b = com.tencent.mm.pluginsdk.ui.e1.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    public int f191814c;

    /* renamed from: d, reason: collision with root package name */
    public int f191815d;

    /* renamed from: e, reason: collision with root package name */
    public int f191816e;

    /* renamed from: f, reason: collision with root package name */
    public int f191817f;

    /* renamed from: g, reason: collision with root package name */
    public int f191818g;

    /* renamed from: h, reason: collision with root package name */
    public int f191819h;

    public boolean a(int i17, int i18, int i19, int i27) {
        if (this.f191814c == i17 && this.f191815d == i18 && this.f191816e == i19 && this.f191817f == i27) {
            return true;
        }
        this.f191814c = i17;
        this.f191815d = i18;
        this.f191816e = i19;
        this.f191817f = i27;
        float f17 = (i19 * 1.0f) / i27;
        float f18 = (i17 * 1.0f) / i18;
        com.tencent.mm.pluginsdk.ui.e1 e1Var = this.f191813b;
        if (e1Var == com.tencent.mm.pluginsdk.ui.e1.DEFAULT) {
            b(f17, f18);
            return false;
        }
        if (e1Var == com.tencent.mm.pluginsdk.ui.e1.CONTAIN) {
            if (i17 < i18) {
                int i28 = (int) (i17 / f17);
                this.f191819h = i28;
                this.f191818g = i17;
                if (i28 <= i18) {
                    return false;
                }
                this.f191818g = (int) (i18 * f17);
                this.f191819h = i18;
                return false;
            }
            int i29 = (int) (i18 * f17);
            this.f191818g = i29;
            this.f191819h = i18;
            if (i29 <= i17) {
                return false;
            }
            this.f191819h = (int) (i17 / f17);
            this.f191818g = i17;
            return false;
        }
        if (e1Var == com.tencent.mm.pluginsdk.ui.e1.FILL) {
            this.f191819h = i18;
            this.f191818g = i17;
            return false;
        }
        if (e1Var != com.tencent.mm.pluginsdk.ui.e1.COVER) {
            b(f17, f18);
            return false;
        }
        if (i17 > i18) {
            int i37 = (int) (i17 / f17);
            this.f191819h = i37;
            this.f191818g = i17;
            if (i37 >= i18) {
                return false;
            }
            this.f191818g = (int) (i18 * f17);
            this.f191819h = i18;
            return false;
        }
        int i38 = (int) (i18 * f17);
        this.f191818g = i38;
        this.f191819h = i18;
        if (i38 >= i17) {
            return false;
        }
        this.f191819h = (int) (i17 / f17);
        this.f191818g = i17;
        return false;
    }

    public final void b(float f17, float f18) {
        if (!this.f191812a) {
            int i17 = this.f191814c;
            int i18 = this.f191815d;
            if (i17 < i18) {
                this.f191819h = (int) (i17 / f17);
                this.f191818g = i17;
                return;
            } else {
                this.f191818g = (int) (i18 * f17);
                this.f191819h = i18;
                return;
            }
        }
        if (java.lang.Math.abs(f17 - f18) > 0.05d) {
            int i19 = this.f191814c;
            int i27 = this.f191815d;
            if (i19 < i27) {
                this.f191819h = (int) (i19 / f17);
                this.f191818g = i19;
                return;
            } else {
                this.f191818g = (int) (i27 * f17);
                this.f191819h = i27;
                return;
            }
        }
        int i28 = this.f191814c;
        int i29 = this.f191815d;
        if (i28 > i29) {
            this.f191819h = (int) (i28 / f17);
            this.f191818g = i28;
        } else {
            this.f191818g = (int) (i29 * f17);
            this.f191819h = i29;
        }
    }

    public void c() {
        this.f191815d = 0;
        this.f191814c = 0;
        this.f191817f = 0;
        this.f191816e = 0;
        this.f191819h = 0;
        this.f191818g = 0;
    }

    public boolean d(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.pluginsdk.ui.e1 e1Var2 = this.f191813b;
        boolean z17 = e1Var2 == e1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", e1Var2, e1Var);
        this.f191813b = e1Var;
        c();
        return !z17;
    }
}
