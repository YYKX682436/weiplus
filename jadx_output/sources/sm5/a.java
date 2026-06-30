package sm5;

/* loaded from: classes10.dex */
public final class a implements com.tencent.tavkit.composition.audio.TAVAudioProcessorNode {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rm5.j f409959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sm5.b f409960b;

    public a(rm5.j jVar, sm5.b bVar) {
        this.f409959a = jVar;
        this.f409960b = bVar;
    }

    @Override // com.tencent.tavkit.composition.audio.TAVAudioProcessorNode
    public com.tencent.tavkit.composition.audio.TAVAudioProcessorNode.TAVAudioProcessorEffect createAudioProcessor() {
        l55.b bVar = (l55.b) this.f409960b.f409961a;
        bVar.getClass();
        rm5.j track = this.f409959a;
        kotlin.jvm.internal.o.g(track, "track");
        return new l55.a(bVar, track);
    }

    @Override // com.tencent.tavkit.composition.audio.TAVAudioProcessorNode
    public java.lang.String getIdentifier() {
        return this.f409959a.f397499a;
    }
}
