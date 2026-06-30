package kj2;

/* loaded from: classes10.dex */
public final class c implements ek2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.o f308388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f308389b;

    public c(kj2.o oVar, int i17) {
        this.f308388a = oVar;
        this.f308389b = i17;
    }

    @Override // ek2.f
    public void a(r45.ng1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        kj2.o oVar = this.f308388a;
        java.util.ArrayList arrayList = oVar.f308429h;
        int i17 = this.f308389b;
        vi2.h hVar = (vi2.h) kz5.n0.a0(arrayList, i17);
        if (hVar != null) {
            hVar.f437550d = vi2.g.f437548f;
        }
        oVar.f308430i.notifyItemChanged(i17);
    }

    @Override // ek2.f
    public void b(int i17, int i18, java.lang.String str) {
        kj2.o oVar = this.f308388a;
        java.util.ArrayList arrayList = oVar.f308429h;
        int i19 = this.f308389b;
        vi2.h hVar = (vi2.h) kz5.n0.a0(arrayList, i19);
        if (hVar != null) {
            hVar.f437550d = vi2.g.f437546d;
        }
        oVar.f308430i.notifyItemChanged(i19);
        com.tencent.mars.xlog.Log.i("FinderLiveInviteVisitorMicWidget", "invite fail errorCode: " + i18 + " errType: " + i17 + " msg: " + str);
        if (str == null || str.length() == 0) {
            str = oVar.f308422a.getContext().getResources().getString(com.tencent.mm.R.string.dq_);
        }
        db5.t7.m(oVar.f308422a.getContext(), str);
    }
}
