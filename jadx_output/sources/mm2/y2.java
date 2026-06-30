package mm2;

/* loaded from: classes3.dex */
public final class y2 extends mm2.e {
    public final java.util.Map A;
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData B;
    public boolean C;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f329556f;

    /* renamed from: g, reason: collision with root package name */
    public final zg2.d f329557g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f329558h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f329559i;

    /* renamed from: m, reason: collision with root package name */
    public pm2.a f329560m;

    /* renamed from: n, reason: collision with root package name */
    public r45.xz1 f329561n;

    /* renamed from: o, reason: collision with root package name */
    public r45.kl4 f329562o;

    /* renamed from: p, reason: collision with root package name */
    public r45.wz1 f329563p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f329564q;

    /* renamed from: r, reason: collision with root package name */
    public xh2.b f329565r;

    /* renamed from: s, reason: collision with root package name */
    public dk2.pf f329566s;

    /* renamed from: t, reason: collision with root package name */
    public int f329567t;

    /* renamed from: u, reason: collision with root package name */
    public dk2.m f329568u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f329569v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f329570w;

    /* renamed from: x, reason: collision with root package name */
    public org.json.JSONObject f329571x;

    /* renamed from: y, reason: collision with root package name */
    public org.json.JSONObject f329572y;

    /* renamed from: z, reason: collision with root package name */
    public org.json.JSONObject f329573z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 1; i17 < 10; i17++) {
            hashMap.put(java.lang.Integer.valueOf(i17), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.lzi, java.lang.Integer.valueOf(i17)));
        }
        this.f329556f = hashMap;
        zg2.d dVar = new zg2.d(null, 1, null);
        dVar.f472822d = new mm2.u2(this);
        this.f329557g = dVar;
        this.f329558h = new java.util.HashMap();
        this.f329559i = new java.util.LinkedList();
        this.f329560m = pm2.a.f356853f;
        this.f329564q = new java.util.HashMap();
        this.f329569v = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329570w = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329571x = new org.json.JSONObject();
        this.f329572y = new org.json.JSONObject();
        this.f329573z = new org.json.JSONObject();
        this.A = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.B = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final boolean N6(boolean z17, int i17, boolean z18) {
        int o76 = ((mm2.o4) business(mm2.o4.class)).o7() + 1;
        int q76 = ((mm2.o4) business(mm2.o4.class)).q7();
        com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptAnchorValidCheck isNeedToast: " + z17 + ", acceptAnchorCarryAnchorSize:" + i17 + ", currentAnchorSize: " + o76 + ", currentVisitorSize: " + q76 + ", fromAccept: " + z18);
        if (Z6()) {
            if (z17) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.lqz), 0).show();
            }
            return false;
        }
        if (q76 > 0) {
            if (o76 == 1 && q76 >= 3) {
                if (z17) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.dnz), 0).show();
                }
                return false;
            }
            if (o76 >= 2) {
                if (z17) {
                    android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context3, context3.getResources().getString(com.tencent.mm.R.string.dnu), 0).show();
                }
                return false;
            }
            if (o76 == 1 && i17 >= 2) {
                if (z17) {
                    android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context4, context4.getResources().getString(com.tencent.mm.R.string.dnw, java.lang.Integer.valueOf(i17)), 0).show();
                }
                return false;
            }
        } else {
            if (o76 >= 4) {
                if (z17) {
                    android.content.Context context5 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context5, context5.getResources().getString(com.tencent.mm.R.string.dnx, 3), 0).show();
                }
                return false;
            }
            if (o76 + i17 > 4) {
                if (z17) {
                    android.content.Context context6 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context6, context6.getResources().getString(com.tencent.mm.R.string.dnv, 4, java.lang.Integer.valueOf(i17)), 0).show();
                }
                return false;
            }
        }
        return true;
    }

    public final boolean O6(boolean z17) {
        int i17;
        int i18;
        com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck mode: " + ((mm2.o4) business(mm2.o4.class)).A.getValue());
        if (((mm2.c1) business(mm2.c1.class)).f328892u3 && ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) business(mm2.o4.class)).H).getValue()).booleanValue() && ((mm2.o4) business(mm2.o4.class)).p7() >= 1) {
            if (z17) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.mkh), 0).show();
            }
            com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck pay link disable");
            return false;
        }
        dk2.u4 u4Var = ((mm2.o4) business(mm2.o4.class)).Z;
        if (!(u4Var == null || u4Var.k() || u4Var.g())) {
            if (z17) {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.f491613cm5), 0).show();
            }
            com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck battle disable");
            return false;
        }
        mm2.o4 o4Var = (mm2.o4) business(mm2.o4.class);
        xh2.c cVar = (xh2.c) o4Var.A.getValue();
        if (cVar != null && ((i18 = cVar.f454533c) == 0 || i18 == 8) && o4Var.p7() >= o4Var.r7()) {
            if (z17) {
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context3, context3.getResources().getString(com.tencent.mm.R.string.f491592dm3, java.lang.Integer.valueOf(((mm2.o4) business(mm2.o4.class)).r7())), 0).show();
            }
            com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck normal mode over size");
            return false;
        }
        mm2.o4 o4Var2 = (mm2.o4) business(mm2.o4.class);
        xh2.c cVar2 = (xh2.c) o4Var2.A.getValue();
        if (cVar2 != null && ((i17 = cVar2.f454533c) == 2 || i17 == 3) && o4Var2.p7() >= 8) {
            if (z17) {
                android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context4, context4.getResources().getString(com.tencent.mm.R.string.f491592dm3, 8), 0).show();
            }
            com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck grab mode over size");
            return false;
        }
        if (Z6()) {
            if (!((mm2.c1) business(mm2.c1.class)).A3) {
                if (z17) {
                    android.content.Context context5 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context5, context5.getResources().getString(com.tencent.mm.R.string.dvu), 0).show();
                }
                com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck enableMicWithShareScreen = false");
                return false;
            }
            if (((mm2.o4) business(mm2.o4.class)).p7() >= 3) {
                if (z17) {
                    android.content.Context context6 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context6, context6.getResources().getString(com.tencent.mm.R.string.lqy), 0).show();
                }
                com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck linkingAndWaitingAudienceSize over");
                return false;
            }
        }
        mm2.o4 o4Var3 = (mm2.o4) business(mm2.o4.class);
        xh2.c cVar3 = (xh2.c) o4Var3.A.getValue();
        if (cVar3 != null && cVar3.f454533c == 1 && o4Var3.p7() >= 3) {
            if (z17) {
                android.content.Context context7 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context7, context7.getResources().getString(com.tencent.mm.R.string.f491594dm5), 0).show();
            }
            com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "anchorAcceptVisitorValidCheck focus mode over size");
            return false;
        }
        if (((mm2.y2) business(mm2.y2.class)).Y6()) {
            if (((mm2.o4) business(mm2.o4.class)).o7() + 1 > 2) {
                if (z17) {
                    android.content.Context context8 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context8, context8.getResources().getString(com.tencent.mm.R.string.dnu), 0).show();
                }
                return false;
            }
            dk2.u4 u4Var2 = ((mm2.o4) business(mm2.o4.class)).Z;
            if (u4Var2 != null && !u4Var2.k() && !u4Var2.g()) {
                return false;
            }
            dk2.u4 u4Var3 = ((mm2.o4) business(mm2.o4.class)).Z;
            if (u4Var3 != null && u4Var3.g()) {
                if (((mm2.o4) business(mm2.o4.class)).p7() >= 4) {
                    if (z17) {
                        android.content.Context context9 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        db5.t7.makeText(context9, context9.getResources().getString(com.tencent.mm.R.string.m8h), 0).show();
                    }
                    return false;
                }
            } else if (((mm2.o4) business(mm2.o4.class)).p7() >= 2) {
                if (z17) {
                    android.content.Context context10 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context10, context10.getResources().getString(com.tencent.mm.R.string.dnz), 0).show();
                }
                return false;
            }
        }
        return true;
    }

    public final pm2.a P6(int i17, int i18, int i19, int i27, int i28) {
        boolean z17 = false;
        if (i17 == 2 && i18 == 8) {
            return pm2.a.f356864t;
        }
        if ((i17 == 0 && i19 == 1) || (i17 == 2 && i18 == 1)) {
            return pm2.a.f356863s;
        }
        if ((i17 == 0 && i19 == 2) || (i17 == 2 && i18 == 2)) {
            return pm2.a.f356862r;
        }
        if ((i17 == 0 && i19 == 4) || (i17 == 2 && i18 == 16)) {
            z17 = true;
        }
        if (z17) {
            return pm2.a.f356865u;
        }
        switch (i27) {
            case 1:
                return pm2.a.f356855h;
            case 2:
                return pm2.a.f356857m;
            case 3:
                return pm2.a.f356861q;
            case 4:
                return pm2.a.f356858n;
            case 5:
                return pm2.a.f356859o;
            case 6:
                return pm2.a.f356860p;
            case 7:
            default:
                return ((mm2.o4) business(mm2.o4.class)).f329324s.size() == 1 ? pm2.a.f356851d : ((mm2.o4) business(mm2.o4.class)).f329324s.size() > 1 ? pm2.a.f356852e : i28 <= 4 ? pm2.a.f356853f : pm2.a.f356854g;
            case 8:
                return pm2.a.f356866v;
        }
    }

    public final xh2.g Q6(java.lang.String sdkUserId, boolean z17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309170a, sdkUserId)) {
                    break;
                }
            }
        }
        km2.q qVar = (km2.q) obj;
        boolean z18 = true;
        if (qVar != null) {
            boolean z19 = pm0.v.z(qVar.f309191v, 16);
            if (((mm2.o4) business(mm2.o4.class)).f329313h != z19) {
                java.lang.String str = qVar.f309170a;
                if (str == null) {
                    str = "";
                }
                if (kotlin.jvm.internal.o.b(((mm2.c1) business(mm2.c1.class)).m8(), str) && !z17) {
                    ((mm2.o4) business(mm2.o4.class)).f329313h = z19;
                    return new xh2.g(qVar.f309183n, qVar.f309191v, z18);
                }
            }
            z18 = false;
            return new xh2.g(qVar.f309183n, qVar.f309191v, z18);
        }
        java.util.List list2 = ((mm2.o4) business(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserList>(...)");
        synchronized (list2) {
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, sdkUserId)) {
                    break;
                }
            }
        }
        km2.q qVar2 = (km2.q) obj2;
        if (qVar2 == null) {
            return null;
        }
        boolean z27 = pm0.v.z(qVar2.f309191v, 16);
        java.lang.Boolean bool = (java.lang.Boolean) ((mm2.y2) business(mm2.y2.class)).f329564q.get(qVar2.f309170a + '_' + qVar2.f309175f);
        if ((bool == null ? false : bool.booleanValue()) == z27 || z17) {
            z18 = false;
        } else {
            ((mm2.y2) business(mm2.y2.class)).f329564q.put(qVar2.f309170a + '_' + qVar2.f309175f, java.lang.Boolean.valueOf(z27));
        }
        return new xh2.g(qVar2.f309183n, qVar2.f309191v, z18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String R6(int r4) {
        /*
            r3 = this;
            java.lang.Class<mm2.e1> r0 = mm2.e1.class
            androidx.lifecycle.c1 r0 = r3.business(r0)
            mm2.e1 r0 = (mm2.e1) r0
            int r0 = r0.R6()
            java.util.HashMap r1 = r3.f329556f
            java.util.HashMap r2 = r3.f329558h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r0 == 0) goto L37
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L37
            int r2 = r0.length()
            if (r2 <= 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 != 0) goto L42
        L37:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r1.get(r4)
            r0 = r4
            java.lang.String r0 = (java.lang.String) r0
        L42:
            if (r0 != 0) goto L46
            java.lang.String r0 = ""
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.y2.R6(int):java.lang.String");
    }

    public final java.util.HashMap S6() {
        java.util.HashMap hashMap = (java.util.HashMap) this.f329558h.get(java.lang.Integer.valueOf(((mm2.e1) business(mm2.e1.class)).R6()));
        return hashMap == null ? this.f329556f : hashMap;
    }

    public final fj2.k U6(java.lang.String sdkUserId) {
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.ArrayList arrayList2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        dk2.u4 u4Var = ((mm2.o4) business(mm2.o4.class)).Z;
        if (u4Var == null) {
            return null;
        }
        mm2.o4 o4Var = (mm2.o4) business(mm2.o4.class);
        java.util.List list = o4Var.f329324s;
        java.util.List list2 = o4Var.f329327v;
        if (u4Var.f234160g == 2 && !u4Var.g()) {
            r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f234163j, 0);
            java.lang.Iterable list3 = r22Var != null ? r22Var.getList(0) : null;
            if (list3 == null) {
                list3 = kz5.p0.f313996d;
            }
            r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f234163j, 1);
            java.lang.Iterable list4 = r22Var2 != null ? r22Var2.getList(0) : null;
            if (list4 == null) {
                list4 = kz5.p0.f313996d;
            }
            synchronized (list3) {
                java.util.Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) obj4).getString(1), sdkUserId)) {
                        break;
                    }
                }
            }
            if (obj4 != null) {
                return fj2.k.f263175d;
            }
            synchronized (list4) {
                java.util.Iterator it6 = list4.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it6.next();
                    if (kotlin.jvm.internal.o.b(((r45.wk6) obj5).getString(1), sdkUserId)) {
                        break;
                    }
                }
            }
            if (obj5 != null) {
                return fj2.k.f263176e;
            }
            return null;
        }
        if (list.size() != 1) {
            return null;
        }
        fj2.k kVar = fj2.k.f263175d;
        if (!kotlin.jvm.internal.o.b(o4Var.a7().f309170a, sdkUserId)) {
            kotlin.jvm.internal.o.d(list2);
            synchronized (list2) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj6 : list2) {
                    if (kotlin.jvm.internal.o.b(((km2.q) obj6).f309189t, java.lang.Boolean.FALSE)) {
                        arrayList.add(obj6);
                    }
                }
            }
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it7.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, sdkUserId)) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (list) {
                    java.util.Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it8.next();
                        if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, sdkUserId)) {
                            break;
                        }
                    }
                }
                if (obj2 == null) {
                    synchronized (list2) {
                        arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj7 : list2) {
                            if (kotlin.jvm.internal.o.b(((km2.q) obj7).f309189t, java.lang.Boolean.TRUE)) {
                                arrayList2.add(obj7);
                            }
                        }
                    }
                    java.util.Iterator it9 = arrayList2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        if (kotlin.jvm.internal.o.b(((km2.q) obj3).f309170a, sdkUserId)) {
                            break;
                        }
                    }
                    if (obj3 == null) {
                        return null;
                    }
                }
                return fj2.k.f263176e;
            }
        }
        return kVar;
    }

    public final jz5.l V6() {
        java.util.LinkedList linkedList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        jz5.l lVar = new jz5.l(arrayList, arrayList2);
        xh2.b bVar = ((mm2.y2) business(mm2.y2.class)).f329565r;
        if (bVar != null && (linkedList = bVar.f454530i) != null) {
            java.util.ArrayList<xh2.a> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList) {
                if (!kotlin.jvm.internal.o.b(((xh2.a) obj).b(), ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n)) {
                    arrayList3.add(obj);
                }
            }
            synchronized (arrayList3) {
                for (xh2.a aVar : arrayList3) {
                    km2.q qVar = aVar.f454520a;
                    if (qVar != null) {
                        if (b7(aVar.f454521b.f454553e)) {
                            arrayList.add(qVar);
                        } else {
                            arrayList2.add(qVar);
                        }
                    }
                }
            }
        }
        return lVar;
    }

    public final boolean W6(boolean z17) {
        java.lang.Object obj;
        dk2.u4 u4Var = ((mm2.o4) business(mm2.o4.class)).Z;
        if (u4Var == null || u4Var.f234158e == 3) {
            return true;
        }
        km2.k a17 = u4Var.a();
        if (a17 != null) {
            java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((km2.q) obj).f309172c, a17.f309114a)) {
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null && z17) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.d6w, qVar.f309173d), 0).show();
            }
        }
        return false;
    }

    public final boolean X6() {
        return ((mm2.c1) business(mm2.c1.class)).f328920y3;
    }

    public final boolean Y6() {
        mm2.o4 o4Var = (mm2.o4) business(mm2.o4.class);
        return o4Var.f329324s.size() > 0 || o4Var.D;
    }

    public final boolean Z6() {
        kn0.p pVar;
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f233378d;
        return (w0Var == null || (pVar = w0Var.D) == null || !pVar.f309589i) ? false : true;
    }

    public final boolean a7() {
        switch (this.f329560m.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 5:
            default:
                return false;
        }
    }

    public final boolean b7(int i17) {
        return i17 == 2 || i17 == 3 || i17 == 6 || i17 == 7;
    }

    public final void c7() {
        dk2.m mVar = this.f329568u;
        if (mVar != null) {
            this.f329567t = mVar.f233741d;
        }
        this.f329568u = null;
    }

    public final void d7(r45.vz1 micConfig) {
        kotlin.jvm.internal.o.g(micConfig, "micConfig");
        if (micConfig.getList(0).size() > 0) {
            java.util.HashMap hashMap = this.f329558h;
            hashMap.clear();
            java.util.LinkedList<r45.hp4> list = micConfig.getList(0);
            kotlin.jvm.internal.o.f(list, "getMode_config_list(...)");
            for (r45.hp4 hp4Var : list) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.util.LinkedList<r45.b02> list2 = hp4Var.getList(1);
                kotlin.jvm.internal.o.f(list2, "getSeat_info_list(...)");
                for (r45.b02 b02Var : list2) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(b02Var.getInteger(0));
                    java.lang.String string = b02Var.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    hashMap2.put(valueOf, string);
                }
                hashMap.put(java.lang.Integer.valueOf(hp4Var.getInteger(0)), hashMap2);
            }
            this.f329557g.postValue(hashMap.get(java.lang.Integer.valueOf(((mm2.e1) business(mm2.e1.class)).R6())));
            com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "updateMicConfig micConfigMap: " + hashMap);
        }
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mars.xlog.Log.i("LiveLinkMicLogicSlice", "onClear");
        this.f329571x = new org.json.JSONObject();
        this.f329573z = new org.json.JSONObject();
        this.f329572y = new org.json.JSONObject();
    }
}
