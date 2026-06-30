package cu2;

/* loaded from: classes2.dex */
public final class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f222432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f222433f;

    public p(android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, yz5.l lVar) {
        this.f222431d = context;
        this.f222432e = baseFinderFeed;
        this.f222433f = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        cu2.u.f222441a.e(this.f222431d, this.f222432e, this.f222433f);
    }
}
