package ol;

/* loaded from: classes13.dex */
public class f implements ll.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ol.h f346089a;

    public f(ol.h hVar) {
        this.f346089a = hVar;
    }

    public void a(com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent) {
        long c17;
        int i17 = audioPlayerEvent.f53990g.f6716a;
        if (!(i17 == 12 || i17 == 11 || i17 == 10 || i17 == 6)) {
            if (this.f346089a.f346107p.containsKey(audioPlayerEvent.f53990g.f6718c)) {
                ol.i iVar = (ol.i) this.f346089a.f346107p.get(audioPlayerEvent.f53990g.f6718c);
                if (iVar != null && iVar.a(java.lang.Integer.valueOf(i17))) {
                    int i18 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioMixPlayerImpl", "don't callback again", null);
                    return;
                }
                if (iVar != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    synchronized (iVar) {
                        java.lang.Object obj = iVar.f346118a;
                        iVar.f346118a = valueOf;
                        java.lang.String str = obj.toString() + " -> " + iVar.f346118a.toString();
                        int i19 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.i("StateRunner", str, null);
                    }
                    this.f346089a.f346107p.put(audioPlayerEvent.f53990g.f6718c, iVar);
                }
            } else {
                synchronized (this.f346089a.f346098g) {
                    this.f346089a.f346107p.put(audioPlayerEvent.f53990g.f6718c, new ol.i(java.lang.Integer.valueOf(i17)));
                }
            }
        }
        if (this.f346089a.f346101j == null) {
            return;
        }
        am.g0 g0Var = audioPlayerEvent.f53990g;
        java.lang.Object[] objArr = {g0Var.f6718c, g0Var.f6719d};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioMixPlayerImpl", "onEventChange audioId:%s, state:%s", objArr);
        if (i17 == 9) {
            ((dl3.p) this.f346089a.f346101j).getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 7) {
            dl3.i iVar2 = ((dl3.p) this.f346089a.f346101j).f235341a;
            if (!iVar2.f235318k.contains(audioPlayerEvent.f53990g.f6718c)) {
                audioPlayerEvent.b(android.os.Looper.getMainLooper());
            }
            iVar2.f235318k.remove(audioPlayerEvent.f53990g.f6718c);
            return;
        }
        if (i17 == 0) {
            ((dl3.p) this.f346089a.f346101j).getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 1) {
            ((dl3.p) this.f346089a.f346101j).getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 2) {
            ((dl3.p) this.f346089a.f346101j).getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 3) {
            this.f346089a.f346106o.put(audioPlayerEvent.f53990g.f6718c, java.lang.Boolean.FALSE);
            dl3.p pVar = (dl3.p) this.f346089a.f346101j;
            pVar.getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            dl3.i.b(pVar.f235341a, audioPlayerEvent.f53990g.f6718c);
            return;
        }
        if (i17 == 5) {
            this.f346089a.f346106o.put(audioPlayerEvent.f53990g.f6718c, java.lang.Boolean.FALSE);
            ((dl3.p) this.f346089a.f346101j).getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 4) {
            this.f346089a.f346106o.put(audioPlayerEvent.f53990g.f6718c, java.lang.Boolean.FALSE);
            dl3.p pVar2 = (dl3.p) this.f346089a.f346101j;
            pVar2.getClass();
            int i28 = audioPlayerEvent.f53990g.f6721f;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "onError errCode:%d", java.lang.Integer.valueOf(i28));
            if (i28 == 709 || i28 == 702 || i28 == 703 || i28 == 705 || i28 == 706) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "decode mix cache errors, don't callback to JS");
            } else {
                audioPlayerEvent.b(android.os.Looper.getMainLooper());
            }
            dl3.i iVar3 = pVar2.f235341a;
            el3.i iVar4 = iVar3.f235328u;
            am.g0 g0Var2 = audioPlayerEvent.f53990g;
            if (iVar4 != null) {
                n01.b bVar = (n01.b) iVar3.f235316i.get(g0Var2.f6718c);
                if (bVar == null) {
                    return;
                }
                el3.i iVar5 = iVar3.f235328u;
                int i29 = g0Var2.f6721f;
                ((el3.h) iVar5).getClass();
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(na1.e.CTRL_INDEX);
                iDKey.SetKey(91);
                iDKey.SetValue(1L);
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(na1.e.CTRL_INDEX);
                iDKey2.SetKey(el3.a.a(i29));
                iDKey2.SetValue(1L);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(iDKey);
                arrayList.add(iDKey2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
                el3.a.b(arrayList);
                if (!iVar3.B.e(bVar.f333838c)) {
                    if (iVar3.A.containsKey(bVar.f333838c)) {
                        iVar3.A.put(bVar.f333838c, java.lang.Integer.valueOf(((java.lang.Integer) iVar3.A.get(bVar.f333838c)).intValue() + 1));
                    } else {
                        iVar3.A.put(bVar.f333838c, 1);
                    }
                }
            }
            dl3.i.b(iVar3, g0Var2.f6718c);
            return;
        }
        if (i17 == 10) {
            ((dl3.p) this.f346089a.f346101j).getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 == 6) {
            ((dl3.p) this.f346089a.f346101j).getClass();
            audioPlayerEvent.b(android.os.Looper.getMainLooper());
            return;
        }
        if (i17 != 11) {
            if (i17 == 12) {
                this.f346089a.f346101j.getClass();
                return;
            } else {
                if (i17 == 13) {
                    dl3.p pVar3 = (dl3.p) this.f346089a.f346101j;
                    pVar3.getClass();
                    dl3.i.b(pVar3.f235341a, audioPlayerEvent.f53990g.f6718c);
                    return;
                }
                return;
            }
        }
        dl3.p pVar4 = (dl3.p) this.f346089a.f346101j;
        dl3.i iVar6 = pVar4.f235341a;
        if (iVar6.f235328u != null) {
            n01.b bVar2 = (n01.b) iVar6.f235316i.get(audioPlayerEvent.f53990g.f6718c);
            if (bVar2 != null) {
                long j17 = bVar2.f333852q;
                if (j17 > 1000000) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onRealPlay: %s, invokeCallTime:%d", bVar2.f333836a, java.lang.Long.valueOf(j17));
                }
                java.lang.String str2 = audioPlayerEvent.f53990g.f6723h;
                if (android.text.TextUtils.isEmpty(str2)) {
                    str2 = bVar2.f333837b;
                }
                java.lang.String str3 = str2;
                el3.i iVar7 = pVar4.f235341a.f235328u;
                java.lang.String str4 = bVar2.f333836a;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - bVar2.f333850o;
                long j18 = bVar2.f333851p;
                long j19 = bVar2.f333852q;
                java.lang.String str5 = bVar2.f333838c;
                long d17 = pVar4.f235341a.B.f346079a.d(bVar2.f333836a);
                long j27 = bVar2.f333859x;
                ol.c cVar = pVar4.f235341a.B;
                java.lang.String str6 = bVar2.f333838c;
                cVar.getClass();
                il.j a17 = il.j.a();
                synchronized (a17.f292005c) {
                    if (a17.f292003a.contains(str6)) {
                        hl.d dVar = (hl.d) a17.f292004b.get(str6);
                        if (dVar != null && dVar.f282019b) {
                            c17 = dVar.c();
                        }
                    }
                    c17 = 0;
                }
                ((el3.h) iVar7).E(str4, str3, currentTimeMillis, j18, j19, false, str5, d17, j27, c17);
                if (pVar4.f235341a.A.containsKey(bVar2.f333838c)) {
                    pVar4.f235341a.A.remove(bVar2.f333838c);
                }
            }
        }
        audioPlayerEvent.b(android.os.Looper.getMainLooper());
    }
}
