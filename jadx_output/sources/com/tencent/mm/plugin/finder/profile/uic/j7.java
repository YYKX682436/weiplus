package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class j7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.tencent.mm.plugin.finder.profile.uic.ob obVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f123843e = obVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.j7(this.f123843e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.uic.j7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.String str2;
        java.lang.Object b17;
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar2;
        com.tencent.mm.protobuf.f fVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f123842d;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123843e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity context = obVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
            if (p2Var != null) {
                p2Var.f124113p = 2L;
                p2Var.f124110m = c01.id.c();
            }
            obVar.r7(true);
            java.lang.String stringExtra = obVar.getIntent().getStringExtra("KEY_FINDER_PROFILE_UI_REQUEST_LIST_POSITION");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "doHeaderCgi start do cgi");
            android.app.Activity context2 = obVar.getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.p2 p2Var2 = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
            if (p2Var2 != null) {
                p2Var2.O6(9037, 11, 0);
            }
            r45.r13 r13Var = new r45.r13();
            r13Var.f384417d = obVar.getUsername();
            java.lang.String f17 = xy2.c.f(obVar.getContextObj());
            r13Var.f384423m = f17;
            r13Var.f384419f = (r26.i0.q(r13Var.f384417d, f17, false, 2, null) || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.F1().r()).booleanValue()) ? 1 : 0;
            r13Var.f384421h = obVar.getActivity().getIntent().getStringExtra("key_biz_username");
            r13Var.f384427q = !obVar.A7() ? 1 : 0;
            r13Var.f384428r = (java.lang.String) ((jz5.n) obVar.getDataUic().f124106f).getValue();
            java.lang.String str3 = r13Var.f384421h;
            long j17 = 0;
            if ((str3 == null || str3.length() == 0) == false) {
                r13Var.f384420g = obVar.P1 != 0 ? 23 : 24;
            }
            if (r13Var.f384420g == 0) {
                r13Var.f384420g = obVar.getContextObj().getInteger(8);
            }
            r13Var.f384424n = stringExtra;
            if (obVar.getIntent().getIntExtra("finder_from_feed_type", 0) == 1) {
                r13Var.f384425o = obVar.P1;
            }
            db2.t4 t4Var = db2.t4.f228171a;
            r45.kv0 b18 = t4Var.b(9037, obVar.getContextObj());
            r13Var.f384418e = b18;
            r45.qt2 contextObj = obVar.getContextObj();
            b18.set(1, java.lang.Integer.valueOf(contextObj != null ? contextObj.getInteger(7) : 0));
            if (t4Var.q()) {
                j17 = obVar.getIntent().getLongExtra("finder_from_feed_id", 0L);
                str = obVar.getIntent().getStringExtra("finder_from_feed_dup_flag");
            } else {
                str = null;
            }
            r45.kv0 kv0Var = r13Var.f384418e;
            r45.qt2 contextObj2 = obVar.getContextObj();
            obj2 = "Check failed.";
            r45.kv0 kv0Var2 = r13Var.f384418e;
            t4Var.h(kv0Var, contextObj2, kz5.b0.c(new jz5.o(new java.lang.Integer(kv0Var2 != null ? kv0Var2.getInteger(1) : 0), new java.lang.Long(j17), str)));
            str2 = "Finder.FinderProfileHeaderUIC";
            com.tencent.mars.xlog.Log.i(str2, "doHeaderCgi param, username: " + r13Var.f384417d + ", viewer: " + r13Var.f384423m + ", needFans: " + r13Var.f384419f + ", bizName: " + r13Var.f384421h + ", enterType: " + r13Var.f384420g + " noticeId: " + stringExtra + ", refLiveId: " + r13Var.f384425o + ", isExportMode: " + obVar.getDataUic().P6());
            com.tencent.mm.modelbase.i b19 = r13Var.b();
            this.f123842d = 1;
            b17 = rm0.h.b(b19, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
            str2 = "Finder.FinderProfileHeaderUIC";
            obj2 = "Check failed.";
        }
        com.tencent.mm.modelbase.f fVar3 = (com.tencent.mm.modelbase.f) b17;
        com.tencent.mars.xlog.Log.i(str2, "dealHeaderResp, errCode: " + fVar3.f70616b + ", errType: " + fVar3.f70615a + ", errMsg: " + fVar3.f70617c);
        android.app.Activity context3 = obVar.getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException(obj2.toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var3 = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var3 != null) {
            int i18 = fVar3.f70616b;
            com.tencent.mm.modelbase.i iVar = fVar3.f70620f;
            java.lang.Integer num = (iVar == null || (oVar2 = iVar.f70646f) == null || (fVar2 = oVar2.f70710a.f70684a) == null) ? null : new java.lang.Integer(fVar2.computeSize());
            com.tencent.mm.modelbase.i iVar2 = fVar3.f70620f;
            p2Var3.Q6(9037, i18, new az2.g(num, (iVar2 == null || (oVar = iVar2.f70646f) == null || (fVar = oVar.f70711b.f70700a) == null) ? null : new java.lang.Integer(fVar.computeSize()), az2.j.f16133r.a(fVar3)));
        }
        int i19 = fVar3.f70616b;
        int i27 = fVar3.f70615a;
        com.tencent.mm.protobuf.f resp = fVar3.f70618d;
        kotlin.jvm.internal.o.f(resp, "resp");
        r45.s13 s13Var = (r45.s13) resp;
        if (i27 == 0 && i19 == 0) {
            obVar.H7(s13Var, false);
            obVar.Q6(s13Var);
        } else if (i19 == -5900) {
            obVar.H7(s13Var, false);
            obVar.Q6(s13Var);
        } else {
            obVar.Q6(null);
        }
        return jz5.f0.f302826a;
    }
}
