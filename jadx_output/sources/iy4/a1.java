package iy4;

/* loaded from: classes11.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f295929e;

    public a1(iy4.c1 c1Var, java.lang.String str, com.tencent.mm.pluginsdk.model.app.d dVar) {
        this.f295928d = str;
        this.f295929e = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.d9.e().g(new com.tencent.mm.pluginsdk.model.app.z4(this.f295928d, this.f295929e));
    }
}
