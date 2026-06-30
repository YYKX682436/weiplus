package fc2;

/* loaded from: classes2.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc2.q f260973d;

    public p(fc2.q qVar) {
        this.f260973d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.q qVar = this.f260973d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = qVar.f260976d;
        if (baseFinderFeed != null) {
            fc2.s sVar = new fc2.s(3);
            sVar.f260981e = baseFinderFeed;
            sVar.f260984h = qVar.f260974b;
            sVar.f260982f = baseFinderFeed.getItemId();
            sVar.f260983g = baseFinderFeed.w();
            qVar.f260974b = baseFinderFeed.getItemId();
            qVar.a(sVar);
        }
    }
}
