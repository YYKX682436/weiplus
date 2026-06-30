package df2;

/* loaded from: classes3.dex */
public final class hg implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f230325d;

    public hg(df2.ug ugVar) {
        this.f230325d = ugVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.f230325d.g7("increasedCommentDanmaku");
        }
        return jz5.f0.f302826a;
    }
}
