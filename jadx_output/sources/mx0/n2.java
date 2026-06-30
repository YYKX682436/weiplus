package mx0;

/* loaded from: classes5.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f332166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f332167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(java.lang.String str, java.util.List list, mx0.q2 q2Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332164d = str;
        this.f332165e = list;
        this.f332166f = q2Var;
        this.f332167g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.n2(this.f332164d, this.f332165e, this.f332166f, this.f332167g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.n2 n2Var = (mx0.n2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setMusicList: templateId ");
        java.lang.String str = this.f332164d;
        sb6.append(str);
        sb6.append(" musicListSize: ");
        java.util.List list = this.f332165e;
        sb6.append(list != null ? new java.lang.Integer(list.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicEntranceV2Plugin", sb6.toString());
        mx0.k3 d17 = this.f332166f.d();
        mx0.n3 o17 = d17.o();
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) o17.e()).t(list, this.f332167g, false);
        d17.i().putString("KEY_TEMPLATE_ID", str);
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) d17.o().e()).setTemplateId(str);
        return jz5.f0.f302826a;
    }
}
