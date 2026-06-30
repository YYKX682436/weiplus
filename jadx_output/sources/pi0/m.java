package pi0;

/* loaded from: classes11.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi0.q f354663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.u0 f354664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pi0.q qVar, pi0.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354663d = qVar;
        this.f354664e = u0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi0.m(this.f354663d, this.f354664e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pi0.m mVar = (pi0.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pi0.q qVar = this.f354663d;
        io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness platformBrightness = (qVar.d().getContext().getResources().getConfiguration().uiMode & 48) == 32 ? io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.dark : io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.light;
        pi0.u0 u0Var = this.f354664e;
        io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder startMessage = u0Var.f354731b.getSettingsChannel().startMessage();
        pi0.r rVar = pi0.r.f354717a;
        yz5.a aVar2 = pi0.r.f354719c;
        startMessage.setTextScaleFactor(aVar2 != null ? ((java.lang.Number) aVar2.invoke()).floatValue() : qVar.d().getContext().getResources().getConfiguration().fontScale).setUse24HourFormat(android.text.format.DateFormat.is24HourFormat(qVar.d().getContext())).setPlatformBrightness(platformBrightness).send();
        pi0.i0 i0Var = pi0.k0.f354629c;
        java.lang.String engineId = u0Var.f354730a;
        io.flutter.embedding.engine.FlutterEngine engine = u0Var.f354731b;
        kotlin.jvm.internal.o.g(engineId, "engineId");
        kotlin.jvm.internal.o.g(engine, "engine");
        io.flutter.embedding.engine.dart.DartExecutor dartExecutor = engine.getDartExecutor();
        kotlin.jvm.internal.o.f(dartExecutor, "getDartExecutor(...)");
        pi0.k0 k0Var = new pi0.k0(dartExecutor);
        k0Var.f354632b = engineId;
        pi0.k0.f354630d.put(engineId, k0Var);
        return jz5.f0.f302826a;
    }
}
