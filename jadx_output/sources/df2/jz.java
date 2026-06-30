package df2;

/* loaded from: classes3.dex */
public final class jz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f230520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.lz f230521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(int i17, df2.lz lzVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230520e = i17;
        this.f230521f = lzVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.jz(this.f230520e, this.f230521f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.jz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230519d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            int e17 = this.f230520e - c01.id.e();
            df2.lz lzVar = this.f230521f;
            if (e17 <= 0) {
                android.widget.TextView c76 = lzVar.c7();
                if (c76 != null) {
                    c76.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491575m85));
                }
                return jz5.f0.f302826a;
            }
            java.lang.String a17 = no0.l.a(no0.m.f338730a, e17, ":", e17 >= 3600, false, false, 24, null);
            android.widget.TextView c77 = lzVar.c7();
            if (c77 != null) {
                c77.setText(a17);
            }
            this.f230519d = 1;
        } while (kotlinx.coroutines.k1.b(1000L, this) != aVar);
        return aVar;
    }
}
