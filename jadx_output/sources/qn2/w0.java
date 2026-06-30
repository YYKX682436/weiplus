package qn2;

/* loaded from: classes3.dex */
public final class w0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f365205a;

    public w0(qn2.l1 l1Var) {
        this.f365205a = l1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.cz1 cz1Var;
        r45.xy1 xy1Var;
        qn2.l1 l1Var = this.f365205a;
        km2.z zVar = ((on2.z2) l1Var.f365091a.P0(on2.z2.class)).f347092m;
        int i17 = 0;
        if (zVar != null && (cz1Var = zVar.f309232d) != null && (xy1Var = (r45.xy1) cz1Var.getCustom(5)) != null) {
            i17 = xy1Var.getInteger(0);
        }
        return l1Var.a(i17);
    }
}
