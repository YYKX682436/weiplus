package dk2;

/* loaded from: classes12.dex */
public final class kb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f233695d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(java.util.List list) {
        super(1);
        this.f233695d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(!dk2.mb.a(((dk2.bb) obj).f233248d, this.f233695d));
    }
}
