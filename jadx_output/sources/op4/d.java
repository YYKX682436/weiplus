package op4;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ op4.e f347268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f347269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(op4.e eVar, long j17) {
        super(0);
        this.f347268d = eVar;
        this.f347269e = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [uo4.g] */
    /* JADX WARN: Type inference failed for: r8v6, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, uo4.b] */
    /* JADX WARN: Type inference failed for: r8v8, types: [uo4.c] */
    /* JADX WARN: Type inference failed for: r8v9, types: [uo4.b] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        ?? cVar;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        rm5.v vVar;
        uo4.e eVar;
        long j17;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        long j18 = 1;
        long j19 = this.f347268d.f347272g ? 1L : 4L;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct();
        new java.util.ArrayList();
        new java.util.ArrayList();
        gp4.j jVar = (gp4.j) this.f347268d.f347270e.j(gp4.j.class);
        java.util.ArrayList<zu3.a> E = jVar != null ? jVar.E() : null;
        lp4.u uVar = (lp4.u) this.f347268d.f347270e.j(lp4.u.class);
        if (uVar != null && (vVar = uVar.f320429h) != null) {
            op4.e eVar2 = this.f347268d;
            com.tencent.mm.plugin.vlog.model.h1 a17 = np4.a.a(vVar);
            eVar2.f347271f.f429705a.clear();
            java.util.Iterator it = a17.f175597c.iterator();
            long j27 = 0;
            long j28 = 0;
            while (it.hasNext()) {
                com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) it.next();
                java.util.Iterator it6 = it;
                int i17 = i1Var.f175617b;
                if (i17 == 2) {
                    j28 += j18;
                    ?? gVar = new uo4.g();
                    gVar.f429689f = i1Var.f175627l.f397506h;
                    qc0.d1 b17 = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a.b(i1Var.f175616a);
                    if (b17 != null) {
                        gVar.f429688e = b17.f361367e;
                        gVar.f429687d = b17.f361365c;
                        gVar.f429690g = b17.f361372j;
                        gVar.f429691h = b17.f361370h;
                    }
                    eVar = gVar;
                } else if (i17 == 1) {
                    j27++;
                    eVar = new uo4.e();
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    eVar.f429684a = i1Var.f175617b;
                }
                if (eVar != null && (arrayList4 = eVar.f429685b) != null) {
                    arrayList4.add(java.lang.Integer.valueOf(i1Var.f175621f));
                }
                if (eVar != null && (arrayList3 = eVar.f429685b) != null) {
                    arrayList3.add(java.lang.Integer.valueOf(i1Var.f175622g));
                }
                if (eVar == null || (arrayList2 = eVar.f429686c) == null) {
                    j17 = j27;
                } else {
                    j17 = j27;
                    arrayList2.add(java.lang.Long.valueOf(i1Var.f175627l.f397502d));
                }
                if (eVar != null && (arrayList = eVar.f429686c) != null) {
                    arrayList.add(java.lang.Long.valueOf(i1Var.f175627l.f397503e));
                }
                if (eVar != null) {
                    eVar2.f347271f.f429705a.add(eVar);
                }
                it = it6;
                j27 = j17;
                j18 = 1;
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct2 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) eVar2.f347291d;
            if (multiMediaEditResultStruct2 != null) {
                multiMediaEditResultStruct2.f59337r = 1;
            }
            if (multiMediaEditResultStruct2 != null) {
                multiMediaEditResultStruct2.f59325f = j28;
            }
            if (multiMediaEditResultStruct2 != null) {
                multiMediaEditResultStruct2.f59326g = j27;
            }
            if (multiMediaEditResultStruct2 != null) {
                multiMediaEditResultStruct2.f59332m = a17.f175603i ? 1L : 0L;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it7 = vVar.f397584l.iterator();
            while (it7.hasNext()) {
                rm5.j jVar2 = (rm5.j) it7.next();
                if (jVar2.f397500b == 2) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(dq4.c.f242369a.b(jVar2.f397499a));
                    sb7.append('#');
                    sb6.append(sb7.toString());
                }
            }
            multiMediaEditResultStruct.f59336q = multiMediaEditResultStruct.b("VideoGOPStr", sb6.toString(), true);
        }
        yo4.p pVar = (yo4.p) this.f347268d.f347270e.j(yo4.p.class);
        if (pVar != null && (audioCacheInfo = pVar.f464287r) != null) {
            op4.e eVar3 = this.f347268d;
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct3 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) eVar3.f347291d;
            if (multiMediaEditResultStruct3 != null) {
                multiMediaEditResultStruct3.f59340u = audioCacheInfo.f155719p;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = audioCacheInfo.f155728y;
            if (finderObject != null) {
                java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(finderObject.getId());
                com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct4 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) eVar3.f347291d;
                if (multiMediaEditResultStruct4 != null) {
                    multiMediaEditResultStruct4.f59339t = multiMediaEditResultStruct4.b("MusicFeedid", r07, true);
                }
            } else if (multiMediaEditResultStruct3 != null) {
                multiMediaEditResultStruct3.f59338s = audioCacheInfo.f155711e;
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct5 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) this.f347268d.f347291d;
        if (multiMediaEditResultStruct5 != null) {
            multiMediaEditResultStruct5.f59333n = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        op4.e eVar4 = this.f347268d;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct6 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) eVar4.f347291d;
        if (multiMediaEditResultStruct6 != null) {
            multiMediaEditResultStruct6.f59330k = j19;
        }
        if (E != null) {
            eVar4.f347271f.f429706b.clear();
            for (zu3.a aVar : E) {
                int ordinal = aVar.f475758a.ordinal();
                java.lang.String str3 = "";
                if (ordinal == 0) {
                    cVar = new uo4.c();
                    zu3.a0 a0Var = aVar instanceof zu3.a0 ? (zu3.a0) aVar : null;
                    if (a0Var != null && (str = a0Var.f475768k) != null) {
                        str3 = str;
                    }
                    com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str3);
                    java.lang.String str4 = a18.f213279f;
                    if (str4 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                        if (!str4.equals(l17)) {
                            a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                        }
                    }
                    java.lang.String str5 = a18.f213279f;
                    int lastIndexOf = str5.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str5 = str5.substring(lastIndexOf + 1);
                    }
                    kotlin.jvm.internal.o.f(str5, "getName(...)");
                    cVar.f429680c = str5;
                } else if (ordinal != 5) {
                    cVar = new uo4.b();
                } else {
                    cVar = new uo4.c();
                    zu3.d dVar = aVar instanceof zu3.d ? (zu3.d) aVar : null;
                    if (dVar != null && (str2 = dVar.f475795j) != null) {
                        str3 = str2;
                    }
                    com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(str3);
                    java.lang.String str6 = a19.f213279f;
                    if (str6 != null) {
                        java.lang.String l18 = com.tencent.mm.vfs.e8.l(str6, false, false);
                        if (!str6.equals(l18)) {
                            a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l18, a19.f213280g, a19.f213281h);
                        }
                    }
                    java.lang.String str7 = a19.f213279f;
                    int lastIndexOf2 = str7.lastIndexOf("/");
                    if (lastIndexOf2 >= 0) {
                        str7 = str7.substring(lastIndexOf2 + 1);
                    }
                    kotlin.jvm.internal.o.f(str7, "getName(...)");
                    cVar.f429680c = str7;
                }
                cVar.f429678a = aVar.f475758a.f475805d;
                java.util.ArrayList arrayList5 = cVar.f429679b;
                bv3.d dVar2 = aVar.f475760c;
                arrayList5.add(java.lang.Long.valueOf(dVar2.c()));
                arrayList5.add(java.lang.Long.valueOf(dVar2.b()));
                eVar4.f347271f.f429706b.add(cVar);
            }
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct7 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) eVar4.f347291d;
            if (multiMediaEditResultStruct7 != null) {
                multiMediaEditResultStruct7.f59327h = E.size();
            }
        } else if (multiMediaEditResultStruct6 != null) {
            multiMediaEditResultStruct6.f59327h = 0L;
        }
        yo4.p pVar2 = (yo4.p) this.f347268d.f347270e.j(yo4.p.class);
        long j29 = (pVar2 != null ? pVar2.f464287r : null) != null ? 1L : 0L;
        op4.e eVar5 = this.f347268d;
        com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct multiMediaEditResultStruct8 = (com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct) eVar5.f347291d;
        if (multiMediaEditResultStruct8 != null) {
            multiMediaEditResultStruct8.f59328i = j29;
        }
        if (multiMediaEditResultStruct8 != null) {
            multiMediaEditResultStruct8.f59329j = this.f347269e;
        }
        eVar5.h();
        op4.e eVar6 = this.f347268d;
        eVar6.f347291d = null;
        eVar6.f347291d = new com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditResultStruct();
        eVar6.f347271f = new uo4.h();
        return jz5.f0.f302826a;
    }
}
