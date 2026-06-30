package f00;

/* loaded from: classes.dex */
public final class l implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.o f258317d;

    public l(f00.o oVar) {
        this.f258317d = oVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        f00.o oVar = this.f258317d;
        android.view.View view = oVar.f258320a;
        if (view != null) {
            view.post(new f00.k(oVar, iPCBoolean));
        }
    }
}
