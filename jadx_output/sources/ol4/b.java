package ol4;

/* loaded from: classes14.dex */
public final class b implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346150d;

    public b(ol4.q qVar) {
        this.f346150d = qVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public final void onStateChange(int i17, int i18) {
        boolean z17;
        java.lang.String str;
        boolean z18;
        java.lang.String str2;
        ol4.q qVar = this.f346150d;
        boolean z19 = qVar.f346195q;
        java.lang.String str3 = qVar.f346197s;
        if (z19 && i18 < 5) {
            com.tencent.mars.xlog.Log.i(str3, "OnPlayerStateChange,preState:" + i17 + ", curState:" + i18 + ", hasDownloadComplete skip.");
            return;
        }
        int i19 = 4;
        if (i18 == 4) {
            i19 = 2;
        } else if (i18 == 5) {
            i19 = i17 == 6 ? 6 : 3;
        } else if (i18 == 6) {
            i19 = 5;
        } else if (i18 != 7) {
            i19 = (i18 == 9 && !qVar.f346188j) ? 11 : -1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
        bw5.lp0 lp0Var = qVar.f346183e;
        if (lp0Var == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var.c().f27457i);
        sb6.append(", isPrepared: ");
        bw5.lp0 lp0Var2 = qVar.f346183e;
        if (lp0Var2 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var2.c().A);
        sb6.append(", title: ");
        bw5.lp0 lp0Var3 = qVar.f346183e;
        if (lp0Var3 == null) {
            kotlin.jvm.internal.o.o("mPlayingItem");
            throw null;
        }
        sb6.append(lp0Var3.d().getTitle());
        com.tencent.mars.xlog.Log.i(str3, "OnPlayerStateChange, " + sb6.toString() + ", preState:" + i17 + ", curState:" + i18 + ", event:" + i19 + ", callback " + qVar.f346182d);
        if (i19 > 0) {
            if (2 == i19) {
                pl4.k kVar = qVar.f346199u;
                long j17 = kVar != null ? kVar.f356723g : 0L;
                boolean z27 = (kVar == null || (str2 = kVar.f356719c) == null || !(r26.n0.N(str2) ^ true)) ? false : true;
                pl4.k kVar2 = qVar.f346199u;
                boolean z28 = kVar2 != null ? kVar2.f356724h : false;
                if (!z28) {
                    if (kVar2 != null ? kVar2.f356726j : false) {
                        z18 = true;
                        kk4.c cVar = qVar.f346180b;
                        int propertyLong = (int) ((kk4.f0) cVar).getPropertyLong(103);
                        int propertyLong2 = (int) ((kk4.f0) cVar).getPropertyLong(105);
                        boolean z29 = z27;
                        int propertyLong3 = (int) ((kk4.f0) cVar).getPropertyLong(101);
                        boolean z37 = !qVar.s() && ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("decryptTotalTimeBeforePlay", j17);
                        jSONObject.put("isEncrypt", z29);
                        jSONObject.put("hitCache", z28);
                        jSONObject.put("downloadCompleteOnReady", z18);
                        jSONObject.put("channelNum", propertyLong);
                        jSONObject.put("sampleRate", propertyLong2);
                        jSONObject.put("bitRate", propertyLong3);
                        jSONObject.put("isEnableHearingAid", z37);
                        java.lang.String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                        str = r26.i0.u(jSONObject2, ',', ';', false, 4, null);
                    }
                }
                z18 = false;
                kk4.c cVar2 = qVar.f346180b;
                int propertyLong4 = (int) ((kk4.f0) cVar2).getPropertyLong(103);
                int propertyLong22 = (int) ((kk4.f0) cVar2).getPropertyLong(105);
                boolean z292 = z27;
                int propertyLong32 = (int) ((kk4.f0) cVar2).getPropertyLong(101);
                if (qVar.s()) {
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("decryptTotalTimeBeforePlay", j17);
                jSONObject3.put("isEncrypt", z292);
                jSONObject3.put("hitCache", z28);
                jSONObject3.put("downloadCompleteOnReady", z18);
                jSONObject3.put("channelNum", propertyLong4);
                jSONObject3.put("sampleRate", propertyLong22);
                jSONObject3.put("bitRate", propertyLong32);
                jSONObject3.put("isEnableHearingAid", z37);
                java.lang.String jSONObject22 = jSONObject3.toString();
                kotlin.jvm.internal.o.f(jSONObject22, "toString(...)");
                str = r26.i0.u(jSONObject22, ',', ';', false, 4, null);
            } else {
                str = null;
            }
            ll4.a aVar = qVar.f346182d;
            if (aVar != null) {
                ((kl4.n) aVar).b(i19, str);
            }
            if (i18 == 9) {
                z17 = false;
                qVar.r(false);
                if (!qVar.f346196r && i17 == 6 && i18 == 5) {
                    qVar.f346196r = z17;
                    ll4.a aVar2 = qVar.f346182d;
                    if (aVar2 != null) {
                        ll4.a.a(aVar2, 10, null, 2, null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z17 = false;
        if (!qVar.f346196r) {
        }
    }
}
