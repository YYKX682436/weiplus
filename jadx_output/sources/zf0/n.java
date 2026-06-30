package zf0;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472477d;

    /* renamed from: e, reason: collision with root package name */
    public int f472478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi3.h f472480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f472481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472482i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vf0.j1 f472483m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vf0.e f472484n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f472485o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f472486p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zf0.v0 v0Var, oi3.h hVar, t21.v2 v2Var, java.lang.String str, vf0.j1 j1Var, vf0.e eVar, java.util.Map map, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f472479f = v0Var;
        this.f472480g = hVar;
        this.f472481h = v2Var;
        this.f472482i = str;
        this.f472483m = j1Var;
        this.f472484n = eVar;
        this.f472485o = map;
        this.f472486p = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zf0.n(this.f472479f, this.f472480g, this.f472481h, this.f472482i, this.f472483m, this.f472484n, this.f472485o, this.f472486p, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zf0.n) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object f17;
        java.lang.String str3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f472478e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Integer d17 = this.f472479f.d(false);
            if (d17 != null) {
                this.f472483m.f436197a = d17.intValue();
                return f0Var;
            }
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            oi3.h hVar = this.f472480g;
            bm5.f0 f0Var2 = bm5.f0.f22571s;
            java.lang.String sj6 = ((k90.b) u0Var).sj(hVar, f0Var2, this.f472481h.d(), true);
            if (!com.tencent.mm.vfs.w6.j(this.f472482i)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.SendVideoTask", "cannot compress video,because importPath:" + this.f472482i + " not exist");
                this.f472483m.f436197a = -540002;
                return f0Var;
            }
            vf0.e eVar = this.f472484n;
            if (eVar.f436148c != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.SendVideoTask", "checkCompress error ,errorcode = " + this.f472484n.f436148c + ",errorMsg = " + this.f472484n.f436149d);
                vf0.j1 j1Var = this.f472483m;
                boolean z17 = this.f472484n.f436146a;
                j1Var.getClass();
                this.f472483m.f436197a = -540004;
                return f0Var;
            }
            if (!eVar.f436146a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f472479f.id() + " skip compressVideo, directly copy file (needCompress=false)");
                com.tencent.mm.vfs.w6.c(this.f472482i, sj6);
                vf0.i3 i3Var = this.f472479f.f472563i.f436177d;
                if ((i3Var != null ? i3Var.f436196a : null) == vf0.j3.f436203e) {
                    ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Ai(this.f472482i);
                }
                this.f472483m.getClass();
                return f0Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", this.f472479f.id() + " start executeCompress (needCompress=true)");
            zf0.b1 b1Var = zf0.b1.f472385a;
            java.lang.String str4 = this.f472482i;
            boolean z18 = this.f472479f.f472563i.f436176c;
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.f472484n.f436147b;
            java.lang.String h17 = this.f472481h.h();
            kotlin.jvm.internal.o.f(h17, "getUser(...)");
            java.lang.String j17 = bm5.z.j(bm5.y.f22756i.e(this.f472480g, f0Var2, this.f472481h.d()));
            zf0.v0 v0Var = this.f472479f;
            zf0.l lVar = new zf0.l(v0Var, this.f472483m);
            java.util.Map map = this.f472485o;
            com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams = this.f472484n.f436150e;
            java.lang.String str5 = this.f472486p;
            zf0.m mVar = new zf0.m(v0Var);
            kotlinx.coroutines.sync.d dVar = v0Var.f472568q;
            this.f472477d = sj6;
            this.f472478e = 1;
            str = "MicroMsg.VideoMsg.SendVideoTask";
            str2 = ",errorMsg = ";
            f17 = b1Var.f(str4, false, z18, sj6, videoTransPara, h17, j17, lVar, map, aBAPrams, str5, mVar, dVar, this);
            if (f17 == aVar) {
                return aVar;
            }
            str3 = sj6;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str6 = (java.lang.String) this.f472477d;
            kotlin.ResultKt.throwOnFailure(obj);
            str3 = str6;
            str = "MicroMsg.VideoMsg.SendVideoTask";
            str2 = ",errorMsg = ";
            f17 = obj;
        }
        vf0.f fVar = (vf0.f) f17;
        if (fVar.f436159d != 0) {
            com.tencent.mars.xlog.Log.e(str, "compressVideo error ,errorcode = " + fVar.f436159d + str2 + fVar.f436160e);
            java.lang.Integer d18 = this.f472479f.d(false);
            if (d18 != null) {
                this.f472483m.f436197a = d18.intValue();
                return f0Var;
            }
            vf0.j1 j1Var2 = this.f472483m;
            j1Var2.f436197a = -540005;
            j1Var2.f436199c = fVar.f436159d;
            java.lang.String str7 = fVar.f436160e;
            if (str7 == null) {
                str7 = "";
            }
            j1Var2.getClass();
            j1Var2.f436200d = str7;
            return f0Var;
        }
        java.lang.String str8 = str;
        if (!com.tencent.mm.vfs.w6.j(str3) || com.tencent.mm.vfs.w6.k(str3) == 0) {
            this.f472483m.f436197a = -540003;
            return f0Var;
        }
        zf0.v0 v0Var2 = this.f472479f;
        v0Var2.f472565n = 40.0f;
        v0Var2.L(40.0f, qi3.g0.f363708g);
        if (this.f472479f.f472563i.f436188o.f436140a) {
            com.tencent.mars.xlog.Log.i(str8, "deleteImportPath" + this.f472482i);
            com.tencent.mm.vfs.w6.h(this.f472482i);
            t21.v2 v2Var = this.f472481h;
            v2Var.f415024v = str3;
            v2Var.U = 1048576;
        }
        vf0.m3.n(this.f472481h, str3);
        return f0Var;
    }
}
