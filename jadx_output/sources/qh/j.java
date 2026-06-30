package qh;

/* loaded from: classes12.dex */
public class j implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh.u f363359a;

    public j(qh.t tVar, qh.u uVar) {
        this.f363359a = uVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        rh.v k17 = ((rh.w) obj).k(0L);
        qh.u uVar = this.f363359a;
        uVar.c("run_time");
        uVar.h("time", (((java.lang.Long) k17.f395518d.f395552a).longValue() / 60000) + "(min)");
        uVar.h("fg", java.lang.String.valueOf(k17.f395519e.f395552a));
        uVar.h("bg", java.lang.String.valueOf(k17.f395520f.f395552a));
        uVar.h("fgSrv", java.lang.String.valueOf(k17.f395521g.f395552a));
        uVar.h("float", java.lang.String.valueOf(k17.f395522h.f395552a));
    }
}
