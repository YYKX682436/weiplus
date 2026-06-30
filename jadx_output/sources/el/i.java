package el;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el.k f253716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el.g f253717e;

    public i(el.k kVar, el.g gVar) {
        this.f253716d = kVar;
        this.f253717e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        el.k kVar = this.f253716d;
        kVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleAddFavorite] title = ");
        el.g gVar = this.f253717e;
        sb6.append(gVar.f253698b);
        sb6.append(", desc = ");
        sb6.append(gVar.f253699c);
        sb6.append(", appId = ");
        sb6.append(gVar.f253697a);
        sb6.append(", identifier = ");
        sb6.append(gVar.f253700d);
        sb6.append(", jumpType = ");
        sb6.append(gVar.f253705i);
        sb6.append(", page = ");
        sb6.append(gVar.f253706j);
        sb6.append(", query = ");
        sb6.append(gVar.f253707k);
        sb6.append(", bizId(subType) = ");
        sb6.append(gVar.f253701e);
        sb6.append(", mediaType = ");
        sb6.append(gVar.f253702f);
        sb6.append(", url = ");
        sb6.append(gVar.f253703g);
        sb6.append(", nickName = ");
        sb6.append(gVar.f253704h);
        sb6.append(", thumbUrl = ");
        sb6.append(gVar.f253708l);
        sb6.append(", transferCtx = ");
        sb6.append(gVar.f253709m);
        sb6.append(", excerptListSize = ");
        sb6.append(gVar.f253712p.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", sb6.toString());
        android.content.Context c17 = kVar.c();
        android.app.Activity activity = c17 instanceof android.app.Activity ? (android.app.Activity) c17 : null;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        kVar.B(gVar, activity, doFavoriteEvent, new r45.bq0(), new r45.jq0(), new r45.op0());
        gm0.j1.d().a(401, kVar);
        doFavoriteEvent.e();
    }
}
