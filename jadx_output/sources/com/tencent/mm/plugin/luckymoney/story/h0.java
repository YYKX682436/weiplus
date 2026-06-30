package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class h0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public r45.re6 f145875d;

    /* renamed from: e, reason: collision with root package name */
    public int f145876e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f145877f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f145878g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f145879h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145880i = "";

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145881m;

    public h0(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145881m = envelopeAppBarLayout;
    }

    public void a() {
        if (this.f145877f <= 0 || this.f145876e <= 0) {
            r45.re6 re6Var = this.f145875d;
            float f17 = re6Var.f384777g / (re6Var.f384778h * 1.0f);
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145881m;
            if (f17 > 1.667f) {
                int i17 = envelopeAppBarLayout.f145780l1;
                this.f145877f = i17;
                this.f145876e = (int) (i17 / f17);
            } else if (f17 >= 1.667f) {
                this.f145877f = envelopeAppBarLayout.f145780l1;
                this.f145876e = envelopeAppBarLayout.f145793y0;
            } else {
                int i18 = envelopeAppBarLayout.f145793y0;
                this.f145876e = i18;
                this.f145877f = (int) (i18 * f17);
            }
        }
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
