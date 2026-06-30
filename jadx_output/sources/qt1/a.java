package qt1;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt1.c f366506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f366507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ im5.c f366508c;

    public a(qt1.c cVar, kotlinx.coroutines.q qVar, im5.c cVar2) {
        this.f366506a = cVar;
        this.f366507b = qVar;
        this.f366508c = cVar2;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        qt1.c cVar = this.f366506a;
        cVar.d("runCgi onTerminate, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        kotlinx.coroutines.q qVar = this.f366507b;
        if (i18 == 0 && i17 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type RESPONSE of com.tencent.mm.plugin.car_license_plate.cgi.CarLicensePlateCgiBase.send$lambda$2");
            qVar.resumeWith(kotlin.Result.m521constructorimpl((r45.js5) fVar));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new qt1.f(i17, i18, str, cVar))));
        }
        this.f366508c.dead();
    }
}
