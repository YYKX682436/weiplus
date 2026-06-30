package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f174366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.ComponentActivity f174367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f174368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174369g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(androidx.activity.ComponentActivity componentActivity, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f174367e = componentActivity;
        this.f174368f = recordConfigProvider;
        this.f174369g = textStatusEditActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.textstatus.ui.v8(this.f174367e, this.f174368f, this.f174369g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.textstatus.ui.v8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f174366d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
            this.f174366d = 1;
            obj = ((pc0.e2) c1Var).wi(this.f174367e, this.f174368f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        if (m1Var.f361411b == -1 && m1Var.f361412c == 0) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174369g;
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo = m1Var.f361415f;
            if (recordMediaReportInfo != null) {
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
                if (h2Var != null) {
                    java.lang.Object b17 = recordMediaReportInfo.b("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", new java.lang.Long(0L));
                    kotlin.jvm.internal.o.f(b17, "getReportValue(...)");
                    h2Var.f355090o = ((java.lang.Number) b17).longValue();
                    h2Var.f355095r = ((java.lang.Number) recordMediaReportInfo.b("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(0))).intValue() + 1;
                }
            }
            qc0.l1 a17 = m1Var.a();
            com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
            textStatusEditActivity.getClass();
            if (a17 != null) {
                boolean b18 = a17.b();
                java.lang.String str = a17.f361397c;
                java.lang.String str2 = a17.f361396b;
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "[handleCaptureResult]isVideo:%s,thumbPath:%s,filePath:%s", java.lang.Boolean.valueOf(a17.b()), b18 ? str : str2, str2);
                textStatusEditActivity.V6();
                com.tencent.mm.plugin.textstatus.ui.g8 d76 = textStatusEditActivity.d7();
                androidx.appcompat.app.AppCompatActivity context2 = textStatusEditActivity.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                d76.b();
                wi4.e.b(d76.f173899a);
                d76.f173904f = false;
                if (a17.b()) {
                    d76.f173902d = 2;
                    d76.f173900b = str2;
                    d76.f173901c = str;
                    d76.f173905g = a17.f361398d;
                } else {
                    d76.f173902d = 1;
                    d76.f173900b = str2;
                    d76.f173903e = true;
                }
                long k17 = com.tencent.mm.vfs.w6.k(d76.f173900b);
                d76.f173908j = k17;
                d76.f173906h = k17;
                d76.f173907i = kk.k.e(d76.f173900b);
                d76.a(context2);
                textStatusEditActivity.t7(str2, a17.b() ? 2 : 1);
                textStatusEditActivity.Q7();
                textStatusEditActivity.V7();
                textStatusEditActivity.R7();
                ((yj4.d) pf5.z.f353948a.a(textStatusEditActivity).a(yj4.d.class)).f462695h = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
