package dp1;

/* loaded from: classes8.dex */
public class r implements al5.g3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp1.u f242172d;

    public r(dp1.u uVar) {
        this.f242172d = uVar;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
        dp1.v vVar = this.f242172d.f242179f;
        if (vVar != null) {
            vVar.f(f17);
        }
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent motionEvent) {
        dp1.u uVar = this.f242172d;
        dp1.v vVar = uVar.f242179f;
        if (vVar != null) {
            vVar.a(motionEvent);
        }
        uVar.getClass();
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        dp1.u uVar = this.f242172d;
        if (uVar.w() && !uVar.x()) {
            uVar.y();
        } else if (uVar.getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            ii5.c cVar = ((com.tencent.mm.ui.MMActivity) uVar.getActivity()).getSwipeBackLayout().f211432m;
            cVar.f291645p = cVar.f291646q;
            cVar.f291647r = false;
        }
        dp1.v vVar = uVar.f242179f;
        int h17 = vVar != null ? vVar.h(z17) : 0;
        uVar.f242181h = z17;
        if (h17 != 0) {
            return h17;
        }
        return 1;
    }

    @Override // al5.g3
    public void c(int i17, int i18) {
        dp1.v vVar = this.f242172d.f242179f;
        if (vVar != null) {
            vVar.c(i17, i18);
        }
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent motionEvent) {
        dp1.v vVar = this.f242172d.f242179f;
        return vVar != null && vVar.d(motionEvent);
    }

    @Override // al5.g3
    public boolean d0() {
        dp1.v vVar = this.f242172d.f242179f;
        return vVar != null && vVar.g();
    }

    @Override // al5.g3
    public int e() {
        dp1.v vVar = this.f242172d.f242179f;
        if (vVar != null) {
            return vVar.e();
        }
        return 0;
    }

    @Override // al5.g3
    public boolean enableSwipeBack() {
        dp1.v vVar = this.f242172d.f242179f;
        return vVar != null && vVar.enableSwipeBack();
    }
}
