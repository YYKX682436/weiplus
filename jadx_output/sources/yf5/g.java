package yf5;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f461870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf5.m f461871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.l0 f461872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f461873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f461874h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yf5.k0 f461875i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yf5.m mVar, yf5.l0 l0Var, yz5.l lVar, java.util.ArrayList arrayList, yf5.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461871e = mVar;
        this.f461872f = l0Var;
        this.f461873g = lVar;
        this.f461874h = arrayList;
        this.f461875i = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yf5.g gVar = new yf5.g(this.f461871e, this.f461872f, this.f461873g, this.f461874h, this.f461875i, continuation);
        gVar.f461870d = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf5.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList<yf5.f> arrayList2 = new java.util.ArrayList();
        yf5.m mVar = this.f461871e;
        java.util.Iterator it = mVar.f461911e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f461874h;
            java.lang.Object obj2 = null;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            yf5.f fVar = (yf5.f) entry.getValue();
            if (fVar.f461868c == this.f461875i.f461896b) {
                if (fVar.f461866a.f461995d.G0() >= mVar.f461912f.f461863a) {
                    arrayList2.add(fVar);
                } else {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it6.next();
                        if (kotlin.jvm.internal.o.b(((yf5.x) next).f461995d.h1(), str)) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 != null) {
                        arrayList2.add(fVar);
                    }
                }
            }
        }
        mVar.f461911e.clear();
        yf5.l0 l0Var = this.f461872f;
        int i17 = l0Var.f461903a.f461896b;
        int i18 = mVar.f461912f.f461864b;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 < i18) {
            return f0Var;
        }
        yz5.l lVar = this.f461873g;
        if (lVar != null) {
            lVar.invoke(arrayList);
        } else {
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = mVar.f461907a.f461962f;
            if (mvvmList != null) {
                mvvmList.n(arrayList, false);
            }
        }
        com.tencent.mars.xlog.Log.i(mVar.f461908b, "submitInsert, " + l0Var.f461903a.f461895a + ", " + arrayList.size());
        for (yf5.f fVar2 : arrayList2) {
            int ordinal = fVar2.f461867b.ordinal();
            yf5.x xVar = fVar2.f461866a;
            if (ordinal == 0) {
                java.lang.String str2 = mVar.f461908b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("change event submitInsert, ");
                com.tencent.mm.storage.l4 l4Var = xVar.f461995d;
                sb6.append(l4Var != null ? l4Var.h1() : null);
                com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = mVar.f461907a.f461962f;
                if (mvvmList2 != null) {
                    mvvmList2.o(xVar, false);
                }
            } else if (ordinal == 1) {
                java.lang.String str3 = mVar.f461908b;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("change event submitUpdate, ");
                com.tencent.mm.storage.l4 l4Var2 = xVar.f461995d;
                sb7.append(l4Var2 != null ? l4Var2.h1() : null);
                com.tencent.mars.xlog.Log.i(str3, sb7.toString());
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList3 = mVar.f461907a.f461962f;
                if (mvvmList3 != null) {
                    mvvmList3.y(xVar, true);
                }
            } else if (ordinal == 2) {
                java.lang.String str4 = mVar.f461908b;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("change event submitRemove, ");
                com.tencent.mm.storage.l4 l4Var3 = xVar.f461995d;
                sb8.append(l4Var3 != null ? l4Var3.h1() : null);
                com.tencent.mars.xlog.Log.i(str4, sb8.toString());
                com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList4 = mVar.f461907a.f461962f;
                if (mvvmList4 != null) {
                    com.tencent.mm.storage.l4 l4Var4 = xVar.f461995d;
                    java.lang.String h17 = l4Var4 != null ? l4Var4.h1() : null;
                    if (h17 == null) {
                        h17 = "";
                    }
                    mvvmList4.s(h17);
                }
            }
        }
        return f0Var;
    }
}
