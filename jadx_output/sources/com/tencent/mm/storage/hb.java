package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public abstract class hb {
    public static final java.lang.String a(java.lang.String content, java.lang.String encryptUsername, java.lang.String tag) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(encryptUsername, "encryptUsername");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.String str = com.tencent.mm.storage.e9.f(content).f193859a;
        boolean z17 = false;
        if (!(str == null || str.length() == 0) && !kotlin.jvm.internal.o.b(str, encryptUsername)) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w(tag, "parseAndValidateTalker: invalid fromUsername, will not save talker. fromUsername=" + str + ", encryptUsername=" + encryptUsername);
        }
        return (!z17 || str == null) ? "" : str;
    }
}
