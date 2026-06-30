package vw3;

/* loaded from: classes12.dex */
public final class x6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441185g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.ui.widget.MMEditText mMEditText2, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f441183e = mMEditText;
        this.f441184f = mMEditText2;
        this.f441185g = repairerUploadTestUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw3.x6(this.f441183e, this.f441184f, this.f441185g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.x6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String aj6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f441182d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f441183e;
            android.text.Editable text = mMEditText.getText();
            long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(mMEditText.getText().toString()) : 0L;
            android.text.Editable text2 = this.f441184f.getText();
            if (text2 == null || (str = text2.toString()) == null) {
                str = "";
            }
            if (parseLong != 0) {
                com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, parseLong);
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 T1 = m11.b1.Di().T1(n17.Q0(), n17.getMsgId());
                if (T1.j()) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(n17, bm5.f0.f22562g, m11.b1.Di().C1(new java.lang.Long(T1.f322649q)).f322637e, "", "");
                } else {
                    aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(n17, bm5.c0.f22550a.d(false), T1.f322637e, "", "");
                }
                java.lang.String str2 = aj6;
                java.lang.String r17 = c01.z1.r();
                java.lang.String str3 = r17 == null ? "" : r17;
                java.lang.String Q0 = n17.Q0();
                r70.g gVar = new r70.g(str2, 1, str3, Q0 == null ? "" : Q0, new k70.i0());
                xs.d1 d1Var = (xs.d1) i95.n0.c(xs.d1.class);
                this.f441182d = 1;
                ((v70.w) d1Var).getClass();
                obj = e80.r.f250075f.a().Z6(gVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        r70.i iVar = ((r70.h) obj).f393109a;
        r70.i iVar2 = r70.i.f393113d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441185g;
        if (iVar == iVar2) {
            repairerUploadTestUI.runOnUiThread(new vw3.v6(repairerUploadTestUI));
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.w6(repairerUploadTestUI));
        }
        return jz5.f0.f302826a;
    }
}
