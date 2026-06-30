package g80;

/* loaded from: classes12.dex */
public final class j implements z25.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s70.g f269469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s70.d f269470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j15.d f269471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s70.d f269472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f269473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s70.d f269474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f269475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f269476h;

    public j(s70.g gVar, s70.d dVar, j15.d dVar2, s70.d dVar3, java.util.List list, s70.d dVar4, boolean z17, kotlinx.coroutines.q qVar) {
        this.f269469a = gVar;
        this.f269470b = dVar;
        this.f269471c = dVar2;
        this.f269472d = dVar3;
        this.f269473e = list;
        this.f269474f = dVar4;
        this.f269475g = z17;
        this.f269476h = qVar;
    }

    @Override // z25.e
    public void a(int i17, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parallelUploadImg[");
        s70.g gVar = this.f269469a;
        sb6.append(gVar.f403944a);
        sb6.append("] onUploadFailure errCode:");
        sb6.append(i17);
        sb6.append(" parallelUploadID:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", sb6.toString());
        gVar.f403951h.put("up_parallel_task_ret", java.lang.Integer.valueOf(i17));
        try {
            kotlinx.coroutines.q qVar = this.f269476h;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new s70.h(s70.i.f403966i, this.f269471c, gVar)));
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // z25.e
    public void b(float f17, long j17) {
    }

    @Override // z25.e
    public void c(z25.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        j15.c t17;
        java.lang.String str6;
        int i17;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parallelUploadImg[");
        s70.g gVar = this.f269469a;
        sb6.append(gVar.f403944a);
        sb6.append("] onUploadSuccess fileMd5:");
        sb6.append(jVar != null ? jVar.f469825c : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", sb6.toString());
        s70.d dVar = this.f269470b;
        dVar.f403928e = 0;
        j15.d dVar2 = this.f269471c;
        j15.a o17 = dVar2.o();
        if (jVar == null || (str = jVar.f469825c) == null) {
            str = "";
        }
        o17.f0(str);
        j15.a o18 = dVar2.o();
        if (jVar == null || (str2 = jVar.f469824b) == null) {
            str2 = "";
        }
        o18.T(str2);
        j15.a o19 = dVar2.o();
        if (jVar == null || (str3 = jVar.f469823a) == null) {
            str3 = "";
        }
        o19.W(str3);
        dVar2.o().V(com.tencent.mm.vfs.w6.k(this.f269472d.f403930g));
        j15.a o27 = dVar2.o();
        if (jVar == null || (str4 = jVar.f469824b) == null) {
            str4 = "";
        }
        o27.L(str4);
        int i18 = gVar.f403949f;
        s70.d dVar3 = this.f269474f;
        if (i18 == 1) {
            for (s70.d dVar4 : this.f269473e) {
                if (dVar4.f403925b == s70.c.f403920h) {
                    j15.a o28 = dVar2.o();
                    if (jVar == null || (str7 = jVar.f469823a) == null) {
                        str7 = "";
                    }
                    o28.R(str7);
                    dVar2.o().e0(com.tencent.mm.vfs.w6.k(dVar3.f403930g));
                    j15.a o29 = dVar2.o();
                    if (jVar == null || (str8 = jVar.f469823a) == null) {
                        str8 = "";
                    }
                    o29.N(str8);
                    dVar2.o().a0(com.tencent.mm.vfs.w6.k(dVar4.f403930g));
                    dVar.f403929f = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(dVar4.f403930g);
                    if (xs.l1.a(dVar2)) {
                        j15.c t18 = dVar2.o().t();
                        if (t18 != null) {
                            if (jVar == null || (str10 = jVar.f469823a) == null) {
                                str10 = "";
                            }
                            t18.s(str10);
                        }
                        j15.c t19 = dVar2.o().t();
                        if (t19 != null) {
                            if (jVar == null || (str9 = jVar.f469823a) == null) {
                                str9 = "";
                            }
                            t19.r(str9);
                        }
                    }
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        j15.a o37 = dVar2.o();
        if (jVar == null || (str5 = jVar.f469823a) == null) {
            str5 = "";
        }
        o37.R(str5);
        dVar2.o().e0(com.tencent.mm.vfs.w6.k(dVar3.f403930g));
        dVar2.o().N("");
        dVar2.o().a0(0L);
        dVar.f403929f = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ai(dVar3.f403930g);
        if (xs.l1.a(dVar2) && (t17 = dVar2.o().t()) != null) {
            if (jVar == null || (str6 = jVar.f469823a) == null) {
                str6 = "";
            }
            t17.r(str6);
        }
        if (this.f269475g) {
            dVar2.o().b0(com.tencent.mm.vfs.w6.k(dVar3.f403931h));
        } else {
            dVar2.o().b0(0L);
        }
        dVar2.y(null);
        if (dVar.f403924a) {
            dVar2.o().Y(dVar2.o().I());
            dVar2.o().S(dVar2.o().K());
            dVar2.o().U(dVar2.o().F());
            dVar2.o().Q(dVar2.o().B());
            if (gVar.f403949f == 1) {
                dVar2.o().P(dVar2.o().K());
                dVar2.o().O(dVar2.o().B());
                i17 = 0;
            } else {
                i17 = 0;
                dVar2.o().P(0);
                dVar2.o().O(0);
            }
            dVar2.o().r0(i17);
            dVar2.o().u0(i17);
            dVar2.o().o0(i17);
            dVar2.o().l0(i17);
            dVar2.o().i0("");
            dVar2.o().n0("");
            dVar2.o().q0("");
            dVar2.o().t0("");
            dVar2.o().k0("");
            dVar2.o().p0(0L);
            dVar2.o().m0(0L);
            dVar2.o().j0(0L);
        }
        try {
            kotlinx.coroutines.q qVar = this.f269476h;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new s70.h(s70.i.f403961d, dVar2, gVar)));
        } catch (java.lang.Throwable unused) {
        }
    }
}
