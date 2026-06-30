package sf2;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f407261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407265h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407266i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(xg2.h hVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.String str, java.lang.String str2, kotlin.jvm.internal.h0 h0Var, sf2.d3 d3Var) {
        super(2, continuation);
        this.f407261d = hVar;
        this.f407262e = i17;
        this.f407263f = str;
        this.f407264g = str2;
        this.f407265h = h0Var;
        this.f407266i = d3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.r2(this.f407261d, continuation, this.f407262e, this.f407263f, this.f407264g, this.f407265h, this.f407266i);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sf2.r2 r2Var = (sf2.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rm0.j jVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f407261d).f454381b;
        com.tencent.mars.xlog.Log.e("FinderLiveRequestSongController", "FinderLiveKtvModSongListRequest fail, modType: " + this.f407262e + ", mid: " + this.f407263f + ", uniqueId " + this.f407264g + " errMsg: " + aVar2 + ' ');
        rm0.j jVar2 = aVar2.f454379a;
        this.f407265h.f310123d = jVar2;
        java.lang.Integer num = jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null;
        boolean z17 = false;
        java.lang.Integer[] numArr = {new java.lang.Integer(-200307), new java.lang.Integer(-200315)};
        int i17 = 0;
        while (true) {
            if (i17 >= 2) {
                break;
            }
            if (kotlin.jvm.internal.o.b(numArr[i17], num)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (z17 && (jVar = aVar2.f454379a) != null && (str = jVar.f397426g) != null) {
            android.content.Context O6 = this.f407266i.O6();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
            e4Var.f211776c = str;
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
