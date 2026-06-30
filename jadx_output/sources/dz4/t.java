package dz4;

/* loaded from: classes12.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245408f;

    public t(dz4.j0 j0Var, java.lang.String str, java.lang.String str2) {
        this.f245406d = j0Var;
        this.f245407e = str;
        this.f245408f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.j0 j0Var = this.f245406d;
        if (j0Var.f245309a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickAddFavorite: holder null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickAddFavorite: chatMsgId " + this.f245407e + ", chatMsgTalker " + this.f245408f);
        dz4.v0 v0Var = (dz4.v0) ((jz5.n) ((ez4.u) j0Var.f245309a).f257961t).getValue();
        ez4.u uVar = (ez4.u) v0Var.f245434a;
        java.lang.ref.WeakReference weakReference = uVar.f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = v0Var.f245435b;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i(str, "handleAddFav: context null");
            return;
        }
        dz4.i iVar = uVar.f257942a;
        if (!(iVar instanceof dz4.f)) {
            if (iVar instanceof dz4.h) {
                hz4.s.a(activity, ((dz4.h) iVar).f245268m);
                return;
            }
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        long j17 = 0;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            j17 = java.lang.Long.parseLong(((dz4.f) iVar).f245232m);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        dz4.f fVar = (dz4.f) iVar;
        com.tencent.mm.pluginsdk.model.a2.i(doFavoriteEvent, j17, fVar.f245233n);
        doFavoriteEvent.e();
        int i17 = doFavoriteEvent.f54091h.f6433a;
        com.tencent.mars.xlog.Log.i(str, "handleAddFav: ret " + i17 + ", chat msgId " + j17 + " msgTalker " + fVar.f245233n);
        com.tencent.mm.plugin.fav.ui.u1.g(i17, 37, activity, new dz4.u0(v0Var));
    }
}
