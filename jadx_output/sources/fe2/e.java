package fe2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f261507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe2.h f261508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.MMActivity mMActivity, fe2.h hVar) {
        super(0);
        this.f261507d = mMActivity;
        this.f261508e = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new de2.h(this.f261507d, new fe2.d(this.f261508e));
    }
}
