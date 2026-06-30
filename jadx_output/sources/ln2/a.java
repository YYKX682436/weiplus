package ln2;

/* loaded from: classes3.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public static java.lang.String b(ln2.a aVar, android.content.Context context, int i17, java.lang.String targetCount, java.lang.String performanceName, java.lang.String defaultString, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            defaultString = "";
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(targetCount, "targetCount");
        kotlin.jvm.internal.o.g(performanceName, "performanceName");
        kotlin.jvm.internal.o.g(defaultString, "defaultString");
        if (i17 == 1) {
            defaultString = context.getString(com.tencent.mm.R.string.osq, targetCount);
        } else if (i17 == 2) {
            defaultString = context.getString(com.tencent.mm.R.string.osi, targetCount);
        } else if (i17 == 3) {
            defaultString = context.getString(com.tencent.mm.R.string.osy, targetCount);
        } else {
            com.tencent.mars.xlog.Log.w("InteractionWishDataHelper", "getInteractionTypeDescTextWithPerformanceName: unknown interactionType=" + i17 + ", using defaultString=\"" + defaultString + '\"');
        }
        kotlin.jvm.internal.o.d(defaultString);
        if (!(performanceName.length() > 0)) {
            return defaultString;
        }
        return defaultString + context.getString(com.tencent.mm.R.string.osp, performanceName);
    }

    public final boolean a(r45.c04 data) {
        kotlin.jvm.internal.o.g(data, "data");
        return data.getLong(1) > 0 && data.getLong(0) > ((long) 0) && data.getLong(0) <= ((long) 3);
    }

    public final int c(int i17, int i18) {
        if (i17 == 1) {
            return com.tencent.mm.R.raw.finder_live_thumb_filled;
        }
        if (i17 == 2) {
            return com.tencent.mm.R.raw.bubble_filled;
        }
        if (i17 == 3) {
            return com.tencent.mm.R.raw.share_filled;
        }
        com.tencent.mars.xlog.Log.w("InteractionWishDataHelper", "getInteractionTypeIconResId: unknown interactionType=" + i17 + ", using defaultResId=" + i18);
        return i18;
    }
}
