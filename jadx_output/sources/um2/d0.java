package um2;

/* loaded from: classes3.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f428756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f428758g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.app.Activity activity, um2.x5 x5Var, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428756e = activity;
        this.f428757f = x5Var;
        this.f428758g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.d0(this.f428756e, this.f428757f, this.f428758g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428755d;
        int i18 = 1;
        um2.x5 x5Var = this.f428757f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                zl2.f fVar = zl2.f.f473753a;
                android.app.Activity activity = this.f428756e;
                java.lang.String string = x5Var.f19605b.getString(com.tencent.mm.R.string.gff);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String a17 = n25.a.a();
                kotlin.jvm.internal.o.f(a17, "getMessageChannelIdUse(...)");
                this.f428755d = 1;
                b17 = fVar.b(activity, 21, string, false, true, a17, 20000L, "finderlivefloatpermission", this);
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                b17 = obj;
            }
            com.tencent.mm.plugin.finder.assist.v0 v0Var = (com.tencent.mm.plugin.finder.assist.v0) b17;
            if (v0Var instanceof com.tencent.mm.plugin.finder.assist.t0) {
                com.tencent.mars.xlog.Log.i(x5Var.f429032f, "ShowWarningAlert positive");
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Mj(true, ml2.z1.f328331e);
                ae2.in inVar = ae2.in.f3688a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3879t0).getValue()).r()).intValue() > 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("PARAM_FINDER_LIVE_FORCE_TASK", true);
                    fm2.c cVar = x5Var.f19606c;
                    if (!(cVar != null && cVar.isSwipeBack())) {
                        i18 = 3;
                    }
                    bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", i18);
                    bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 13);
                    fm2.c cVar2 = x5Var.f19606c;
                    if (cVar2 != null) {
                        cVar2.statusChange(qo0.b.B, bundle);
                    }
                } else {
                    yz5.a aVar2 = this.f428758g;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
                fm2.c cVar3 = x5Var.f19606c;
                if (cVar3 != null) {
                    cVar3.setMiniWinPermission(false);
                }
            } else if (v0Var instanceof com.tencent.mm.plugin.finder.assist.s0) {
                com.tencent.mars.xlog.Log.i(x5Var.f429032f, "ShowWarningAlert negative");
                fm2.c cVar4 = x5Var.f19606c;
                if (cVar4 != null) {
                    cVar4.setMiniWinPermission(false);
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                fm2.c cVar5 = x5Var.f19606c;
                if (cVar5 != null) {
                    cVar5.statusChange(qo0.b.E, bundle2);
                }
                com.tencent.mars.xlog.Log.i("FinderLiveWindowPermissionUtil", "recordRefuseWindowPermission ");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_WINDOW_PERMISSION_TOAST_INT_SYNC, 1);
            } else if (v0Var instanceof com.tencent.mm.plugin.finder.assist.r0) {
                com.tencent.mars.xlog.Log.i(x5Var.f429032f, "ShowWarningAlert cancel");
                fm2.c cVar6 = x5Var.f19606c;
                if (cVar6 != null) {
                    cVar6.setMiniWinPermission(false);
                }
                android.os.Bundle bundle3 = new android.os.Bundle();
                fm2.c cVar7 = x5Var.f19606c;
                if (cVar7 != null) {
                    cVar7.statusChange(qo0.b.G, bundle3);
                }
                com.tencent.mars.xlog.Log.i("FinderLiveWindowPermissionUtil", "recordRefuseWindowPermission ");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_WINDOW_PERMISSION_TOAST_INT_SYNC, 1);
            } else if (v0Var instanceof com.tencent.mm.plugin.finder.assist.u0) {
                com.tencent.mars.xlog.Log.i(x5Var.f429032f, "ShowWarningAlert timeout");
                fm2.c cVar8 = x5Var.f19606c;
                if (cVar8 != null) {
                    cVar8.setMiniWinPermission(false);
                }
                android.os.Bundle bundle4 = new android.os.Bundle();
                fm2.c cVar9 = x5Var.f19606c;
                if (cVar9 != null) {
                    cVar9.statusChange(qo0.b.G, bundle4);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f302826a;
    }
}
