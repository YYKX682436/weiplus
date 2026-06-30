package hc2;

/* loaded from: classes.dex */
public abstract class y0 {
    public static final java.lang.String a(long j17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (j17 < 3600000) {
            return "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (currentTimeMillis < 600000) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f492059f34);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (600000 <= currentTimeMillis && currentTimeMillis < 3600000) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f492060f35, java.lang.Long.valueOf(currentTimeMillis / 60000));
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (3600000 <= currentTimeMillis && currentTimeMillis < 86400000) {
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f492058f33, java.lang.Long.valueOf(currentTimeMillis / 3600000));
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            return string3;
        }
        if (86400000 <= currentTimeMillis && currentTimeMillis < 604800000) {
            long j18 = currentTimeMillis / 86400000;
            java.lang.String string4 = j18 == 1 ? context.getString(com.tencent.mm.R.string.f38) : context.getString(com.tencent.mm.R.string.f492057f32, java.lang.Long.valueOf(j18));
            kotlin.jvm.internal.o.d(string4);
            return string4;
        }
        if (604800000 <= currentTimeMillis && currentTimeMillis < 2592000000L) {
            java.lang.String string5 = context.getString(com.tencent.mm.R.string.f37, java.lang.Long.valueOf(currentTimeMillis / 604800000));
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            return string5;
        }
        if (!(2592000000L <= currentTimeMillis && currentTimeMillis < 31536000000L)) {
            return "";
        }
        java.lang.String string6 = context.getString(com.tencent.mm.R.string.f492061f36, java.lang.Long.valueOf(currentTimeMillis / 2592000000L));
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        return string6;
    }
}
