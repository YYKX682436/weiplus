package fb2;

/* loaded from: classes2.dex */
public final class g implements fb2.m {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f260844a = new android.util.SparseArray();

    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        kotlin.jvm.internal.o.g(resp, "resp");
        return false;
    }

    @Override // fb2.m
    public boolean b(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        so2.i1 i1Var = (so2.i1) this.f260844a.get(i17);
        if (i1Var != null) {
            loadedInfo.f107767e.add(0, i1Var);
        }
        return false;
    }

    @Override // fb2.m
    public boolean c(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }
}
