package ym5;

/* loaded from: classes10.dex */
public final class w2 extends ym5.h {
    @Override // ym5.h
    public bn5.f a() {
        return new bn5.g(getContext(), getPresenter());
    }

    @Override // ym5.h
    public dn5.c b() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        l45.q presenter = getPresenter();
        kotlin.jvm.internal.o.f(presenter, "getPresenter(...)");
        return new dn5.d(context, presenter);
    }

    @Override // ym5.h
    public qk.g6[] getFeatures() {
        if (this.f463347g == null) {
            this.f463347g = new qk.g6[]{qk.g6.DOODLE, qk.g6.EMOJI, qk.g6.TEXT, qk.g6.MOSAIC, qk.g6.CROP_PHOTO};
        }
        qk.g6[] mFeaturesTypes = this.f463347g;
        kotlin.jvm.internal.o.f(mFeaturesTypes, "mFeaturesTypes");
        return mFeaturesTypes;
    }
}
