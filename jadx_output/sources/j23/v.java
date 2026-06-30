package j23;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j23.y f297283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f297284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t13.j f297285f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j23.y yVar, android.content.Context context, t13.j jVar) {
        super(1);
        this.f297283d = yVar;
        this.f297284e = context;
        this.f297285f = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        b23.a it = (b23.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        j75.d dVar = it.f298066d;
        if (dVar != null && (dVar instanceof fi0.c)) {
            fi0.c cVar = (fi0.c) dVar;
            j23.y yVar = this.f297283d;
            boolean b17 = kotlin.jvm.internal.o.b(cVar.f262737b, yVar.f297294m);
            boolean z18 = cVar.f262741f;
            if (b17) {
                long j17 = yVar.f297295n;
                long j18 = cVar.f262738c;
                if (j18 == j17) {
                    yVar.f297297p = c01.id.c();
                    java.util.LinkedList linkedList = cVar.f262740e;
                    yVar.f414561g = !linkedList.isEmpty() ? 1 : 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSRelevantSearchUIUnit", "[fts][sug] uiunit pardus end hasUpdated:" + yVar.f297299r + ", hitLocal:" + z18 + ", searchId=" + j18);
                    synchronized (yVar.f297299r) {
                        if (yVar.f297299r.get()) {
                            z17 = true;
                        } else {
                            yVar.f297299r.set(true);
                            z17 = false;
                        }
                    }
                    if (!z17) {
                        yVar.f297296o = z18;
                        if (!z18) {
                            yVar.f297298q = linkedList;
                            java.lang.String str = cVar.f262742g;
                            kotlin.jvm.internal.o.g(str, "<set-?>");
                            yVar.f297300s = str;
                            java.lang.String str2 = yVar.f297294m;
                            java.util.LinkedList linkedList2 = yVar.f297298q;
                            android.content.Context context = this.f297284e;
                            kotlin.jvm.internal.o.g(context, "context");
                            pf5.z zVar = pf5.z.f353948a;
                            boolean z19 = context instanceof androidx.appcompat.app.AppCompatActivity;
                            if (!z19) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                            androidx.lifecycle.c1 a17 = zVar.a(appCompatActivity).a(z13.f.class);
                            kotlin.jvm.internal.o.f(a17, "get(...)");
                            if (((z13.f) a17).f7()) {
                                if (!(linkedList2 == null || linkedList2.isEmpty()) && kotlin.jvm.internal.o.b(((r45.di6) kz5.n0.X(linkedList2)).f372512d, str2)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSRelevantSearchUIUnit", "[fts] removeSugItemEqualToQueryAtFirstIfNeeded: " + str2);
                                    linkedList2.removeFirst();
                                }
                            }
                            if (!z19) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                            androidx.lifecycle.c1 a18 = zVar.a(appCompatActivity).a(z13.f.class);
                            kotlin.jvm.internal.o.f(a18, "get(...)");
                            boolean f76 = ((z13.f) a18).f7();
                            int i17 = cVar.f262743h;
                            if (f76) {
                                if (i17 <= 0) {
                                    i17 = 0;
                                }
                                java.util.LinkedList linkedList3 = yVar.f297298q;
                                int size = linkedList3 != null ? linkedList3.size() : 0;
                                if (i17 > size) {
                                    i17 = size;
                                }
                            } else {
                                if (1 >= i17) {
                                    i17 = 1;
                                }
                                java.util.LinkedList linkedList4 = yVar.f297298q;
                                int size2 = linkedList4 != null ? linkedList4.size() : 1;
                                if (i17 > size2) {
                                    i17 = size2;
                                }
                            }
                            yVar.f297301t = i17;
                            long j19 = yVar.f297295n;
                            java.lang.String str3 = yVar.f297294m;
                            if (str3 == null) {
                                str3 = "";
                            }
                            android.content.Context context2 = yVar.f414559e;
                            if (context2 instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) {
                                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity");
                                j75.f stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) context2).getStateCenter();
                                if (stateCenter != null) {
                                    stateCenter.B3(new fi0.j(j19, str3, false));
                                }
                            }
                        }
                        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                        if (lifecycleScope != null) {
                            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new j23.u(this.f297285f, yVar, null), 2, null);
                        }
                    }
                }
            }
            cVar.f298067a = new fi0.d(z18);
        }
        return jz5.f0.f302826a;
    }
}
