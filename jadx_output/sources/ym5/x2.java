package ym5;

/* loaded from: classes10.dex */
public class x2 extends ym5.h {
    @Override // ym5.h
    public bn5.f a() {
        return new bn5.h(getContext(), getPresenter());
    }

    @Override // ym5.h
    public dn5.c b() {
        return new dn5.e(getContext(), getPresenter());
    }

    @Override // ym5.h
    public qk.g6[] getFeatures() {
        if (this.f463347g == null) {
            this.f463347g = new qk.g6[]{qk.g6.DOODLE, qk.g6.EMOJI, qk.g6.TEXT, qk.g6.MOSAIC, qk.g6.CROP_PHOTO};
        }
        return this.f463347g;
    }
}
