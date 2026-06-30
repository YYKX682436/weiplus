package ij5;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ij5.t tVar) {
        super(0);
        this.f291798d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f291798d.getIntent().getStringExtra("key_tipWord");
    }
}
