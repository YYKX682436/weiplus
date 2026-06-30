package pa3;

/* loaded from: classes8.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String bizName, java.lang.String appId, java.lang.String page, java.lang.String query, java.lang.String str) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(query, "query");
        if (str != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                query = str;
            }
        }
        return "[" + bizName + "]<star>-[" + appId + '-' + page + "]-{" + query + '}';
    }
}
