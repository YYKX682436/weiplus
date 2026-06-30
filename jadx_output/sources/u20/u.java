package u20;

/* loaded from: classes9.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f423939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u20.y f423940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f423941f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(u20.y yVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f423940e = yVar;
        this.f423941f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new u20.u(this.f423940e, this.f423941f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((u20.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f423939d;
        boolean z17 = true;
        u20.y yVar = this.f423940e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f423939d = 1;
            obj = u20.y.e(yVar, this.f423941f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fw6);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            java.util.List list = yVar.f423955f;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (com.tencent.mm.storage.z3.R4((java.lang.String) it.next())) {
                        break;
                    }
                }
            }
            z17 = false;
            yVar.d(z17);
        } else {
            yVar.a();
        }
        return jz5.f0.f302826a;
    }
}
