package so2;

/* loaded from: classes2.dex */
public final class v1 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final ya2.b2 f410645d;

    public v1(ya2.b2 contact) {
        kotlin.jvm.internal.o.g(contact, "contact");
        this.f410645d = contact;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return so2.v1.class.getName().hashCode();
    }
}
