package ya2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f460474d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i17) {
        super(1);
        this.f460474d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ya2.b2 contact = (ya2.b2) obj;
        kotlin.jvm.internal.o.g(contact, "contact");
        contact.field_follow_Flag = this.f460474d;
        return contact;
    }
}
