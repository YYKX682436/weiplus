package ya2;

/* loaded from: classes10.dex */
public final class w0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl0.g f460572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f460574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460575d;

    public w0(cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str) {
        this.f460572a = gVar;
        this.f460573b = context;
        this.f460574c = i5Var;
        this.f460575d = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String username;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            java.util.LinkedList list = ((r45.ua1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getContactList(...)");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) kz5.n0.Z(list);
            java.lang.String str = (finderContact == null || (username = finderContact.getUsername()) == null) ? "" : username;
            java.lang.String string = ((r45.ua1) fVar.f70618d).getString(3);
            ya2.e1.T(ya2.e1.f460472a, this.f460572a, this.f460573b, this.f460574c, this.f460575d, str, string == null ? "" : string, null, 64, null);
        } else {
            com.tencent.mars.xlog.Log.i("FinderRouterApi", "CgiFinderGetUser failed.");
        }
        return jz5.f0.f302826a;
    }
}
