package ju2;

/* loaded from: classes2.dex */
public final class a implements android.view.ViewStub.OnInflateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f301807a;

    public a(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f301807a = baseFinderFeed;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(android.view.ViewStub viewStub, android.view.View view) {
        ju2.g.b(view.findViewById(com.tencent.mm.R.id.lkg), this.f301807a);
    }
}
