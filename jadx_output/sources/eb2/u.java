package eb2;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final fp0.t f250856a;

    public u() {
        fp0.t tVar = new fp0.t("Finder.EnhanceStreamFetcher");
        tVar.e();
        this.f250856a = tVar;
    }

    public final java.lang.Object a(int i17, int i18, r45.qt2 qt2Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.util.List list, java.util.List list2, int i19, long j17, com.tencent.mm.protobuf.g gVar, kotlin.coroutines.Continuation continuation) {
        fp0.t tVar = this.f250856a;
        tVar.d();
        u26.w a17 = u26.z.a(0, null, null, 7, null);
        tVar.b(new eb2.q(a17, new eb2.t(i18, qt2Var, finderObject, list, list2, i17, i19, j17, gVar, a17)));
        return ((u26.k) a17).r(continuation);
    }
}
