package tb5;

/* loaded from: classes12.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f417070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f417071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f417072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f417073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f417074h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tb5.j f417075i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ tb5.d f417076m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ tb5.d f417077n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ tb5.f f417078o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417079p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ tb5.v f417080q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.HashMap hashMap, java.util.HashMap hashMap2, java.util.HashMap hashMap3, java.util.HashMap hashMap4, java.util.ArrayList arrayList, tb5.j jVar, tb5.d dVar, tb5.d dVar2, tb5.f fVar, java.lang.String str, tb5.v vVar) {
        super(0);
        this.f417070d = hashMap;
        this.f417071e = hashMap2;
        this.f417072f = hashMap3;
        this.f417073g = hashMap4;
        this.f417074h = arrayList;
        this.f417075i = jVar;
        this.f417076m = dVar;
        this.f417077n = dVar2;
        this.f417078o = fVar;
        this.f417079p = str;
        this.f417080q = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        java.util.List list5;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.util.HashMap hashMap = this.f417070d;
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        int i17 = 10;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(entrySet, 10));
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Integer num = (java.lang.Integer) entry.getKey();
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : (java.lang.Iterable) value) {
                if (((tb5.e) obj).f417047d) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(java.lang.Long.valueOf(((tb5.e) it.next()).f417045b));
            }
            kotlin.jvm.internal.o.d(num);
            int intValue = num.intValue();
            long M = (long) kz5.n0.M(arrayList3);
            java.lang.Object value2 = entry.getValue();
            kotlin.jvm.internal.o.f(value2, "<get-value>(...)");
            tb5.e eVar = (tb5.e) kz5.n0.a0((java.util.List) value2, 0);
            arrayList.add(new tb5.e(intValue, M, (eVar == null || (str6 = eVar.f417046c) == null) ? "" : str6, true, arrayList3.size()));
        }
        java.util.List F0 = kz5.n0.F0(arrayList, new tb5.m());
        java.util.Set<java.util.Map.Entry> entrySet2 = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet2, "<get-entries>(...)");
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(entrySet2, 10));
        for (java.util.Map.Entry entry2 : entrySet2) {
            java.lang.Integer num2 = (java.lang.Integer) entry2.getKey();
            java.lang.Object value3 = entry2.getValue();
            kotlin.jvm.internal.o.f(value3, "<get-value>(...)");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj2 : (java.lang.Iterable) value3) {
                if (!((tb5.e) obj2).f417047d) {
                    arrayList5.add(obj2);
                }
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
            java.util.Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                arrayList6.add(java.lang.Long.valueOf(((tb5.e) it6.next()).f417045b));
            }
            kotlin.jvm.internal.o.d(num2);
            int intValue2 = num2.intValue();
            long M2 = (long) kz5.n0.M(arrayList6);
            java.lang.Object value4 = entry2.getValue();
            kotlin.jvm.internal.o.f(value4, "<get-value>(...)");
            tb5.e eVar2 = (tb5.e) kz5.n0.a0((java.util.List) value4, 0);
            arrayList4.add(new tb5.e(intValue2, M2, (eVar2 == null || (str5 = eVar2.f417046c) == null) ? "" : str5, false, arrayList6.size()));
        }
        java.util.List F02 = kz5.n0.F0(arrayList4, new tb5.n());
        java.util.HashMap hashMap2 = this.f417071e;
        java.util.Set<java.util.Map.Entry> entrySet3 = hashMap2.entrySet();
        kotlin.jvm.internal.o.f(entrySet3, "<get-entries>(...)");
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(entrySet3, 10));
        for (java.util.Map.Entry entry3 : entrySet3) {
            java.lang.Integer num3 = (java.lang.Integer) entry3.getKey();
            java.lang.Object value5 = entry3.getValue();
            kotlin.jvm.internal.o.f(value5, "<get-value>(...)");
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            for (java.lang.Object obj3 : (java.lang.Iterable) value5) {
                if (((tb5.e) obj3).f417047d) {
                    arrayList8.add(obj3);
                }
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(arrayList8, 10));
            java.util.Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                arrayList9.add(java.lang.Long.valueOf(((tb5.e) it7.next()).f417045b));
            }
            kotlin.jvm.internal.o.d(num3);
            int intValue3 = num3.intValue();
            long M3 = (long) kz5.n0.M(arrayList9);
            java.lang.Object value6 = entry3.getValue();
            kotlin.jvm.internal.o.f(value6, "<get-value>(...)");
            tb5.e eVar3 = (tb5.e) kz5.n0.a0((java.util.List) value6, 0);
            arrayList7.add(new tb5.e(intValue3, M3, (eVar3 == null || (str4 = eVar3.f417046c) == null) ? "" : str4, true, arrayList9.size()));
        }
        java.util.List F03 = kz5.n0.F0(arrayList7, new tb5.o());
        java.util.Set<java.util.Map.Entry> entrySet4 = hashMap2.entrySet();
        kotlin.jvm.internal.o.f(entrySet4, "<get-entries>(...)");
        java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(entrySet4, 10));
        for (java.util.Map.Entry entry4 : entrySet4) {
            java.lang.Integer num4 = (java.lang.Integer) entry4.getKey();
            java.lang.Object value7 = entry4.getValue();
            kotlin.jvm.internal.o.f(value7, "<get-value>(...)");
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            for (java.lang.Object obj4 : (java.lang.Iterable) value7) {
                if (!((tb5.e) obj4).f417047d) {
                    arrayList11.add(obj4);
                }
            }
            java.util.ArrayList arrayList12 = new java.util.ArrayList(kz5.d0.q(arrayList11, 10));
            java.util.Iterator it8 = arrayList11.iterator();
            while (it8.hasNext()) {
                arrayList12.add(java.lang.Long.valueOf(((tb5.e) it8.next()).f417045b));
            }
            kotlin.jvm.internal.o.d(num4);
            int intValue4 = num4.intValue();
            long M4 = (long) kz5.n0.M(arrayList12);
            java.lang.Object value8 = entry4.getValue();
            kotlin.jvm.internal.o.f(value8, "<get-value>(...)");
            tb5.e eVar4 = (tb5.e) kz5.n0.a0((java.util.List) value8, 0);
            arrayList10.add(new tb5.e(intValue4, M4, (eVar4 == null || (str3 = eVar4.f417046c) == null) ? "" : str3, false, arrayList12.size()));
        }
        java.util.List F04 = kz5.n0.F0(arrayList10, new tb5.p());
        java.util.Set<java.util.Map.Entry> entrySet5 = this.f417072f.entrySet();
        kotlin.jvm.internal.o.f(entrySet5, "<get-entries>(...)");
        java.util.ArrayList arrayList13 = new java.util.ArrayList(kz5.d0.q(entrySet5, 10));
        for (java.util.Map.Entry entry5 : entrySet5) {
            java.lang.Integer num5 = (java.lang.Integer) entry5.getKey();
            java.lang.Object value9 = entry5.getValue();
            kotlin.jvm.internal.o.f(value9, "<get-value>(...)");
            java.lang.Iterable iterable = (java.lang.Iterable) value9;
            java.util.ArrayList arrayList14 = new java.util.ArrayList(kz5.d0.q(iterable, i17));
            java.util.Iterator it9 = iterable.iterator();
            while (it9.hasNext()) {
                arrayList14.add(java.lang.Long.valueOf(((tb5.e) it9.next()).f417045b));
                F03 = F03;
            }
            java.util.List list6 = F03;
            kotlin.jvm.internal.o.d(num5);
            int intValue5 = num5.intValue();
            long M5 = (long) kz5.n0.M(arrayList14);
            java.lang.Object value10 = entry5.getValue();
            kotlin.jvm.internal.o.f(value10, "<get-value>(...)");
            tb5.e eVar5 = (tb5.e) kz5.n0.a0((java.util.List) value10, 0);
            arrayList13.add(new tb5.e(intValue5, M5, (eVar5 == null || (str2 = eVar5.f417046c) == null) ? "" : str2, true, arrayList14.size()));
            F03 = list6;
            i17 = 10;
        }
        java.util.List list7 = F03;
        java.util.List F05 = kz5.n0.F0(arrayList13, new tb5.q());
        java.util.Set<java.util.Map.Entry> entrySet6 = this.f417073g.entrySet();
        kotlin.jvm.internal.o.f(entrySet6, "<get-entries>(...)");
        java.util.ArrayList arrayList15 = new java.util.ArrayList(kz5.d0.q(entrySet6, 10));
        for (java.util.Map.Entry entry6 : entrySet6) {
            java.lang.Integer num6 = (java.lang.Integer) entry6.getKey();
            java.lang.Object value11 = entry6.getValue();
            kotlin.jvm.internal.o.f(value11, "<get-value>(...)");
            java.lang.Iterable iterable2 = (java.lang.Iterable) value11;
            java.util.ArrayList arrayList16 = new java.util.ArrayList(kz5.d0.q(iterable2, 10));
            java.util.Iterator it10 = iterable2.iterator();
            while (it10.hasNext()) {
                arrayList16.add(java.lang.Long.valueOf(((tb5.e) it10.next()).f417045b));
            }
            kotlin.jvm.internal.o.d(num6);
            int intValue6 = num6.intValue();
            long M6 = (long) kz5.n0.M(arrayList16);
            java.lang.Object value12 = entry6.getValue();
            kotlin.jvm.internal.o.f(value12, "<get-value>(...)");
            tb5.e eVar6 = (tb5.e) kz5.n0.a0((java.util.List) value12, 0);
            arrayList15.add(new tb5.e(intValue6, M6, (eVar6 == null || (str = eVar6.f417046c) == null) ? "" : str, true, arrayList16.size()));
        }
        java.util.List F06 = kz5.n0.F0(arrayList15, new tb5.r());
        java.util.ArrayList arrayList17 = this.f417074h;
        int size = arrayList17.size();
        long J0 = kz5.n0.J0(arrayList17);
        com.tencent.mars.xlog.Log.isDebug();
        int i18 = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
        ((java.lang.Number) ((jz5.n) tb5.v.f417083s).getValue()).intValue();
        tb5.d dVar = this.f417076m;
        boolean z17 = dVar.f417041d > 100 && dVar.f417038a > 0.0f;
        tb5.v vVar = this.f417080q;
        java.lang.String str7 = this.f417079p;
        if (z17) {
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 2001L;
            errorMsgInfoStruct.f56112d = dVar.f417038a;
            float f17 = dVar.f417039b;
            list = F06;
            list2 = F04;
            errorMsgInfoStruct.f56115g = f17;
            errorMsgInfoStruct.f56117i = dVar.f417040c;
            errorMsgInfoStruct.r(java.lang.String.valueOf(f17));
            errorMsgInfoStruct.s(java.lang.String.valueOf(dVar.f417038a));
            errorMsgInfoStruct.t(java.lang.String.valueOf(dVar.f417038a / dVar.f417039b));
            errorMsgInfoStruct.p(java.lang.String.valueOf(i18));
            errorMsgInfoStruct.q(str7);
            errorMsgInfoStruct.k();
            if (com.tencent.mars.xlog.Log.isDebug()) {
                tb5.v.a(vVar, errorMsgInfoStruct);
            }
        } else {
            list = F06;
            list2 = F04;
        }
        tb5.d dVar2 = this.f417077n;
        java.util.List list8 = F05;
        if (dVar2.f417041d > 100 && dVar2.f417038a > 0.0f) {
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct2 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            list3 = list2;
            errorMsgInfoStruct2.f56113e = 2002L;
            errorMsgInfoStruct2.f56112d = dVar2.f417038a;
            errorMsgInfoStruct2.f56115g = dVar2.f417039b;
            errorMsgInfoStruct2.f56117i = dVar2.f417040c;
            errorMsgInfoStruct2.r(java.lang.String.valueOf(dVar.f417039b));
            errorMsgInfoStruct2.s(java.lang.String.valueOf(dVar.f417038a));
            errorMsgInfoStruct2.t(java.lang.String.valueOf(dVar.f417038a / dVar.f417039b));
            errorMsgInfoStruct2.p(java.lang.String.valueOf(i18));
            errorMsgInfoStruct2.q(str7);
            errorMsgInfoStruct2.k();
            if (com.tencent.mars.xlog.Log.isDebug()) {
                tb5.v.a(vVar, errorMsgInfoStruct2);
            }
        } else {
            list3 = list2;
        }
        tb5.j jVar = this.f417075i;
        boolean isNaN = java.lang.Double.isNaN(((java.lang.Number) ((jz5.n) jVar.f417059d).getValue()).doubleValue());
        jz5.g gVar = jVar.f417061f;
        jz5.g gVar2 = jVar.f417060e;
        if ((isNaN || java.lang.Double.isNaN(((java.lang.Number) ((jz5.n) gVar2).getValue()).doubleValue()) || java.lang.Double.isNaN(((java.lang.Number) ((jz5.n) gVar).getValue()).doubleValue())) ? false : true) {
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct3 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            list4 = F02;
            errorMsgInfoStruct3.f56113e = 2003L;
            errorMsgInfoStruct3.f56112d = (long) ((java.lang.Number) ((jz5.n) jVar.f417059d).getValue()).doubleValue();
            errorMsgInfoStruct3.f56115g = (long) ((java.lang.Number) ((jz5.n) gVar2).getValue()).doubleValue();
            errorMsgInfoStruct3.f56117i = (long) ((java.lang.Number) ((jz5.n) gVar).getValue()).doubleValue();
            errorMsgInfoStruct3.p(java.lang.String.valueOf(i18));
            errorMsgInfoStruct3.q(str7);
            errorMsgInfoStruct3.k();
            if (com.tencent.mars.xlog.Log.isDebug()) {
                tb5.v.a(vVar, errorMsgInfoStruct3);
            }
        } else {
            list4 = F02;
        }
        long j17 = 0;
        if (!F0.isEmpty()) {
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            for (java.lang.Object obj5 : F0) {
                java.util.List list9 = list8;
                if (((tb5.e) obj5).f417045b != 0) {
                    arrayList18.add(obj5);
                }
                list8 = list9;
            }
            list5 = list8;
            java.util.Iterator it11 = arrayList18.iterator();
            while (it11.hasNext()) {
                tb5.e eVar7 = (tb5.e) it11.next();
                com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct4 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                errorMsgInfoStruct4.f56113e = 2004L;
                errorMsgInfoStruct4.f56112d = eVar7.f417045b;
                errorMsgInfoStruct4.f56115g = eVar7.f417044a;
                errorMsgInfoStruct4.f56117i = eVar7.f417048e;
                errorMsgInfoStruct4.p(java.lang.String.valueOf(i18));
                errorMsgInfoStruct4.q(str7);
                errorMsgInfoStruct4.r(eVar7.f417046c);
                errorMsgInfoStruct4.s(vVar.f417098o);
                errorMsgInfoStruct4.k();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    tb5.v.a(vVar, errorMsgInfoStruct4);
                }
            }
        } else {
            list5 = list8;
        }
        if (!list7.isEmpty()) {
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            for (java.lang.Object obj6 : list7) {
                if (((tb5.e) obj6).f417045b != 0) {
                    arrayList19.add(obj6);
                }
            }
            java.util.Iterator it12 = arrayList19.iterator();
            while (it12.hasNext()) {
                tb5.e eVar8 = (tb5.e) it12.next();
                com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct5 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                errorMsgInfoStruct5.f56113e = 2005L;
                errorMsgInfoStruct5.f56112d = eVar8.f417045b;
                errorMsgInfoStruct5.f56115g = eVar8.f417044a;
                errorMsgInfoStruct5.f56117i = eVar8.f417048e;
                errorMsgInfoStruct5.p(java.lang.String.valueOf(i18));
                errorMsgInfoStruct5.q(str7);
                errorMsgInfoStruct5.r(eVar8.f417046c);
                errorMsgInfoStruct5.s(vVar.f417098o);
                errorMsgInfoStruct5.k();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    tb5.v.a(vVar, errorMsgInfoStruct5);
                }
            }
        }
        if (size > 0) {
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct6 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct6.f56113e = 2006L;
            errorMsgInfoStruct6.f56112d = J0;
            errorMsgInfoStruct6.f56115g = size;
            errorMsgInfoStruct6.p(java.lang.String.valueOf(i18));
            errorMsgInfoStruct6.q(str7);
            errorMsgInfoStruct6.k();
            if (com.tencent.mars.xlog.Log.isDebug()) {
                tb5.v.a(vVar, errorMsgInfoStruct6);
            }
        }
        if (!list4.isEmpty()) {
            java.util.ArrayList arrayList20 = new java.util.ArrayList();
            for (java.lang.Object obj7 : list4) {
                if (((tb5.e) obj7).f417045b != 0) {
                    arrayList20.add(obj7);
                }
            }
            java.util.Iterator it13 = arrayList20.iterator();
            while (it13.hasNext()) {
                tb5.e eVar9 = (tb5.e) it13.next();
                com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct7 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                errorMsgInfoStruct7.f56113e = 2707L;
                errorMsgInfoStruct7.f56112d = eVar9.f417045b;
                errorMsgInfoStruct7.f56115g = eVar9.f417044a;
                errorMsgInfoStruct7.p(java.lang.String.valueOf(i18));
                errorMsgInfoStruct7.f56117i = eVar9.f417048e;
                errorMsgInfoStruct7.q(str7);
                errorMsgInfoStruct7.r(eVar9.f417046c);
                errorMsgInfoStruct7.s(vVar.f417098o);
                errorMsgInfoStruct7.k();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    tb5.v.a(vVar, errorMsgInfoStruct7);
                }
            }
        }
        if (!list3.isEmpty()) {
            java.util.ArrayList arrayList21 = new java.util.ArrayList();
            for (java.lang.Object obj8 : list3) {
                if (((tb5.e) obj8).f417045b != 0) {
                    arrayList21.add(obj8);
                }
            }
            java.util.Iterator it14 = arrayList21.iterator();
            while (it14.hasNext()) {
                tb5.e eVar10 = (tb5.e) it14.next();
                com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct8 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                errorMsgInfoStruct8.f56113e = 2708L;
                errorMsgInfoStruct8.f56112d = eVar10.f417045b;
                errorMsgInfoStruct8.f56115g = eVar10.f417044a;
                errorMsgInfoStruct8.p(java.lang.String.valueOf(i18));
                errorMsgInfoStruct8.f56117i = eVar10.f417048e;
                errorMsgInfoStruct8.q(str7);
                errorMsgInfoStruct8.r(eVar10.f417046c);
                errorMsgInfoStruct8.s(vVar.f417098o);
                errorMsgInfoStruct8.k();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    tb5.v.a(vVar, errorMsgInfoStruct8);
                }
            }
        }
        tb5.f fVar = this.f417078o;
        if (!fVar.f417049a.isEmpty()) {
            for (java.util.Map.Entry entry7 : fVar.f417049a.entrySet()) {
                int intValue7 = ((java.lang.Number) entry7.getKey()).intValue();
                java.lang.Iterable iterable3 = (java.lang.Iterable) entry7.getValue();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.lang.Object obj9 : iterable3) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) obj9).f302833d).intValue());
                    java.lang.Object obj10 = linkedHashMap.get(valueOf);
                    if (obj10 == null) {
                        obj10 = new java.util.ArrayList();
                        linkedHashMap.put(valueOf, obj10);
                    }
                    ((java.util.List) obj10).add(obj9);
                }
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
                for (java.util.Map.Entry entry8 : linkedHashMap.entrySet()) {
                    java.lang.Object key = entry8.getKey();
                    java.util.Iterator it15 = ((java.util.List) entry8.getValue()).iterator();
                    long j18 = j17;
                    while (it15.hasNext()) {
                        j18 += ((java.lang.Number) ((jz5.l) it15.next()).f302834e).longValue();
                    }
                    linkedHashMap2.put(key, java.lang.Long.valueOf(j18 / r8.size()));
                }
                java.util.List F07 = kz5.n0.F0(kz5.e1.v(linkedHashMap2), new tb5.s());
                jz5.l lVar = (jz5.l) kz5.n0.a0(F07, 0);
                java.lang.Number valueOf2 = lVar != null ? java.lang.Integer.valueOf(((java.lang.Number) lVar.f302833d).intValue()) : java.lang.Long.valueOf(j17);
                jz5.l lVar2 = (jz5.l) kz5.n0.a0(F07, 1);
                java.lang.Number valueOf3 = lVar2 != null ? java.lang.Integer.valueOf(((java.lang.Number) lVar2.f302833d).intValue()) : java.lang.Long.valueOf(j17);
                jz5.l lVar3 = (jz5.l) kz5.n0.a0(F07, 2);
                java.lang.Number valueOf4 = lVar3 != null ? java.lang.Integer.valueOf(((java.lang.Number) lVar3.f302833d).intValue()) : java.lang.Long.valueOf(j17);
                jz5.l lVar4 = (jz5.l) kz5.n0.a0(F07, 0);
                long longValue = lVar4 != null ? ((java.lang.Number) lVar4.f302834e).longValue() : j17;
                jz5.l lVar5 = (jz5.l) kz5.n0.a0(F07, 1);
                long longValue2 = lVar5 != null ? ((java.lang.Number) lVar5.f302834e).longValue() : j17;
                jz5.l lVar6 = (jz5.l) kz5.n0.a0(F07, 2);
                long longValue3 = lVar6 != null ? ((java.lang.Number) lVar6.f302834e).longValue() : j17;
                com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct9 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                errorMsgInfoStruct9.f56115g = intValue7;
                errorMsgInfoStruct9.f56113e = 1899L;
                errorMsgInfoStruct9.f56117i = valueOf2.longValue();
                errorMsgInfoStruct9.f56118j = valueOf3.longValue();
                errorMsgInfoStruct9.f56119k = valueOf4.longValue();
                errorMsgInfoStruct9.r(java.lang.String.valueOf(longValue));
                errorMsgInfoStruct9.s(java.lang.String.valueOf(longValue2));
                errorMsgInfoStruct9.t(java.lang.String.valueOf(longValue3));
                errorMsgInfoStruct9.q(str7);
                errorMsgInfoStruct9.k();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    tb5.v.a(vVar, errorMsgInfoStruct9);
                }
                j17 = 0;
            }
        }
        if (!list5.isEmpty()) {
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            for (java.lang.Object obj11 : list5) {
                if (((tb5.e) obj11).f417045b != 0) {
                    arrayList22.add(obj11);
                }
            }
            java.util.Iterator it16 = arrayList22.iterator();
            while (it16.hasNext()) {
                tb5.e eVar11 = (tb5.e) it16.next();
                com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct10 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                errorMsgInfoStruct10.f56113e = 2012L;
                errorMsgInfoStruct10.f56112d = eVar11.f417045b;
                errorMsgInfoStruct10.f56115g = eVar11.f417044a;
                errorMsgInfoStruct10.p(java.lang.String.valueOf(i18));
                errorMsgInfoStruct10.f56117i = eVar11.f417048e;
                errorMsgInfoStruct10.q(str7);
                errorMsgInfoStruct10.r(eVar11.f417046c);
                errorMsgInfoStruct10.s(vVar.f417098o);
                errorMsgInfoStruct10.k();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    tb5.v.a(vVar, errorMsgInfoStruct10);
                }
            }
        }
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList23 = new java.util.ArrayList();
            for (java.lang.Object obj12 : list) {
                if (((tb5.e) obj12).f417045b != 0) {
                    arrayList23.add(obj12);
                }
            }
            java.util.Iterator it17 = arrayList23.iterator();
            while (it17.hasNext()) {
                tb5.e eVar12 = (tb5.e) it17.next();
                com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct11 = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                errorMsgInfoStruct11.f56113e = 2011L;
                errorMsgInfoStruct11.f56112d = eVar12.f417045b;
                errorMsgInfoStruct11.f56115g = eVar12.f417044a;
                errorMsgInfoStruct11.p(java.lang.String.valueOf(i18));
                errorMsgInfoStruct11.f56117i = eVar12.f417048e;
                errorMsgInfoStruct11.q(str7);
                errorMsgInfoStruct11.r(eVar12.f417046c);
                errorMsgInfoStruct11.s(vVar.f417098o);
                errorMsgInfoStruct11.k();
                if (com.tencent.mars.xlog.Log.isDebug()) {
                    tb5.v.a(vVar, errorMsgInfoStruct11);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
