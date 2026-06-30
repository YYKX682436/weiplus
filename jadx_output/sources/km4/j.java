package km4;

/* loaded from: classes11.dex */
public final class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f309290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f309291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f309292f;

    public j(yz5.l lVar, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f309290d = lVar;
        this.f309291e = c0Var;
        this.f309292f = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.pigeon.ting.TingADErrorCode tingADErrorCode = com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL;
        yz5.l lVar = this.f309290d;
        kotlin.jvm.internal.c0 c0Var = this.f309291e;
        kotlin.jvm.internal.h0 h0Var = this.f309292f;
        km4.l.c(lVar, c0Var, h0Var, tingADErrorCode);
        km4.l.d(h0Var);
        com.tencent.mars.xlog.Log.w("MicroMsg.TingAdHelper", "openAD user cancel");
        km4.l.f309296a.a(14, null);
    }
}
