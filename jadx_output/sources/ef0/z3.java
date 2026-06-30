package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class z3 extends i95.w implements qk.d9 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f252377g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f252378h;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f252379d = jz5.h.b(ef0.y3.f252368d);

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f252380e = new androidx.lifecycle.j0();

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f252381f = new androidx.lifecycle.j0();

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002e. Please report as an issue. */
    public static final void wi(ef0.z3 z3Var, com.tencent.mm.plugin.finder.extension.reddot.a aVar) {
        z3Var.getClass();
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingRedDotFeatureService", "handleTingFindEntryRedDot result is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotFeatureService", "handleTingFindEntryRedDot path: " + aVar.f105331e + ", result: " + aVar);
        java.lang.String str = aVar.f105331e;
        switch (str.hashCode()) {
            case -1947195044:
                if (!str.equals("Listen.Music.Bubble")) {
                    return;
                }
                z3Var.f252380e.postValue(aVar);
                return;
            case -745530627:
                if (!str.equals("Listen.Entrance")) {
                    return;
                }
                z3Var.f252380e.postValue(aVar);
                return;
            case -215995941:
                if (!str.equals("Listen.NonMusic.Bubble")) {
                    return;
                }
                z3Var.f252380e.postValue(aVar);
                return;
            case 1206099673:
                if (!str.equals("Listen.CircleX.Bubble")) {
                    return;
                }
                z3Var.f252380e.postValue(aVar);
                return;
            case 1853252761:
                if (!str.equals("Listen.MentionEntrance")) {
                    return;
                }
                z3Var.f252380e.postValue(aVar);
                return;
            default:
                return;
        }
    }

    public java.lang.String Ai(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(path);
        if (L0 == null) {
            return "";
        }
        r45.f03 I0 = L0.I0(path);
        r45.vs2 field_ctrInfo = L0.field_ctrInfo;
        kotlin.jvm.internal.o.f(field_ctrInfo, "field_ctrInfo");
        org.json.JSONObject a17 = ri.l0.a(em4.c.a(field_ctrInfo, I0, null));
        java.lang.String jSONObject = a17 != null ? a17.toString() : null;
        return jSONObject == null ? "" : jSONObject;
    }

    public boolean Bi(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(str, "Listen.Entrance")) {
            return f252377g;
        }
        if (kotlin.jvm.internal.o.b(str, "Listen.MentionEntrance")) {
            return f252378h;
        }
        return false;
    }

    public void Di(r45.vs2 vs2Var, r45.f03 f03Var, java.lang.Integer num) {
        em4.c cVar = em4.c.f255213a;
        if (vs2Var == null || f03Var == null) {
            return;
        }
        java.lang.String str = f03Var.f373892i;
        java.lang.String str2 = vs2Var.f388503x;
        if (num != null) {
            num.intValue();
        }
        java.util.Map map = em4.c.f255214b;
        java.lang.String str3 = str != null ? (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(str) : null;
        if (str3 != null && kotlin.jvm.internal.o.b(str3, vs2Var.f388503x)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingRedDotReporter", "reportTingDiscoverRedDotExpose, duplicated, path: " + str + ", uuid: " + str2);
            return;
        }
        if (str != null && str2 != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, str2);
        }
        java.util.Map b17 = em4.c.b(vs2Var, f03Var, null, 4, null);
        if (num != null) {
            b17.put("showtitle_completetype", java.lang.Integer.valueOf(num.intValue()));
        }
        em4.c.d("view_exp", b17);
    }

    public void Ni(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "Listen.Entrance")) {
            if (f252377g != z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotFeatureService", "setRedDotShowingAtPath redDotPath: " + str + ", isShowing: " + z17);
                f252377g = z17;
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.o.b(str, "Listen.MentionEntrance") || f252378h == z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotFeatureService", "setRedDotShowingAtPath redDotPath: " + str + ", isShowing: " + z17);
        f252378h = z17;
    }

    public void Ri(boolean z17) {
        boolean z18 = em4.b.f255212a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotManager", "setShowAudioRedDot show: " + z17);
        em4.b.f255212a = z17;
        gm4.a.f273557a.g("key_show_audio_red_dot", z17);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotFeatureService", "onAccountInitialized");
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi()) {
            pm0.v.X(new ef0.v3(this));
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0().add(new ef0.w3(this));
        }
    }
}
