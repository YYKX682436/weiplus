package t22;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f415083a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.feature.emoji.api.m5 f415084b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f415085c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.u3 f415086d;

    public e(android.content.Context context, java.lang.String str, com.tencent.mm.feature.emoji.api.m5 onResult) {
        java.lang.String lensId;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onResult, "onResult");
        this.f415083a = context;
        this.f415084b = onResult;
        this.f415085c = "MicroMsg.CheckLensInfo";
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.gga);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        boolean z17 = true;
        this.f415086d = com.tencent.mm.ui.widget.dialog.u3.f(context, string, true, 0, new t22.d(this));
        int L = str != null ? r26.n0.L(str, "lensid=", 0, false, 6, null) : 0;
        if (str != null) {
            lensId = str.substring(L + 7);
            kotlin.jvm.internal.o.f(lensId, "substring(...)");
        } else {
            lensId = null;
        }
        if (lensId != null && lensId.length() != 0) {
            z17 = false;
        }
        if (z17) {
            onResult.a(false);
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        t22.c cVar = new t22.c(this, lensId);
        kotlin.jvm.internal.o.g(lensId, "lensId");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            new x85.f(mMActivity, lensId, cVar);
        } else {
            new x85.i(mMActivity, lensId, cVar);
        }
    }
}
