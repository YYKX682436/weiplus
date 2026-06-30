package vt2;

/* loaded from: classes3.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt2.g f439948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f439949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.i56 f439950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vt2.g gVar, gk2.e eVar, r45.i56 i56Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439948e = gVar;
        this.f439949f = eVar;
        this.f439950g = i56Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vt2.e(this.f439948e, this.f439949f, this.f439950g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vt2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439947d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.q4 q4Var = dk2.q4.f233938a;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) this.f439948e.f439956a;
        gk2.e eVar = this.f439949f;
        r45.i56 i56Var = this.f439950g;
        long j17 = i56Var.getLong(3);
        long j18 = i56Var.getLong(2);
        java.lang.String string = i56Var.getString(9);
        java.lang.String string2 = i56Var.getString(4);
        java.lang.String str = string2 == null ? "" : string2;
        gk2.e eVar2 = this.f439949f;
        byte[] bArr = ((mm2.e1) eVar2.a(mm2.e1.class)).f328985o;
        java.lang.String string3 = i56Var.getString(6);
        java.lang.String str2 = string3 != null ? string3 : "";
        java.lang.String str3 = ((mm2.c1) eVar2.a(mm2.c1.class)).f328844m5;
        this.f439947d = 1;
        g17 = q4Var.g(mMActivity, eVar, true, true, j17, j18, string, str, bArr, str2, null, 3, str3, (r37 & 8192) != 0 ? java.lang.Boolean.TRUE : null, this);
        return g17 == aVar ? aVar : g17;
    }
}
