package qf;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f362232a = new java.util.LinkedList();

    public void a(qf.c cVar) {
        java.lang.String b17 = cVar.b();
        this.f362232a.add(new android.util.Pair(cVar, android.text.TextUtils.isEmpty(b17) ? null : java.util.regex.Pattern.compile(b17)));
    }

    public android.webkit.WebResourceResponse b(java.lang.String str) {
        android.webkit.WebResourceResponse a17;
        java.util.Iterator it = this.f362232a.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            qf.c cVar = (qf.c) pair.first;
            java.util.regex.Pattern pattern = (java.util.regex.Pattern) pair.second;
            if (pattern != null && pattern.matcher(str).matches() && (a17 = cVar.a(str)) != null) {
                return a17;
            }
        }
        return null;
    }
}
