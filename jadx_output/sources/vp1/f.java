package vp1;

/* loaded from: classes15.dex */
public final class f implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public static final vp1.f f438886d = new vp1.f();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        switch (it.what) {
            case 10000:
                try {
                    java.lang.Object obj = it.obj;
                    nm5.c cVar = obj instanceof nm5.c ? (nm5.c) obj : null;
                    if (cVar != null) {
                        vp1.i iVar = vp1.i.f438889a;
                        r45.f83 f83Var = (r45.f83) cVar.a(0);
                        java.lang.Object a17 = cVar.a(1);
                        kotlin.jvm.internal.o.f(a17, "$2(...)");
                        android.content.Intent intent = (android.content.Intent) a17;
                        java.lang.Object a18 = cVar.a(2);
                        kotlin.jvm.internal.o.f(a18, "$3(...)");
                        long longValue = ((java.lang.Number) a18).longValue();
                        r45.f83 V = iVar.V(f83Var != null ? f83Var.f374089h : 0);
                        android.content.ComponentName component = intent.getComponent();
                        vp1.i.f438896h.f448382d = component != null ? component.getClassName() : null;
                        java.util.Iterator it6 = vp1.i.f438897i.iterator();
                        while (it6.hasNext()) {
                            ((up1.a) it6.next()).j(V, intent, longValue);
                        }
                        break;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_START_ACTIVITY err! " + e17.getMessage());
                    break;
                }
                break;
            case 10001:
                try {
                    java.lang.Object obj2 = it.obj;
                    nm5.b bVar = obj2 instanceof nm5.b ? (nm5.b) obj2 : null;
                    if (bVar != null) {
                        vp1.i iVar2 = vp1.i.f438889a;
                        java.lang.Object a19 = bVar.a(0);
                        kotlin.jvm.internal.o.f(a19, "$1(...)");
                        vp1.i.H(iVar2, (r45.f83) a19, (android.content.Intent) bVar.a(1));
                        break;
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_CREATE err! " + e18.getMessage());
                    break;
                }
                break;
            case 10002:
                try {
                    java.lang.Object obj3 = it.obj;
                    nm5.b bVar2 = obj3 instanceof nm5.b ? (nm5.b) obj3 : null;
                    if (bVar2 != null) {
                        vp1.i iVar3 = vp1.i.f438889a;
                        java.lang.Object a27 = bVar2.a(0);
                        kotlin.jvm.internal.o.f(a27, "$1(...)");
                        r45.f83 f83Var2 = (r45.f83) a27;
                        java.lang.Object a28 = bVar2.a(1);
                        kotlin.jvm.internal.o.f(a28, "$2(...)");
                        android.content.Intent intent2 = (android.content.Intent) a28;
                        iVar3.Y("on_new_intent", f83Var2);
                        r45.f83 V2 = iVar3.V(f83Var2.f374089h);
                        if (V2 != null) {
                            java.util.Iterator it7 = vp1.i.f438897i.iterator();
                            while (it7.hasNext()) {
                                ((up1.a) it7.next()).q(V2, intent2, f83Var2.f374092n);
                            }
                            break;
                        }
                    }
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_NEW_INTENT err! " + e19.getMessage());
                    break;
                }
                break;
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                try {
                    java.lang.Object obj4 = it.obj;
                    nm5.b bVar3 = obj4 instanceof nm5.b ? (nm5.b) obj4 : null;
                    if (bVar3 != null) {
                        vp1.i iVar4 = vp1.i.f438889a;
                        java.lang.Object a29 = bVar3.a(0);
                        kotlin.jvm.internal.o.f(a29, "$1(...)");
                        vp1.i.L(iVar4, (r45.f83) a29, (android.content.Intent) bVar3.a(1));
                        break;
                    }
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_START err! " + e27.getMessage());
                    break;
                }
                break;
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID /* 10004 */:
                try {
                    java.lang.Object obj5 = it.obj;
                    nm5.b bVar4 = obj5 instanceof nm5.b ? (nm5.b) obj5 : null;
                    if (bVar4 != null) {
                        vp1.i iVar5 = vp1.i.f438889a;
                        java.lang.Object a37 = bVar4.a(0);
                        kotlin.jvm.internal.o.f(a37, "$1(...)");
                        vp1.i.K(iVar5, (r45.f83) a37, (android.content.Intent) bVar4.a(1));
                        break;
                    }
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_RESUME err! " + e28.getMessage());
                    break;
                }
                break;
            case 10005:
                try {
                    java.lang.Object obj6 = it.obj;
                    nm5.b bVar5 = obj6 instanceof nm5.b ? (nm5.b) obj6 : null;
                    if (bVar5 != null) {
                        vp1.i iVar6 = vp1.i.f438889a;
                        java.lang.Object a38 = bVar5.a(0);
                        kotlin.jvm.internal.o.f(a38, "$1(...)");
                        vp1.i.J(iVar6, (r45.f83) a38, (android.content.Intent) bVar5.a(1));
                        break;
                    }
                } catch (java.lang.Exception e29) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_PAUSE err! " + e29.getMessage());
                    break;
                }
                break;
            case 10006:
                try {
                    java.lang.Object obj7 = it.obj;
                    nm5.b bVar6 = obj7 instanceof nm5.b ? (nm5.b) obj7 : null;
                    if (bVar6 != null) {
                        vp1.i iVar7 = vp1.i.f438889a;
                        java.lang.Object a39 = bVar6.a(0);
                        kotlin.jvm.internal.o.f(a39, "$1(...)");
                        vp1.i.M(iVar7, (r45.f83) a39, (android.content.Intent) bVar6.a(1));
                        break;
                    }
                } catch (java.lang.Exception e37) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_STOP err! " + e37.getMessage());
                    break;
                }
                break;
            case 10007:
                try {
                    java.lang.Object obj8 = it.obj;
                    nm5.b bVar7 = obj8 instanceof nm5.b ? (nm5.b) obj8 : null;
                    if (bVar7 != null) {
                        vp1.i iVar8 = vp1.i.f438889a;
                        java.lang.Object a47 = bVar7.a(0);
                        kotlin.jvm.internal.o.f(a47, "$1(...)");
                        iVar8.Y("on_finish", (r45.f83) a47);
                        break;
                    }
                } catch (java.lang.Exception e38) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_FINISH err! " + e38.getMessage());
                    break;
                }
                break;
            case 10008:
                try {
                    java.lang.Object obj9 = it.obj;
                    nm5.b bVar8 = obj9 instanceof nm5.b ? (nm5.b) obj9 : null;
                    if (bVar8 != null) {
                        vp1.i iVar9 = vp1.i.f438889a;
                        java.lang.Object a48 = bVar8.a(0);
                        kotlin.jvm.internal.o.f(a48, "$1(...)");
                        iVar9.Y("on_save_state", (r45.f83) a48);
                        break;
                    }
                } catch (java.lang.Exception e39) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_SAVE_STATE err! " + e39.getMessage());
                    break;
                }
                break;
            case 10009:
                try {
                    java.lang.Object obj10 = it.obj;
                    nm5.b bVar9 = obj10 instanceof nm5.b ? (nm5.b) obj10 : null;
                    if (bVar9 != null) {
                        vp1.i iVar10 = vp1.i.f438889a;
                        java.lang.Object a49 = bVar9.a(0);
                        kotlin.jvm.internal.o.f(a49, "$1(...)");
                        vp1.i.I(iVar10, (r45.f83) a49, (android.content.Intent) bVar9.a(1));
                        break;
                    }
                } catch (java.lang.Exception e47) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_DESTROY err! " + e47.getMessage());
                    break;
                }
                break;
            case 10010:
                try {
                    java.lang.Object obj11 = it.obj;
                    nm5.c cVar2 = obj11 instanceof nm5.c ? (nm5.c) obj11 : null;
                    if (cVar2 != null) {
                        vp1.i iVar11 = vp1.i.f438889a;
                        java.lang.Object a57 = cVar2.a(0);
                        kotlin.jvm.internal.o.f(a57, "$1(...)");
                        java.lang.Object a58 = cVar2.a(1);
                        kotlin.jvm.internal.o.f(a58, "$2(...)");
                        ((java.lang.Boolean) a58).booleanValue();
                        iVar11.Y("on_move_to_back", (r45.f83) a57);
                        break;
                    }
                } catch (java.lang.Exception e48) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_ACTIVITY_MOVE_TO_TASK_BACK err! " + e48.getMessage());
                    break;
                }
                break;
            case 10011:
                try {
                    java.lang.Object obj12 = it.obj;
                    nm5.b bVar10 = obj12 instanceof nm5.b ? (nm5.b) obj12 : null;
                    if (bVar10 != null) {
                        vp1.i iVar12 = vp1.i.f438889a;
                        java.lang.Object a59 = bVar10.a(0);
                        kotlin.jvm.internal.o.f(a59, "$1(...)");
                        vp1.i.P(iVar12, (r45.g83) a59, (android.content.Intent) bVar10.a(1));
                        break;
                    }
                } catch (java.lang.Exception e49) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_FRAGMENT_RESUME err! " + e49.getMessage());
                    break;
                }
                break;
            case 10012:
                try {
                    java.lang.Object obj13 = it.obj;
                    nm5.b bVar11 = obj13 instanceof nm5.b ? (nm5.b) obj13 : null;
                    if (bVar11 != null) {
                        vp1.i iVar13 = vp1.i.f438889a;
                        java.lang.Object a67 = bVar11.a(0);
                        kotlin.jvm.internal.o.f(a67, "$1(...)");
                        r45.g83 g83Var = (r45.g83) a67;
                        android.content.Intent intent3 = (android.content.Intent) bVar11.a(1);
                        r45.g83 g83Var2 = (r45.g83) ((java.util.LinkedHashMap) vp1.i.f438895g).get(java.lang.Integer.valueOf(g83Var.f374982g));
                        if (g83Var2 != null) {
                            r45.f83 V3 = iVar13.V(g83Var.f374988p);
                            if (V3 == null) {
                                V3 = vp1.i.f438896h.a("on_resume");
                            }
                            if (V3 != null) {
                                g83Var2.f374986n = g83Var.f374986n;
                                iVar13.U(V3, g83Var2, intent3);
                                java.util.LinkedList linkedList = V3.f374094p;
                                if (linkedList != null) {
                                    linkedList.remove(g83Var2);
                                    break;
                                }
                            }
                        }
                    }
                } catch (java.lang.Exception e57) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_FRAGMENT_PAUSE err! " + e57.getMessage());
                    break;
                }
                break;
            case 10013:
                try {
                    java.lang.Object obj14 = it.obj;
                    nm5.b bVar12 = obj14 instanceof nm5.b ? (nm5.b) obj14 : null;
                    if (bVar12 != null) {
                        vp1.i iVar14 = vp1.i.f438889a;
                        java.lang.Object a68 = bVar12.a(0);
                        kotlin.jvm.internal.o.f(a68, "$1(...)");
                        vp1.i.O(iVar14, (r45.g83) a68, (android.content.Intent) bVar12.a(1));
                        break;
                    }
                } catch (java.lang.Exception e58) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_FRAGMENT_DESTROY err! " + e58.getMessage());
                    break;
                }
                break;
            case 10014:
                try {
                    java.lang.Object obj15 = it.obj;
                    nm5.d dVar = obj15 instanceof nm5.d ? (nm5.d) obj15 : null;
                    if (dVar != null) {
                        vp1.i iVar15 = vp1.i.f438889a;
                        java.lang.Object a69 = dVar.a(0);
                        kotlin.jvm.internal.o.f(a69, "$1(...)");
                        java.lang.Object a76 = dVar.a(1);
                        kotlin.jvm.internal.o.f(a76, "$2(...)");
                        ((java.lang.Number) a76).intValue();
                        java.lang.Object a77 = dVar.a(2);
                        kotlin.jvm.internal.o.f(a77, "$3(...)");
                        ((java.lang.Number) a77).longValue();
                        java.lang.Object a78 = dVar.a(3);
                        kotlin.jvm.internal.o.f(a78, "$4(...)");
                        int intValue = ((java.lang.Number) a78).intValue();
                        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "onHellEvent " + ((java.lang.String) a69) + ", " + intValue);
                        if (intValue == 7) {
                            iVar15.d0(true);
                            break;
                        }
                    }
                } catch (java.lang.Exception e59) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_HELL_APP_EVENT err! " + e59.getMessage());
                    break;
                }
                break;
            case 10015:
                try {
                    java.lang.Object obj16 = it.obj;
                    nm5.b bVar13 = obj16 instanceof nm5.b ? (nm5.b) obj16 : null;
                    if (bVar13 != null) {
                        vp1.i iVar16 = vp1.i.f438889a;
                        java.lang.Object a79 = bVar13.a(0);
                        kotlin.jvm.internal.o.f(a79, "$1(...)");
                        r45.g83 g83Var3 = (r45.g83) a79;
                        r45.g83 Q = iVar16.Q(g83Var3);
                        if (iVar16.Z("on_create", g83Var3)) {
                            vp1.e[] eVarArr = vp1.e.f438885d;
                            Q.f374990r = 2;
                            break;
                        }
                    }
                } catch (java.lang.Exception e66) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_ON_FRAGMENT_RESUME err! " + e66.getMessage());
                    break;
                }
                break;
            case 10016:
                try {
                    java.lang.Object obj17 = it.obj;
                    nm5.b bVar14 = obj17 instanceof nm5.b ? (nm5.b) obj17 : null;
                    if (bVar14 != null) {
                        vp1.i iVar17 = vp1.i.f438889a;
                        java.lang.Object a86 = bVar14.a(0);
                        kotlin.jvm.internal.o.f(a86, "$1(...)");
                        vp1.i.N(iVar17, (r45.f83) a86, (android.content.Intent) bVar14.a(1));
                        break;
                    }
                } catch (java.lang.Exception e67) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "MSG_CHECK_APP_OUT err! " + e67.getMessage());
                    break;
                }
                break;
        }
        return true;
    }
}
