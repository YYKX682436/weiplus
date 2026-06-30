package hf2;

/* loaded from: classes10.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281055d;

    public f(hf2.x xVar) {
        this.f281055d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = (java.lang.String) obj;
        hf2.x xVar = this.f281055d;
        boolean z17 = xVar.f281190v;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            return f0Var;
        }
        r45.h84 h84Var = xVar.f281186r;
        boolean z18 = false;
        if (!kotlin.jvm.internal.o.b(str, h84Var != null ? h84Var.getString(0) : null)) {
            return f0Var;
        }
        xVar.f281190v = false;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = xVar.l7().f281107d;
        if (liveBottomSheetPanel != null && liveBottomSheetPanel.isShowing) {
            z18 = true;
        }
        if (z18) {
            java.lang.Object Z6 = hf2.x.Z6(xVar, "resourceLoadFinish", continuation);
            return Z6 == pz5.a.f359186d ? Z6 : f0Var;
        }
        com.tencent.mars.xlog.Log.i(xVar.f281181m, "waitingInitMaasResurceDownload " + str + " but panel hide!");
        return f0Var;
    }
}
