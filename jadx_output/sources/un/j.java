package un;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.l f429291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(un.l lVar) {
        super(0);
        this.f429291d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f429291d.getIntent().getStringExtra("RoomInfo_Id");
    }
}
