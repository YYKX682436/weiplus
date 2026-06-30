package rv2;

/* loaded from: classes10.dex */
public final class b extends pv2.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400374e;

    public b() {
        super("PostFileClearStage");
        this.f400374e = "LogPost.PostFileClearStage";
    }

    @Override // pv2.g
    public int a() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [kz5.p0] */
    @Override // pv2.m
    public pv2.g c() {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i(this.f400374e, "PostFileClearStage exec");
        mv2.q qVar = mv2.q.f331618a;
        if ((c01.id.a() - mv2.q.f331620c > com.tencent.mm.plugin.finder.storage.t70.f127590a.F()) || ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127888q1).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "FinderFileTrack checkPostingFolder");
            mv2.q.f331620c = c01.id.a();
            try {
                java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102147p;
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str, false);
                if (s17 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(s17, 10));
                    java.util.Iterator it = s17.iterator();
                    while (it.hasNext()) {
                        arrayList.add(str + ((com.tencent.mm.vfs.x1) it.next()).f213232b);
                    }
                } else {
                    arrayList = null;
                }
                linkedHashSet.addAll(arrayList != null ? arrayList : kz5.p0.f313996d);
                java.util.Iterator it6 = ((java.util.ArrayList) mv2.q.f331621d).iterator();
                while (it6.hasNext()) {
                    mv2.n nVar = (mv2.n) it6.next();
                    java.util.List a17 = nVar.a();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : a17) {
                        java.lang.String str2 = (java.lang.String) obj;
                        if ((str2 == null || kotlin.jvm.internal.o.b(str2, "")) ? false : true) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        com.tencent.mars.xlog.Log.i("LogPost.FinderPostFileManager", "ownership, " + nVar.name() + " owns:" + ((java.lang.String) it7.next()));
                    }
                    kotlin.jvm.internal.m0.a(linkedHashSet).removeAll(arrayList2);
                }
                java.util.Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    mv2.q.f331618a.m((java.lang.String) it8.next());
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LogPost.FinderPostFileManager", th6, "checkPostingFolder", new java.lang.Object[0]);
            }
        }
        return new rv2.a("PostFileClearStage");
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }
}
