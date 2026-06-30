package oa2;

/* loaded from: classes2.dex */
public final class r implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oa2.w f343834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.r03 f343835b;

    public r(oa2.w wVar, r45.r03 r03Var) {
        this.f343834a = wVar;
        this.f343835b = r03Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        oa2.w wVar = this.f343834a;
        yz5.a aVar = wVar.f343845m;
        if (aVar == null) {
            aVar = new oa2.j(wVar, this.f343835b);
            wVar.f343845m = aVar;
        }
        return (java.util.Map) ((oa2.j) aVar).invoke();
    }
}
