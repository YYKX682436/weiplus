package dk2;

/* loaded from: classes3.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ce2.i f234111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(ce2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f234111d = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.t7(this.f234111d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.t7 t7Var = (dk2.t7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.oa0 F0;
        r45.oa0 oa0Var;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.u7 u7Var = dk2.u7.f234181a;
        if (dk2.ef.f233404s) {
            ce2.i iVar = this.f234111d;
            r45.na0 D0 = iVar.D0();
            if (D0 != null) {
                u7Var.c("fetchCustomGiftResource", iVar, D0);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "fetchCustomGiftResource resourceList size:" + D0.getList(2).size() + ",lazyLoadCustomGiftPagResource:" + dk2.ef.f233405t);
                java.util.LinkedList list = D0.getList(2);
                kotlin.jvm.internal.o.f(list, "getResource_list(...)");
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.oa0 oa0Var2 = (r45.oa0) it.next();
                    if (dk2.ef.f233405t) {
                        oa0Var = oa0Var2;
                        i17 = 0;
                        str = "field_rewardProductId";
                        str2 = "field_name";
                    } else {
                        r45.gs5 gs5Var = (r45.gs5) oa0Var2.getCustom(3);
                        java.lang.String string = gs5Var != null ? gs5Var.getString(0) : null;
                        java.lang.String field_rewardProductId = iVar.field_rewardProductId;
                        kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
                        java.lang.String field_name = iVar.field_name;
                        kotlin.jvm.internal.o.f(field_name, "field_name");
                        oa0Var = oa0Var2;
                        i17 = 0;
                        str = "field_rewardProductId";
                        u7Var.d(string, field_rewardProductId, field_name, false, false);
                        r45.gs5 gs5Var2 = (r45.gs5) oa0Var.getCustom(4);
                        java.lang.String string2 = gs5Var2 != null ? gs5Var2.getString(0) : null;
                        java.lang.String str3 = iVar.field_rewardProductId;
                        kotlin.jvm.internal.o.f(str3, str);
                        java.lang.String field_name2 = iVar.field_name;
                        kotlin.jvm.internal.o.f(field_name2, "field_name");
                        str2 = "field_name";
                        u7Var.d(string2, str3, field_name2, false, true);
                    }
                    r45.gs5 gs5Var3 = (r45.gs5) oa0Var.getCustom(2);
                    java.lang.String string3 = gs5Var3 != null ? gs5Var3.getString(i17) : null;
                    java.lang.String str4 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(str4, str);
                    java.lang.String str5 = iVar.field_name;
                    kotlin.jvm.internal.o.f(str5, str2);
                    u7Var.d(string3, str4, str5, true, false);
                    r45.gs5 gs5Var4 = (r45.gs5) oa0Var.getCustom(5);
                    java.lang.String string4 = gs5Var4 != null ? gs5Var4.getString(i17) : null;
                    java.lang.String str6 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(str6, str);
                    java.lang.String str7 = iVar.field_name;
                    kotlin.jvm.internal.o.f(str7, str2);
                    u7Var.d(string4, str6, str7, true, false);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchCustomGiftResource ");
                    sb6.append(iVar.field_name);
                    sb6.append(" animation is null:");
                    r45.gs5 gs5Var5 = (r45.gs5) oa0Var.getCustom(3);
                    java.lang.String string5 = gs5Var5 != null ? gs5Var5.getString(i17) : null;
                    boolean z17 = 1;
                    z17 = 1;
                    sb6.append((string5 == null || string5.length() == 0) ? 1 : i17);
                    sb6.append(",landscape_animation is null:");
                    r45.gs5 gs5Var6 = (r45.gs5) oa0Var.getCustom(4);
                    java.lang.String string6 = gs5Var6 != null ? gs5Var6.getString(i17) : null;
                    if (string6 != null && string6.length() != 0) {
                        z17 = i17;
                    }
                    sb6.append(z17);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
                }
                if (dk2.ef.f233405t && (F0 = iVar.F0(iVar.y0())) != null) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "fetchCustomGiftResource default resource:" + pm0.b0.g(F0));
                    r45.gs5 gs5Var7 = (r45.gs5) F0.getCustom(3);
                    java.lang.String string7 = gs5Var7 != null ? gs5Var7.getString(0) : null;
                    java.lang.String field_rewardProductId2 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId2, "field_rewardProductId");
                    java.lang.String field_name3 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name3, "field_name");
                    u7Var.d(string7, field_rewardProductId2, field_name3, false, false);
                    r45.gs5 gs5Var8 = (r45.gs5) F0.getCustom(4);
                    java.lang.String string8 = gs5Var8 != null ? gs5Var8.getString(0) : null;
                    java.lang.String field_rewardProductId3 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId3, "field_rewardProductId");
                    java.lang.String field_name4 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name4, "field_name");
                    u7Var.d(string8, field_rewardProductId3, field_name4, false, true);
                }
                r45.gs5 gs5Var9 = (r45.gs5) D0.getCustom(5);
                java.lang.String string9 = gs5Var9 != null ? gs5Var9.getString(0) : null;
                java.lang.String field_rewardProductId4 = iVar.field_rewardProductId;
                kotlin.jvm.internal.o.f(field_rewardProductId4, "field_rewardProductId");
                java.lang.String field_name5 = iVar.field_name;
                kotlin.jvm.internal.o.f(field_name5, "field_name");
                u7Var.d(string9, field_rewardProductId4, field_name5, false, false);
                r45.gs5 gs5Var10 = (r45.gs5) D0.getCustom(6);
                java.lang.String string10 = gs5Var10 != null ? gs5Var10.getString(0) : null;
                java.lang.String field_rewardProductId5 = iVar.field_rewardProductId;
                kotlin.jvm.internal.o.f(field_rewardProductId5, "field_rewardProductId");
                java.lang.String field_name6 = iVar.field_name;
                kotlin.jvm.internal.o.f(field_name6, "field_name");
                u7Var.d(string10, field_rewardProductId5, field_name6, false, true);
                r45.gs5 gs5Var11 = (r45.gs5) D0.getCustom(4);
                java.lang.String string11 = gs5Var11 != null ? gs5Var11.getString(0) : null;
                java.lang.String field_rewardProductId6 = iVar.field_rewardProductId;
                kotlin.jvm.internal.o.f(field_rewardProductId6, "field_rewardProductId");
                java.lang.String field_name7 = iVar.field_name;
                kotlin.jvm.internal.o.f(field_name7, "field_name");
                u7Var.d(string11, field_rewardProductId6, field_name7, true, false);
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "fetchCustomGiftResource but disable!");
        }
        return jz5.f0.f302826a;
    }
}
