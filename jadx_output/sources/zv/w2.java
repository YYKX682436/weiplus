package zv;

/* loaded from: classes8.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476125d;

    public w2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, yz5.l lVar) {
        this.f476125d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        yz5.l lVar = this.f476125d;
        if (e17 != null) {
            e17.g(new zv.v2(e17, lVar));
        } else {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
    }
}
