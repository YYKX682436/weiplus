package nk3;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final nk3.f f338041a = new nk3.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f338042b = new java.util.HashMap();

    public final long a(int i17) {
        if (!((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).Di()) {
            if (i17 == 1) {
                return 2L;
            }
            if (i17 == 2) {
                return 1L;
            }
            if (i17 == 3) {
                return 4L;
            }
            if (i17 == 4) {
                return 3L;
            }
            if (i17 != 5) {
                if (i17 != 8) {
                    if (i17 != 22) {
                        return i17 != 25 ? -1L : 5L;
                    }
                    return 8L;
                }
                return 6L;
            }
            return 0L;
        }
        if (i17 == 1) {
            return 15L;
        }
        if (i17 == 2) {
            return 14L;
        }
        if (i17 == 3) {
            return 11L;
        }
        if (i17 == 4) {
            return 12L;
        }
        if (i17 != 5) {
            if (i17 != 8) {
                switch (i17) {
                    case 22:
                        return 16L;
                    case 23:
                        return 19L;
                    case 24:
                        return 20L;
                    case 25:
                        return 17L;
                    case 26:
                        return 13L;
                    case 27:
                        return 18L;
                    default:
                        return -1L;
                }
            }
            return 6L;
        }
        return 0L;
    }

    public final void b(r45.hr4 hr4Var) {
        if (hr4Var != null) {
            com.tencent.mm.autogen.mmdata.rpt.MultiTaskEduStruct multiTaskEduStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiTaskEduStruct();
            multiTaskEduStruct.f59364d = hr4Var.getLong(1);
            multiTaskEduStruct.f59365e = hr4Var.getLong(2);
            multiTaskEduStruct.f59366f = hr4Var.getLong(3);
            multiTaskEduStruct.f59367g = hr4Var.getLong(4);
            multiTaskEduStruct.k();
        }
    }

    public final void c(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, long j17, long j18, java.lang.String str, r45.kr4 kr4Var) {
        r45.ir4 ir4Var;
        if (multiTaskInfo != null) {
            com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemActionStruct multiTaskItemActionStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemActionStruct();
            int i17 = 1;
            multiTaskItemActionStruct.f59370f = multiTaskItemActionStruct.b("ItemId", multiTaskInfo.field_id, true);
            multiTaskItemActionStruct.f59369e = f338041a.a(multiTaskInfo.field_type);
            multiTaskItemActionStruct.f59368d = multiTaskItemActionStruct.b("ContextId", kr4Var != null ? kr4Var.getString(0) : null, true);
            multiTaskItemActionStruct.f59371g = j17;
            multiTaskItemActionStruct.f59372h = c01.id.c();
            multiTaskItemActionStruct.f59373i = j18;
            multiTaskItemActionStruct.f59374j = multiTaskItemActionStruct.b("ItemSubId", str, true);
            java.lang.String field_id = multiTaskInfo.field_id;
            kotlin.jvm.internal.o.f(field_id, "field_id");
            java.util.HashMap hashMap = f338042b;
            java.lang.Long valueOf = !hashMap.containsKey(field_id) ? java.lang.Long.valueOf(c01.id.c()) : (java.lang.Long) hashMap.get(field_id);
            multiTaskItemActionStruct.f59375k = valueOf != null ? valueOf.longValue() : c01.id.c();
            multiTaskItemActionStruct.f59376l = multiTaskInfo.field_createTime;
            if (kr4Var != null && (ir4Var = (r45.ir4) kr4Var.getCustom(7)) != null && ((int) ir4Var.getLong(0)) != 1 && ((int) ir4Var.getLong(0)) == 7) {
                i17 = 2;
            }
            multiTaskItemActionStruct.f59377m = i17;
            multiTaskItemActionStruct.k();
        }
    }

    public final void d(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, long j17, long j18, java.lang.String str, java.lang.String str2) {
        if (multiTaskInfo != null) {
            com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemAddStruct multiTaskItemAddStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemAddStruct();
            multiTaskItemAddStruct.f59378d = multiTaskItemAddStruct.b("ItemId", multiTaskInfo.field_id, true);
            multiTaskItemAddStruct.f59379e = f338041a.a(multiTaskInfo.field_type);
            multiTaskItemAddStruct.f59380f = j17;
            multiTaskItemAddStruct.f59381g = j18;
            multiTaskItemAddStruct.f59382h = multiTaskItemAddStruct.b("ContextId", str, true);
            multiTaskItemAddStruct.f59383i = multiTaskItemAddStruct.b("ItemSubId", str2, true);
            multiTaskItemAddStruct.k();
        }
    }

    public final void e(r45.kr4 kr4Var) {
        r45.ir4 ir4Var;
        if (kr4Var == null || (ir4Var = (r45.ir4) kr4Var.getCustom(7)) == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiTaskPageActionStruct multiTaskPageActionStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiTaskPageActionStruct();
        multiTaskPageActionStruct.f59390e = multiTaskPageActionStruct.b("ContextId", kr4Var.getString(0), true);
        multiTaskPageActionStruct.f59389d = ir4Var.getLong(0);
        multiTaskPageActionStruct.f59391f = ir4Var.getLong(1);
        multiTaskPageActionStruct.f59392g = ir4Var.getLong(2);
        multiTaskPageActionStruct.f59393h = ir4Var.getLong(3);
        multiTaskPageActionStruct.f59394i = ir4Var.getLong(4);
        multiTaskPageActionStruct.f59395j = ir4Var.getLong(5);
        multiTaskPageActionStruct.f59396k = ir4Var.getLong(6);
        multiTaskPageActionStruct.k();
    }

    public final void f(r45.kr4 kr4Var) {
        r45.gr4 gr4Var;
        if (kr4Var == null || (gr4Var = (r45.gr4) kr4Var.getCustom(5)) == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemPageBrowseStruct multiTaskItemPageBrowseStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiTaskItemPageBrowseStruct();
        multiTaskItemPageBrowseStruct.f59385e = multiTaskItemPageBrowseStruct.b("ItemId", kr4Var.getString(2), true);
        multiTaskItemPageBrowseStruct.f59386f = f338041a.a(kr4Var.getInteger(3));
        multiTaskItemPageBrowseStruct.f59384d = multiTaskItemPageBrowseStruct.b("ContextId", kr4Var.getString(0), true);
        multiTaskItemPageBrowseStruct.f59387g = multiTaskItemPageBrowseStruct.b("ItemSubId", kr4Var.getString(4), true);
        multiTaskItemPageBrowseStruct.f59388h = gr4Var.getLong(1);
        multiTaskItemPageBrowseStruct.k();
    }

    public final void g(int i17, r45.jr4 jr4Var) {
        if (jr4Var != null) {
            nk3.f fVar = f338041a;
            if (i17 == 1) {
                fVar.h(10, jr4Var.getLong(0), jr4Var.getBoolean(1));
                return;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    fVar.h(20, jr4Var.getLong(0), jr4Var.getBoolean(1));
                    return;
                }
                if (i17 == 4) {
                    fVar.h(15, jr4Var.getLong(0), jr4Var.getBoolean(1));
                    return;
                }
                if (i17 == 5) {
                    fVar.h(0, jr4Var.getLong(0), jr4Var.getBoolean(1));
                    return;
                }
                if (i17 == 8) {
                    fVar.h(30, jr4Var.getLong(0), jr4Var.getBoolean(1));
                    return;
                } else if (i17 == 22 || i17 == 25) {
                    fVar.h(25, jr4Var.getLong(0), jr4Var.getBoolean(1));
                    return;
                } else if (i17 != 26) {
                    return;
                }
            }
            fVar.h(5, jr4Var.getLong(0), jr4Var.getBoolean(1));
        }
    }

    public final void h(int i17, long j17, boolean z17) {
        if (j17 <= 0 || j17 > 30000) {
            return;
        }
        if (i17 == -1 || i17 == 0 || i17 == 5 || i17 == 10 || i17 == 15 || i17 == 20 || i17 == 25 || i17 == 30) {
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(1627);
            iDKey.SetKey(i17 + 1);
            iDKey.SetValue(j17);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(1627);
            iDKey2.SetKey(i17 + 2);
            iDKey2.SetValue(1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            if (!z17) {
                com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
                iDKey3.SetID(1627);
                iDKey3.SetKey(i17 + 3);
                iDKey3.SetValue(1L);
                arrayList.add(iDKey3);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
        }
    }
}
