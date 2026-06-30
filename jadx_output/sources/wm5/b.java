package wm5;

/* loaded from: classes10.dex */
public class b implements com.tencent.tavkit.composition.video.TAVVideoMixEffect {

    /* renamed from: a, reason: collision with root package name */
    public final wm5.a f447344a;

    public b(wm5.a filter) {
        kotlin.jvm.internal.o.g(filter, "filter");
        this.f447344a = filter;
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect
    public com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter createFilter() {
        return this.f447344a;
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect
    public java.lang.String effectId() {
        return "CompositionMixEffect_" + hashCode();
    }
}
