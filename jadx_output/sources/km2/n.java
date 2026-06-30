package km2;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.HashMap f309147p = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static int f309148q = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: b, reason: collision with root package name */
    public int f309150b;

    /* renamed from: c, reason: collision with root package name */
    public km2.r f309151c;

    /* renamed from: f, reason: collision with root package name */
    public km2.u f309154f;

    /* renamed from: g, reason: collision with root package name */
    public dk2.x4 f309155g;

    /* renamed from: h, reason: collision with root package name */
    public int f309156h;

    /* renamed from: k, reason: collision with root package name */
    public r45.k42 f309159k;

    /* renamed from: l, reason: collision with root package name */
    public android.os.Bundle f309160l;

    /* renamed from: m, reason: collision with root package name */
    public int f309161m;

    /* renamed from: o, reason: collision with root package name */
    public r45.md5 f309163o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309149a = "FinderLiveDataModel@" + hashCode();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f309152d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f309153e = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f309157i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f309158j = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f309162n = "";

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(java.util.List list, km2.u uVar) {
        java.util.List list2;
        java.lang.String str;
        if (list != null) {
            list2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(new km2.t((km2.m) it.next()));
            }
        } else {
            list2 = kz5.p0.f313996d;
        }
        java.util.List f17 = f(this.f309153e, list2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = this.f309153e.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            km2.t tVar = (km2.t) it6.next();
            km2.m mVar = tVar.f309222d;
            if ((mVar != null && mVar.f309139q) != false) {
                if (!(mVar != null && mVar.f309138p)) {
                    arrayList.add(tVar);
                }
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            str = this.f309149a;
            if (!hasNext) {
                break;
            }
            km2.t tVar2 = (km2.t) it7.next();
            java.util.Iterator it8 = this.f309153e.iterator();
            int i17 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b((km2.t) it8.next(), tVar2)) {
                    break;
                }
                i17++;
            }
            if (i17 > -1) {
                this.f309153e.remove(i17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeNotExposedBackUpLive removeDataIndex=");
                sb6.append(i17);
                sb6.append(" name=");
                com.tencent.mm.live.api.LiveConfig b17 = tVar2.b();
                sb6.append(b17 != null ? b17.M : null);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                if (uVar != null) {
                    uVar.g(i17, 1);
                }
            }
        }
        this.f309153e.addAll(f17);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#appendLiveData remoteSize=");
        sb7.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb7.append(", after filter size ");
        java.util.LinkedList linkedList = (java.util.LinkedList) f17;
        sb7.append(linkedList.size());
        sb7.append(", now liveDataList.size=");
        sb7.append(this.f309153e.size());
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        return linkedList.size();
    }

    public final android.content.Intent b(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        km2.t c17 = c();
        if (c17 != null) {
            com.tencent.mm.live.api.LiveConfig b17 = c17.b();
            intent.putExtra("key_enter_live_param_share_username", b17 != null ? b17.I : null);
            com.tencent.mm.live.api.LiveConfig b18 = c17.b();
            intent.putExtra("key_enter_live_param_from_share_scene_new", b18 != null ? java.lang.Integer.valueOf(b18.K) : null);
            com.tencent.mm.live.api.LiveConfig b19 = c17.b();
            intent.putExtra("KEY_ENTER_LIVE_PARAM_TO_USERNAME", b19 != null ? b19.L : null);
        }
        return intent;
    }

    public final km2.t c() {
        int size = this.f309153e.size();
        int d17 = d();
        boolean z17 = false;
        if (d17 >= 0 && d17 < size) {
            z17 = true;
        }
        if (z17) {
            return (km2.t) kz5.n0.a0(this.f309153e, d());
        }
        return null;
    }

    public final int d() {
        com.tencent.mars.xlog.Log.i(this.f309149a, "get curPos:" + this.f309150b);
        return this.f309150b;
    }

    public final r45.ta4 e() {
        dk2.x4 x4Var = this.f309155g;
        if (x4Var != null) {
            return x4Var.B;
        }
        return null;
    }

    public final java.util.List f(java.util.List list, java.util.List list2) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            km2.t tVar = (km2.t) it.next();
            java.util.Iterator it6 = list.iterator();
            int i17 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((km2.t) it6.next()).d(tVar) == 0) {
                    break;
                }
                i17++;
            }
            java.util.Iterator it7 = linkedList.iterator();
            int i18 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((km2.t) it7.next()).d(tVar) == 0) {
                    break;
                }
                i18++;
            }
            if (i17 == -1 && i18 == -1) {
                linkedList.add(tVar);
            }
        }
        return linkedList;
    }

    public final void g(dk2.x4 finderLiveConfig) {
        java.lang.Integer num;
        java.util.LinkedList linkedList;
        gk2.e a17;
        int i17;
        long j17;
        java.util.LinkedList<r45.sp1> list;
        kotlin.jvm.internal.o.g(finderLiveConfig, "finderLiveConfig");
        this.f309155g = finderLiveConfig;
        this.f309156h = finderLiveConfig.f234326t;
        this.f309157i = finderLiveConfig.f234328v;
        this.f309158j = finderLiveConfig.f234327u;
        this.f309160l = finderLiveConfig.f234330x;
        h(finderLiveConfig.f234315i);
        int i18 = finderLiveConfig.f234316j;
        int i19 = finderLiveConfig.f234317k;
        int i27 = finderLiveConfig.f234320n;
        r45.kd1 kd1Var = finderLiveConfig.f234322p;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderLiveConfig.f234324r;
        r45.gy0 gy0Var = finderLiveConfig.f234325s;
        int i28 = finderLiveConfig.f234326t;
        java.lang.String str = finderLiveConfig.f234323q;
        r45.q92 q92Var = finderLiveConfig.f234329w;
        r45.ta4 ta4Var = finderLiveConfig.B;
        java.lang.String string = ta4Var != null ? ta4Var.getString(32) : null;
        r45.ta4 ta4Var2 = finderLiveConfig.B;
        int integer = ta4Var2 != null ? ta4Var2.getInteger(34) : 0;
        jz5.l P6 = ((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).P6();
        km2.r rVar = new km2.r(null, 0L, null, null, null, 0, null, 0, 0.0f, 0.0f, 0, 0, null, null, 0, null, 0, null, false, null, 0, 2097151, null);
        rVar.f309204i = ((java.lang.Number) P6.f302833d).floatValue();
        rVar.f309205j = ((java.lang.Number) P6.f302834e).floatValue();
        rVar.f309203h = 7;
        rVar.f309206k = i19;
        rVar.f309201f = i18;
        rVar.f309207l = i27;
        rVar.f309199d = kd1Var;
        rVar.f309208m = str;
        rVar.f309200e = finderObject;
        rVar.f309209n = gy0Var;
        rVar.f309210o = i28;
        rVar.f309213r = q92Var;
        rVar.f309215t = string;
        rVar.f309216u = integer;
        this.f309151c = rVar;
        r45.ta4 ta4Var3 = finderLiveConfig.B;
        java.lang.String string2 = ta4Var3 != null ? ta4Var3.getString(32) : null;
        boolean z17 = !(string2 == null || string2.length() == 0);
        java.util.ArrayList arrayList = finderLiveConfig.f234318l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            km2.m mVar = new km2.m((com.tencent.mm.live.api.LiveConfig) it.next());
            mVar.f309136n = z17;
            arrayList2.add(new km2.t(mVar));
        }
        this.f309153e = new java.util.ArrayList(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        r45.ta4 ta4Var4 = finderLiveConfig.B;
        java.lang.String str2 = this.f309149a;
        if (ta4Var4 != null && (list = ta4Var4.getList(31)) != null) {
            for (r45.sp1 sp1Var : list) {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                kotlin.jvm.internal.o.d(sp1Var);
                km2.m mVar2 = new km2.m(((com.tencent.mm.feature.finder.live.v4) w0Var).Mk(sp1Var));
                mVar2.f309139q = true;
                com.tencent.mars.xlog.Log.i(str2, "parseLiveConfigList name=" + sp1Var.getString(3));
                arrayList3.add(new km2.t(mVar2));
            }
        }
        if (this.f309153e.size() > 0 && finderLiveConfig.f234322p != null) {
            r45.jc1 jc1Var = new r45.jc1();
            r45.kd1 kd1Var2 = finderLiveConfig.f234322p;
            if (kd1Var2 != null) {
                i17 = 0;
                j17 = kd1Var2.getLong(0);
            } else {
                i17 = 0;
                j17 = 0;
            }
            jc1Var.set(i17, java.lang.Long.valueOf(j17));
            r45.kd1 kd1Var3 = finderLiveConfig.f234322p;
            jc1Var.set(1, kd1Var3 != null ? kd1Var3.getByteString(2) : null);
            km2.m mVar3 = ((km2.t) this.f309153e.get(0)).f309222d;
            if (mVar3 != null) {
                mVar3.f309133h = jc1Var;
            }
            gk2.e a18 = ((km2.t) this.f309153e.get(0)).a();
            mm2.c1 c1Var = a18 != null ? (mm2.c1) a18.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.f328827j5 = jc1Var;
            }
            gk2.e a19 = ((km2.t) this.f309153e.get(0)).a();
            mm2.c1 c1Var2 = a19 != null ? (mm2.c1) a19.a(mm2.c1.class) : null;
            if (c1Var2 != null) {
                com.tencent.mm.live.api.LiveConfig b17 = ((km2.t) this.f309153e.get(0)).b();
                c1Var2.f328899v4 = b17 != null ? b17.H : false;
            }
        }
        if (!arrayList3.isEmpty()) {
            this.f309153e.addAll(arrayList3);
        }
        km2.t c17 = c();
        mm2.c1 c1Var3 = (c17 == null || (a17 = c17.a()) == null) ? null : (mm2.c1) a17.a(mm2.c1.class);
        if (c1Var3 == null) {
            num = null;
        } else {
            r45.ta4 ta4Var5 = finderLiveConfig.B;
            if (ta4Var5 != null) {
                java.util.LinkedList<r45.qa4> list2 = ta4Var5.getList(20);
                if (list2 != null) {
                    linkedList = null;
                    for (r45.qa4 qa4Var : list2) {
                        if (linkedList == null) {
                            linkedList = new java.util.LinkedList();
                        }
                        kotlin.jvm.internal.o.d(qa4Var);
                        r45.qa4 qa4Var2 = new r45.qa4();
                        qa4Var2.set(0, qa4Var.getString(0));
                        qa4Var2.set(1, java.lang.Long.valueOf(qa4Var.getLong(1)));
                        linkedList.add(qa4Var2);
                    }
                    num = null;
                } else {
                    num = null;
                    linkedList = null;
                }
                ta4Var5.set(20, num);
            } else {
                num = null;
                linkedList = null;
            }
            c1Var3.f328907w6 = linkedList;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseLiveConfigList liveDataListSize=");
        sb6.append(this.f309153e.size());
        sb6.append(" backupLiveDataListSize=");
        sb6.append(arrayList3.size());
        sb6.append(' ');
        r45.ta4 e17 = e();
        sb6.append(e17 != null ? java.lang.Integer.valueOf(e17.hashCode()) : num);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
    }

    public final void h(int i17) {
        this.f309150b = i17;
        com.tencent.mars.xlog.Log.i(this.f309149a, "set curPos :" + this.f309150b);
    }

    public final java.lang.String i(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            java.lang.String str = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("******" + i17 + ':');
            km2.m mVar = ((km2.t) obj).f309222d;
            if (mVar != null) {
                str = mVar.c();
            }
            sb6.append(str);
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveDataModel(" + hashCode() + "):");
        sb6.append("init pos:" + d() + ';');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loaderParams:tab:");
        km2.r rVar = this.f309151c;
        sb7.append(rVar != null ? java.lang.Integer.valueOf(rVar.f309201f) : null);
        sb7.append(",objectId:");
        km2.r rVar2 = this.f309151c;
        sb7.append(rVar2 != null ? java.lang.Long.valueOf(rVar2.f309197b) : null);
        sb7.append(",lastBuf is null:");
        km2.r rVar3 = this.f309151c;
        sb7.append((rVar3 != null ? rVar3.f309196a : null) == null);
        sb7.append(",columnVMKey:");
        km2.r rVar4 = this.f309151c;
        sb7.append(rVar4 != null ? rVar4.f309215t : null);
        sb7.append(';');
        sb6.append(sb7.toString());
        int size = this.f309153e.size();
        if (size <= 0) {
            sb6.append("live data is empty");
            java.lang.String sb8 = sb6.toString();
            kotlin.jvm.internal.o.f(sb8, "toString(...)");
            return sb8;
        }
        for (int i17 = 0; i17 < size; i17++) {
            sb6.append("live_" + i17 + ':' + this.f309153e.get(i17));
        }
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }
}
