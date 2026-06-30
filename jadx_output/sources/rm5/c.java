package rm5;

/* loaded from: classes10.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final rm5.h a(rm5.j track) {
        kotlin.jvm.internal.o.g(track, "track");
        com.tencent.tavkit.composition.TAVClip tAVClip = new com.tencent.tavkit.composition.TAVClip(rm5.l.f397520a.c(track));
        tAVClip.getVideoConfiguration().setContentMode(com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill);
        com.tencent.tavkit.composition.TAVComposition tAVComposition = new com.tencent.tavkit.composition.TAVComposition();
        tAVComposition.addVideoChannel(kz5.b0.c(tAVClip));
        com.tencent.tavkit.composition.builder.TAVCompositionBuilder tAVCompositionBuilder = new com.tencent.tavkit.composition.builder.TAVCompositionBuilder(tAVComposition);
        tAVCompositionBuilder.setReloadChannels(false);
        com.tencent.tavkit.composition.TAVSource buildSource = tAVCompositionBuilder.buildSource();
        kotlin.jvm.internal.o.f(buildSource, "buildSource(...)");
        return new rm5.h(new rm5.a(buildSource), track.f397499a);
    }

    public final rm5.h b(rm5.v composition) {
        kotlin.jvm.internal.o.g(composition, "composition");
        return new rm5.h(new rm5.b(composition), java.lang.String.valueOf(composition.hashCode()));
    }
}
