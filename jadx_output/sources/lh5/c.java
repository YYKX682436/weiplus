package lh5;

/* loaded from: classes7.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setEasterEggAnimationStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        lc3.a0 h17;
        kotlin.jvm.internal.o.g(data, "data");
        yz5.l s17 = s();
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        kh5.h hVar = (kh5.h) eVar;
        int optInt = data.optInt("status");
        org.json.JSONObject jSONObject = data.getJSONObject("result");
        java.lang.String optString = jSONObject.optString("eggKey");
        java.lang.String optString2 = jSONObject.optString("eggId");
        long optLong = jSONObject.optLong("timeout");
        if (optLong <= 0) {
            optLong = 20000;
        }
        if (optInt > 0) {
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() == 0)) {
                kotlin.jvm.internal.o.d(optString2);
                if (!(optString2.length() == 0)) {
                    if (kotlin.jvm.internal.o.b(optString2, hVar.f308077q.f299868b)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "[ME]: onMagicEggStatusChange: " + optInt + ' ' + optString2);
                        if (optInt == 1) {
                            hVar.f308075o.postDelayed(hVar.f308081u, optLong);
                            kh5.a aVar = hVar.f308076p;
                            if (aVar != null) {
                                jh5.b bVar = hVar.f308077q;
                                com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "onStart: %s, %s", bVar.f299868b, bVar.f299867a);
                                com.tencent.mm.ui.chatting.n9 n9Var = ((com.tencent.mm.ui.chatting.o9) aVar).f202069a;
                                n9Var.f202036s = true;
                                n9Var.f202027j = false;
                                com.tencent.mm.ui.chatting.ChattingAnimFrame chattingAnimFrame = n9Var.f202019b;
                                if (chattingAnimFrame != null) {
                                    chattingAnimFrame.e();
                                }
                            }
                        } else if (optInt == 2) {
                            kh5.a aVar2 = hVar.f308076p;
                            if (aVar2 != null) {
                                jh5.b bVar2 = hVar.f308077q;
                                com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "onClick: %s, %s", bVar2.f299868b, bVar2.f299867a);
                                b12.k.f17060a.b(4, b12.k.f17067h, "");
                                com.tencent.mm.ui.chatting.n9 n9Var2 = ((com.tencent.mm.ui.chatting.o9) aVar2).f202069a;
                                com.tencent.mm.ui.chatting.n9.a(n9Var2, n9Var2.f202034q, n9Var2.f202032o, n9Var2.f202018a, n9Var2.f202021d);
                            }
                        } else if (optInt != 3) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.MEChattingMgr", "[ME]: onMagicEggStatusChange: wrong status: " + optInt);
                        } else {
                            hVar.s1();
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MEChattingMgr", "[ME]: can't send status change because " + optString2 + " is not " + hVar.f308077q);
                    }
                    h17 = k();
                    s17.invoke(h17);
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MESetEasterEggStatus", "stevecai: set easter egg status error: " + optInt + ' ' + optString + ' ' + optString2 + ' ' + optLong);
        h17 = h(2, "");
        s17.invoke(h17);
    }
}
