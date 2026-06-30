package vw3;

/* loaded from: classes12.dex */
public final class b7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f440896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f440900i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(com.tencent.mm.ui.widget.MMEditText mMEditText, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440896e = mMEditText;
        this.f440897f = str;
        this.f440898g = str2;
        this.f440899h = str3;
        this.f440900i = repairerUploadTestUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw3.b7(this.f440896e, this.f440897f, this.f440898g, this.f440899h, this.f440900i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw3.b7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r05.i iVar;
        v05.b k17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440895d;
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f440900i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f440896e;
            android.text.Editable text = mMEditText.getText();
            long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(mMEditText.getText().toString()) : 0L;
            c01.h7 h7Var = new c01.h7();
            h7Var.f37227b = parseLong;
            h7Var.f37229d = this.f440897f;
            l15.c cVar = new l15.c();
            cVar.fromXml(this.f440898g);
            if (ot.a.b(cVar) == null) {
                cVar.q(new v05.b());
            }
            v05.b k18 = cVar.k();
            if ((k18 != null ? (v05.a) k18.getCustom(k18.f432315e + 8) : null) == null && (k17 = cVar.k()) != null) {
                k17.set(k17.f432315e + 8, new v05.a());
            }
            pu.l lVar = new pu.l();
            lVar.f358326a = h7Var;
            v05.b k19 = cVar.k();
            if (k19 != null && (iVar = (r05.i) k19.getCustom(k19.f432315e + 22)) != null) {
                lVar.f358329d = iVar.j();
                lVar.f358328c = iVar.k();
                lVar.f358327b = iVar.l();
            }
            java.lang.String r17 = c01.z1.r();
            if (r17 == null) {
                r17 = "";
            }
            pu.p pVar = new pu.p(r17, this.f440899h, cVar, new java.lang.ref.WeakReference(repairerUploadTestUI.f), lVar);
            pt.g0 g0Var = (pt.g0) i95.n0.c(pt.g0.class);
            this.f440895d = 1;
            ((ot.g) g0Var).getClass();
            ot.g gVar = (ot.g) i95.n0.c(ot.g.class);
            kotlin.jvm.internal.o.d(gVar);
            if (!jm0.g.class.isAssignableFrom(pu.o.class)) {
                throw new java.lang.IllegalArgumentException(ot.g.class.getName().concat(" must extends FeatureServiceComponent"));
            }
            androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(gVar.getViewModel(), new jm0.e(gVar)).a(pu.o.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            obj = ((pu.o) ((jm0.g) a17)).T6(pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pu.q qVar = (pu.q) obj;
        com.tencent.mars.xlog.Log.i(repairerUploadTestUI.d, "send app msg result:" + qVar.f358363a);
        if (qVar.f358363a == pu.r.f358366d) {
            repairerUploadTestUI.runOnUiThread(new vw3.z6(repairerUploadTestUI));
        } else {
            repairerUploadTestUI.runOnUiThread(new vw3.a7(repairerUploadTestUI));
        }
        return jz5.f0.f302826a;
    }
}
