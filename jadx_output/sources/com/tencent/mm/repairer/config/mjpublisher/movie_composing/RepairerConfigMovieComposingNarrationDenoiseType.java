package com.tencent.mm.repairer.config.mjpublisher.movie_composing;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/mjpublisher/movie_composing/RepairerConfigMovieComposingNarrationDenoiseType;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigMovieComposingNarrationDenoiseType extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_MovieComposingNarrationDenoiseType";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "解说降噪方案";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.config.mjpublisher.RepairerGroupMJPublisherMovieComposing.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 2;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_finder_maas_mj_publisher_narration_denoise_type";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("NO_USE", "MAAS_SDK", "VOIP_3A");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("0", "1", "2");
    }
}
