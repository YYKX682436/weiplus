package qi5;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi5.i f363818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qi5.i iVar) {
        super(0);
        this.f363818d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f363818d.f363819d.getIntent().getIntExtra("Select_Conv_Type", com.tencent.mm.ui.contact.i5.g(1, 2)));
    }
}
