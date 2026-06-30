package in5;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final in5.d f293019a = new in5.d();

    public final java.lang.String a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.nwa);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num == null) {
            return "";
        }
        try {
            java.lang.String resourceEntryName = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceEntryName(num.intValue());
            kotlin.jvm.internal.o.d(resourceEntryName);
            return resourceEntryName;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.vc_);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        if (num == null) {
            return "";
        }
        try {
            java.lang.String resourceEntryName = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getResourceEntryName(num.intValue());
            kotlin.jvm.internal.o.d(resourceEntryName);
            return resourceEntryName;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
