package rk4;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {
    public final /* synthetic */ rk4.l3 L;

    /* renamed from: d, reason: collision with root package name */
    public int f396948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.ting.TingSelectContactsConfig f396950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.pigeon.ting.TingSelectContactsConfig tingSelectContactsConfig, rk4.l3 l3Var, android.content.Context context, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396950f = tingSelectContactsConfig;
        this.L = l3Var;
        this.f396949e = context;
        this.f396951g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.r2(this.f396950f, this.L, this.f396949e, this.f396951g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396948d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f396948d = 1;
                ((com.tencent.mm.plugin.ting.TingFlutterActivity) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.pigeon.ting.TingSelectContactsConfig tingSelectContactsConfig = this.f396950f;
        boolean b17 = kotlin.jvm.internal.o.b(tingSelectContactsConfig.getUseSessionMode(), java.lang.Boolean.TRUE);
        android.content.Context activity = this.f396949e;
        yz5.l lVar = this.f396951g;
        if (b17) {
            rk4.q2 q2Var = new rk4.q2(lVar, tingSelectContactsConfig);
            n13.r rVar = new n13.r();
            rVar.f334118b = this.L.f396828s;
            rVar.f334119c = q2Var;
            rVar.f334126j = true;
            rVar.f334117a = false;
            java.util.List<java.lang.String> presetUsername = tingSelectContactsConfig.getPresetUsername();
            rVar.f334129m = presetUsername != null ? kz5.n0.V(presetUsername) : null;
            rVar.f334130n = tingSelectContactsConfig.getPresetCancelable();
            java.lang.Long maxSelectCount = tingSelectContactsConfig.getMaxSelectCount();
            rVar.f334131o = maxSelectCount != null ? new java.lang.Integer((int) maxSelectCount.longValue()) : null;
            rVar.f334132p = tingSelectContactsConfig.getOverLimitAlert();
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).a(activity, rVar);
        } else {
            l0.m5 m5Var = new l0.m5(lVar);
            rd0.e1 e1Var = (rd0.e1) i95.n0.c(rd0.e1.class);
            java.util.List<java.lang.String> presetUsername2 = tingSelectContactsConfig.getPresetUsername();
            java.lang.Boolean presetCancelable = tingSelectContactsConfig.getPresetCancelable();
            java.lang.Long maxSelectCount2 = tingSelectContactsConfig.getMaxSelectCount();
            java.lang.Integer num = maxSelectCount2 != null ? new java.lang.Integer((int) maxSelectCount2.longValue()) : null;
            java.lang.String overLimitAlert = tingSelectContactsConfig.getOverLimitAlert();
            java.lang.String rightBarButtonTitle = tingSelectContactsConfig.getRightBarButtonTitle();
            ((qd0.q0) e1Var).getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
            intent.putExtra("titile", activity.getString(com.tencent.mm.R.string.mbj));
            intent.putExtra("list_type", 0);
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(64, 131072));
            intent.putExtra("default_multi_search", true);
            intent.putExtra("menu_mode", 1);
            if (rightBarButtonTitle == null) {
                rightBarButtonTitle = activity.getString(com.tencent.mm.R.string.f492366mb4);
                kotlin.jvm.internal.o.f(rightBarButtonTitle, "getString(...)");
            }
            intent.putExtra("key_confirm_menu_name", rightBarButtonTitle);
            intent.putExtra("key_confirm_menu_color", 0);
            intent.putExtra("recommend_chatroom", true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c01.z1.r());
            arrayList.add("weixin");
            arrayList.add("filehelper");
            arrayList.addAll(c01.e2.i());
            arrayList.addAll(c01.e2.h());
            if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
            }
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(presetUsername2, ",");
            if (c17 != null) {
                if (presetCancelable != null && kotlin.jvm.internal.o.b(presetCancelable, java.lang.Boolean.FALSE)) {
                    intent.putExtra("always_select_contact", c17);
                }
                intent.putExtra("already_select_contact", c17);
            }
            if (num != null) {
                intent.putExtra("max_limit_num", num.intValue());
                intent.putExtra("too_many_member_tip_string", overLimitAlert);
            }
            pf5.j0.a(intent, cj5.q4.class);
            pf5.j0.a(intent, aj5.g1.class);
            pf5.j0.a(intent, aj5.i.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            pf5.j0.a(intent, cj5.b3.class);
            pf5.j0.a(intent, cj5.o.class);
            if (activity instanceof android.app.Activity) {
                bh5.c cVar = new bh5.c();
                cVar.f20922a.f20924a = activity;
                cVar.d(intent);
                cVar.c(true);
                cVar.a(com.tencent.mm.ui.mvvm.MvvmContactListUI.class.getName());
                cVar.i(m5Var);
            }
        }
        return f0Var;
    }
}
