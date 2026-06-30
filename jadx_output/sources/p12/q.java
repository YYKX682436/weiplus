package p12;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f351042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f351043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p12.w wVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f351042d = wVar;
        this.f351043e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new p12.q(this.f351042d, this.f351043e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p12.q qVar = (p12.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorTrimView emojiEditorTrimView = this.f351042d.f351055h;
        if (emojiEditorTrimView == null) {
            kotlin.jvm.internal.o.o("trimView");
            throw null;
        }
        emojiEditorTrimView.f97524r = emojiEditorTrimView.d((float) this.f351043e) - emojiEditorTrimView.f97512J;
        emojiEditorTrimView.invalidate();
        return jz5.f0.f302826a;
    }
}
