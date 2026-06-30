package pn;

/* loaded from: classes11.dex */
public final class i implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pn.m f356926a;

    public i(pn.m mVar) {
        this.f356926a = mVar;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public final void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        tm.a b17 = tm.a.b(str);
        pn.m mVar = this.f356926a;
        if (b17 != null) {
            b17.c(mVar.f356930a, null, null);
        } else {
            db5.e1.s(mVar.f356930a, mVar.c(com.tencent.mm.R.string.f492327g24), mVar.c(com.tencent.mm.R.string.f490573yv));
            mVar.f356935f.Z0();
        }
    }
}
