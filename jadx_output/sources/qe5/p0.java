package qe5;

/* loaded from: classes8.dex */
public final class p0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public jk3.v f362167d;

    /* renamed from: e, reason: collision with root package name */
    public gc5.c f362168e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362170g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final java.lang.String U6() {
        java.lang.String str;
        kd5.e T6 = T6();
        return (T6 == null || (str = T6.f306893x) == null) ? "" : str;
    }

    public final void V6() {
        java.lang.String str;
        java.lang.String str2;
        if (this.f362169f) {
            return;
        }
        ty.i0 i0Var = (ty.i0) i95.n0.c(ty.i0.class);
        ak3.i iVar = new ak3.i(getContext());
        ((sy.x) i0Var).getClass();
        md5.b bVar = new md5.b(iVar);
        this.f362167d = bVar;
        kd5.e T6 = T6();
        java.lang.String str3 = "";
        if (T6 == null || (str = T6.F) == null) {
            str = "";
        }
        java.lang.String U6 = U6();
        kd5.e T62 = T6();
        bVar.c0(str, U6, T62 != null ? T62.f306883n : 0, true);
        java.lang.Object obj = this.f362167d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.multitask.IFilesPageMultiTaskHelper");
        md5.c cVar = (md5.c) obj;
        java.lang.String U62 = U6();
        kd5.e T63 = T6();
        if (T63 != null && (str2 = T63.f306892w) != null) {
            str3 = str2;
        }
        ((md5.b) cVar).d0(U62, str3);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile = ((qe5.e) pf5.z.f353948a.a(activity).a(qe5.e.class)).f362088d;
        if (absHandOffFile != null) {
            jk3.v vVar = this.f362167d;
            absHandOffFile.saveToMultiTaskInfo(vVar != null ? vVar.f300077a : null);
        }
        this.f362169f = true;
    }

    public final void W6() {
        gc5.b bVar;
        java.lang.String str;
        java.lang.String str2;
        if (this.f362170g) {
            return;
        }
        if (((ty.i0) i95.n0.c(ty.i0.class)) != null) {
            bVar = new gc5.b(new dp1.a(getContext()));
            kd5.e T6 = T6();
            java.lang.String str3 = "";
            if (T6 == null || (str = T6.F) == null) {
                str = "";
            }
            java.lang.String U6 = U6();
            kd5.e T62 = T6();
            bVar.u0(str, U6, T62 != null ? T62.f306883n : 0, true);
            java.lang.String U62 = U6();
            kd5.e T63 = T6();
            if (T63 != null && (str2 = T63.f306892w) != null) {
                str3 = str2;
            }
            bVar.v0(U62, str3);
            this.f362170g = true;
        } else {
            bVar = null;
        }
        this.f362168e = bVar;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.Object obj = this.f362168e;
        if (obj != null) {
            ((com.tencent.mm.plugin.ball.service.s4) obj).o0();
        }
    }
}
