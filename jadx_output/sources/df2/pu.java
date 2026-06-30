package df2;

/* loaded from: classes3.dex */
public final class pu extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.qu f231111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(df2.qu quVar, java.lang.Class cls) {
        super(cls);
        this.f231111b = quVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.h84 h84Var;
        java.util.LinkedList list;
        r45.g84 g84Var;
        r45.h84 h84Var2;
        java.util.LinkedList list2;
        r45.g84 g84Var2;
        r45.h84 h84Var3;
        java.util.LinkedList list3;
        r45.g84 g84Var3;
        java.util.LinkedList list4;
        r45.g84 g84Var4;
        r45.ad2 result = (r45.ad2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.util.LinkedList<r45.t72> list5 = result.getList(0);
        if (list5 != null) {
            df2.qu quVar = this.f231111b;
            for (r45.t72 t72Var : list5) {
                com.tencent.mars.xlog.Log.i("FinderLiveSyncResourcePackageController", "#startPolling package_type=" + t72Var.getInteger(0));
                switch (t72Var.getInteger(0)) {
                    case 1:
                        java.util.LinkedList list6 = t72Var.getList(1);
                        if (list6 != null && (h84Var = (r45.h84) kz5.n0.Z(list6)) != null && (list = h84Var.getList(4)) != null && (g84Var = (r45.g84) kz5.n0.Z(list)) != null) {
                            ko0.l lVar = ko0.l.f309870a;
                            java.lang.String string = g84Var.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            java.lang.String string2 = g84Var.getString(2);
                            lVar.e(string, string2 != null ? string2 : "");
                            com.tencent.mm.plugin.finder.live.util.y.d(quVar, null, null, new df2.nu(null), 3, null);
                            break;
                        }
                        break;
                    case 2:
                        java.util.LinkedList list7 = t72Var.getList(1);
                        if (list7 != null && (h84Var2 = (r45.h84) kz5.n0.Z(list7)) != null && (list2 = h84Var2.getList(4)) != null && (g84Var2 = (r45.g84) kz5.n0.Z(list2)) != null) {
                            ko0.l0 l0Var = ko0.l0.f309878a;
                            java.lang.String string3 = g84Var2.getString(1);
                            if (string3 == null) {
                                string3 = "";
                            }
                            java.lang.String string4 = g84Var2.getString(2);
                            l0Var.d(string3, string4 != null ? string4 : "");
                            break;
                        }
                        break;
                    case 3:
                        java.util.LinkedList list8 = t72Var.getList(1);
                        if (list8 != null && (h84Var3 = (r45.h84) kz5.n0.Z(list8)) != null && (list3 = h84Var3.getList(4)) != null && (g84Var3 = (r45.g84) kz5.n0.Z(list3)) != null) {
                            ko0.c0 c0Var = ko0.c0.f309825a;
                            java.lang.String string5 = g84Var3.getString(1);
                            if (string5 == null) {
                                string5 = "";
                            }
                            java.lang.String string6 = g84Var3.getString(2);
                            c0Var.i(string5, string6 != null ? string6 : "");
                            break;
                        }
                        break;
                    case 4:
                        com.tencent.mars.xlog.Log.i("FinderLiveSyncResourcePackageController", "#startPolling MMFinderLiveResourcePackageType_StreamDecor done");
                        uh2.c.f427953a.a(t72Var.getList(1));
                        break;
                    case 5:
                        com.tencent.mars.xlog.Log.i("FinderLiveSyncResourcePackageController", "#startPolling MMFinderLiveResourcePackageType_VisionEffects done");
                        vh2.c.f437041a.a(t72Var.getList(1));
                        break;
                    case 6:
                        com.tencent.mars.xlog.Log.i("FinderLiveSyncResourcePackageController", "#startPolling MMFinderLiveResourcePackageType_GiftResource done");
                        java.util.LinkedList list9 = t72Var.getList(1);
                        kotlin.jvm.internal.o.f(list9, "getResource_list(...)");
                        r45.h84 h84Var4 = (r45.h84) kz5.n0.Z(list9);
                        if (h84Var4 != null && (list4 = h84Var4.getList(4)) != null && (g84Var4 = (r45.g84) kz5.n0.Z(list4)) != null) {
                            java.lang.String string7 = g84Var4.getString(1);
                            if (string7 == null) {
                                string7 = "";
                            }
                            java.lang.String string8 = g84Var4.getString(2);
                            com.tencent.mm.plugin.finder.live.util.y.d(quVar, null, null, new df2.ou(quVar, string7, string8 != null ? string8 : "", null), 3, null);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
