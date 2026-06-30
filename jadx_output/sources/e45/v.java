package e45;

/* loaded from: classes.dex */
public final class v implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e45.x f249429a;

    public v(e45.x xVar) {
        this.f249429a = xVar;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        int i18 = iArr[0];
        e45.x xVar = this.f249429a;
        if (i18 == 0) {
            xVar.O6();
        } else {
            db5.e1.C(xVar.getActivity(), xVar.getActivity().getString(com.tencent.mm.R.string.hhp), xVar.getActivity().getString(com.tencent.mm.R.string.hht), xVar.getActivity().getString(com.tencent.mm.R.string.g6z), xVar.getActivity().getString(com.tencent.mm.R.string.fic), false, new e45.u(xVar), null);
        }
    }
}
