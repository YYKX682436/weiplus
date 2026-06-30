package ev4;

/* loaded from: classes8.dex */
public final class i implements tg0.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ev4.j f256952a;

    public i(ev4.j jVar) {
        this.f256952a = jVar;
    }

    @Override // tg0.b2
    public boolean a(int i17, android.os.Bundle res) {
        kotlin.jvm.internal.o.g(res, "res");
        if (i17 != 119) {
            return false;
        }
        ev4.f fVar = new ev4.f(this.f256952a, res);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            fVar.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(fVar));
        }
        return true;
    }

    @Override // tg0.b2
    public void b() {
        ev4.e eVar = new ev4.e(this.f256952a);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            eVar.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(eVar));
    }

    @Override // tg0.b2
    public void c(tg0.c1 result) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        android.view.View view;
        kotlin.jvm.internal.o.g(result, "result");
        fv4.i iVar = this.f256952a.f256953a;
        iVar.getClass();
        tg0.c2 c2Var2 = iVar.f267009c;
        if ((c2Var2 != null ? c2Var2.f419049d : null) == tg0.g2.f419074f) {
            fv4.g gVar = iVar.f267008b;
            gVar.getClass();
            java.lang.String str = result.f419032d;
            java.lang.String str2 = result.f419033e;
            int i17 = result.f419034f;
            int i18 = result.f419035g;
            java.lang.String str3 = result.f419036h;
            java.lang.String str4 = result.f419037i;
            fv4.i iVar2 = gVar.f267005a;
            tg0.c1 c1Var = new tg0.c1(((iVar2 == null || (view = iVar2.f267010d) == null || view.getVisibility() != 0) ? 0 : 1) ^ 1, 0, null, str, str2, i17, i18, str3, str4, null, 0, null, 0, 0, 0, 0.0d, 0L, 130566, null);
            fv4.i iVar3 = gVar.f267005a;
            if (iVar3 == null || (c2Var = iVar3.f267009c) == null || (h2Var = c2Var.f419053h) == null) {
                return;
            }
            ((ch0.h0) h2Var).a(c2Var.f419049d.f419078d, c1Var);
        }
    }

    @Override // tg0.b2
    public void d(boolean z17) {
        this.f256952a.f256953a.f267008b.e(z17);
    }

    @Override // tg0.b2
    public void e(java.lang.String funcName, java.lang.String str) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        int hashCode = funcName.hashCode();
        if (hashCode == -2115079805) {
            if (funcName.equals("onMoreClickInFlutter")) {
                ev4.h hVar = new ev4.h(this.f256952a, str);
                if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                    hVar.run();
                    return;
                }
                ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(hVar));
                return;
            }
            return;
        }
        if (hashCode == -171895335) {
            if (funcName.equals("onWebViewSizeChanged")) {
                java.lang.String content = "H5 call onWebViewSizeChanged, params: " + str;
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
                this.f256952a.f256953a.f267008b.d(str);
                return;
            }
            return;
        }
        if (hashCode == 1484266638 && funcName.equals("onSetSearchInputWordInFlutter")) {
            ev4.g gVar = new ev4.g(this.f256952a, str);
            if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
                gVar.run();
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(gVar));
        }
    }
}
