package hx;

/* loaded from: classes11.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "manualResort";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MBJsApiManulResort", "invoke");
        if (!z40.e.l4() || !((y40.i0) z40.e.get()).Ni()) {
            com.tencent.wechat.mm.biz.g0.f218063b.D(new hx.d(this));
            return;
        }
        z40.e eVar = z40.e.get();
        hx.c cVar = new hx.c(this);
        ((y40.i0) eVar).getClass();
        com.tencent.wechat.mm.finder_box.c0 a17 = a50.e1.f1471a.a();
        if (a17 != null) {
            a17.y(new y40.d0(cVar));
        }
    }
}
