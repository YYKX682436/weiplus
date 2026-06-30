package g41;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g41.f f268702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g41.f fVar) {
        super(0);
        this.f268702d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f268702d.f268709a;
        if (view != null) {
            return (com.tencent.mm.open_voice_control.debug.A2AVolumeBarView) view.findViewById(com.tencent.mm.R.id.sfa);
        }
        kotlin.jvm.internal.o.o("floatingView");
        throw null;
    }
}
