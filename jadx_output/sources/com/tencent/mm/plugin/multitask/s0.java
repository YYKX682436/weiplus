package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.multitask.s0 f150501a = new com.tencent.mm.plugin.multitask.s0();

    public static final java.lang.String b(java.lang.String str, int i17) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s#%d", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Integer.valueOf(i17)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public static final java.lang.String c(java.lang.String str) {
        java.lang.String format = java.lang.String.format("%s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(format.getBytes());
        kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
        return b17;
    }

    public static final java.lang.String d(java.lang.String str) {
        java.lang.String format = java.lang.String.format("%s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(format.getBytes());
        kotlin.jvm.internal.o.f(b17, "getMD5String(...)");
        return b17;
    }

    public final java.lang.String a(java.lang.String path, o11.g imageLoaderOptions) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(imageLoaderOptions, "imageLoaderOptions");
        if (imageLoaderOptions.f342124v) {
            path = path + "round" + imageLoaderOptions.f342125w;
        }
        java.lang.String str = imageLoaderOptions.f342122t;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            path = path + str;
        }
        return path + "size" + imageLoaderOptions.f342111i + imageLoaderOptions.f342112j;
    }

    public final int e(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        return g(multiTaskInfo) ? com.tencent.mm.R.raw.icons_multi_task_star_line_filled : com.tencent.mm.R.raw.star_heavy;
    }

    public final java.lang.String f(android.content.Context context, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        if (h()) {
            java.lang.String string = g(multiTaskInfo) ? b3.l.getString(context, com.tencent.mm.R.string.oa7) : b3.l.getString(context, com.tencent.mm.R.string.c0x);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = b3.l.getString(context, com.tencent.mm.R.string.h0u);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }

    public final boolean g(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        if (!h() || multiTaskInfo == null) {
            return false;
        }
        return ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
    }

    public final boolean h() {
        return ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai();
    }
}
