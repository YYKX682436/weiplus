package xx3;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a */
    public static final xx3.h f458024a = new xx3.h();

    public static final boolean a() {
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        return mx3.i0.d(r17) != null;
    }

    public static final java.lang.Object b(long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new xx3.b(j17, str, null), continuation);
    }

    public final java.lang.Object c(int i17, int i18, long j17, java.lang.String str, int i19, int i27, java.lang.String str2, int i28, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSettingHelper", "saveExclusiveRingtone: useRingtone=" + i18 + ", objectId=" + j17 + ", nonceId=" + str + ", start=" + i19 + ", end=" + i27 + ", username=" + str2 + ",musicUrl =" + i28);
        return f(i17, i18, j17, str, i19, i27, str2, i28, 0, str3, continuation);
    }

    public final java.lang.Object e(int i17, int i18, int i19, long j17, java.lang.String str, int i27, int i28, int i29, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneSettingHelper", "saveNormalPersonalityRingtone: useRingtone=" + i18 + ", objectId=" + j17 + ", nonceId=" + str + ", start=" + i27 + ", end=" + i28 + ",musicUrl=" + i19 + ", extBusinessScene:" + i29);
        return f(i17, i18, j17, str, i27, i28, null, i19, i29, str2, continuation);
    }

    public final java.lang.Object f(int i17, int i18, long j17, java.lang.String str, int i19, int i27, java.lang.String str2, int i28, int i29, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new xx3.g(i17, i18, j17, str, i19, i27, str2, i28, i29, str3, null), continuation);
    }
}
