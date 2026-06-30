package fn4;

/* loaded from: classes15.dex */
public class p0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.r0 f264596d;

    public p0(fn4.r0 r0Var, fn4.l0 l0Var) {
        this.f264596d = r0Var;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        fn4.r0 r0Var = this.f264596d;
        if (r0Var.f264602c.containsKey(str)) {
            r45.yn6 yn6Var = (r45.yn6) r0Var.f264602c.get(str);
            long j17 = hVar.field_recvedBytes;
            yn6Var.f391244e = j17;
            yn6Var.f391245f = r0Var.a(j17, (int) hVar.field_fileLength);
            yn6Var.f391246g = (int) hVar.field_fileLength;
            r0Var.f264602c.put(str, yn6Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "VideoPreloadCallback onFinish %s %d %s", str, java.lang.Long.valueOf(yn6Var.f391245f), com.tencent.mm.sdk.platformtools.t8.i0(yn6Var.f391244e, 100.0d));
        }
    }
}
