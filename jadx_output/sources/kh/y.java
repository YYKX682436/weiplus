package kh;

/* loaded from: classes5.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final kh.y f307947d = new kh.y();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f307948e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f307949f;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f307948e = jz5.h.a(iVar, kh.v.f307932d);
        f307949f = jz5.h.a(iVar, kh.u.f307923d);
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2) {
        try {
            if (r26.n0.D(str, str2, false, 2, null)) {
                java.lang.String substring = str.substring(r26.n0.L(str, str2, 0, false, 6, null) + str2.length());
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                if (r26.n0.B(substring, " ", false)) {
                    java.lang.String substring2 = substring.substring(0, r26.n0.L(substring, " ", 0, false, 6, null));
                    kotlin.jvm.internal.o.f(substring2, "substring(...)");
                    return substring2;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final boolean b() {
        if (!((java.lang.Boolean) f307948e.getValue()).booleanValue()) {
            return false;
        }
        try {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((android.media.AudioManager) systemService).isMusicActive();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.battery.AudioPower", "isMusicActive err: " + e17.getMessage());
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        jz5.g gVar = f307949f;
        for (android.media.AudioPlaybackConfiguration audioPlaybackConfiguration : (java.util.List) gVar.getValue()) {
            kh.y yVar = f307947d;
            try {
                try {
                    java.lang.reflect.Field declaredField = audioPlaybackConfiguration.getClass().getDeclaredField("mPlayerIId");
                    declaredField.setAccessible(true);
                    java.lang.Object obj2 = declaredField.get(audioPlaybackConfiguration);
                    kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    i17 = ((java.lang.Integer) obj2).intValue();
                } catch (java.lang.Throwable unused) {
                    java.lang.String audioPlaybackConfiguration2 = audioPlaybackConfiguration.toString();
                    kotlin.jvm.internal.o.f(audioPlaybackConfiguration2, "toString(...)");
                    i17 = ((java.lang.Number) yVar.a(audioPlaybackConfiguration2, "piid:")).intValue();
                }
            } catch (java.lang.Throwable unused2) {
                i17 = -1;
            }
            arrayList.add(java.lang.Integer.valueOf(i17));
            try {
                try {
                    java.lang.reflect.Field declaredField2 = audioPlaybackConfiguration.getClass().getDeclaredField("mPlayerState");
                    declaredField2.setAccessible(true);
                    obj = declaredField2.get(audioPlaybackConfiguration);
                } catch (java.lang.Throwable unused3) {
                }
            } catch (java.lang.Throwable unused4) {
                java.lang.String audioPlaybackConfiguration3 = audioPlaybackConfiguration.toString();
                kotlin.jvm.internal.o.f(audioPlaybackConfiguration3, "toString(...)");
                str = (java.lang.String) yVar.a(audioPlaybackConfiguration3, "state:");
            }
            if (obj != null) {
                str = obj.toString();
                arrayList2.add(str);
            }
            str = null;
            arrayList2.add(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.AudioPower", "onPlaybackConfigChanged: " + ((java.util.List) gVar.getValue()).size() + ", isAudioActive=" + b() + ", playerIds=" + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null) + ", playerStates=" + kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        ((java.util.List) gVar.getValue()).clear();
    }
}
