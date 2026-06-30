package km2;

/* loaded from: classes3.dex */
public final class t implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final km2.m f309222d;

    /* renamed from: e, reason: collision with root package name */
    public final km2.p f309223e;

    public t(km2.m liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f309222d = liveData;
    }

    public final gk2.e a() {
        km2.m mVar = this.f309222d;
        if (mVar != null) {
            return mVar.f309130e;
        }
        return null;
    }

    public final com.tencent.mm.live.api.LiveConfig b() {
        km2.m mVar = this.f309222d;
        if (mVar != null) {
            return mVar.f309129d;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        km2.m mVar;
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof km2.t)) {
            return -1;
        }
        km2.p pVar = this.f309223e;
        if (pVar == null) {
            km2.t tVar = (km2.t) obj;
            if (tVar.f309223e == null) {
                km2.m mVar2 = this.f309222d;
                if (mVar2 == null || (mVar = tVar.f309222d) == null) {
                    return -1;
                }
                return mVar2.d(mVar);
            }
        }
        if (pVar == null) {
            return -1;
        }
        km2.t tVar2 = (km2.t) obj;
        return (tVar2.f309223e == null || getItemId() != tVar2.getItemId()) ? -1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        km2.p pVar = this.f309223e;
        if (pVar != null) {
            return java.lang.System.identityHashCode(pVar != null ? pVar.f309166a : null);
        }
        km2.m mVar = this.f309222d;
        if (mVar != null) {
            return mVar.f309129d.f68549s;
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        r45.fa2 fa2Var;
        km2.p pVar = this.f309223e;
        if (pVar == null) {
            return 9;
        }
        if (pVar == null || (fa2Var = pVar.f309166a) == null) {
            return 0;
        }
        return fa2Var.f374126e;
    }

    public java.lang.String toString() {
        km2.p pVar = this.f309223e;
        if (pVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveVisitorData(container=");
            sb6.append(pVar != null ? pVar.f309166a : null);
            sb6.append(')');
            return sb6.toString();
        }
        return "FinderLiveVisitorData(liveData=" + this.f309222d + ')';
    }

    public t(km2.p guidePageData) {
        kotlin.jvm.internal.o.g(guidePageData, "guidePageData");
        this.f309222d = null;
        this.f309223e = guidePageData;
    }
}
