package x40;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public pi0.l1 f451766a;

    /* renamed from: b, reason: collision with root package name */
    public final jm4.n2 f451767b;

    public h() {
        jm4.n2 n2Var;
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
        jm4.u2 a17 = jm4.w2.f300435d.a();
        if (a17 != null) {
            n2Var = ((jm4.w2) a17).a(bw5.eq0.FinderAudio);
        } else {
            n2Var = null;
        }
        this.f451767b = n2Var;
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x40.h r17, java.lang.String r18, java.util.Map r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x40.h.a(x40.h, java.lang.String, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object b(x40.h hVar, pi0.l1 l1Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        java.lang.Object w17;
        hVar.getClass();
        boolean z17 = com.tencent.mm.plugin.finder_audio.FinderAudioViewActivity.f136975u;
        jz5.f0 f0Var = jz5.f0.f302826a;
        return (z17 || (w17 = l1Var.w(context, new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null), com.tencent.mm.plugin.finder_audio.FinderAudioViewActivity.class, null, null, 603979776, continuation)) != pz5.a.f359186d) ? f0Var : w17;
    }

    public final java.lang.Object c(pi0.l1 l1Var, java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderAudioRoute", "pushWithDefaultParams, routeName: " + str + ", params: " + map);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (map == null) {
            map = kz5.q0.f314001d;
        }
        linkedHashMap.putAll(map);
        java.lang.Object o17 = l1Var.o(str, linkedHashMap, continuation);
        return o17 == pz5.a.f359186d ? o17 : jz5.f0.f302826a;
    }
}
