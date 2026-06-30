package un;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.p f429313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(un.p pVar) {
        super(0);
        this.f429313d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f429313d.getIntent().getStringExtra("RoomInfo_Id");
    }
}
