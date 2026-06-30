package hc2;

/* loaded from: classes2.dex */
public abstract class c {
    public static final void a(java.lang.Exception exc, java.lang.String extraMsg) {
        boolean z17;
        kotlin.jvm.internal.o.g(exc, "<this>");
        kotlin.jvm.internal.o.g(extraMsg, "extraMsg");
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            throw exc;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(extraMsg);
        sb6.append(' ');
        sb6.append(exc.getMessage());
        sb6.append(' ');
        java.lang.Throwable cause = exc.getCause();
        sb6.append(cause != null ? cause.getMessage() : null);
        com.tencent.mm.sdk.platformtools.Log.c("FinderExt", sb6.toString(), new java.lang.Object[0]);
        com.tencent.mars.xlog.Log.printErrStackTrace("FinderExt", exc, "", new java.lang.Object[0]);
    }
}
