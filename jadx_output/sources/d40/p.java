package d40;

/* loaded from: classes9.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f226370e;

    public p(java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f226369d = str;
        this.f226370e = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
        int type = this.f226370e.getType();
        java.lang.String str = this.f226369d;
        zz.b bj6 = ((t02.e) iVar).bj(str, type, null, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileMsgFeatureService", "recordCheckDup:%s ret:%s hitCache:%s copyResult:%s replaceResult:%s", str, java.lang.Integer.valueOf(bj6.f477691a), java.lang.Boolean.valueOf(bj6.f477692b), java.lang.Boolean.valueOf(bj6.f477694d), java.lang.Long.valueOf(bj6.f477695e));
    }
}
