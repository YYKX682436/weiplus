package dk2;

/* loaded from: classes3.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f234032a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f234033b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f234034c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f234035d;

    public rc(java.lang.ref.WeakReference rContext) {
        kotlin.jvm.internal.o.g(rContext, "rContext");
        this.f234032a = rContext;
        this.f234033b = "Finder.LiveRotationHelper";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dk2.rc r20, com.tencent.mm.plugin.finder.ui.MMFinderUI r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.rc.a(dk2.rc, com.tencent.mm.plugin.finder.ui.MMFinderUI, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b() {
        boolean z17;
        df2.ug ugVar;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        java.lang.ref.WeakReference weakReference = this.f234032a;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = (com.tencent.mm.plugin.finder.ui.MMFinderUI) weakReference.get();
        java.lang.Integer valueOf = (mMFinderUI == null || (resources = mMFinderUI.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        if (valueOf == null || valueOf.intValue() != 2) {
            return false;
        }
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI2 = (com.tencent.mm.plugin.finder.ui.MMFinderUI) weakReference.get();
        if (mMFinderUI2 != null) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null && (ugVar = (df2.ug) k0Var.getController(df2.ug.class)) != null) {
                ugVar.c7("changeScreenToPortrait");
            }
            z17 = true;
            mMFinderUI2.b7(true);
            mMFinderUI2.setRequestedOrientation(1);
        } else {
            z17 = false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeScreenToPortrait curOrientation:");
        sb6.append(valueOf);
        sb6.append(",requestOrientation:");
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI3 = (com.tencent.mm.plugin.finder.ui.MMFinderUI) weakReference.get();
        sb6.append(mMFinderUI3 != null ? java.lang.Integer.valueOf(mMFinderUI3.getRequestedOrientation()) : null);
        sb6.append(",change:");
        sb6.append(z17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f234033b;
        com.tencent.mars.xlog.Log.i(str, sb7);
        com.tencent.mars.xlog.Log.i(str, "disableAutoRotation");
        this.f234034c = false;
        return z17;
    }
}
