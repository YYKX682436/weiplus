package zk;

/* loaded from: classes8.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= str.length()) {
                return true;
            }
            char charAt = str.charAt(i17);
            if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '_' && charAt != '-') {
                z17 = false;
            }
            if (!z17) {
                return false;
            }
            i17++;
        }
    }

    public final java.lang.String b() {
        try {
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            java.lang.String o17 = lp0.b.h0("secure_chat_records_provider").o();
            kotlin.jvm.internal.o.d(o17);
            if (!r26.n0.N(o17)) {
                return o17;
            }
            return null;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareableChatRecordsProvider", "[-] getFilePathChatRecords: fileDirectoryPath is null");
            return null;
        }
    }

    public final java.lang.String c(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (!a(sessionId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareableChatRecordsProvider", "[-] getFilePathChatRecords: sessionId is malicious, ".concat(sessionId));
            return null;
        }
        java.lang.String b17 = b();
        java.lang.String concat = b17 != null ? b17.concat("/chat_records") : null;
        if (concat == null) {
            return null;
        }
        return concat + '_' + sessionId;
    }

    public final android.net.Uri d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.net.Uri parse = android.net.Uri.parse("content://" + context.getPackageName() + ".app.provider.ShareableChatRecords/");
        if (parse != null) {
            return parse;
        }
        android.net.Uri EMPTY = android.net.Uri.EMPTY;
        kotlin.jvm.internal.o.f(EMPTY, "EMPTY");
        return EMPTY;
    }
}
