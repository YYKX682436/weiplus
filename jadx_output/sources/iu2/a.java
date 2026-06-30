package iu2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final iu2.a f294983a = new iu2.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f294984b = new java.util.HashMap();

    public final java.lang.String a(jv2.a commentObj) {
        kotlin.jvm.internal.o.g(commentObj, "commentObj");
        commentObj.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(commentObj.field_feedId);
        sb6.append('_');
        sb6.append(commentObj.t0());
        return sb6.toString();
    }

    public final void b(java.lang.String key, java.lang.String str) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveDraft() called with: key = ");
        sb6.append(key);
        sb6.append(" draft:");
        sb6.append(str != null ? java.lang.Integer.valueOf(str.length()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDraftCache", sb6.toString());
        f294984b.put(key, str);
    }
}
