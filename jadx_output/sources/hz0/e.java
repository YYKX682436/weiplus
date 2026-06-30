package hz0;

/* loaded from: classes4.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.export.MJExportManager f286256e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, com.tencent.maas.export.MJExportManager mJExportManager, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f286255d = str;
        this.f286256e = mJExportManager;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hz0.e(this.f286255d, this.f286256e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hz0.e eVar = (hz0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        hz0.m.f286283a.a(this.f286255d);
        az0.i5.f15557a.u(this.f286256e);
        return jz5.f0.f302826a;
    }
}
